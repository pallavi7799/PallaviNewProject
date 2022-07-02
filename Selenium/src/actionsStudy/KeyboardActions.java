package actionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement id = driver.findElement(By.xpath("//input[@id='email']"));
		
		//id.sendKeys("pallavimhetre2606@gmail.com");          // sendkeys by webelement method
		
		Actions act = new Actions(driver);
		
		act.sendKeys(id, "pallavimhetre2606@gmail.com").perform();   //Sendkeys by Action Class
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
       
		//keyDown(WebElement target, java.lang.CharSequence key) – performs a key press after focusing on the target element
        //sendKeys(WebElement target, java.lang.CharSequence… keys) – types the value.
		
		act.keyDown(Password, Keys.SHIFT).sendKeys("p").keyUp(Keys.SHIFT).sendKeys("allavi@7799").build().perform();
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		act.moveToElement(loginbutton).click().build().perform();


	}

}
