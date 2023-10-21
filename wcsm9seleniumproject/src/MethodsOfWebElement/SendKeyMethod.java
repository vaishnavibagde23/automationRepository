package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyMethod {
	
	   WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	         driver.get("");
	         WebDriver usnTb= (WebDriver) driver.findElement(By.name("username"));
	         usnTB.sendkeys("admin");
	         Thread.sleep(2000);
	         WebElement passTB =driver.findElement(By.name("pwd"));
	         passTB.sendkeys("manager");

}
 }