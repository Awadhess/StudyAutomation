package Assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchPaytm 
{
public static void main (String[]args) throws InterruptedException
{
	WebDriver driver =  new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://paytm.com/");
	Thread.sleep(5000);
    driver.findElement(By.xpath("//span[@ id = 'srcCode']")).click();
	Thread.sleep(5000);
    // Clear the pre-field 
	driver.findElement(By.xpath("//img[@class = 'Dr08x']")).click();
	Thread.sleep(2000);
	
	// enter source place is Mumbai 
	driver.findElement(By.xpath("//input[@ class= '_2D0RF']")).sendKeys("mumbai");
	Thread.sleep(2000);
	
	// Select the airport from the drop-down list
	//driver.findElement(By.xpath("//div[text()= 'Chhatrapati Shivaji Maharaj Airport']")).click();
	// by using another path 
    driver.findElement(By.xpath("//div[text()= 'Mumbai, Maharashtra, India']")).click();
	Thread.sleep(2000);
	
	// to select the destination place
	driver.findElement(By.xpath("//span[@ id='destCode']")).click();
	Thread.sleep(2000);
	
	// Click on the cross button to remove the existing field
	driver.findElement(By.xpath("//img[@ class='Dr08x']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='_2D0RF']")).sendKeys("goa");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='GOI']")).click();
	Thread.sleep(2000);
	
	// click on the date 
	driver.findElement(By.id("departureDate")).click();
	//driver.findElement(By.xpath("//span[@ id='departureDate']")).click();
    driver.findElement(By.xpath("(//div[text()='30'])[2]")).click();
	Thread.sleep(2000);
	// click on the add trvaller button
	driver.findElement(By.xpath("//span[text()='1 Traveller']")).click();
	for (int i= 0; i<=4; i++)
	{
       driver.findElement(By.xpath("(//img[@alt='add-icon'])[1]")).click();
       Thread.sleep(2000);
	}
	driver.findElement(By.xpath("//div[@tabindex='0']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class = 'rippleButton']")).click();
	Thread.sleep(2000);
	
	
	//driver.quit();
	
}
}
