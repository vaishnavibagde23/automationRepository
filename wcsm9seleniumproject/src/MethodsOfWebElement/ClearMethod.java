package MethodsOfWebElement;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         driver.get("https://timetracker.ctepl.com/actitime/login.do");
         driver.findElement(By.name=("username").sendKeys("admin"));
         driver.findElement(By.name("Username").sendKeys("admin"));
         driver.findElement(By.name("pwd").sendKeys("admin"));
         driver.findElement(By.name("Username")).clear();       
  }
    }


        
                      