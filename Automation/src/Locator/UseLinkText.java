
package Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class UseLinkText {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		// Click on the link with help of link text
		
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		link.click();
		driver.quit();
		
	}

}
