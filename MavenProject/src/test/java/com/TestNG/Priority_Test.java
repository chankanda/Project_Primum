package com.TestNG;

import org.testng.annotations.Test;

public class Priority_Test {

	@Test
	private void brower_Launch() {
		System.out.println("Browser Launch");
	}

	@Test (priority = 1)
	private void get_Url() {
		System.out.println("get Url");
	}

	@Test (priority = 4)
	private void signIn() {
		System.out.println("SignIn");
	}

	@Test (priority = -1)
	private void setProperty() {
		System.out.println("Set Property");
	}
}