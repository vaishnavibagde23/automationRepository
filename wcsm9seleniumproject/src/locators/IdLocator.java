package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) throws InterruptedException {
		//launch web application
		WebDriver driver =new ChromeDriver();
		//Delay for 2sec
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
        driver.get("htmlbasic loginpage");
		Thread.sleep(2000);
        //identify the web element username textbox and pass the value
		driver.findElement(By.tagName("input")).sendKeys("Admin");
		Thread.sleep(2000);
		//identify the web element password textbox and pass the value
		driver.findElement(By.id("id2")).sendKeys("manager");
	}

}
