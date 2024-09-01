package Assignement;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Myntra {

	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver =new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.myntra.com/");
      Thread.sleep(200);
      driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("jeans",Keys.ENTER);
      
	}

}
