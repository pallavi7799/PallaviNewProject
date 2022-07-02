package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver101\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(1000);
		
	    File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
	    String random = RandomString.make(3);
	    
	    File src = new File("G:\\Automation testing\\Selenium\\ScreenShots\\ss"+random+".png");
	    
	    FileHandler.copy(ss, src);

	}

}
