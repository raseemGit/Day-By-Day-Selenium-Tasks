package org.test.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//NOTE: Search greens velmurugan and click the 1st link.


public class Quest8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Alerts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//****************************************************************
		WebElement googleSearch=driver.findElement(By.name("q"));
		googleSearch.sendKeys("greens velmurugan");
		
		Thread.sleep(3000);
		WebElement btn=driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		btn.click();
		
		
		
	}

}
