package com.Primum;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Primum_LMPUsers {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chank\\eclipse-workspace\\MavenProject\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://qa-app.primum.co/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("alep.ramirez+qa-lmp2@kinandcarta.com");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Testing123");

		WebElement login = driver.findElement(By.xpath("//button[@role='button']"));
		login.click();

		Thread.sleep(4000);

		WebElement search = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		search.click();

		WebElement text = driver.findElement(By.xpath("//li[contains(text(), 'Acute Myeloid Leukemia (AML)')]"));
		text.click();

		Thread.sleep(4000);

		WebElement message = driver.findElement(By.xpath("(//button[contains(text(), 'Message')])[3]"));
		message.click();

		Thread.sleep(4000);

		WebElement messagebox = driver.findElement(By.name("message"));
		messagebox.sendKeys("This is new disease");

		WebElement yes = driver.findElement(By.xpath("//input[@label='Yes']"));
		yes.click();

		Thread.sleep(4000);

		WebElement search1 = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		search1.click();

		WebElement text1 = driver.findElement(By.xpath("//li[contains(text(), 'New Diagnosis (New DX)')]"));
		text1.click();

		WebElement age = driver.findElement(By.name("age"));
		age.sendKeys("60");

		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();

		Thread.sleep(4000);

		WebElement gotoinbox = driver.findElement(By.xpath("//button[contains(text(), 'Go to Inbox')]"));
		gotoinbox.click();

		WebElement inbox = driver.findElement(By.xpath("(//button[@class='block w-full'])[1]"));
		inbox.click();

		WebElement newmessage = driver
				.findElement(By.xpath("//textarea[@placeholder='New message. CTRL + Enter to send ']"));
		newmessage.sendKeys("Good morning!");

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement closeinquiry = driver.findElement(By.xpath("//button[contains(text(), 'Close Inquiry')]"));
		closeinquiry.click();

//		WebElement close = driver.findElement(By.xpath("//button[contains(text(), 'Close Inquiry')]"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(close).click().build().perform();

		WebElement close = driver.findElement(By.xpath("(//button[contains(text(), 'Close Inquiry')])[2]"));
		close.click();
		
		WebElement feedback1 = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		feedback1.click();

		WebElement rating = driver.findElement(By.xpath("//label[@for='radio_5']"));
		rating.click();

		WebElement info = driver.findElement(By.xpath("//textarea[@type='text']"));
		info.sendKeys("Thank you");

		WebElement submit_feed = driver.findElement(By.xpath("//button[@type='submit']"));
		submit_feed.click();
	}
}