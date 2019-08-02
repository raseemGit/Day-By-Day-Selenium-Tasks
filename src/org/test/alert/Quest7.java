package org.test.alert;
//import java.util.Set;
//import java.util.List;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;

	public class Quest7 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Alerts\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.cleartrip.com/trains");
			driver.manage().window().maximize();
			//***************************************************************************
			WebElement fromElement=driver.findElement(By.id("from_station"));
			fromElement.sendKeys("Chennai");
			WebElement toElement=driver.findElement(By.id("to_station"));
			toElement.sendKeys("Banglore");
			//Using Select
			WebElement selectClassElement=driver.findElement(By.id("trainClass"));
			Select select = new Select(selectClassElement);
			select.selectByIndex(1);
			//Using Actions Class To Perform MouseOverActions
			Actions act = new Actions(driver);
			WebElement dayElement=driver.findElement(By.xpath("(//a[text()='30'])[1]"));
			act.click(dayElement).perform();
			
			
			
			
}
	}
