package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIDlocator {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		// find the element by using iD locator 
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.sendKeys("678987678978");
		
		// find the element by using name attribute 
		driver.findElement(By.name("pass")).sendKeys("jdbjd");
		
		// find the element by using class attribute
		driver.findElement(By.className(""))
		Thread.sleep(10000);
		driver.quit();

	}

}
