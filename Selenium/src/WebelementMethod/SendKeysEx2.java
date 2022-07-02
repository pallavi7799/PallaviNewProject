package WebelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysEx2 
{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nobroker.in/");
		
		driver.findElement(By.xpath("//input[contains(@id,'listPageSearchLocality')]")).sendKeys("Bandra");
		Thread.sleep(100);
		driver.findElement(By.xpath("//button[contains(@class,'prop-search-button btn btn-primary btn-lg')]")).click();
		

	}

}
