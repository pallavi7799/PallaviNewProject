package pom1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.Pinpage;
import POM.homepage;
import POM.loginpage;

public class testNGforCrossBrowser {
	
	HomePage home;
	Kiteloginpage login;
	Kitepinpage pin;
	WebDriver driver;
	org.apache.poi.ss.usermodel.Sheet Mysheet;
	
	@org.testng.annotations.Parameters("browser")
	@BeforeClass
	public void launchnrowser(String browser) throws EncryptedDocumentException, IOException
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		    driver = new ChromeDriver();
		}
		
		else if (browser.equals("Edgedriver")) 
		{
			System.setProperty("webdriver.edge.driver", "G:\\Automation testing\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("lauching url",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login= new Kiteloginpage(driver);
		home= new HomePage(driver);
		pin= new Kitepinpage(driver);
		File MyFile=new File("G:\\book1.xlsx");
		Mysheet=WorkbookFactory.create(MyFile).getSheet("Sheet4");
		}
		@BeforeMethod
		public void loginToKite() 
		{
		login.sendUserID(Mysheet.getRow(0).getCell(0).getStringCellValue());
		login.sendpassword(Mysheet.getRow(0).getCell(1).getStringCellValue());
		login.clickonloginbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.SendPin(Mysheet.getRow(0).getCell(2).getStringCellValue());
		pin.Clickoncontiue();
	}	
  @Test
  public void ValidateUserID() 
  {
	 String ExpectedUserID = home.validateUserID(Mysheet.getRow(0).getCell(0).getStringCellValue());
	 String RealUSerID = home.ActualuserID();
	 
	 Assert.assertEquals(RealUSerID, ExpectedUserID, "Test Case is FAILED,Real And Expected are not matching");
	 Reporter.log("Test Case is passed,rea and expected are matching");
  }
  
  @AfterTest
  public void logout() throws InterruptedException
  {
	  home.logout();
  }
  
  public void closebrowser() 
  {
	  driver.close();
  }
  }
