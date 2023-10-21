package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirVistaraCssSelector {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions() ;
		co.addArguments("--disable-notifications");
		  WebDriver driver = new ChromeDriver(co);
		   driver.manage().window().maximize();
		   driver.navigate().to("https://www.airvistara.com/in/en");
		   Thread.sleep(2000);
		   driver.findElement(By.cssSelector("button[id=\"cookieModalCloseBtn\"]")).click();
		   driver.findElement(By.cssSelector("input[name=\"FlightSearchFrom\"]")).sendKeys("PNQ");
		   driver.findElement(By.cssSelector("input[name=\"FlightSearchTo\"]")).sendKeys("PNQ");
		   driver.findElement(By.xpath("fieldset[id=\"calanderDiv\"]")).click();
		   driver.findElement(By.className("label[id=\"depart-radio\"]")).click();
		 //  driver.findElement(By.cssSelector("td[class=\" ui-datepicker-days-cell-over calender every\"]")).click();
		   driver.findElement(By.cssSelector("td[class=\" everymundo\"]")).click();
		   driver.findElement(By.cssSelector("input[id=\"passangers\"]")).click();
		   driver.findElement(By.cssSelector("button[id=\"adds_adult\"]")).click();
		  // driver.findElement(By.cssSelector("button[class=\"col-xs-12 done_btn aubergine-button-dark\"]")).click();
		   driver.findElement(By.cssSelector("button[id=\"book-flight-widget\"]")).click();
		  // driver.findElement(By.cssSelector("input[id=\"departCalender\"]")).click();
		//   driver.findElement(By.cssSelector("a[class=\"ui-state-default ui-state-active\"]")).sendKey();
		//   driver.findElement(By.cssSelector("div[id=\"calender_icon\"]")).click();




		   


}
}