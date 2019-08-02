package org.day5.test;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Quest3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Selenium_Day5_Tasks\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.flipkart.com");
		//*****************************************************************************************************
		//NOTE: Home&appliances is first mouseOver 
	    // Click any chair and add it to cart.
		Actions actions = new Actions(driver);
		
		WebElement popUp=driver.findElement(By.xpath("//button[text()='✕']"));
		popUp.click();

		Thread.sleep(4000);
		WebElement homeFurn=driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		actions.moveToElement(homeFurn).perform();
		Thread.sleep(4000);
		WebElement clock=driver.findElement(By.xpath("(//a[@title='Clocks'])[1]"));
		actions.moveToElement(clock).click().perform();
		Thread.sleep(4000);
		WebElement clockAj=driver.findElement(By.xpath("(//a[@title='Ajanta Analog 32 cm X 32 cm Wall Clock'])[1]"));
		actions.click(clockAj).perform();
		
		Set<String> allWindId=driver.getWindowHandles();
		int count =0;
		for(String v : allWindId) {
			if(count==2) {
				driver.switchTo().window(v);
			}
			count=count+1;
			
		}
		//Code Drop Due to Unable to Locate AddCart Button
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
