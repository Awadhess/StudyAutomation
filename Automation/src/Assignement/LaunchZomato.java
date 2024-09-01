package Assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchZomato {

	public static void main(String[] args) throws InterruptedException
	{
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.zomato.com/");
    	   Thread.sleep(5000);
       WebElement search = driver.findElement(By.cssSelector("input[placeholder='Search for restaurant, cuisine or a dish']"));
       Thread.sleep(10000);
       search.sendKeys("Roti");
       search.click();
       Thread.sleep(5000);
       WebElement text=  driver.findElement(By.cssSelector("p[class='sc-1hez2tp-0 sc-bLJvFH isBcSC']"));
       text.click();
       
       driver.quit();
       
	}

}
