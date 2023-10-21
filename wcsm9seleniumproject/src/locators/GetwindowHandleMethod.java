package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetwindowHandleMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
        driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
       driver.findElement(By.partialLinkText("open a popup window")).click();
		Thread.sleep(2000);
       String currentUrl =driver.getCurrentUrl();
       System.err.println(currentUrl);
       String tittleOfpage = driver.getTitle();
       System.err.println(tittleOfpage);
        // string sourcepage =driver.getpagesource();
       //System.out.println(sourcepage);
        String parentHandle = driver.getWindowHandle(); 
        System.out.println(parentHandle);
		driver.manage().window().maximize();
		Thread.sleep(2000);
        driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
       driver.findElement(By.partialLinkText("open a popup window")).click();
		Thread.sleep(2000);
       String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        String tittleOFpage = driver.getTitle();
        System.out.println(tittleOfpage);
         // String sourcepage = driver.getpageSource();
       // System.out.println(ParentHandle);
        String ParentHandle  =driver.getWindowHandle();       
        System.out.println(ParentHandle);
        driver.quit();      
     }
	
 
  }