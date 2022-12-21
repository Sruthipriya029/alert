package com.selenium.concept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_methods {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ASUS\\eclipse-workspace\\Selenium _Java_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email_Id = driver.findElement(By.id("email"));
		email_Id.sendKeys("qwerty@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("56783");
		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\ASUS\\eclipse-workspace\\Selenium _Java_Project\\screenshot/fblogin.png");
		FileUtils.copyFile(source, destination);
	}

}
