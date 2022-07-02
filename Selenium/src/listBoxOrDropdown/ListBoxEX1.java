package listBoxOrDropdown;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEX1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Ce%7Cfacebook%20login%7C&placement=&creative=589460569900&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D1007783%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwjtOTBhAvEiwASG4bCGMTYN3TZlL-AUlFBwfybXteQyGxyDSmseDOWUyfnLEFdcS5-Ji9pBoCes0QAvD_BwE");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.name("websubmit")).click();
		WebElement day = driver.findElement(By.name("birthday_day"));
		
		Select s = new Select(day);
		s.selectByValue("20");
		
        WebElement month = driver.findElement(By.id("month"));
        Select s1 = new Select(month);
        s1.selectByIndex(5);
        
        WebElement year = driver.findElement(By.name("birthday_year"));
        Select s2 = new Select(year);
        s2.selectByVisibleText("1996");
        
      
       for(int i=0;i<=10;i++) {
    	   Thread.sleep(200);
    	   s.selectByIndex(i);
       }
       

       for(int j=0;j<=11;j++) {
    	   Thread.sleep(200);
    	   s1.selectByIndex(j);
       }
		
	}

}
