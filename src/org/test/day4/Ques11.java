package org.test.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques11 {

   //NOTE: Print the UserName and Password that you are entered.

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Alerts\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		//*****************************************************************************************
		
		WebElement userName=driver.findElement(By.id("username"));
		userName.sendKeys("raseem66");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("kajshdkasjdn");
		
		String st1=userName.getAttribute("value");
		String st2=password.getAttribute("value");
		
		System.out.println("UserName : "+st1 +"Password : " +st2);
		
		
		
		
		
		
	}

}
