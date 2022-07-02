package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\ChromDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.precisionrealty.com/");
		//Thread.sleep(100);
		driver.findElement(By.xpath("//a[@href=\"/houston-property-management\"]")).click();

	}

}
