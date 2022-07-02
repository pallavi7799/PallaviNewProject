import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSelenumProgram {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver101\\chromedriver.exe");
        WebDriver driver = (WebDriver) new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        //driver.manage().window().minimize();
        driver.navigate().to("https://www.flipkart.com/");
        driver.navigate().back();
        driver.close();
        driver.quit();
	}
}
