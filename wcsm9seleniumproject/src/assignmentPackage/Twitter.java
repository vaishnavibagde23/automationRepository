package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.edge.EdgeDriver;

public class Twitter {
	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver =new EdgeDriver();
		//maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Navigation Nav =driver.navigate();
		Nav.to("https://twitter.com/i/flow/signup");
		//Nav.back();
		//Nav.forward();
		//Nav.refresh();
		//identify textbox and pass value
		driver.findElement(By.tagName("span")).click();
	  // driver.findElement(By.tagName("input")).sendKeys("vaish");
		Thread.sleep(2000);
		

	}

}
