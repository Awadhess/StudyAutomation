package Assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AirVistatra {

	public static void main(String[] args) throws InterruptedException 
	{
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.airvistara.com/in/en");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@type= 'radio' and @ id = 'onewaytrip']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@name= 'flightSearchFrom']")).sendKeys("goa");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//span[text()=', Dabolim (GOI) ']")).click();
     
      driver.quit();
	}

}
