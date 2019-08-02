package org.day5.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Quest2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Selenium_Day5_Tasks\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//NOTE: Shop by category is first mouseOver
	    //Mobile and accessories is second mouseOver
	    // Click powerBank
		//******************************************************************************
		Actions actions = new Actions(driver);
		
		WebElement category=driver.findElement(By.xpath("//span[text()='Category']"));
		actions.moveToElement(category).perform();
		
		WebElement mobComp=driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		actions.moveToElement(mobComp).perform();
		
		WebElement powBank=driver.findElement(By.xpath("//span[text()='Power Banks']"));
		actions.moveToElement(powBank).click().perform();
		
	}

}
