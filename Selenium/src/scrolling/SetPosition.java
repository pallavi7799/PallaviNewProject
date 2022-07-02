package scrolling;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://webdriveruniversity.com/index.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.manage().window().maximize();
        
        System.out.println(driver.manage().window().getSize());
      
        Dimension d = new Dimension(500, 600);
        driver.manage().window().setSize(d);
        
        System.out.println(driver.manage().window().getPosition());
      
        Point p = new Point(600, 200);
       
        driver.manage().window().setPosition(p);
        System.out.println(driver.manage().window().getPosition());

	}

}
