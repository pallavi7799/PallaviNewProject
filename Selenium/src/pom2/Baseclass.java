package pom2;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	 public WebDriver driver;
	
	public void Launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

}
}
