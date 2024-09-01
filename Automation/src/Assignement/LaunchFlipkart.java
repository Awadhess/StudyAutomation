package Assignement;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchFlipkart 
{
public static void main(String[]args) throws InterruptedException

{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(5000);
	WebElement search = driver.findElement(By.xpath("//input[@name ='q']"));
	search.sendKeys("laptop",Keys.ENTER);
	List<WebElement> pruductdetails = driver.findElements(By.xpath("//div[@class = 'col col-7-12']"));
	//search.click();
	for(int i=0; i<=pruductdetails.size(); i++)
	{
		System.out.println(pruductdetails.get(i).getText());
		System.out.println("====================================================================================================================");
	}
		
	driver.quit();
}
}
