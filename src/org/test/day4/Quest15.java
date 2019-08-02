package org.test.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quest15 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Alerts\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//*****************************************************************************************
		//Click login/sign up and give the details and press submit.
	    // Print the details you are given.
		
		WebElement loginClick=driver.findElement(By.xpath("//a[text()='Login & Signup']"));
		loginClick.click();
		Thread.sleep(3000);
		WebElement name=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		name.sendKeys("raseem66");
		//Code Dropped---------------------------------
	}

}
