package testNGXmlStudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest3 {
	@Test
	  public void method3() 
	  {
		    System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			Reporter.log("Method 3 is runing");
			
	  }
}
