
package GetMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchAmzone 
{
public static void main (String[]args)
{
	// launch the browser
	WebDriver driver = new ChromeDriver();
	
	//maximize the window using manage method
	driver.manage().window().maximize();
	
	// launch the application
	driver.get("http://www.flipkart.com");
	
	// to fetch the Title using getTitle method
	String actual_title = driver.getTitle();
	String expected_title = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	if(actual_title.equals(expected_title))
		System.out.println("Title is correct");
	else
		System.out.println("Title is wrong");
	
	// get current using getCurrentUrl method
	
	String actual_url = driver.getCurrentUrl();
	String expected_url = "https://www.flipkart.com/";
	if(actual_url.equals(expected_url))
		System.out.println("url is correct");
	else
	{
		System.out.println("url is wrong");
	}
	
	// fetch the source code using getPageSource method()
	System.out.println(driver.getPageSource());
	
	
	// closed
	driver.close();
}
}
