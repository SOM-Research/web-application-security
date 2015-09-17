package web.security.analyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubUserMailCollector {
	
	private List<String> contacts;
	private static final String USERS_PATH = "./users.txt";
	private static final String EMAILS_PATH = "./emails.txt";
	private WebDriver driver;
	
	public GitHubUserMailCollector() {
		this.contacts = new LinkedList<String>();
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		this.driver = new ChromeDriver();
	}
	
	private void sleep(int time) {
		try {
		    Thread.sleep(time);                
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}
	
	public void collect() {
		BufferedReader br = null;

		try {

			String sCurrentLine;
			br = new BufferedReader(new FileReader(USERS_PATH));

			while ((sCurrentLine = br.readLine()) != null) {
				driver.get(sCurrentLine);
				this.sleep(3000);
				String email, url = null;
				try { email = driver.findElement(By.className("email")).getText(); }
				catch (Exception e) { email = null; }
				
				try { url = driver.findElement(By.className("url")).getText(); }
				catch (Exception e) { url = null; }
				
				if (email != null)
					this.contacts.add(email);
				else if (url != null)
					this.contacts.add(url);
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public void save() {
		try {
			PrintWriter writer_contacts = new PrintWriter(EMAILS_PATH, "UTF-8");
			
			for (String contact : this.contacts)
				writer_contacts.println(contact);
			
			writer_contacts.close();
			this.driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		GitHubUserMailCollector x = new GitHubUserMailCollector();
		x.collect();
		x.save();
	}

}
