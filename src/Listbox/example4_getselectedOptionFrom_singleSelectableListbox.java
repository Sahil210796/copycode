package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example4_getselectedOptionFrom_singleSelectableListbox
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
				
		Thread.sleep(3000);
				
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(month);
		
		
//		WebElement s1 = s.getFirstSelectedOption();
//		String text = s1.getText();
//		System.out.println(text);
		
		String text = s.getFirstSelectedOption().getText();
		System.out.println(text);	
	}
}
