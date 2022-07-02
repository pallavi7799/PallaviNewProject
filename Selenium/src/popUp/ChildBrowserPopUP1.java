package popUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUP1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("NewWindow")).click();
		
		Set<String> allIDs = driver.getWindowHandles();
		
		ArrayList<String> Ar = new ArrayList<>(allIDs);
		for(int i=0;i<=Ar.size()-1;i++) 
		{
			System.out.println("ID by Using For Loop "+Ar.get(i));
		}
		
		String MainPage = Ar.get(0);
		System.out.println(MainPage);
		String ChildPage = Ar.get(1);
		System.out.println(ChildPage);
		
		driver.switchTo().window(ChildPage);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("the7-search")).sendKeys("pallavi");
		Thread.sleep(1000);
		driver.close();
		
		
		
		driver.switchTo().window(MainPage);
		
		
		
	}

}
