package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HidenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nobroker.in/");
		driver.findElement(By.xpath("(//div[text()='Log in'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='login-signup__modal-close-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("listPageSearchLocality")).sendKeys("katraj");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='prop-search-button btn btn-primary btn-lg']")).click();
		
		
		
		
	}
				

}
