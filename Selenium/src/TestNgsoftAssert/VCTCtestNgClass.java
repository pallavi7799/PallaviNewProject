package TestNgsoftAssert;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VCTCtestNgClass {
     WebDriver driver;
     VCTCPage page;
     SoftAssert soft = new SoftAssert();
	@BeforeClass
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
	@Test
  public void validateheading() 
  {
     page = new VCTCPage(driver);
     
	 String ActualText = page.validatetext();
	 
	 String ExpectedText ="Welcome To Practice Page";
	 
	 soft.assertEquals(ActualText, ExpectedText, "Text is not Matching TC is Failed");
	 
	 //soft.assertNotEquals(ActualText, ExpectedText, "Text is matching TC is failed");
	 
	 soft.assertAll();
  }
}
