package Miscelleneous;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WholeTablePrint {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        
        List<WebElement> Rows = driver.findElements(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//table//tr"));
        List<WebElement> Columns = driver.findElements(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//table//th"));

       int TotalRows = Rows.size();
       int TotalColumns = Columns.size();
       
       System.out.println(TotalRows);
       System.out.println(TotalColumns);
       
       for(int i=1;i<=TotalRows;i++)
       {
    	  for(int j=1;j<=TotalColumns;j++) 
    	  {
    		 
    	    if(i==1) 
       		  {
       			    String text = driver.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//table//tr["+i+"]//th["+j+"]")).getText();
       			    System.out.print(text+" ||");
       		  }
    		 else {
    			 String text = driver.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//table//tr["+i+"]//td["+j+"]")).getText();
     			   System.out.print(text+" ||");
			}
    	    
			}
    		  System.out.println();
    	  } 
       }
       
	}


