package BrokenLink;
// Java program to detect broken
// links on the webpage
// Imported Packages
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_BrokenLinks
{
public static void main(String[] args) throws IOException
{	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://www.google.co.in/");
	
	// Getting All The Links In One List
	List <WebElement> allLinks = driver.findElements(By.tagName("a"));
	
	// Printing The Total Links Number
	System.out.println("Total Link Size: " + allLinks.size());
	
	for(WebElement s1: allLinks)
	{		
		String url = s1.getAttribute("href");
	
		URL link = new URL(url);
		
		HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
		
		httpConn.connect();
			
		// Getting The Response Code
		int code = httpConn.getResponseCode();
			
		// If The Number Is Greater Than 400,
		// Then It Is Broken Link
		if(code >= 400)
		{
			System.out.println("Broken Link: " + url);
		}
		else
		{
			System.out.println("Valid Link: " + url);
		}	
	}
	
	driver.quit();	
}
}
