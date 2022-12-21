package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_frames {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ASUS\\eclipse-workspace\\Selenium _Java_Project\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Frames.html");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			WebElement multiple = driver.findElement(By.xpath("//a[@data-toggle='tab']"));
			multiple.click();
			Thread.sleep(3000);
			WebElement outer = driver.findElement(By.xpath("//div[contains(@class,'iframes')]"));
			driver.switchTo().frame(outer);
			Thread.sleep(3000);
			WebElement inner = driver.findElement(By.xpath("//div[@class='container']"));
			driver.switchTo().frame(inner);
			Thread.sleep(3000);
			WebElement text = driver.findElement(By.xpath(" //input[@type='text']"));
			text.sendKeys("Hello Demo");
			
	}
	

}
