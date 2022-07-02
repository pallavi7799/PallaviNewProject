package kiteAppBaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import kiteAppUtility.UtilityClassUsingProperty;

public class BaseclassUsingProperty {
	protected static WebDriver driver;

	public void launchbrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(UtilityClassUsingProperty.readDataFromProperty("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

	public void takeScreenshot(String TCName) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("G:\\Automation testing\\Selenium\\ScreenShots\\" + TCName +".png");
		FileHandler.copy(src, dest);
	}
}