package org.day5.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quest4 {
	//Editorial mouseOver 
    //Click entertainment.
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Selenium_Day5_Tasks\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.gettyimages.in/editorial-images");
	
	WebElement editorial=driver.findElement(By.xpath("(//a[text()='EDITORIAL'])[2]"));
	editorial.click();
	
	WebElement entertainment=driver.findElement(By.xpath("//a[text()='Entertainment']"));
	entertainment.click();
	}

}
