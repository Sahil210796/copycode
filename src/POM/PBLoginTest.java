package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PBLoginTest
{
	public static void main(String[] args) {
		
		ChromeOptions op = new ChromeOptions();
		
		op.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		PBLoginPage login=new PBLoginPage(driver);
		login.clickPBLoginPageSignInBtn();
		
		PBMobNumPage mobNum=new PBMobNumPage(driver);
		mobNum.inpPBMobNumPageMobnum();
		mobNum.clickPBMobNumPageLoginWithPwd();
		
		PBPwdPage pwd=new PBPwdPage(driver);
		pwd.inpPBPwdPagePwd();
		pwd.clickPBPwdPageSignInBtn();
		
	}
}
