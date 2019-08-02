package org.test.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Quest10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Alerts\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//******************************************************************************************
		WebElement signIn=driver.findElement(By.xpath("(//span[text()='Account & Lists'])[1]"));
		signIn.click();
		WebElement createAcc=driver.findElement(By.id("createAccountSubmit"));
		createAcc.click();
		WebElement userName=driver.findElement(By.id("ap_customer_name"));
		userName.sendKeys("raseem");
		WebElement phoneElement=driver.findElement(By.id("ap_phone_number"));
		phoneElement.sendKeys("9442983829");
		
		WebElement mailElement2=driver.findElement(By.id("ap_email"));
		mailElement2.sendKeys("raseem@123");
		WebElement pass=driver.findElement(By.id("ap_password"));
		pass.sendKeys("raseem@123");
		
}	
}