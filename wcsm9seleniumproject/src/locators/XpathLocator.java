package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathLocator {
public static void main(String[] args) throws InterruptedException {
	 ChromeOptions co = new ChromeOptions();
	 co.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   Thread.sleep(2000);
	   driver.navigate().to("https://www.irctc.co.in/nget/train-search");
	   Thread.sleep(2000);
       driver.switchTo().activeElement().sendKeys("pune");
	   Thread.sleep(2000);

}
}
