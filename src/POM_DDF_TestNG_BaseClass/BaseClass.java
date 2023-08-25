package POM_DDF_TestNG_BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass 
{
	WebDriver driver;
	
	public void initializeBrowser() 
	{
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		 driver=new ChromeDriver(op);
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();		
	}

}
