package org.test.day8;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quest7 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Alerts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//*******************************************************************************************
		WebElement btn=	driver.findElement(By.xpath("//div[text()='Log In/Sign Up']"));
		btn.click();
		
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='/v1/api/login?isIframe=true&theme=mp-web']"));
		driver.switchTo().frame(frame);
		
		WebElement nxtBtn=	driver.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']"));
		nxtBtn.click();
		
		WebElement user=driver.findElement(By.id("input_0"));
		user.sendKeys("raseem67");
		WebElement pass=driver.findElement(By.id("input_1"));
		pass.sendKeys("raseem67");
		
}
}
