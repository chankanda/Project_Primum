package com.TestNG;

import org.testng.annotations.Test;

public class Timeout_Test {

	@Test(timeOut = 7000)
	private void logIn() throws InterruptedException {

		Thread.sleep(2000);
		System.out.println("Set Property");
		System.out.println("Browser launch");

		Thread.sleep(3000);
		System.out.println("get url");
		System.out.println("signin");
		System.out.println("Pass Credentials");

		Thread.sleep(2000);
		System.out.println("click login");
	}
}
