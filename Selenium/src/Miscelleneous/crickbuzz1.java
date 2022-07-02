package Miscelleneous;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class crickbuzz1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/cricket-series/4061/indian-premier-league-2022/points-table");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        
        List<WebElement> Heading = driver.findElements(By.xpath("//div//table//thead//tr//th[1]"));
      
        for(WebElement H:Heading) 
        {
           System.out.print(H.getText()+"  ");
        }
        
        List<WebElement> data = driver.findElements(By.xpath("//div//table//thead//tr//td"));
        for(WebElement D:data) {
        System.out.print(D.getText()+"  ");
        }
        System.out.println();
        
//        List<WebElement> row = driver.findElements(By.xpath("//div//table//tbody//tr//td//div[1]"));
//       int totalrows = row.size();
//        for(int i=1;i<=100;i++) 
//        {
//        	for(int j=1;j<=totalrows;j++) 
//        	{
//        		WebElement value = driver.findElement(By.xpath("//div[4]/div[1]/table/tbody/tr["+i+"]/td["+j+"]"));
//        		System.out.println(value.getText()+"  ");
//        	}
//        System.out.println();
//        
//        }
       
     List<WebElement> data1 = driver.findElements(By.xpath("//div[4]/div[1]/table/tbody/tr"));
     int totalele = data1.size();
     
    List<WebElement> data2 = driver.findElements(By.xpath("//div[4]/div[1]/table/tbody/tr[1]/td"));
   int totaldata = data2.size();
     
     for(int i=1;i<=totalele;i=i+2) 
     {
    	 for(int j=1;j<=totaldata;j=j+1) 
    	 {
    		 WebElement element = driver.findElement(By.xpath("//div[4]/div[1]/table/tbody/tr["+i+"]/td["+j+"]"));
    		System.out.print(element.getText()+"  ");
    	 }
    	 System.out.println();
     }
    
	}

  }
