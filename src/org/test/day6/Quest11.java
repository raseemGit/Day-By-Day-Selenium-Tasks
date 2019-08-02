package org.test.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Quest11 {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Selenium_Day5_Tasks\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.swiggy.com/restaurants/login-besant-nagar-adyar-chennai-8308");
		//*****************************************************************************************************
		Actions actions = new Actions(driver);
		Robot r = new Robot();
		Thread.sleep(2000);
		WebElement signIn=driver.findElement(By.xpath("//span[text()='Sign In']"));
		signIn.click();
		WebElement login=driver.findElement(By.id("mobile"));
		login.sendKeys("9836282929");
		Thread.sleep(3000);
		
		WebElement logIn2=driver.findElement(By.xpath("//a[text()='Login']"));
		logIn2.click();
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_X);r.keyRelease(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		for(int i =1; i<=3;i++) {
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		}
}
