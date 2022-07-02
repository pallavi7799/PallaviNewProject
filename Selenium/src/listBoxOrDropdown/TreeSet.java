package listBoxOrDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TreeSet {

	
			public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver101\\\\chromedriver.exe");
				
				WebDriver driver= new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://en-gb.facebook.com/");
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
				Thread.sleep(2000);
				WebElement Month = driver.findElement(By.id("month"));
				Thread.sleep(1000);
				Select s= new Select(Month);
				List<WebElement> AvailableMonths = s.getOptions();
				
				for(WebElement we:AvailableMonths)
				{
					String Text = we.getText();
					System.out.println(Text);
				}

				//System.out.println(ts1);
				
			
				
			}

			
		

	}


