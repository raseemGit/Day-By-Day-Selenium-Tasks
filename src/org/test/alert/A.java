package org.test.alert;

//import java.util.Set;

//import java.util.List;


import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;

public class A {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Alerts\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		//****************************************************************************
		Thread.sleep(1000);
		
		WebElement contactUs=driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		contactUs.click();
		
		WebElement name=driver.findElement(By.id("InputName"));
		name.sendKeys("Mohamed Raseem");
		WebElement eMail=driver.findElement(By.id("InputEmail1"));
		eMail.sendKeys("raseem.moha@gmail.com");
		WebElement phoneNumber=driver.findElement(By.id("InputSubject"));
		phoneNumber.sendKeys("9442932436");
		//To Select Course
		WebElement courseElement= driver.findElement(By.name("courses"));
		Select selectCourse = new Select(courseElement);
		selectCourse.selectByIndex(5);
		//To Select Branch
		WebElement branchElement= driver.findElement(By.name("branch"));
		Select selectBranch = new Select(branchElement);
		selectBranch.selectByIndex(2);
		//To Select Time
		WebElement timeElement= driver.findElement(By.name("time"));
		Select selectTime = new Select(timeElement);
		selectTime.selectByIndex(0);
		
		WebElement descElement=driver.findElement(By.name("comments"));
		descElement.sendKeys("This is For Only Automation Testing Purpose.");
		
		
		
		
		
		
		

			}
	
	

}
