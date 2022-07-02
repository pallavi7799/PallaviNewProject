package testNGAssertStudy;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertionStudy {
	WebDriver driver;
	
  @BeforeTest
  public void LaunchBrowser() {
	    System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  
  @Test
  public void AssertEqualsStudy()
  { 
	 LoginPOM page = new LoginPOM(driver);
	 String Actual = page.ActualText();
	 String Expectedtext = "Login to Kit";
	 Assert.assertEquals(Actual, Expectedtext, "Text not matching TC is failed");
	 Reporter.log("Tc is passed",true);  
  }
  @Test
  public void AssertNotEqualsStudy()
  { 
	 LoginPOM page = new LoginPOM(driver);
	 String Actual = page.ActualText();
	 String Expectedtext = "Login to Kit";
	 Assert.assertNotEquals(Actual, Expectedtext, "Text not matching TC is failed");
	 Reporter.log("Tc is passed",true);  
  }
  @Test
  public void Asserttruestudy()
  {
	  LoginPOM page = new LoginPOM(driver);
	  Assert.assertTrue(page.LoginButton.isDisplayed(), "Button is not displayed,TC is Failed");
	  Reporter.log("Button is displayed Tc is Pass",true);
  }
  @Test
  public void AssertNullStudy()
  {
	  LoginPOM page = new LoginPOM(driver);
	  page.SenduserId();
	  Assert.assertNotNull(page.UserID, "Field is not null,TC is Failed");
	  Reporter.log("Feld is null TC is Passed");
  }
  
  
  
}
