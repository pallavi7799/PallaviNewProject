package Miscelleneous;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedListHandling {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	WebElement searchbox = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	searchbox.click();
	Thread.sleep(1000);
	driver.findElement(By.name("q")).sendKeys("Samsung galaxy s22 ultra pro");
	Thread.sleep(500);
	
	List<WebElement> searchresult = driver.findElements(By.tagName("li"));
	
	for(WebElement S:searchresult) 
	{
		System.out.println(S.getText());
	}
	String ExpectedResult = "samsung galaxy s21 ultra pro max";
	for(WebElement R:searchresult) 
	{
		String ActualResult = R.getText();
		if(ActualResult.equals(ExpectedResult)) 
		{
			R.click();
			break;
		}
	}
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	WebElement Reviews = driver.findElement(By.xpath("((((//div[@class='col col-7-12'])[1]/div)[2]/span)[2]/span/span)[3]"));
	System.out.println(Reviews.getText());
	}

}
