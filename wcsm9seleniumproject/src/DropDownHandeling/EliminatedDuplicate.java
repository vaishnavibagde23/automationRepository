package DropDownHandeling;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminatedDuplicate {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         driver.get("file:///C:/Users/lenovo/Desktop/HTML/dropdown.html");
         //identify dropdownOption and click
        WebElement menuDropdown = driver.findElement(By.id("idddd"));
        //get all the option menuDropdown
        Select sel =new Select(menuDropdown);
        List<WebElement> allOps =sel.getOptions();
        //
        HashSet<String>hs = new HashSet<String>();
        //
        for(int i =0; i<allOps.size(); i++)
        {
        	WebElement op = allOps.get(i);
        	//get txt of WebElement
        	String  dropdownOption  =op.getText(); 
        	
        	 //ADD THE dropdownOption INTO HASHSET AND REMOVE DUPLICATES FROM dropdown
        	     hs.add(dropdownOption);   	
        }
                     Thread.sleep(2000);
              //read the option from hashset by using for loop
                     for(String opt:hs)
                     {

                         Thread.sleep(2000);
                           System.out.println(opt);
                     }
	}}
 