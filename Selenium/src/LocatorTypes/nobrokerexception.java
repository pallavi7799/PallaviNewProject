package LocatorTypes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nobrokerexception {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nobroker.in/?ef_id=Cj0KCQjwma6TBhDIARIsAOKuANx1PVntTBq7SDFdMStkw7SMzGjR-NydyEgGgAgIKesTe0sPgHzJPwcaAg9vEALw_wcB:G:s&AL!5425!3!385439544151!e!!g!!nobroker!650219748!32123275389&gclid=Cj0KCQjwma6TBhDIARIsAOKuANx1PVntTBq7SDFdMStkw7SMzGjR-NydyEgGgAgIKesTe0sPgHzJPwcaAg9vEALw_wcB");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        driver.manage().window().maximize();
//    	       
//        WebElement EnquireNow = driver.findElement(By.linkText("Enquire Now"));  
//	    JavascriptExecutor executor = (JavascriptExecutor) driver;
//	    executor.executeScript("window.scrollBy(10,1000)");
//	    Thread.sleep(1000);
//	    EnquireNow.click();
	    
	  driver.findElement(By.id("listPageSearchLocality")).sendKeys("pune");
	  driver.findElement(By.name("Search")).click();
	  driver.findElement(By.partialLinkText(""));
        
	}

}
