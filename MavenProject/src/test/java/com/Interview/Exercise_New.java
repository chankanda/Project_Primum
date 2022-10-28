package com.Interview;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise_New {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chank\\eclipse-workspace\\MavenProject\\ChromeNew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone 11 pro");

		WebElement search1 = driver.findElement(By.xpath("//input[@type='submit']"));
		search1.click();

		WebElement iphone = driver.findElement(By.xpath("(//img[@class='s-image'])[2]"));
		iphone.click();

		Set<String> windowHandles = driver.getWindowHandles();
		for (String id : windowHandles) {
			driver.switchTo().window(id);
		}

		WebElement addcard = driver.findElement(By.xpath("//input[@type='button']"));
		addcard.click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\chank\\eclipse-workspace\\MavenProject\\test-output\\image.png");
		FileUtils.copyFile(scr, des);
	}

}