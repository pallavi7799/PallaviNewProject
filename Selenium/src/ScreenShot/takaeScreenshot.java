package ScreenShot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class takaeScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.primevideo.com/?");
		Thread.sleep(1000);
		
		//1.To take screenshot using selenium webdriver, we need to type cast driver object to Takes Screenshot interface.
		// ((TakesScreenshot) driver)

		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Create Object of string class
		
	    String Random = new RandomString().make(3);
		
		File Dest = new File("G:\\Automation testing\\Selenium\\ScreenShots\\TestSS"+Random+".png");
		
	    FileHandler.copy(Source, Dest);
	}

}
