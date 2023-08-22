package POM_DDF;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PBLogoutTest
{
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions op = new ChromeOptions();
		
		op.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		PBLoginPage login=new PBLoginPage(driver);
		login.clickPBLoginPageSignInBtn();
		Thread.sleep(2000);
		
		PBMobNumPage mobNum=new PBMobNumPage(driver);
		mobNum.inpPBMobNumPageMobnum();
		mobNum.clickPBMobNumPageLoginWithPwd();
		Thread.sleep(2000);
		
		PBPwdPage pwd=new PBPwdPage(driver);
		pwd.inpPBPwdPagePwd();
		pwd.clickPBPwdPageSignInBtn();
		Thread.sleep(2000);
		
		PBHomePage home=new PBHomePage(driver);
		home.openDDOptionPBHomePageMyAcc();
		Thread.sleep(2000);
		

		MyAccPage acc=new MyAccPage(driver);
		acc.clickMyAccPageMyLogout();
		
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
