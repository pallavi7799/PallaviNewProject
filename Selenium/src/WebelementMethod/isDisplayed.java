package WebelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver101\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement Element = driver.findElement(By.name("show-hide"));
		boolean Result = Element.isDisplayed();
		System.out.println("Status of Element is "+Result);
		
		Element.sendKeys("Hii Good Evening");
		Thread.sleep(5000);
		
		if(Element.isDisplayed()) 
		{
			System.out.println("Element Is Displayed");
			driver.findElement(By.id("hide-textbox")).click();
			boolean Result1= Element.isDisplayed();
			System.out.println("Status of Element is "+Result1);
		}
	}

}
