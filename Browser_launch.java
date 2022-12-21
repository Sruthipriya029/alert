package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch {

	public static void main(String[] args) {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\Selenium _Java_Project\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement mail_Id = driver.findElement(By.id("email"));
	mail_Id.sendKeys("sruthi884@gamil.com");
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("098765");
	String attribute = mail_Id.getAttribute("type");
	System.out.println(attribute);
	String tagName = mail_Id.getTagName();
	System.out.println(tagName);
	
	
	
	}	

}
