package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_AlertPopup1
{
	public static void main(String[] args)
	{			
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("101");
		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		
		
		//get text from alert popup
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		//click on cancel btn
		//driver.switchTo().alert().dismiss();
		
		
		//click on ok btn from 1st alert popup
		driver.switchTo().alert().accept();
		
		
		//click on ok btn from 2nd alert popup
		driver.switchTo().alert().accept();
		
	}

}
