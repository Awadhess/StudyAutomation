package Assignement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchFacebook {

	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");
      Thread.sleep(5000);
      driver.findElement(By.className("_6lti")).click();
      Thread.sleep(5000);
      driver.findElement(By.name("firstname")).sendKeys("Awadhesh");
      driver.findElement(By.name("lastname")).sendKeys("kumar");
      driver.findElement(By.name("reg_email__")).sendKeys("9625909204");
      driver.findElement(By.name("reg_passwd__")).sendKeys("dhnf843h");
      driver.findElement(By.name("websubmit")).click();
      Thread.sleep(5000);
      driver.quit();
	}

}
