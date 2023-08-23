package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_Keyword1_invocationcount 
{
	@Test(invocationCount = 3)
	public void TC1() 
	{
		Reporter.log("running TC1", true);
	}

}
