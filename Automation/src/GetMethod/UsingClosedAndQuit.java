package GetMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingClosedAndQuit 
{
public static void main (String[] args)
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogsport.com");
	
	// close() methos used for closed the parents window
	//driver.close();
	
	// quite method closed parents window as well child
	driver.quit();
	
}
}
