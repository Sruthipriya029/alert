package com.selenium.concept;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handles {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ASUS\\eclipse-workspace\\Selenium _Java_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement bestsellers = driver.findElement(By.xpath(""));
        Actions a = new Actions(driver);
		a.contextClick(bestsellers).build().perform();
		Robot r = new Robot();
   //		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//
//		String parent_id = driver.getWindowHandle();
//		System.out.println(parent_id);
//		Set<String> id = driver.getWindowHandles();
//		for (String eachid : id) {
//
//			if (parent_id.equals(id)) {
//
//				continue;
//			} else {
//				driver.switchTo().window(eachid);
//				System.out.println(driver.getTitle());
//			}
//
//		}

	}

}
