package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
	public static void main(String[] args) {
		
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		         driver.get("actitime.3");
		         WebDriver usnTb= (WebDriver) driver.findElement(By.name("username"));
		        String u =usnTb.sendKeys("admin");
		         Thread.sleep(2000);
		         WebElement passTB =driver.findElement(By.name("pwd"));
		         passTB.sendKeys("manager");
		       By by;
				//select checkbox  
		         driver.findElement(by.name("remeber")).click();
		         
		       // click on login button
		      
		        driver.findElement(by.id("loginButton")).click();
		        

	}
	 }

