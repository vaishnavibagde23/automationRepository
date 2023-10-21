package MethodsOfWebDrivers;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class SwitchToMethod {
	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
		   driver.get("https://www.google.com");
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);	}

}
