package pom1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.homepage;

public class TestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File myfile = new File("G:\\book1.xlsx"); 
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
		String userid = mysheet.getRow(0).getCell(0).getStringCellValue();
		String password = mysheet.getRow(0).getCell(1).getStringCellValue();
		String pin = mysheet.getRow(0).getCell(2).getStringCellValue();
		
		
		Kiteloginpage kp = new Kiteloginpage(driver);
		kp.sendUserID(userid);
		kp.sendpassword(password);
		kp.clickonloginbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		Kitepinpage kpp = new Kitepinpage(driver);
		kpp.SendPin(pin);
		kpp.Clickoncontiue();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
		homepage hp = new homepage(driver);
		hp.ClickonActualuser();
		hp.clockonlogout();
		
		Thread.sleep(1000);		
		driver.close();
		

	}

}

