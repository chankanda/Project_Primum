package com.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	@Test (dataProvider = "data")
	private void credentials(String username, String password) {
		System.out.println("Username is : "+ username);
		System.out.println("Password is : "+ password);

	}
	
	@DataProvider
	private Object[][] data() {
		return new Object[][] {
			{"James", "james@123"},
			{"Jason", "jason@123"},
			{"Steve", "steve@123"}};

	}
}
