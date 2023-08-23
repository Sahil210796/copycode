package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_AssertClass2_assertNotEquals
{
	@Test
	public void TC1() 
	{
		String actResult="hi";
		String expResult="hi";
		Assert.assertNotEquals(actResult, expResult,"Failed- both results are same:    ");
	}
	
}
