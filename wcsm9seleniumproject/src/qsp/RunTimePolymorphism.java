package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePolymorphism {
	  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//to take input from user
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the browser value!!!");
		String browserValue = sc.next();
		if(browserValue.equalsIgnoreCase("chrome"))
			{
			driver=new ChromeDriver();
			System.out.println("ChromeDriver is open");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
			System.out.println("ChromeDriver is close");
			}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			driver =new FirefoxDriver();
			System.out.println("FirefoxDriver is open");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
			System.out.println("FirefoxDriver is close");
		}
		else if(browserValue.equalsIgnoreCase("edge"))
		{
			driver =new EdgeDriver();
			System.out.println("edgeDriver is open");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
			System.out.println("edgeDriver is close");
			
		}
	}

}
