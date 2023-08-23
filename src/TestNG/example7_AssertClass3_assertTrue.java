package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_AssertClass3_assertTrue
{
	@Test
	public void TC1() 
	{
		boolean actResult=false;
		Assert.assertTrue(actResult,"Failed-act result is false:    ");
	}
	
}
