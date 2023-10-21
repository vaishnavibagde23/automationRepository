package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	public static void main(String[] args) throws InterruptedException {
	// To launch ChromeBrowser we need to create object of ChromeBrowser
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println("ChromeBrowser are open");
	//to delay the time of closing we use the method from Threat Class Sleep();
	Thread.sleep(2000);
	//to close the browser we need to call the method from WebDriver Interface which is close();
	driver.close();
	
}
}