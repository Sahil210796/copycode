package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_Keyword3_Priority2
{
	@Test(priority = -3)            //duplicate priority=2
	public void TC3() 
	{
		Reporter.log("running TC3", true);
	}
	
	
	@Test(priority = 2)            //duplicate priority=2
	public void TC2() 
	{
		Reporter.log("running TC2", true);
	}
	
	
	@Test                      //  bydefault priority=0
	public void TC1() 
	{
		Reporter.log("running TC1", true);
	}
}
