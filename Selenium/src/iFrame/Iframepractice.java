package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframepractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();

		driver.switchTo().frame("iframe-name");
		driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();
		driver.switchTo().parentFrame();

	}

}
