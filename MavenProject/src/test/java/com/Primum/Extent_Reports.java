package com.Primum;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent_Reports {

	WebDriver driver;
	ExtentReports extentreports;
	ExtentSparkReporter htmlreports;
	ExtentTest testCase;

	@Test (priority = 0)
	public void login() throws InterruptedException {
				
		extentreports = new ExtentReports();
		htmlreports = new ExtentSparkReporter("LMPUsers.html");
		extentreports.attachReporter(htmlreports);
	
		testCase=extentreports.createTest("Verify Login Page");
		testCase.log(Status.INFO, "Login LMP_User");
		testCase.log(Status.INFO, "Expected Result: Login LMP_User");
		testCase.log(Status.INFO, "Actual Result: Login LMP_User");
		testCase.log(Status.PASS, "Expected meets actual");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chank\\eclipse-workspace\\MavenProject\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://qa-app.primum.co/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.name("email")).sendKeys("alep.ramirez+qa-lmp2@kinandcarta.com");

		driver.findElement(By.name("password")).sendKeys("Testing123");

		driver.findElement(By.xpath("//button[@role='button']")).click();
		Thread.sleep(4000);
		
	}

	@Test (priority = 1)
	public void searchCancerTypes() throws InterruptedException {
		testCase=extentreports.createTest("Search Cancer Types");
		testCase.log(Status.INFO, "Search Cancer Type");
		testCase.log(Status.INFO, "Expected Result: Search Cancer Types");
		testCase.log(Status.INFO, "Actual Result: Search Cancer Types");
		testCase.log(Status.PASS, "Expected meets actual");

		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();

		driver.findElement(By.xpath("//li[contains(text(), 'Acute Myeloid Leukemia (AML)')]")).click();

		Thread.sleep(4000);
		
	}

	@Test (priority = 2)
	public void messagetoExperts() throws InterruptedException {
		testCase=extentreports.createTest("Message to Experts");
		testCase.log(Status.INFO, "Message to Experts");
		testCase.log(Status.INFO, "Expected Result: Messsage to Experts");
		testCase.log(Status.INFO, "Actual Result: Message to Experts");
		testCase.log(Status.PASS, "Expected meets actual");

		driver.findElement(By.xpath("(//button[contains(text(), 'Message')])[3]")).click();

		Thread.sleep(4000);

		driver.findElement(By.name("message")).sendKeys("This is new disease");

		driver.findElement(By.xpath("//input[@label='Yes']")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();

		driver.findElement(By.xpath("//li[contains(text(), 'New Diagnosis (New DX)')]")).click();

		driver.findElement(By.name("age")).sendKeys("60");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[contains(text(), 'Go to Inbox')]")).click();
	}

	@Test (priority = 4)
	public void Inbox_Closed() throws AWTException, InterruptedException {
		testCase=extentreports.createTest("Inbox and Closed Message");
		testCase.log(Status.INFO, "Received Information into Inbox/Closed tabs");
		testCase.log(Status.INFO, "Expected Result: Received Information in Inbox/Closed tabs");
		testCase.log(Status.INFO, "Actual Result: Received Information in Inbox/Closed tabs");
		testCase.log(Status.PASS, "Expected meets actual");
	
		driver.findElement(By.xpath("(//button[@class='block w-full'])[1]")).click();

		driver.findElement(By.xpath("//textarea[@placeholder='New message. CTRL + Enter to send ']")).sendKeys("Good morning!");

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//button[contains(text(), 'Close Inquiry')]")).click();

		driver.findElement(By.xpath("(//button[contains(text(), 'Close Inquiry')])[2]")).click();

		driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();

		driver.findElement(By.xpath("//label[@for='radio_5']")).click();

		driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Thank you");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		extentreports.flush();
	}
}