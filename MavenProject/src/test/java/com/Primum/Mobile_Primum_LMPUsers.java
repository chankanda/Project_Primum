package com.Primum;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Mobile_Primum_LMPUsers {
	public static RemoteWebDriver driver;

	public void setUp() {

//Set up desired capabilities and pass the Android app-activity and app-package to Appium
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformVersion", "10");
		capabilities.setCapability("deviceName", "3200fb5afc4465bd");
		capabilities.setCapability("platformName", "Android");

// This package name of your app (you can get it from apk info app)

		capabilities.setCapability("appPackage", "com.android.chrome");

// This is Launcher activity of your app (you can get it from apk info app)
		capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");

//Create RemoteWebDriver instance and connect to the Appium server
//It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities

		try {
			driver = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public String testCalculator() {
		setUp();
		WebElement login = driver.findElement(By.id("//android.view.View[@content-desc=\"Log In\"]/android.widget.TextView\r\n"
				+ ""));
		login.click();
		return null;
		
//		WebElement plus = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
//		plus.click();
//		WebElement secondNum = driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
//		secondNum.click();
//		WebElement equals = driver.findElement(By.id("com.google.android.calculator:id/eq"));
//		equals.click();
//
//		String result = driver.findElement(By.id("com.google.android.calculator:id/result")).getText();
//		return result;
	}

	public static void main(String[] args) {

// TODO Auto-generated method stub
		Mobile_Primum_LMPUsers app = new Mobile_Primum_LMPUsers();
		System.out.println("The result is : " + app.testCalculator());
	}
}