package kiteAppUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class UtilityClassUsingProperty {
	WebDriver driver;
//	public static void takeScreenshot(WebDriver driver) throws IOException
//	{
//	    	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	    	String random = RandomString.make(3);
//	    	File dest = new File("G:\\Automation testing\\Selenium\\ScreenShots\\TestScrenshot"+random+".png");
//	    	FileHandler.copy(src, dest);
//	}
	public static String readDataFromProperty(String key) throws IOException
	{
		Properties prop = new Properties();
		
		FileInputStream myfile = new FileInputStream("C:\\Users\\pallavi\\eclipse-workspace\\Selenium\\src\\kiteAppTest\\Property.properties");
		
		prop.load(myfile);
		
		String value = prop.getProperty(key);
		
		return value;
	}

}
