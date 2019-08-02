package org.test.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Quest9 {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Selenium_Day5_Tasks\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.flipkart.com");
		//*****************************************************************************************************
		Actions actions = new Actions(driver);
		WebElement popUp=driver.findElement(By.xpath("//button[text()='✕']"));
		popUp.click();
		Thread.sleep(5000);
		WebElement login=driver.findElement(By.xpath("//a[text()='Login & Signup']"));
		login.click();
		Thread.sleep(6000);
		WebElement userName=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		userName.sendKeys("Raseem66");
		actions.doubleClick(userName).perform();
		actions.contextClick(userName).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		Thread.sleep(4000);
		actions.contextClick(pass).perform();
		for(int i=1;i<=2;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
				}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		}
}

