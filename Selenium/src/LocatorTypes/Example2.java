package LocatorTypes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nobroker.in/?ef_id=Cj0KCQjwma6TBhDIARIsAOKuANx1PVntTBq7SDFdMStkw7SMzGjR-NydyEgGgAgIKesTe0sPgHzJPwcaAg9vEALw_wcB:G:s&AL!5425!3!385439544151!e!!g!!nobroker!650219748!32123275389&gclid=Cj0KCQjwma6TBhDIARIsAOKuANx1PVntTBq7SDFdMStkw7SMzGjR-NydyEgGgAgIKesTe0sPgHzJPwcaAg9vEALw_wcB");
		
		driver.manage().window().maximize();
		
	    driver.findElement(By.xpath("//a[text()='Enquire Now']")).click();
    	 
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//button[contains(@class,'prop-search-button btn btn-primary btn-lg')]")).click();
    	Thread.sleep(100);
    	driver.findElement(By.xpath("//div[contains(text(),'Commercial')]")).click();
    	
		
		//Thread.sleep(100);
		//X-path by text method
		//driver.findElement(By.xpath("//strong[contains(text(),'Pay rent')]")).click();
		//Thread.sleep(1000);
		
		//Contains method by text
		//driver.findElement(By.xpath("//span[contains(text(),'Pay Maintenance and Rent')]")).click();-->ElementClickInterceptedException
		
		// contains method by atribute
	    //driver.findElements(By.xpath("//span[contains(@class,'tooltip-trigger-text\')]"));//---> error
		
		//Contains method by text
		//driver.findElement(By.xpath("//button[contains(text(),'Post Free property ad')]")).click();
		
		
    	
		
    	
	}


	}


