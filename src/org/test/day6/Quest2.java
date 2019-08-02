package org.test.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quest2 {
	//In google and click google apps(::) and click gmail app.

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Alerts\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/webhp");
		//**********************************************************************************************
		
		WebElement appG=driver.findElement(By.xpath("//a[@title='Google apps']"));
		appG.click();
		
		WebElement gmail=driver.findElement(By.xpath("//span[text()='Gmail']"));
		gmail.click();

}
}
