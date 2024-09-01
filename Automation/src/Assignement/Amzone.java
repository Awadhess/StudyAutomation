package Assignement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amzone 
{
public static void main (String[]args) throws InterruptedException
{
    WebDriver  driver = new ChromeDriver();
    driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://www.amazon.in/");
    driver.findElement(By.id("nav-link-accountList")).click();
    //driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
    //Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("ashuawadhesh@gmail.com");
    driver.findElement(By.xpath("//input[@class = 'a-button-input']")).click();
    
    
}
}
