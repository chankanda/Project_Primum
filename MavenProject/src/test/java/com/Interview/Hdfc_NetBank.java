package com.Interview;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc_NetBank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chank\\eclipse-workspace\\MavenProject\\ChromeNew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://v1.hdfcbank.com/assets/popuppages/netbanking.htm");
		driver.manage().window().maximize();
				
		WebElement cook = driver.findElement(By.id("onetrust-accept-btn-handler"));
		cook.click();
		Alert cook1 = driver.switchTo().alert();
		cook1.accept();
		
		WebElement proceed = driver.findElement(By.xpath("//img[@class ='v-desk']"));
		proceed.click();
		

		Set<String> windowHandles = driver.getWindowHandles();
		for (String id : windowHandles) {
			driver.switchTo().window(id);
		}

		
	}

}
