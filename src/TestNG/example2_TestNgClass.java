package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class example2_TestNgClass 
{
	@Test
	public void name() throws InterruptedException 
	{		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		
		Thread.sleep(2000);
		
		driver.close();			
	}

}
