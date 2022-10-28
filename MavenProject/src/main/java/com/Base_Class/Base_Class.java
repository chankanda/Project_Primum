package com.Base_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;

	public static WebDriver launchbrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void ClickElement (WebElement login) {
		login.click();
	}
	public static void InputValue(WebElement input, String value) {
		input.sendKeys(value);
	}
	public static WebDriver close() {
		driver.close();
		return driver;
	}

	public static void quit() {
		driver.quit();
	}
	
	public static void to() {
		driver.switchTo();
	}
	public static void back() {
		driver.navigate().back();
	}
	public static void forward() {
		driver.navigate().forward();
	}
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	public static void alert(String url) {
		driver.navigate().to(url);
	}
	
	public static void robot() throws AWTException {
		Robot r = new Robot();
		r.keyPress(0);
		r.keyRelease(0);
	}
	
	public static void screenshot(WebDriver s1, String s2) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src  = ts.getScreenshotAs(OutputType.FILE);
		File des = new File ("user.dir");
		FileUtils.copyFile(src, des);
	}
	
	public static void dropDown(WebElement element, String type, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);
		}
		else if (type.equalsIgnoreCase("byIndex")) {
			int data = Integer.parseInt(value);
			s.selectByIndex(data);
		}
		else if (type.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(value);
		}
}
}