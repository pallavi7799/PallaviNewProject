package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","G:\\\\chromedriver101\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");

		File Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File Dest = new File("G:\\Automation testing\\Selenium\\ScreenShots\\myScreenshot.png");

		FileHandler.copy(Src,Dest);

	}

}
