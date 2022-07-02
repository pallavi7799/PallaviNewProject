package Miscelleneous;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class unorederLIst1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.findElement(By.name("q")).sendKeys("Hyundai Creta");
		
		List<WebElement> Searchresult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		 
		String Expectedresult = "hyundai creta 2022";
		Thread.sleep(200);
		for(WebElement result:Searchresult) 
		{
			String Actualresult = result.getText(); 
			
			System.out.println(Actualresult);
			
			if(Actualresult.equals(Expectedresult)) 
			{
				result.click();
				break;
			}
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		driver.findElement(By.linkText("Images")).click();
		
	}

}
