package com.Interview;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_Test {
	@Test
	public static void test1() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chank\\eclipse-workspace\\MavenProject\\ChromeNew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("iphone 11 pro");
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		search.click();
		WebElement findphone = driver.findElement(By.xpath("(//img[@class='s-image'])[2]"));
		findphone.click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String id : windowHandles) {
			driver.switchTo().window(id);
		}

		WebElement addcard = driver.findElement(By.id("add-to-cart-button"));
		addcard.click();

	}
}