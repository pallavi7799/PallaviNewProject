package synchronization;



import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));//Emplicitly wait to Load webpage
		
		//Cast javascriptExecutor to driver
		JavascriptExecutor js = ((JavascriptExecutor)driver);// Scroll down to find Element
		js.executeScript("window.scrollBy(10,800)");
		
		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
	
	    driver.findElement(By.id("timerAlertButton")).click();
	    
	    WebDriverWait w1= new WebDriverWait(driver, Duration.ofMillis(5500));// Explicit Wait to View Alert PopUP
		w1.until(ExpectedConditions.alertIsPresent());
		
		Alert alt = driver.switchTo().alert();// Switch selenium focus From Main page to alert PopUp
	
		alt.accept();     // Accept Alert
		
		
		
		
		
	}

}
