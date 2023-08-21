package Framework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class example1_loginToPBApp
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		//click on signIn btn
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
				
		//enter mob num
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys("7020500587");
				
		//click on signIN with pwd btn
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		
		Thread.sleep(2000);
		
		//enter pwd
		driver.findElement(By.xpath("//input[@id='central-login-password']")).sendKeys("abcd@1234");
				
		//click on signIN btn
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		Thread.sleep(2000);
		
		//open myacc options
		WebElement myAcc = driver.findElement(By.xpath("//div[text()='My Account']"));
		Actions act=new Actions(driver);
		act.moveToElement(myAcc).perform();
		Thread.sleep(2000);
		
		//click on my profile
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		
		//switch to child window
		Set<String> allIds = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList(allIds);
		driver.switchTo().window(al.get(1));
				
		//get full name
		String actFullName = driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
		String expFullName="Jan batch";
		
		
		if (actFullName.equals(expFullName)) 
		{
			System.out.println("TC Pass");
		} 
		else 
		{
			System.out.println("TC Fail");
		}
		
		Thread.sleep(4000);
		
		
		driver.quit();
		
	}

}
