package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example3_EmailableReport
{
	@Test
	public void TC1()             //test case or test method 
	{		
		Reporter.log("--running TC1--",true);
	}
	
	
	@Test
	public void TC2()             //test case or test method 
	{		
		Reporter.log("--running TC2--",true);	
	}
}
