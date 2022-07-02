package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindXpathByText {

	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.google.co.in/");
      Thread.sleep(100);
      driver.findElement(By.xpath("//a[@href=\"https://mail.google.com/mail/&ogbl\"]")).click();//X-Path Byy Atribute
      driver.findElement(By.xpath("//a[text()=\" How Search works \"]")).click();// X-Path By Text Method
      
      
	}

}
