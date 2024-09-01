package LaunchBrowser;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
public class EdgeBrowser 
{
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the browser name ");
	 String browser= sc.next();
	 
	if (browser.equalsIgnoreCase("chrome"))
	{
		ChromeDriver driver = new ChromeDriver();
	}
	else if (browser.equalsIgnoreCase("edge"))
	{
		EdgeDriver driver = new EdgeDriver();
	}
	else if (browser.equalsIgnoreCase("Safari"))
	{
		SafariDriver driver = new SafariDriver();
	}
	else
	{
		System.out.println("You have enterd the worng browser name");
	}
}
}
