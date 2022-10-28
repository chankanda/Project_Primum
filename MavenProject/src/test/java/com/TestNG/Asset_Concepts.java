package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asset_Concepts {
	
	//Hard Assert
/*	@Test
	private void demo() {

		String expected = "James";

		String actual = "James";

		Assert.assertEquals(actual, expected);

		System.out.println("Data Validation");

	}

}*/
	
	//Soft Assert
	
	@Test (priority = 1, retryAnalyzer = Retry_Class.class)
	private void demo1() {

		String expected = "James";

		String actual = "Jason";
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(actual, expected);

		System.out.println("Data Validation");
		
		soft.assertAll();

	}
}