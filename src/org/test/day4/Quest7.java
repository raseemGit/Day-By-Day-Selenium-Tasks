package org.test.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quest7 {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\WorkSpace\\Alerts\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//*************************************************************************
	
	WebElement userNameElement=	driver.findElement(By.id("email"));
	userNameElement.sendKeys("Raseem@123");
	WebElement passElement = driver.findElement(By.id("pass"));
	passElement.sendKeys("raseempassword");
	
	Thread.sleep(3000);
	String user=userNameElement.getAttribute("Value");
	System.out.println(user);
	String passw=passElement.getAttribute("value");
	System.out.println(passw);
	
	}
}
