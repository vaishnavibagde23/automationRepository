package DropDownHandeling;
import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.grid.Main;
	import org.openqa.selenium.support.ui.Select;

	public class SelectSelectionMethod{
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		         driver.get("http://demoapps.qspiders.com/dropdown");
		         //identify dropdownOption and click
		         driver.findElement(By.xpath("/selection[text()=''dropdown']")).click();
		         WebElement dropDown1 = driver.findElement(By.xpath("//select[contains(@class='transion-all duration-150'"));
	                 Select  sel =new Select(dropDown1);
	                 
	               //select the option
	                 sel.selectByIndex(5);
	                 Thread.sleep(2000);
	                 //identif country dropdown inspect country
	                 WebElement dropDown2=  driver.findElement(By.xpath("//label[text()='country']/following-sibling::select"));
	                 Select  sel2 =new Select(dropDown2);
	                 //inspect country copy india value
	                 sel2.selectByValue("India");
	                 WebElement dropDown3 =driver.findElement(By.xpath("//label[text() ='state']/following-sibling::select"));
	                 
	                 Select  sel3=new Select(dropDown3);
	                 sel3.selectByVisibleText("Maharashtra");
	                 
	                 // HandleMultiselecctDROPDOWN
	                 Thread.sleep(2000);

	                 driver.navigate().to("");
	                WebElement dropDown4 =driver.findElement(By.id("idddd"));
	                Select sel4 = new Select(dropDown4);
	                
	                // select MUltiple opt for multiselect dropdown
	                 Thread.sleep(2000);

	                for(int i= 0;i<=5;i++)
	                {
	                	sel4.selectByIndex(i);
	                }
	                 
	                 driver.navigate().to("http://demoapps.qspiders.com/dropdown");
	                 driver.findElement(By.partialLinkText("Multi Select")).click();
	                 //identify dropdown
	                 WebElement dropDown5 = driver.findElement(By.xpath("//label[text() ='country']Following-sibling::select"));
		                Select sel5 = new Select(dropDown5);
	
		}
		
		

	}


