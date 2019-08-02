package org.test.day7;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quest2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Alerts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		
		
		//*******************************************************************************************
		Thread.sleep(3000);
		WebElement cookie=driver.findElement(By.id("cookie_action_close_header"));
		cookie.click();
		
		
		
		
		WebElement txt=driver.findElement(By.xpath("//a[text()='TOOLSQA']"));
		Thread.sleep(3000);
		JavascriptExecutor jk = (JavascriptExecutor)driver;
		jk.executeScript("arguments[0].scrollIntoView(true)", txt);
		Thread.sleep(3000);
		WebElement menu=driver.findElement(By.id("primary-menu"));
		jk.executeScript("arguments[0].scrollIntoView(false)", menu);
	
		}
	
}
