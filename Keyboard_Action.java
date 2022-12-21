package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ASUS\\eclipse-workspace\\Selenium _Java_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a = new Actions(driver);
		a.moveToElement(courses).build().perform();
		WebElement AWS= driver.findElement(By.xpath("//span[text()='AWS Training']"));
		a.moveToElement(AWS).build().perform();
		a.click(AWS).build().perform();
	}

}
