package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartFindElementMethod {
	private static final String Laptops = null;

	public static void main(String[]args)
	{
		   WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		   driver.manage().window().maximize();
         driver.manage().window().implicitlyWait(Duration.ofSeconds(2000));
         driver.get("");
         //handle the popup
         driver.findElement(By.xpath("//")).click();
         //find laptop name
         driver.findElement(By.name("q")).sendKeys("Laptop");
         //click on search icon
         driver.findElement(By.xpath("//button[@area_label='search for product,brands])"));
         //click on brand and sect hp
         driver.findElement(By.xpath("//div[text()='Brands")).click();
         //
         driver.findElement(By.xpath("//div[@class='_3879cV'and(text()='HP')]")).click();
         //CLICK ON CORE 7 PROCESSOR
         driver.findElement(By.xpath("//div[@class='_3879cV'and(text()='Core i7')]")).click();
         //click on os and select the window11
         Thread.sleep(0);
         driver.findElement(By.xpath("//div[text()='4* &above'])")).click();
         Thread.sleep(0);
        //identify name of lppi
         List<WebElement>allLaptops = driver.findElements(By.xpath("(//div[@class='_4rR01T'])[1]"));
         // ident price lap
         List<WebElement> allprices = driver.findElements(By.xpath("(//div[@class='__4rR01T'])[1]"));
           for(int i=0; i<allLaptops.size();i++)
           {
        	   String laptop=allLaptops.get(i).getText();
        	   Thread.sleep(2000);
        	   for(int j=i;j<=i;j++)
        	   {
        		   String price= allprices.get(j).getText();
            	   Thread.sleep(2000);
                  System.out.println(Laptops+" :"+price);
        		   
        		   
        	   }
        	   
        	   
           }
           
         
         
         
         
         
         

}
}