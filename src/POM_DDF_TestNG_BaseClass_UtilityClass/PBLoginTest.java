package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBLoginTest extends BaseClass
{
	PBLoginPage login;
	PBMobNumPage mobNum;
	PBPwdPage pwd;
	PBHomePage home;
	MyAccPage myAcc;
	MyProfilePage profile;	
		
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException 
	{				
		initializeBrowser();
		
		login=new PBLoginPage(driver); 
		mobNum=new PBMobNumPage(driver);
		pwd=new PBPwdPage(driver);
	    home=new PBHomePage(driver);
		myAcc=new MyAccPage(driver);
		profile=new MyProfilePage(driver);	
	}
	
	@BeforeMethod
	public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		login.clickPBLoginPageSignInBtn();
		Thread.sleep(2000);
		mobNum.inpPBMobNumPageMobnum(UtiltyClass.getTestData(0, 0));
		mobNum.clickPBMobNumPageLoginWithPwd();
		Thread.sleep(2000);
		pwd.inpPBPwdPagePwd(UtiltyClass.getTestData(0, 1));
		pwd.clickPBPwdPageSignInBtn();
		Thread.sleep(2000);
	}
	
	@Test
	public void VerifyFullName() throws InterruptedException, EncryptedDocumentException, IOException   
	{
		home.openDDOptionPBHomePageMyAcc();
		Thread.sleep(2000);
		myAcc.clickMyAccPageMyProfile();
		profile.switchToChildWindow();
		
		String actFullName=profile.getMyProfilePageFullName();
		String expFullName=UtiltyClass.getTestData(0, 2);
		
		Assert.assertEquals(actFullName, expFullName, "Failed: both results are diff");
		Thread.sleep(2000);
	}
	

	
	@AfterMethod
	public void logoutFromApp() 
	{
		
	}
	
	
	@AfterClass
	public void closeBrowser() 
	{
		driver.quit();
	}
}
