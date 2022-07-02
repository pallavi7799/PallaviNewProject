package actionsStudy;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassStudy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://webdriveruniversity.com/index.html");
		WebElement ref = driver.findElement(By.xpath("//h1[text()='ACTIONS']"));
		
		//Scrolling to view element
		
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeScript("window.scrollBy(50,2500)");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		ref.click();
		
		//Change selenium focus from Main Page to child page
		
		Set<String> allids = driver.getWindowHandles();
		ArrayList<String> i = new ArrayList<>(allids);
		String Mainpage =  i.get(0);
	    String ChildPage = i.get(1);
		 
		driver.switchTo().window(ChildPage);
		 
		Actions act = new Actions(driver);// To Perform mouse actions create object of action class
		
		WebElement Myelement = driver.findElement(By.xpath("//button[text()='Hover Over Me First!']"));
		
		//Move to Element
		
		act.moveToElement(Myelement).click().build().perform();
		
		driver.findElement(By.xpath("(//a[text()='Link 1'])[1]")).click();
		
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
		
		//Drag And Drop 
		
		WebElement src = driver.findElement(By.xpath("//b[text()='DRAG ME TO MY TARGET!']"));
		
		WebElement dest = driver.findElement(By.xpath("//b[text()='DROP HERE!']"));
		
		//act.dragAndDrop(src, dest).perform();
		
		act.clickAndHold(src).moveToElement(dest).release().build().perform();
		
		WebElement ele = driver.findElement(By.id("double-click"));
		
		driver.switchTo().window(Mainpage);
		
		j.executeScript("window.scrollBy(50,100)");
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Selenium Webdriver 4 New Features In Detail']"));
		
		//act.contextClick(link).perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		Dimension d = new Dimension(500, 500);
		
	    driver.manage().window().setSize(d);
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    
	    Point p = new Point(700, 50);
	    
	    driver.manage().window().setPosition(p);
		
		
		
		
		
			}

}
