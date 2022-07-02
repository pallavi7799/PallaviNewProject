package mockInterview;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
       
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        
        driver.manage().window().maximize();
        
       WebElement Searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
       
       Searchbox.sendKeys("iphone13");
       
       driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
       
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
       
       driver.findElement(By.id("low-price")).sendKeys("50000");
       
       driver.findElement(By.id("high-price")).sendKeys("100000");
       
       driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
       
       List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
       
       Iterator<WebElement> it = price.iterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next().getText());
	    	
	    }
       
      
       
       
       
       
      
      
      
       
       
       

	}

}
