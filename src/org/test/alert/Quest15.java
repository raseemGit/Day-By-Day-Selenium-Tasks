package org.test.alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Quest15 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Alerts\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://management.ind.in/forum/lakshmi-vilas-bank-net-banking-application-form-157353.html");
		driver.manage().window().maximize();
		//******************************************************************************************
		
		WebElement userId= driver.findElement(By.id("navbar_username"));
		userId.sendKeys("raseem66");
		
		WebElement pass= driver.findElement(By.id("navbar_password"));
		pass.sendKeys("raseem66");
		
		WebElement rembr= driver.findElement(By.id("cb_cookieuser_navbar"));
		rembr.click();
		
	}
}
