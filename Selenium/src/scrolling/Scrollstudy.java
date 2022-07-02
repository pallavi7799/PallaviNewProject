package scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollstudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://webdriveruniversity.com/index.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.manage().window().maximize();
        //cast javasriptExecutor in driver
        JavascriptExecutor j = ((JavascriptExecutor)driver);
            // +ve x value--> right hand side, Y value +ve --> down 
     		// +ve x value--> right hand side, Y value -ve --> up 
     		// -ve x value--> left hand side, Y value +ve --> down 
     		// -ve x value--> left hand side, Y value -ve --> up 
//        j.executeScript("window.scrollBy(50,4000)");
//        Thread.sleep(1000);
//        j.executeScript("window.scrollBy(-1296,-1000)");
//        
        System.out.println(driver.manage().window().getSize());

    	JavascriptExecutor p = ((JavascriptExecutor)driver);
    	p.executeScript("window.scrollBy(50,2000)");
    	

	} 

}
