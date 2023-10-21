package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkTextLocator {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://omayo.blogspot.com/");
	   driver.findElement(By.linkText("Open a popup window")).click();
	   driver.manage().window().maximize();
	}

}
