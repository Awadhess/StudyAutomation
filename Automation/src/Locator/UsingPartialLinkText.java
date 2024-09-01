

package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingPartialLinkText 
{
 public static void main (String[]args) throws InterruptedException
 {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com");
	 Thread.sleep(5000);
	 
	 
	// Hit the element using partailLinkText
	 WebElement link = driver.findElement(By.partialLinkText("Forgotten"));
	 link.click();
	 Thread.sleep(5000);
	 driver.quit();
 }
	
}
