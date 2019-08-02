package org.day5.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Quest21 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Selenium_Day5_Tasks\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.sprint.com/");
		
		Actions actions = new Actions(driver);
		Thread.sleep(8000);
		WebElement mob1=driver.findElement(By.xpath("(//button[@display-submenu='true'])[2]"));
		actions.moveToElement(mob1).perform();
		
		
}
}
