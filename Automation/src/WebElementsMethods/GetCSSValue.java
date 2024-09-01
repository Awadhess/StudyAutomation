package WebElementsMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetCSSValue
{
 public static void main (String [] args)
 {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.myntra.com/");
	 WebElement logo = driver.findElement(By.xpath("//a[contains(@class,'my')]"));
	 String cs = logo.getCssValue("color");
	 System.out.println(cs);
 }
 
}
