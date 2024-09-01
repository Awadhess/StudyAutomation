package Assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Spotify {

	public static void main(String[] args) throws InterruptedException
	{
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://open.spotify.com");
     Thread.sleep(10000);
     driver.findElement(By.xpath("//span[text()='Log in']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@placeholder = 'Email or username']")).sendKeys("ashuawadhesh@gmail.com");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Ashudhiru@123");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//span[text()='Log In']")).click();
     Thread.sleep(10000);
     driver.findElement(By.xpath("//div[@id = 'onClickHintspotify:show:2Glo2VmfYg9mWi53MPSh7a-0']")).click();   //driver.findElement(By.partialLinkText("Sajni")).click();
    // Thread.sleep(2000);
     
     //driver.quit();
     
     
	}

}
