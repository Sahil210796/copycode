package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_selectMultipleCheckboxes
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Daily%20Examples/Revision%20Session2/Selenium/Html%20Files/multipleCheckboxes.html");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		
		for(WebElement link:allLinks)
		{
			link.click();
			Thread.sleep(500);
		}
		
	}
}
