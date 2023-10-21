package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	   driver.get("https://timetracker.ctepl.com/actitime/login.do");
	   driver.manage().window().maximize();
	   Thread.sleep(2000);
	   driver.findElement(By.name("username")).sendKeys("admin");
	   driver.findElement(By.name("pwd")).sendKeys("manager");
	   driver.findElement(By.id("loginButton")).click();

}
}