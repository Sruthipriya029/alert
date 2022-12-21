package com.selenium.concept;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Facebook_Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ASUS\\eclipse-workspace\\Selenium _Java_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email_Id = driver.findElement(By.id("email"));
		email_Id.sendKeys("abcd@gamail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("345627");
		WebElement loginbtn = driver.findElement(By.name("login"));
		String text = loginbtn.getText();
		System.out.println(text);
		String cssValue = loginbtn.getCssValue("font-size");
		System.out.println(cssValue);
		loginbtn.click();
		
		
		
		
		}
			
	}