package org.day5.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Quest5 {
	//Mobile and electronics is first mouseOver and click range Rs5001 - Rs10000
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Selenium_Day5_Tasks\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.sprint.com/");
		
		Actions actions = new Actions(driver);
		Thread.sleep(6000);
		WebElement mob1=driver.findElement(By.xpath("//a[text()='\r\n" + 
				"              Shop Plans']"));
		actions.moveToElement(mob1).perform();
		
		Thread.sleep(8000);
		
		WebElement rangeClick=driver.findElement(By.xpath("//a[text()='Rs.5001 - Rs.10000']"));
		actions.click(rangeClick).perform();
		
		
		
		
		
	}

}
