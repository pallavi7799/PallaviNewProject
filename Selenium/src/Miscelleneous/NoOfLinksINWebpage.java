package Miscelleneous;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksINWebpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        driver.manage().window().maximize();
    	       
      
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    System.out.println(links.size());
	    
	    Iterator<WebElement> it = links.iterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next().getText());
	    	
	    }
	    
	    List<WebElement> bt = driver.findElements(By.tagName("button"));
	   
	    System.out.println(bt.size());
	    
	    Iterator<WebElement> buttons = bt.iterator();
	    while(buttons.hasNext())
	    {
	    	System.out.println(buttons.next().getText());
	    }
	    	    

	}

}
