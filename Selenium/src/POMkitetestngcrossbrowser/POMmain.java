package POMkitetestngcrossbrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMmain {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		loginpage lp = new loginpage(driver);
	    lp.sendusername();
	    lp.sendpassword();
	    lp.clickonloginbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	    Pinpage pp = new Pinpage(driver);
	    pp.sendpin();
	    pp.clickoncontinuebutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		homepage hp = new homepage(driver);
		hp.ClickonActualuser();
		Thread.sleep(500);
		hp.clockonlogout(); 

		

	}

}
