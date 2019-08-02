package org.test.day4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quest16 {
	//Add any fasttrack watch to cart 
    //Print the cost in cart 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Alerts\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		//*****************************************************************************************
		WebElement search=driver.findElement(By.id("autocomplete"));
		search.sendKeys("Fasttrack watch");
		WebElement src=driver.findElement(By.xpath("//a[text()='Search']"));
		src.click();
		WebElement watch=driver.findElement(By.id("det_img_129569302"));
		watch.click();
		Thread.sleep(4000);
		String pwId=driver.getWindowHandle();
		Set<String> allId=driver.getWindowHandles();
		for(String v: allId) {
			if(!pwId.equals(v)) {
				driver.switchTo().window(v);
			}
		}
		WebElement addCart=driver.findElement(By.id("add_cart"));
		addCart.click();
		Thread.sleep(3000);
		WebElement txt=driver.findElement(By.xpath("//span[@content='369']"));
		String amount=txt.getText();
		System.out.println(amount);
		                                             
	}
}
