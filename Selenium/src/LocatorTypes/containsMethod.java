package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class containsMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\ChromDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.99acres.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='Search']")).click();// X-path by Text method
		
		//	Contains with text() : //tagname[contains(text(),’textvalue’)]: //a[contains(text(),‘link1’)]
		
		//	Contains with attribute : //tagname[contains(@attribute name, ‘attribute value’)]
			
	   //driver.findElement(By.xpath("//div[contains(@data-label,'Read Ratings & Reviews')]")).click();
	   Thread.sleep(1000);

	}

}
