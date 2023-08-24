package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class example11_Parallel2
{
	@Test
	public void openGoogleApp() throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
	
		driver.close();
	}
	
}
