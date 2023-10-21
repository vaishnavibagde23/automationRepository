package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod_GetCssValue_GetTagName {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	         
	         //get the AttributeValueOfUsernameTextBox i.e name attribute
	         WebElement usnTB =driver.findElement(By.xpath("//inpute[@placeholder='Username']"));
	         String attributevalue = usnTB.getAttribute("id");
	         System.out.println(attributevalue);
	         
	         //get the css property of username Textbox i.e color
	          String  CssValue= usnTB.getCssValue("width");
	      System.out.println(CssValue);
	      
	      // get the tagname of username tb
	   String tag = usnTB.getTagName();
	   System.out.println(tag);
	}

}
