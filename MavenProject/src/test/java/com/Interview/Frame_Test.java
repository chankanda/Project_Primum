package com.Interview;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Test {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chank\\eclipse-workspace\\MavenProject\\ChromeNew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Frames.html");

		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);

		driver.switchTo().frame(0);

		WebElement frame = driver.findElement(By.xpath("//input[@type='text']"));
		frame.sendKeys("Selenium");

		driver.switchTo().defaultContent();

		WebElement multiple = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		multiple.click();

		WebElement outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outer);

		WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(inner);

		WebElement frame1 = driver.findElement(By.xpath("//input[@type='text']"));
		frame1.sendKeys("Java");

		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
	}
}