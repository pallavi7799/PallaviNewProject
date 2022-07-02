package WebelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class insatgramsendkeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("9158819635");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Pallavi@7799");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()=\"Log In\"]")).click();

	}

}
