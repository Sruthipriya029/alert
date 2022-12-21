package com.selenium.concept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Box {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ASUS\\eclipse-workspace\\Selenium _Java_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement clickbutton = driver.findElement(By.xpath("//a[@data-toggle='tab']"));
		clickbutton.click();
		// simple alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement confirm_btn = driver.findElement(By.xpath("//a[@class='analystic']"));
		confirm_btn.click();
		WebElement confirm_alert = driver.findElement(By.xpath(" "));
		confirm_alert.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		WebElement prompt_button = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		prompt_button.click();
		WebElement prompt_alert = driver.findElement(By.xpath(" "));
		prompt_alert.click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("sruthiiii");
		alert3.accept();

	}

}
