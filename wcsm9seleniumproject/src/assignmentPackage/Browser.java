package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class Browser {
  public static void main(String[] args) throws InterruptedException
  {
	   //create a object
	  WebDriver driver =new ChromeDriver();
	  //delay application using thread
	  Thread.sleep(2000);
	  //maximize the window using manage method
	  driver.manage().window().maximize();
	  //open the instagram login page using get method
	   driver.get("https://www.instagram.login.com");
	   driver.findElement(By.xpath(By.name(""//input[@name='username'])").sendKeys("abc"));
	  
  }

}
