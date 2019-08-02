package org.test.alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Quest16 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Alerts\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		//************************************************************************************************
		
		Thread.sleep(3000);
		WebElement signUp=driver.findElement(By.xpath("//a[text()='Sign up']"));
		signUp.click();
		WebElement phone=driver.findElement(By.id("mobile"));
		phone.sendKeys("9826725187");
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("raseem");
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("raseem@123");
		WebElement pass= driver.findElement(By.id("password"));
		pass.sendKeys("raseem@123");
		
		
		
		
		
		
}
}
