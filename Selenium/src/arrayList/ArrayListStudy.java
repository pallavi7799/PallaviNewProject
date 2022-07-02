package arrayList;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayListStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nobroker.in/?ef_id=Cj0KCQjwma6TBhDIARIsAOKuANx1PVntTBq7SDFdMStkw7SMzGjR-NydyEgGgAgIKesTe0sPgHzJPwcaAg9vEALw_wcB:G:s&AL!5425!3!385439544151!e!!g!!nobroker!650219748!32123275389&gclid=Cj0KCQjwma6TBhDIARIsAOKuANx1PVntTBq7SDFdMStkw7SMzGjR-NydyEgGgAgIKesTe0sPgHzJPwcaAg9vEALw_wcB");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        driver.manage().window().maximize();
        
        WebElement EnquireNow = driver.findElement(By.linkText("Enquire Now"));  
	    JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("window.scrollBy(10,1000)");
	    Thread.sleep(1000);
	    EnquireNow.click();
	    
	    Set<String> allids = driver.getWindowHandles();
	    ArrayList ar = new ArrayList<>(allids);
	    String mainpage = (String) ar.get(0);
	    String childpage = (String) ar.get(1);
	    System.out.println(ar);
	    driver.switchTo().window(childpage);
	    driver.switchTo().window(mainpage);
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    WebElement postfreead = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
	    executor.executeScript("window.scrollBy(10,-1000)");
	    Thread.sleep(1000);
	    postfreead.click();
	}

}
