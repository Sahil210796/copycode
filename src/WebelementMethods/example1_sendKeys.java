package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_sendKeys 
{
	public static void main(String[] args) {
		
		
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
		
		WebElement un = driver.findElement(By.xpath("//input[@name='email']"));
		un.sendKeys("abc");
		
	}
}
