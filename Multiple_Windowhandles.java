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

public class Multiple_Windowhandles {
	public static WebDriver driver;

	public static void right_click(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick().build().perform();
	}

	public static void keyboard() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void bestseller() {
		String s = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Set<String> All_id = driver.getWindowHandles();
		for (String id : All_id) {
			if (driver.switchTo().window(id).equals(s)) {
				String title = driver.getTitle();
				System.out.println(title);
			}
		}
	}

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ASUS\\eclipse-workspace\\Selenium _Java_Project\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		right_click(mobiles);
		keyboard();
		WebElement bestsellers = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		right_click(bestsellers);
		keyboard();
		
		bestseller();

	}

}
