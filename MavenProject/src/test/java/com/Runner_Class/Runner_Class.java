package com.Runner_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.Base_Class.Base_Class;

public class Runner_Class extends Base_Class {
	
	public static WebDriver driver = Base_Class.launchbrowser("chrome");
	
	public static void main(String[] args) {
		
		getUrl("https://adactinhotelapp.com/index.php");

		WebElement username = driver.findElement(By.id("username"));
		InputValue(username, "Chandru1234");
		
		WebElement password = driver.findElement(By.id("password"));
		InputValue(password, "Chandru1$");

		WebElement login = driver.findElement(By.id("login"));
		ClickElement(login);

		WebElement location = driver.findElement(By.id("location"));
		dropDown(location, "byVisibleText", "London");
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		dropDown(hotels, "byVisibleText", "Hotel Sunshine");
		
		WebElement room = driver.findElement(By.id("room_type"));
		dropDown(room, "byVisibleText", "Double");
		
		WebElement room1 = driver.findElement(By.id("room_nos"));
		dropDown(room1, "byVisibleText", "1 - One");
		
		WebElement ci_date = driver.findElement(By.id("datepick_in"));
		InputValue(ci_date, "10/04/2022");
		
		WebElement co_date = driver.findElement(By.id("datepick_out"));
		InputValue(co_date, "15/04/2022");
		
		WebElement aroom = driver.findElement(By.id("adult_room"));
		dropDown(aroom, "byVisibleText", "2 - Two");
		
		WebElement childroom = driver.findElement(By.id("child_room"));
		dropDown(childroom, "byVisibleText", "1 - One");
		
		WebElement search = driver.findElement(By.id("Submit"));
		ClickElement(search);
		
		WebElement select = driver.findElement(By.id("radiobutton_0"));
		ClickElement(select);

		WebElement continu = driver.findElement(By.id("continue"));
		ClickElement(continu);

		WebElement fname = driver.findElement(By.id("first_name"));
		InputValue(fname, "Chandrasekaran");
		
		WebElement lname = driver.findElement(By.id("last_name"));
		InputValue(lname, "Kandasamy");

		WebElement addres = driver.findElement(By.id("address"));
		InputValue(addres, "408, 1st Floor, Somu Nagar, Medavakkam, Chennai");

		WebElement ccnumber = driver.findElement(By.id("cc_num"));
		InputValue(ccnumber, "1234567890000000");

		WebElement cctype = driver.findElement(By.id("cc_type"));
		dropDown(cctype, "byVisibleText", "VISA");

		WebElement ccexpmonth = driver.findElement(By.id("cc_exp_month"));
		dropDown(ccexpmonth, "byVisibleText", "September");

		WebElement ccexpyear = driver.findElement(By.id("cc_exp_year"));
		dropDown(ccexpyear, "byVisibleText", "2022");
		
		WebElement CVVNum = driver.findElement(By.id("cc_cvv"));
		InputValue(CVVNum, "123");
		
		WebElement book = driver.findElement(By.id("book_now"));
		ClickElement(book);
			
		driver.close();
		driver.quit();
	}
}