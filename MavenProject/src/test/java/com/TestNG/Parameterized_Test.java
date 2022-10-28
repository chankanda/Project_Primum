package com.TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {

	@Test
	@Parameters({"username", "password"})
	private void credentials(@Optional("Jason") String username, String password) {
		// inputValueElement(pom.getInstanceLP().getUsername(), username;)
		System.out.println("Username is: " + username);
		System.out.println("Password is: " + password);
	}

}
