package POMkitetestngcrossbrowser;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGforCrossBrowser {
	
	homepage home;
	loginpage login;
	Pinpage pin;
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
		
		else if (browser.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "G:\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("lauching url",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login= new loginpage(driver);
		home= new homepage(driver);
		pin= new Pinpage(driver);
		File MyFile=new File("G:\\book1.xlsx");
		Mysheet=WorkbookFactory.create(MyFile).getSheet("Sheet4");
		}
		@BeforeMethod
		public void loginToKite() 
		{
		login.sendusername();
		login.sendpassword();
		login.clickonloginbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendpin();
		pin.clickoncontinuebutton();
     	}
	
        @Test
        public void ValidateUserID()
        {
        	home.ClickonActualuser();
        }
}
