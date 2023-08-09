package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example5_getAllSelectedOptionFrom_MultiSelectableListbox
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new  ChromeDriver();
		driver.get("file:///D:/Daily%20Examples/Revision%20Session2/Selenium/Html%20Files/listbox.html");
		
		Thread.sleep(2000);
		
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
		Select s=new Select(selectCountry);
		
		s.selectByIndex(0);
		s.selectByIndex(2);
		s.selectByIndex(3);
	
	
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		
		for(WebElement s1:allSelectedOptions)
		{
			System.out.println(s1.getText());
		}
		
		
	}

}
