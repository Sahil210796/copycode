package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1_selectOption_fromMultiSelectableListbox 
{
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new  ChromeDriver();
		driver.get("file:///D:/Daily%20Examples/Revision%20Session2/Selenium/Html%20Files/listbox.html");
		
			
		Thread.sleep(2000);
		
		
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s=new Select(selectCountry);
		
		s.selectByVisibleText("Ind");
		s.selectByIndex(1);
		
	}

}
