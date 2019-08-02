package org.test.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quest9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Alerts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		//*******************************************************************************************
		Thread.sleep(3000);
		WebElement userName= driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		userName.sendKeys("raseem66");
		
		
		WebElement pass= driver.findElement(By.xpath("(//input[@type='password'])[4]"));
		pass.sendKeys("raseem66");
		
		
		
		
		
		
		
		
		
	}

}
