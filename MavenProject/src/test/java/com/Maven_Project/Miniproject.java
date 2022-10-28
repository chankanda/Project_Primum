package com.Maven_Project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Miniproject {

public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir")+"\\chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://adactinhotelapp.com/index.php");
		
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("Chandru1234");

	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("Chandru1$");

	WebElement login = driver.findElement(By.id("login"));
	login.click();

	WebElement location = driver.findElement(By.id("location"));
	Select s1 = new Select(location);
	s1.selectByVisibleText("London");

	WebElement hotels = driver.findElement(By.id("hotels"));
	Select s2 = new Select(hotels);
	s2.selectByVisibleText("Hotel Sunshine");

	WebElement room = driver.findElement(By.id("room_type"));
	Select s3 = new Select(room);
	s3.selectByVisibleText("Double");

	WebElement room1 = driver.findElement(By.id("room_nos"));
	Select s4 = new Select(room1);
	s4.selectByVisibleText("1 - One");

	WebElement ci_date = driver.findElement(By.id("datepick_in"));
	ci_date.clear();
	ci_date.sendKeys("10/04/2022");

	WebElement co_date = driver.findElement(By.id("datepick_out"));
	co_date.clear();
	co_date.sendKeys("15/04/2022");

	WebElement aroom = driver.findElement(By.id("adult_room"));
	Select s5 = new Select(aroom);
	s5.selectByVisibleText("2 - Two");

	WebElement childroom = driver.findElement(By.id("child_room"));
	Select s6 = new Select(childroom);
	s6.selectByVisibleText("1 - One");

	WebElement search = driver.findElement(By.id("Submit"));
	search.click();

	WebElement select = driver.findElement(By.id("radiobutton_0"));
	select.click();

	WebElement continu = driver.findElement(By.id("continue"));
	continu.click();

	WebElement fname = driver.findElement(By.id("first_name"));
	fname.sendKeys("Chandrasekaran");

	WebElement lname = driver.findElement(By.id("last_name"));
	lname.sendKeys("Kandasamy");

	WebElement addres = driver.findElement(By.id("address"));
	addres.sendKeys("408, 1st Floor, Somu Nagar, Medavakkam, Chennai");

	WebElement ccnumber = driver.findElement(By.id("cc_num"));
	ccnumber.sendKeys("1234567890000000");

	WebElement cctype = driver.findElement(By.id("cc_type"));
	Select s7 = new Select(cctype);
	s7.selectByVisibleText("VISA");

	WebElement ccexpmonth = driver.findElement(By.id("cc_exp_month"));
	Select s8 = new Select(ccexpmonth);
	s8.selectByVisibleText("September");

	WebElement ccexpyear = driver.findElement(By.id("cc_exp_year"));
	Select s9 = new Select(ccexpyear);
	s9.selectByVisibleText("2022");

	WebElement CVVNum = driver.findElement(By.id("cc_cvv"));
	CVVNum.sendKeys("123");

	WebElement book = driver.findElement(By.id("book_now"));
	book.click();

}
	}
