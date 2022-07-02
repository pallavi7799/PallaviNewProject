package WebelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.primevideo.com/?");
		
		Thread.sleep(1000);
		
		WebElement Element = driver.findElement(By.xpath("//h1[text()='Welcome to Prime Video']"));
		
		Thread.sleep(1000);
		
		String ActualText = Element.getText();
		
		System.out.println(ActualText);
        
		String ExpectedText = "Welcome to Prime Video";
		
		boolean Result = ActualText.equals(ExpectedText);

        if(ActualText.equals(ExpectedText)) {
        	System.out.println("Test Case Is passed,result is "+Result);
        }
        else {
			System.out.println("Test Case is Failed, result is "+Result);
		}
        
	}

}
