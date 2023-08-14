package Popup;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_switchTo_childBrowserPopup1
{
	public static void main(String[] args) throws InterruptedException
	{			
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Thread.sleep(2000);
		
		//click newTab from main page
		driver.findElement(By.xpath("//body/div[2]/form[1]/fieldset[1]/div[1]/a[1]/input[1]")).click();
		
		
		//get childWindowID
		Set<String> allIds = driver.getWindowHandles();     //[mainPageId, childWindowID]
		ArrayList<String> al=new ArrayList<>(allIds);       //[mainPageId(0), childWindowID(1)]
		
		//switch to child window
		driver.switchTo().window(al.get(1));  //String childWindowID
		
		
	//click on training from child window
		driver.findElement(By.xpath("//header/ul[@id='primary-menu']/li[7]/a[1]/span[1]/span[1]")).click();	
		
	}
}
