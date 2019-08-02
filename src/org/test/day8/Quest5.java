package org.test.day8;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quest5 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Alerts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		//*******************************************************************************************
		WebElement btn=	driver.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN']"));
		btn.click();
		
		WebElement logIn=	driver.findElement(By.id("Button2"));
		logIn.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
}
}
