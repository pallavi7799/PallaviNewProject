package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopUpStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("submit")).click();
		
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(100);
		
		System.out.println(alt.getText());
		
		alt.accept();
		
		System.out.println(alt.getText());
		
		alt.accept();
		
		
	}

}
