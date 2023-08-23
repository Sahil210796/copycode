package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_Keyword4_Timeout
{
	@Test(timeOut = 5000)
	public void TC1() throws InterruptedException 
	{
		Thread.sleep(3000);
		Reporter.log("running TC1", true);
	}

}
