package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocators {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.google.com");
	driver.switchTo().activeElement().sendKeys("joey Tribbiani",Keys.ENTER);
	driver.findElement(By.className("lNPNe")).click();
	
	
	}

}
