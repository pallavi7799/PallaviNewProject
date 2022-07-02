package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("courses-iframe");
		
//		WebDriverWait wait = new WebDriverWait(driver, null);
//		wait.until(ExpectedConditions.visibilityOf((WebElement) driver.switchTo().frame("courses-iframe"))); 
//		wait.until(ExpectedConditions.elementToBeClickable((WebElement) driver.switchTo().frame("courses-iframe")));
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();// this element is present on iframe(need to switch selenium focus from main page to frame)

		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();// switch selenium focus from frame to main page
		
		Thread.sleep(1000);
		
		//driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@value='Radio1']")).click();
	}

}

