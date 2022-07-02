package listBoxOrDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookdropbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\\\chromedriver101\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		WebElement Day=driver.findElement(By.id("day")); 

		Select s = new Select(Day);

		s.selectByVisibleText("26");

		WebElement Month=driver.findElement(By.id("month"));

		Select s1 = new Select(Month);

		s1.selectByValue("6");

		WebElement Year=driver.findElement(By.id("year"));

		Select s2 = new Select(Year);

		s2.selectByValue("1996");




	}

}
