package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver ",
				"C:\\Users\\ASUS\\eclipse-workspace\\Selenium _Java_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement mail_Id = driver.findElement(By.xpath("//input[contains(@placeholder,'address')]"));
		mail_Id.sendKeys("srutji@gmail.com");
		WebElement pass = driver.findElement(By.xpath("(//input[contains(@data-testid,'roya')])[2] "));
		pass.sendKeys("656725");

	}

}
