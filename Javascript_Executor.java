package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Executor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ASUS\\eclipse-workspace\\Selenium _Java_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/ ");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//a[text()='Log in']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", login);
		Thread.sleep(3000);
		WebElement mail = driver.findElement(By.xpath("//input[@type='text']"));
		js.executeScript("arguments[0].scrollIntoView()", mail);
		js.executeScript("arguments[0].value='sruthi@gmail.com'", mail);
		js.executeScript(" arguments[0].setAttribute('style','color:violet')", mail);
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].scrollIntoView()", pass);
		js.executeScript("arguments[0].value='098765'", pass);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView()", login);
		js.executeScript("arguments[0].click()", login);

	}

}
