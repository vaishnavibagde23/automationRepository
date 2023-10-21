package MethodsOfWebDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
	public static void main(String[]args) throws InterruptedException
	{
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.instagram.com/accounts/login/?next=https%3A%2F%2Fwww.instagram.com%2Fdirect%2Finbox%2F%3Fnext%3D%252F%26__coig_login%3D1");
	   driver.manage().window().maximize();
	   String urlofloginpage=driver.getCurrentUrl();
	   System.out.println(urlofloginpage);
	   Thread.sleep(2000);
	}
}