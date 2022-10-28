package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	@BeforeSuite
	private void propertySetup() {
		System.out.println("Property Setup");
	}
	@BeforeTest
	private void browserLaunch() {
		System.out.println("Browser Launch");
	}
	@BeforeClass
	private void launchURL() {
		System.out.println("Lauching the URL");
	}
	@BeforeMethod
	private void signIn() {
		System.out.println("signIn");
	}
	@Test
	private void men() {
		System.out.println("men");
	}
	@Test
	private void women() {
		System.out.println("women");
	}
	@Test
	private void tshirt() {
		System.out.println("t-shirt");
	}
	@AfterMethod
	private void signOut() {
		System.out.println("Sign Out");
	}
	@AfterClass
	private void homePage() {
		System.out.println("Home Page");
	}
	@AfterTest
	private void close() {
		System.out.println("Close");
	}
	@AfterSuite
	private void deleteCookies() {
		System.out.println("Delete all cookies");
	}
}