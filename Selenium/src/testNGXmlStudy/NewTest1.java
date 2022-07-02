package testNGXmlStudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
	@Test
	  public void method1() 
	  {
		    System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			Reporter.log("Method 1 is runing");
			
	  }
}
