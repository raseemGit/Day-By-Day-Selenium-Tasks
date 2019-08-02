package org.day5.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Quest1 {
	//NOTE: Drag bank ,5000  in debited side  and drop sales,5000 in credited side
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Selenium_Day5_Tasks\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	//******************************************************************************
	Actions actions =new Actions(driver);
	//******************************************************************************
	WebElement s1=driver.findElement(By.xpath("//a[text()=' 5000']"));
	WebElement d1=driver.findElement(By.id("amt7"));
	Thread.sleep(3000);
	actions.dragAndDrop(s1, d1).perform();
	//******************************************************************************
	WebElement s2=driver.findElement(By.xpath("//a[text()=' 5000']"));
	WebElement d2=driver.findElement(By.id("amt8"));
	actions.dragAndDrop(s2, d2).perform();
	//******************************************************************************
	WebElement s3=driver.findElement(By.id("credit2"));
	WebElement d3=driver.findElement(By.id("bank"));
	actions.dragAndDrop(s3, d3).perform();
	//******************************************************************************
	WebElement s4=driver.findElement(By.id("credit1"));
	WebElement d4=driver.findElement(By.id("loan"));
	actions.dragAndDrop(s4, d4).perform();
	}

}
