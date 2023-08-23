package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_AssertClass1_assertEquals
{
	@Test
	public void TC1() 
	{
		String actResult="hi";
		String expResult="hello";
		Assert.assertEquals(actResult, expResult,"Failed: both results are diff;  ");
	}
	
}
