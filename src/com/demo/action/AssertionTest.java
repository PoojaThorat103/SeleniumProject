package com.demo.action;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {

	@Test
	public void testAss() {
		// soft assert
		SoftAssert SoftAssert1 = new SoftAssert();
		SoftAssert1.assertTrue(false);
		System.out.println("softAssert Method Was Executed");	
		
		/*Assert.assertTrue(false);
		System.out.println("Hard Method Was Executed");*/	

	}
	
	@Test
	public void testTwo() {
		System.out.println("this is test Two");
	}
}
