package kiteAppUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityClass
{
	public static String ReaddataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException {
	File Myfile = new File("G:\\book1.xlsx");
	Sheet mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet4");
	String myvalue = mysheet.getRow(row).getCell(cell).getStringCellValue();
	return myvalue;
}
	
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
	    	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	String random = RandomString.make(3);
	    	File dest = new File("G:\\Automation testing\\Selenium\\ScreenShots\\TestScrenshot"+random+".png");
	    	FileHandler.copy(src, dest);
	}
	
}