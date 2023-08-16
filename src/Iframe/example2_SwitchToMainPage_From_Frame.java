package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_SwitchToMainPage_From_Frame 
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switch to frame
		driver.switchTo().frame("iframeResult");             //String frameID
		
		//click on "click me" btn from iframe
		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
				
		Thread.sleep(3000);
		
		//switch to main Page
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		
		//click on menu btn from main page
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
		
	}
	
	
	

}
