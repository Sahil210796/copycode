package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class example7_SoftAssertClass1
{
	@Test
	public void TC1() 
	{
		SoftAssert soft=new SoftAssert();
		
		boolean actResult=true;
		soft.assertFalse(actResult,"failed1- act result is true:    ");
		
		String actResult1="hi";
		String expResult1="hello";
		soft.assertEquals(actResult1, expResult1,"Failed2: both results are diff;  ");
		
		soft.assertAll();
	}	
}
