package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframestudy3 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver101\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.switchTo().frame("iframeResult");
		Thread.sleep(1000);
		
		WebElement button = driver.findElement(By.xpath("//button[@type='button']"));
		button.click();
		
		driver.switchTo().defaultContent();
		WebElement theme = driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]"));
		theme.click();
		
	}

}
