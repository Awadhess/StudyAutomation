package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCssSelector {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		// search the selementy by css selector 
		
		//WebElement text = 	driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']"));
		WebElement text = driver.findElement(By.cssSelector("input[type='text']"));
		text.sendKeys("dcdfs");
		Thread.sleep(5000);
		driver.quit();
	

	}

}
