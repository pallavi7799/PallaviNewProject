package Miscelleneous;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablePrint {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        
        List<WebElement> TableHeading = driver.findElements(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//table//tr[1]//th"));
        for(WebElement T:TableHeading) 
        {
        	System.out.print(T.getText()+" ||");
        }
        System.out.println();
        List<WebElement> secondRow = driver.findElements(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//table//tr[2]//td"));
        for(WebElement T:secondRow) 
        {
        	System.out.print(T.getText()+" ||");
        }
        System.out.println();
        List<WebElement> thirdRow = driver.findElements(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//table//tr[3]//td"));
        for(WebElement R:thirdRow)
        {
        	System.out.print(R.getText()+" ||");
        } 
	}

}
