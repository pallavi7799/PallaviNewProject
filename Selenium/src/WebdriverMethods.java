import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\\\ChromDriver\\\\chromedriver.exe");
	    //WebDriver driver = new ChromeDriver();
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://web.whatsapp.com/");
	    
	    driver.manage().window().maximize();
	   // driver.manage().window().minimize();
	    driver.navigate().to("https://www.youtube.com/");
	    driver.navigate().back();
	    driver.navigate().forward();
	    
        String title = driver.getTitle();
		
		System.out.println(title);
		
		System.out.println(driver.getTitle());
		
		String url = driver.getCurrentUrl();
		
		System.out.println("url is "+url);
		
		System.out.println(driver.getCurrentUrl());
	    
	}

}
