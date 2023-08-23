package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example4_TestNgAnnotations 
{
	@BeforeClass
	public void openBrowser() 
	{
		Reporter.log("--open Browser--", true);
	}
	
	@BeforeMethod
	public void loginToApp() 
	{
		Reporter.log("--Login to App--", true);
	}
	
	@Test
	public void VerifyFullName()   
	{
		Reporter.log("running VerifyFullName Test case", true);
	}
	
	
	@Test
	public void VerifyFullName2()   
	{
		Reporter.log("running VerifyFullName2 Test case", true);
	}
	
	@AfterMethod
	public void logoutFromApp() 
	{
		Reporter.log("--Logout from App--", true);
	}
	
	
	@AfterClass
	public void closeBrowser() 
	{
		Reporter.log("--close Browser--", true);
	}
}
