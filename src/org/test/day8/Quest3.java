package org.test.day8;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quest3 {
	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Alerts\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
	//*******************************************************************************************
	driver.switchTo().frame("login_page");
	WebElement btn=	driver.findElement(By.xpath("(//td[@colspan='2'])[3]"));
	btn.click();
	
	Alert alert=driver.switchTo().alert();
	alert.accept();
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

