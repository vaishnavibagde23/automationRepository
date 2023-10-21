package MethodsOfWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetTextMethod {
	 public static <WebElement> void main(String[] args) {
	 WebDriver driver = new ChromeDriver();

		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		         driver.get("actitime.3");
		         driver.get("");
		         driver.switchTo().activeElement().sendKeys("iphone");
		         //explicit wait
		         WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		        // wait.until(ExpectedConditions.visibilitiofAllElements(driver.FindElements(By.xpath("//div[@class='wM6W7d']"))))
		         List<WebElement> allIphone  =(List<WebElement>) driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		         for(WebElement phone:allIphone )
		          {
		        	 System.out.println(phone.getText());
		         }
		         
	  
}
}
