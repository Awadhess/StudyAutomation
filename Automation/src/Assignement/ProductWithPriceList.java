package Assignement;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ProductWithPriceList 
{
		public static void main(String[]args) throws InterruptedException

		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//using imnplicity wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.flipkart.com/");
			//Thread.sleep(5000);
			WebElement search = driver.findElement(By.xpath("//input[@name ='q']"));
			search.sendKeys("iphone",Keys.ENTER);
			List<WebElement> pruductdetails = driver.findElements(By.xpath("//div[@class = 'KzDlHZ']"));
			List<WebElement> productprice = driver.findElements(By.xpath("//div[@class = 'Nx9bqj _4b5DiR']"));
			for(int i=0; i<pruductdetails.size();i++)
			{
				for (int j=i; j<=i; j++)
				{
				System.out.println(pruductdetails.get(i).getText()+ "====" +productprice.get(j).getText() );
				
				
			}
			
           //driver.quit();
}
			}
}