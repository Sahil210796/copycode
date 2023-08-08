package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7_Displayed
{
	public static void main(String[] args) throws InterruptedException {
				
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.facebook.com/");
			
		boolean result = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		System.out.println(result);
	
	}
}
