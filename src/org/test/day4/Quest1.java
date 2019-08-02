package org.test.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quest1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Alerts\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		//**********************************************************************************************
		Thread.sleep(6000);
		WebElement popUp=driver.findElement(By.xpath("//button[@type='button']"));
		popUp.click();
		
		WebElement parag=driver.findElement(By.xpath("//strong[contain(text(),'Selenium with Appium course syllabus'])"));
		String pg=parag.getText();
		System.out.println(pg);

}
}
