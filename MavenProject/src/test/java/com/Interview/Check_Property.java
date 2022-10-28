package com.Interview;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Check_Property {
		
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chank\\eclipse-workspace\\MavenProject\\ChromeNew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://amazon.in/");

		Actions ac = new Actions(driver);
		Robot rb = new Robot();

		WebElement search = driver.findElement(By.xpath("(//a[text()= 'Best Sellers'])[1]"));
		ac.contextClick(search).build().perform();

		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Set<String> windowHandles = driver.getWindowHandles();
		for (String id : windowHandles) {
			driver.switchTo().window(id);
		}
		
		WebElement search1 = driver.findElement(By.id("twotabsearchtextbox"));
		search1.sendKeys("iPhone 13");

		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();

		WebElement phone2 = driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
		phone2.click();

		Set<String> windowHandles2 = driver.getWindowHandles();
		for (String id1 : windowHandles2) {
			String title = driver.switchTo().window(id1).getTitle();
			System.out.println(title);
		}

		WebElement addcart = driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']"));
		addcart.click();
	}
}