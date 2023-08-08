package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_isSelected
{
	public static void main(String[] args) throws InterruptedException {
				
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
				
		Thread.sleep(3000);
		
		boolean result = driver.findElement(By.xpath("//input[@class='_8esa']")).isSelected();	
		System.out.println(result);
	
	}
}
