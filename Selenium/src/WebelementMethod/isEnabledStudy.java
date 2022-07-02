package WebelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(1000);
		
		WebElement username = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		
		Thread.sleep(1000);
		
		username.sendKeys("9158819635");
		
	    WebElement Password	= driver.findElement(By.xpath("//input[@aria-label='Password']"));
	    
	    Password.sendKeys("Pallavi@7799");
	    
	    Thread.sleep(500);
		
		WebElement button =driver.findElement(By.xpath("//div[text()=\"Log In\"]"));
		
		boolean Result = button.isEnabled();
		
		System.out.println("Button Status is "+Result);
		
		Thread.sleep(500);
		
		button.click();
		
	}

}
