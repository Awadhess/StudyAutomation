package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TagNameLocator 
{
public static void main (String[] args) throws InterruptedException
{
	// to lauch the browser
	WebDriver driver = new ChromeDriver();
	//to maximize the window
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	// to identify the searchtext field with the help of tagName
	
	WebElement searchTextField = driver.findElement(By.tagName("input"));
	searchTextField.sendKeys("books");
	Thread.sleep(10000);
	driver.quit();
}
}
