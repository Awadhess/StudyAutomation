package Assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DMRC 
{
  public static void main (String[]args) throws InterruptedException
 {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://delhimetrorail.com/");
	 driver.findElement(By.xpath("//button[@class= 'btn-close ']")).click();
	 driver.findElement(By.id("FromStation")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[@class = 'line-stataion-show']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[@class = 'sub-result-name']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("ToStation")).click();
	 driver.findElement(By.xpath("(//div[@class = 'line-stataion-show'])[2]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//font[text() = 'ROHINI SECTOR - 18, 19']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[text()='Show Route & Fare']")).click();
	 
 }
}
