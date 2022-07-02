package Miscelleneous;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class crickbuz {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/cricket-series/4061/indian-premier-league-2022/points-table");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        
        List<WebElement> row = driver.findElements(By.xpath("//div//table[@class='table cb-srs-pnts-dwn-tbl']//tbody//tr[1]"));
        List<WebElement> column = driver.findElements(By.xpath("//div//table[@class='table cb-srs-pnts-dwn-tbl']//tbody//th[1]"));
        
        int totalrows = row.size();
        System.out.println(totalrows);
        int totalcolumn = column.size();
        System.out.println(totalcolumn);
      
        for(int i = 1; i<= totalrows;i++) 
        {
        	 WebElement rows = driver.findElement(By.xpath("//div//table[@class='table cb-srs-pnts-dwn-tbl']//tbody//tr["+i+"]"));
        	System.out.println(rows);
        }
        
        
        
        
        
        
        
       
        	}
        }
   
	


