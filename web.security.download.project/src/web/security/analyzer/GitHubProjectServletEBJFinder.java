package web.security.analyzer;

import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author atlanmod
 * this class looks for GitHub projects that contain security information in both servlet and ejb descriptors
 * 
 * ex.:
 * GitHubProjectServletEBJFinder x = new GitHubProjectServletEBJFinder();
 * x.getProjects("<web-resource-collection>", "xml", x.servlet_links, "");
 * x.getProjects("<security-identity>", "xml", x.ejb_links, "");
 * x.findMatches();
 * x.save(x.match_links, "./servlet_ejb_links.txt");
 * 
 */

public class GitHubProjectServletEBJFinder {
	
	private List<String> servlet_links;
	private List<String> ejb_links;
	private List<String> match_links;
	private List<String> file_links;
	private final int TIME_BETWEEN_REQUESTS = 10000; //10 secs
	
	public GitHubProjectServletEBJFinder() {
		this.servlet_links = new LinkedList<String>();
		this.ejb_links = new LinkedList<String>();
		this.match_links = new LinkedList<String>();
		
		this.file_links = new LinkedList<String>();
	}
	
	public List<String> getServlet_links() {
		return servlet_links;
	}

	public List<String> getEjb_links() {
		return ejb_links;
	}

	public List<String> getMatch_links() {
		return match_links;
	}
	
	public List<String> getFile_links() {
		return file_links;
	}
	
	private void sleep(int time) {
		try {
		    Thread.sleep(time);                
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}
	
	public void getProjects(String search_text, String file_ext, List<String> output, String filter) {
		//start browser
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/search/advanced?q=test&type=Repositories&utf8=%E2%9C%93");
		
		prepareSearch(driver, search_text, file_ext);
		collectProjects(driver, output, filter);
		
		//close browser
		driver.quit();
		
	}
	
	public void prepareSearch(WebDriver driver, String search_text, String file_ext) {
		//set text to look for
		WebElement codeSearch = driver.findElement(By.id("adv_code_search"));
		WebElement codeSearchInput = codeSearch.findElement(By.xpath("//div/label/input"));
		codeSearchInput.clear();
		codeSearchInput.sendKeys(search_text);
		
		//set file extension
		WebElement fileExtension = driver.findElement(By.id("search_extension"));
		fileExtension.sendKeys(file_ext);
		
		//look for button search
		List<WebElement> buttonsSearch = driver.findElements(By.xpath("//*[@class='button']"));
		WebElement lastButtonSearch = buttonsSearch.get(buttonsSearch.size()-1);
		//search
		lastButtonSearch.click();
		this.sleep(3000);
		
	}
	
	private int findMaxNumberOfPages(WebDriver driver) {
		//get number of pages
		WebElement pagination = driver.findElement(By.className("pagination"));
		List<WebElement> pages = pagination.findElements(By.xpath("./a"));
		//we take the next-to-last number, since the last page could contain less than the fixed number of hits per page (10)
		int numberOfPages = Integer.parseInt(pages.get(pages.size()-3).getText());
		
		return numberOfPages;
				
	}
	
	public void collectProjects(WebDriver driver, List<String> links, String filter) {
		
		int currentPage = 1;
		while (currentPage <= this.findMaxNumberOfPages(driver)) {
			this.collectProjectsInPage(driver, links, filter);
			this.goToNextPage(driver);
			
			currentPage++;
		}
	}
	
	private boolean applyFilter(String path, String dir) {
		boolean flag = true;
		if (!dir.equals(""))
			flag = path.contains("/" + dir + "/");
		return flag;
	}
	
	private void collectProjectsInPage(WebDriver driver, List<String> links, String filter) {
		String projectLink, fileLink;
		WebElement codeList = driver.findElement(By.className("code-list"));
		List<WebElement> projects = codeList.findElements(By.xpath("./div"));
		for (WebElement project : projects) {
			projectLink = project.findElement(By.className("title")).findElement(By.xpath("./a[1]")).getAttribute("href");
			fileLink = project.findElement(By.className("title")).findElement(By.xpath("./a[last()]")).getAttribute("href");
			
			if (this.applyFilter(fileLink, filter)) {
				if (!this.inList(links, projectLink)) {
					file_links.add(fileLink);
					links.add(projectLink);
				}
			}
		}
	}
	
	private void goToNextPage(WebDriver driver) {
		WebElement pagination = driver.findElement(By.className("pagination"));
		List<WebElement> pages = pagination.findElements(By.xpath("./a"));
		WebElement nextPage = pages.get(pages.size()-1);
		nextPage.click();
		this.sleep(this.TIME_BETWEEN_REQUESTS);
	}
	
	private boolean inList(List<String> output, String link) {
		boolean found = false;
		for (String o : output) {
			if (o.equals(link)) {
				found = true;
				break;
			}
		}
		
		return found;
	}
	
	public void findMatches() {
		for (String servlet : this.servlet_links) {
			for (String ejb : this.ejb_links) {
				if (servlet.equals(ejb))
					this.match_links.add(ejb);
			}
		}
	}
	
	public void save(List<String> links, String output_path) {
		try {
			PrintWriter writer = new PrintWriter(output_path, "UTF-8");
			for (String link : links)
				writer.println(link);
			writer.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		GitHubProjectServletEBJFinder x = new GitHubProjectServletEBJFinder();
		//to activate the filter, set it to the folder name that should contain the text
		//to deactivate the filter, set it to null
		
		//x.getProjects("<web-resource-collection>", "xml", x.servlet_links, "WEB-INF");
		//x.getProjects("<security-identity>", "xml", x.ejb_links, "META-INF");
		
		x.getProjects("<web-resource-collection>", "xml", x.servlet_links, "WEB-INF");
		x.getProjects("<security-identity>", "xml", x.ejb_links, "");
		x.findMatches();
		x.save(x.servlet_links, "./servlet_links.txt");
		x.save(x.ejb_links, "./ejb_links.txt");
		x.save(x.match_links, "./servlet_ejb_links.txt");
	}

}
