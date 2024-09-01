package Assignement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MMT 
{
  public static void main (String[]args)
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.makemytrip.com/");
	  driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
	  driver.findElement(By.xpath("//li[@class='menu_Trains']")).click();
	  driver.findElement(By.xpath("//label[@for='fromCity']")).click();
	  driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Lucknow");
	  driver.findElement(By.xpath("//span[text()='Lucknow - All Stations']")).click();
	  //driver.findElement(By.xpath("//input[@data-cy='toCity']")).click();
	  driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Varanasi");
	  driver.findElement(By.xpath("//span[text()='Varanasi - All Stations']")).click();
	  driver.findElement(By.xpath("//div[@ aria-label='Wed Oct 30 2024']")).click();
	  driver.findElement(By.xpath("//li[text()='All Class']")).click();
	  driver.findElement(By.xpath("//a[text()='Search']")).click();
	  driver.findElement(By.xpath("//div[@class='card ']")).click();
	  driver.findElement(By.xpath("//p[text()='Pay fees on cancellation']")).click();
	  driver.findElement(By.xpath("//span[text()='Add Traveller']")).click();
	  driver.findElement(By.xpath("//input[@placeholder='Enter Traveller Name']")).sendKeys("Awadhess");
	  driver.findElement(By.xpath("//input[@class='font14 darkGreyText  ']")).sendKeys("19");
	  driver.findElement(By.xpath("//span[text()='Select']")).click();
	  driver.findElement(By.xpath("//span[text()='Male']")).click();
	  driver.findElement(By.xpath("//button[text()='Add']")).click();
	  //driver.findElement(By.xpath("//span[@class='checkBox  appendRight20']")).click();
	  driver.findElement(By.xpath("//input[@placeholder='Enter IRCTC username']")).click();
	  driver.findElement(By.xpath("//input[@placeholder='sham171993']")).sendKeys("Awadhess1");
	  driver.findElement(By.xpath("//span[text()='Submit']")).click();
	  driver.findElement(By.xpath("//input[@placeholder='Enter Email Id']")).sendKeys("ashuawadhesh@gmail.com");
	  driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("9625909204");
	  driver.findElement(By.xpath("//span[@class='checkboxWpr']")).click();
	  driver.findElement(By.xpath("//span[text()='Pay & Book Now']")).click();
	  
	  
	  // print the train details in consloe
	   /*List <WebElement> TrainDetails =  driver.findElements(By.xpath("//div[@class='single-train-detail single-train-padding']"));
	 
	 for(WebElement detail:TrainDetails)
	 {
		 System.out.println(detail.getText());
		 System.out.println("==========================");
	 }*/
	  
	  
	  
  }
}
