package MethodsOfWebDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	public static void main(String[]args)
	{
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.google.com");
	   driver.manage().window().maximize();
	             String titleofpage=driver.getTitle();
	             System.out.println(titleofpage);
	   
}
}


