package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class x_PathLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\\\ChromDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(100);
		// Find X-Path By Attribute
		driver.findElement(By.xpath("//input[@value=\"Radio4\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption3\"]")).click();
	}

}
