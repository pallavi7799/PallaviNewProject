package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollIntoView {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://webdriveruniversity.com/index.html");
       
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        
        driver.manage().window().maximize();
       
        WebElement ref = driver.findElement(By.xpath("//h1[text()='ACTIONS']"));
       
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        
        js.executeScript("arguments[0].scrollIntoView(true);",ref);
        
        String text = driver.findElement(By.xpath("//h4[text()='Can you really handle this challenge?']")).getText();
		
        System.out.println(text);
        
	}

}
