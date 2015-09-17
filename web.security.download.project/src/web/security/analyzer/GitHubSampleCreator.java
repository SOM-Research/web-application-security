package web.security.analyzer;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author atlanmod
 * This class builds a random sample of GitHub projects containing security information.
 * From the set of projects retrieved from the GitHub search, a sample of size X is randomly created
 * 
 * ex. template:
 * GitHubSampleCreator x = new GitHubSampleCreator();
 * x.createSample(text_to_search, file_extension, file_size, sample_size, filter);
 * x.save(path_to_file_links_found, path_to_project_links_to_download_found);
 *
 */

public class GitHubSampleCreator {
	
	private List<String> links;
	private Set<String> users;
	private final int HITS_PER_PAGE = 10;
	private final int TIME_BETWEEN_REQUESTS = 10000; //10 secs
	
	public GitHubSampleCreator() {
		this.links = new LinkedList<String>();
		this.users = new HashSet<String>();
	}
	
	private void sleep(int time) {
		try {
		    Thread.sleep(time);                
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}
	
	public void createSample(String search_text, String file_ext, String file_size, int sample_size, String filter) {
		//start browser
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/search/advanced?q=test&type=Repositories&utf8=%E2%9C%93");
		
		prepareSearch(driver, search_text, file_ext, file_size);
		collectProjects(driver, sample_size);
		
		if (!filter.equals(""))
			this.filter(filter);
		
		extractGitHubUsers();
		
		//close browser
		driver.quit();
		
	}
	
	public void extractGitHubUsers() {
		for (String link : this.links) {
			String repoInfo = link.replaceAll("https://github.com/", "");
			String user = repoInfo.split("/")[0];
			
			this.users.add("https://github.com/" + user);
		}
		
		
	}
	
	public void prepareSearch(WebDriver driver, String search_text, String file_ext, String file_size) {
		//set text to look for
		WebElement codeSearch = driver.findElement(By.id("adv_code_search"));
		WebElement codeSearchInput = codeSearch.findElement(By.xpath("//div/label/input"));
		codeSearchInput.clear();
		codeSearchInput.sendKeys(search_text);
		
		//set file extension
		WebElement fileExtension = driver.findElement(By.id("search_extension"));
		fileExtension.sendKeys(file_ext);
		
		//set file size
		WebElement fileSize = driver.findElement(By.id("search_file_size"));
		fileSize.sendKeys(file_size);
		
		//look for button search
		List<WebElement> buttonsSearch = driver.findElements(By.xpath("//*[@class='btn']"));
		WebElement lastButtonSearch = buttonsSearch.get(buttonsSearch.size()-1);
		//search
		lastButtonSearch.click();
		this.sleep(3000);
		
	}
	
	public void collectProjects(WebDriver driver, int sample_size) {
		//get number of pages
		WebElement pagination = driver.findElement(By.className("pagination"));
		List<WebElement> pages = pagination.findElements(By.xpath("./a"));
		//we take the next-to-last number, since the last page could contain less than the fixed number of hits per page (10)
		int numberOfPages = Integer.parseInt(pages.get(pages.size()-3).getText());
		
		//hits per pages = 10
		int totalNumberOfHits = numberOfPages*this.HITS_PER_PAGE;
		List<Integer> inSample = this.getRandomSample(sample_size, totalNumberOfHits);
		
		int lastPageInSample = (int)((inSample.get(inSample.size()-1)/10));
		int timeToGenerateSampleSec = (lastPageInSample * (this.TIME_BETWEEN_REQUESTS/1000));
		System.out.println("time to generate the sample: about " + String.valueOf(timeToGenerateSampleSec) + " sec" );
		
		this.lookForProjects(driver, inSample);
	}
	
	private String getRepoLink(String link) {
		String[] fragments = link.replaceAll("https://github.com/", "").split("/");
		String repo_link = "https://github.com/";
		for (int i = 0; i<fragments.length; i++) {
			if (fragments[i].equals("blob")) {
				repo_link = repo_link + "archive/" + fragments[i+1] + ".zip";
				break;
			}
			else {
				repo_link = repo_link + fragments[i] + "/";
			}
		}
		
		return repo_link;
	}
	
	public void filter(String filter) {
		List<String> filtered = new LinkedList<String>();
		for (String link : this.links) {
			if (link.contains("/" + filter + "/"))
				filtered.add(link);
		}
		this.links.clear();
		this.links = filtered;
	}
	
	private List<String> getRepoLinks() {
		List<String> repoLinks = new LinkedList<String>();
		for (String link : this.links) {
			if (!repoLinks.contains(this.getRepoLink(link)))
				repoLinks.add(this.getRepoLink(link));
		}
		return repoLinks;
	}
	
	public void save(String sample_links_path, String sample_repos_path, String sample_users_path) {
		try {
			PrintWriter writer_links = new PrintWriter(sample_links_path, "UTF-8");
			PrintWriter writer_repos = new PrintWriter(sample_repos_path, "UTF-8");
			PrintWriter writer_users = new PrintWriter(sample_users_path, "UTF-8");
			
			for (String link : this.links) {
				//write file link
				writer_links.println(link);
			}
			for (String link : this.getRepoLinks()) {
				//retrieve project zip and write it
				writer_repos.println(link);
			}
			for (String user : this.users) {
				writer_users.println(user);
			}
			
			writer_links.close();
			writer_repos.close();
			writer_users.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void lookForProjects(WebDriver driver, List<Integer> inSample) {
		int currentPage = 0;
		for (int pos=0; pos<inSample.size(); pos++) {
			if (this.links.size() == inSample.size())
				break;
			else {
				while (((int)(inSample.get(pos)/10)) != currentPage) {
					currentPage++;
					this.goToNextPage(driver);
				}
				
				int posInPage = (inSample.get(pos) % 10);
				this.links.add(this.getLink(driver, posInPage));
				
			}
		}
	}
	
	private String getLink(WebDriver driver, int posInPage) {
		String link = "";
		
		WebElement codeList = driver.findElement(By.className("code-list"));
		WebElement project;
		if (posInPage == 0)
			project = codeList.findElement(By.xpath("./div[last()]"));
		else
			project = codeList.findElements(By.xpath("./div")).get(posInPage);
		
		String path = project.findElement(By.className("title")).findElement(By.xpath("./a[last()]")).getAttribute("href");
		link = path;
		
		return link;
	}
	
	private void goToNextPage(WebDriver driver) {
		WebElement pagination = driver.findElement(By.className("pagination"));
		List<WebElement> pages = pagination.findElements(By.xpath("./a"));
		WebElement nextPage = pages.get(pages.size()-1);
		
		try {
			this.sleep(2000);
			nextPage.click();
			this.sleep(this.TIME_BETWEEN_REQUESTS);
		}
		catch (Exception e) {}
	}
	
	private List<Integer> getRandomSample(int sample_size, int population) {
		List<Integer> inSample = new LinkedList<Integer>();
		Random rand = new Random();
		
		int n;
		while (inSample.size() < sample_size) {
			n = rand.nextInt(population) + 1;
			if (!this.inSample(inSample, n))
				inSample.add(n);
		}
		
		Collections.sort(inSample);
		return inSample;
	}
	
	private boolean inSample(List<Integer> sample, int n) {
		boolean found = false;
		for (Integer i : sample) {
			if (i == n) {
				found = true;
				break;
			}
		}
		
		return found;
	}
	
	
	public static void main(String[] args) {
		GitHubSampleCreator x = new GitHubSampleCreator();
		//deactivate the filter using "" in the filter parameter
		//x.createSample("<web-resource-collection>", "xml", ">5000", 100, "WEB-INF");
		x.createSample("servlet-name", "xml", ">1000", 750, "WEB-INF");
		x.save("./servlet_file_links.txt", "./servlet_sample_links.txt", "./users.txt");
		
//		GitHubSampleCreator y = new GitHubSampleCreator();
//		y.createSample("<security-identity>", "xml", ">1000", 100, "");
//		y.save("./ejb_file_links.txt", "./ejb_sample_links.txt");
	}

}
