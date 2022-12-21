package com.selenium.concept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single_Frames {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ASUS\\eclipse-workspace\\Selenium _Java_Project\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Frames.html ");
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			driver.manage().window().maximize();
			WebElement single = driver.findElement(By.xpath("//a[@data-toggle='tab']"));
			single.click();
			driver.switchTo().frame("singleframe");
			WebElement text1 = driver.findElement(By.xpath("//input[@type='text']"));
			text1.sendKeys("singleframe");
			
			
	}

}
