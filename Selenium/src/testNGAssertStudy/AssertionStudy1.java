package testNGAssertStudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertionStudy1 {
	
	WebDriver driver = null;
	
	
	
  @BeforeTest
  public void Mymethod() 
  {
	    System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  
  @FindBy(id = "userid") WebElement UserID;
  @FindBy(id = "password")  WebElement Password;
  @FindBy(xpath = "//button[@type='submit']") WebElement LoginButton;
  @FindBy(xpath = "//h2[text()='Login to Kite']") WebElement text;
  
  @Test
  public void mymethod1()
  {
	  String title = driver.getTitle();
	  Assert.assertEquals(title, "Login to Kite", "text is not matching TC is failed");
  }
}
