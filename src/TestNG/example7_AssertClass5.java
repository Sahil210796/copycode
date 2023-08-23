package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_AssertClass5
{
	@Test
	public void TC1() 
	{
		boolean actResult=true;
		Assert.assertFalse(actResult,"failed1- act result is true:    ");
		
		String actResult1="hi";
		String expResult1="hello";
		Assert.assertEquals(actResult1, expResult1,"Failed2: both results are diff;  ");
		
	}	
}
