package GetMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNavigationMethod 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com");
		Thread.sleep(2000);
		driver.navigate().to("https://swiggy.com");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
	}
}
