package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeXpathLocator {
	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
		   driver.get("https://timetracker.ctepl.com/actitime/login.do");
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		   driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		   driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();

 }
} 