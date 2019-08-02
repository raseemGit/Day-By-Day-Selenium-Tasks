package org.test.day8;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quest6 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Alerts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sprint.com/");
		//*******************************************************************************************
		Thread.sleep(4000);
		WebElement btn=	driver.findElement(By.xpath("//p[text()='Sign In']"));
		btn.click();
		Thread.sleep(4000);
		WebElement Framelement=driver.findElement(By.xpath("//iframe[@cd_frame_id_='fd943bc35ca00c02d5be4867dc796588']"));
		driver.switchTo().frame(Framelement);
		
		WebElement log=	driver.findElement(By.id("loginHeaderButton"));
		log.click();
		//Code Drop Due to Unable To Locate Frame
}
}
	
