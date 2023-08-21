package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class example2_loginToPBApp_DDF
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Daily Examples\\Revision Session2\\SeleniumRevision2.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		//click on signIn btn
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
				
		//enter mob num
		String mobNum = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys(mobNum);
				
		//click on signIN with pwd btn
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		
		Thread.sleep(2000);
		
		//enter pwd
		String pwd = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='central-login-password']")).sendKeys(pwd);
				
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
		String expFullName=sh.getRow(0).getCell(2).getStringCellValue();
		
		
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
