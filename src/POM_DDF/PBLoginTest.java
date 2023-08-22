package POM_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PBLoginTest
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("D:\\Daily Examples\\Revision Session2\\SeleniumRevision2.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
			
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		PBLoginPage login=new PBLoginPage(driver);    //early initialization
		login.clickPBLoginPageSignInBtn();            //late initialization
		Thread.sleep(2000);
		
		PBMobNumPage mobNum=new PBMobNumPage(driver);
		String mobileNumber = sh.getRow(0).getCell(0).getStringCellValue();
		mobNum.inpPBMobNumPageMobnum(mobileNumber);
		mobNum.clickPBMobNumPageLoginWithPwd();
		Thread.sleep(2000);
		
		PBPwdPage pwd=new PBPwdPage(driver);
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		pwd.inpPBPwdPagePwd(password);
		pwd.clickPBPwdPageSignInBtn();
		Thread.sleep(2000);
		
		PBHomePage home=new PBHomePage(driver);
		home.openDDOptionPBHomePageMyAcc();
		Thread.sleep(2000);
		
		MyAccPage myAcc=new MyAccPage(driver);
		myAcc.clickMyAccPageMyProfile();
		Thread.sleep(2000);
		
		MyProfilePage profile=new MyProfilePage(driver);
		profile.switchToChildWindow();
		String expFullName = sh.getRow(0).getCell(2).getStringCellValue();
		profile.verifyMyProfilePageFullName(expFullName);
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
