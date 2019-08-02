package org.test.alert;


import org.openqa.selenium.Alert;

//import java.util.Set;

//import java.util.List;


import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;

public class B {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Alerts\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		//***************************************************************************
		Thread.sleep(4000);
		Alert ale=driver.switchTo().alert();
		ale.dismiss();
		
		WebElement signInFrst=driver.findElement(By.id("sign-in-icon-down"));
		signInFrst.click();
		WebElement signInSecond=driver.findElement(By.id("signInLink"));
		signInSecond.click();
		WebElement phoneNumber=driver.findElement(By.id("mobileNoInp"));
		phoneNumber.sendKeys("9876543210");
		
		
		
		
		
		
	
	

}
}
