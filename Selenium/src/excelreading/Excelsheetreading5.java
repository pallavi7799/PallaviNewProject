package excelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelsheetreading5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
	   System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver101\\\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   
	   WebElement userid = driver.findElement(By.id("email"));
	   WebElement password = driver.findElement(By.id("pass"));
	   WebElement loginbutton = driver.findElement(By.xpath("//button[@name='login']"));
		
		File myfile = new File("G:\\book1.xlsx");
		Sheet sheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		String UN = sheet.getRow(0).getCell(0).getStringCellValue();
		String Pass = sheet.getRow(0).getCell(1).getStringCellValue();
	
		//System.out.println(UN);
		//System.out.println(Pass);
		userid.sendKeys(UN);
		password.sendKeys(Pass);
		loginbutton.click();
		Thread.sleep(1000);
		WebElement profile = driver.findElement(By.xpath("//div[@class='j83agx80 l9j0dhe7 gl4o1x5y lt9micmv']"));
		
		profile.click();
		
		Thread.sleep(1000);
		
		WebElement logout = driver.findElement(By.xpath("(//div[@class='qzhwtbm6 knvmm38d'])[7]"));
		
		Thread.sleep(1000);
		
		logout.click();
		
		driver.quit();

		 


	}

}
