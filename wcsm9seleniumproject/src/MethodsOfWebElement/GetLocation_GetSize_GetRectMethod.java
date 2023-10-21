package MethodsOfWebElement;

import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_GetSize_GetRectMethod {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	         driver.get("https://demoapps.qspider.com");
	         
	         //identify email textbox inspect username {tagname#av } input#email 
	   WebElement emailTextBox  = driver.findElement(By.cssSelector("input#email"));
	         
		// get the location of email textbox
	     Point loc  = emailTextBox.getLocation();
	      int xaxis = loc.getX();
	      int yaxis =loc.getY();
	      System.out.println("location of email text box :"+xaxis+" :"+yaxis);
	      
	      //get size of email textbox
	      Dimension size = emailTextBox.getSize();
	     int height = size.getHeight()
	    		 width =size.getWidth();
	     System.out.println(emailTextBox.getCssValue("height")+" " +emailTextBox.getCssValue("Width"));
	     System.out.println("size of email TextBox : "+width+" :" +height);
	     
	     Rectangle rect = emailTextBox.getRect();
	     System.out.println(rect.getX()+" :"rect.getY());
	     System.out.println(rect.getY()+" :"rect.getX());
	      
	}

}
	