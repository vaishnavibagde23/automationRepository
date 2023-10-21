package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	   Thread.sleep(2000);
	   driver.get("webpage.html");
	   //identify webelement username textbox and pass a value
	   driver.findElement(By.tagName("input")).sendKeys("admin");
	}

}
