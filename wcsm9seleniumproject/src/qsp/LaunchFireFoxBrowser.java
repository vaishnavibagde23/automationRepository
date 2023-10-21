package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFoxBrowser {
	public static void main(String[] args) throws InterruptedException {
		// To launch ChromeBrowser we need to create object of ChromeBrowser
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("FirefoxBrowser are open");
		//to delay the time of closing we use the method from Threat Class Sleep();
		Thread.sleep(2000);
		//to close the browser we need to call the method from WebDriver Interface which is close();
		driver.close();

}
}