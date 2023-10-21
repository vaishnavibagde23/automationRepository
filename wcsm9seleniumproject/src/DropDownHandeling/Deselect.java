package DropDownHandeling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.support.ui.Select;

public class Deselect {
	 
	 public static void main(String[] args) {
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         driver.get("http://demoapps.qspiders.com/dropdown");
         //identify dropdownOption and click
         driver.findElement(By.xpath("/selection[text()=''dropdown']")).click();
         WebElement dropDown1 = driver.findElement(By.xpath("//select[contains(@class='transion-all duration-150'"));
             Select  sel =new Select(dropDown1);
             
           //select the multiselect option
      
             driver.findElement(By.partialLinkText("")).click();
             
             //identify dropDown that is Multiselect
             WebElement dropDown2 = driver.findElement(By.id("idddd")).click();
                Select sel2 = new Select(dropDown2);
              // select and deselect opt using index
             Thread.sleep(2000);
         
             sel2.deselctByIndex(2);
             //
             WebElement dropDown2 = new Select(drpDown2);
             
             sel2.deSelectByIndex(2);
             // select and deselect using forloop
             for(int i=0;i<=4;i++)
             {   
                 Thread.sleep(2000);
                 sel2.deselectByIndex(i);        
               
                 // select and deselect using value
                    sel2.selectByValue("v2");
                 sel2.deselectByValue("v2");
                 
                 // select and deselect using visible text
                 sel2.selectByVisibleText("misal");
                 sel2.deselectByVisibleText("");



                 

                 


                 
       
} 
}}        
