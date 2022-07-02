package Miscelleneous;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintNoofRows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        
        List<WebElement> TableHeading = driver.findElements(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//table//tr"));
        for(WebElement T:TableHeading) 
        {
        	System.out.println(T.getText()+" ||");
        }
        System.out.println("==========================");
        
       int Tablecount = TableHeading.size();
        System.out.println(Tablecount);
        
	}
	
	

}
