package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframestudy2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver101\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//switching Selenium Focus from main page to iframe
		
		driver.switchTo().frame("frame1");
		Thread.sleep(1000);
		
		//switching Selenium Focus from main page to frame2(child frame)
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(frame2);
		Thread.sleep(1000);
		
		WebElement frame2text = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		String result1 = frame2text.getText();
		System.out.println("frame 2 text is "+result1);
		Thread.sleep(1000);
		
		//switching Selenium Focus from frame2(child frame) frame 1
		
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		
		WebElement frame1 = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		String parenttext = frame1.getText();
		System.out.println("frame 1 text is "+parenttext);
		
		//switching Selenium Focus from frame 1 to main page
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		WebElement mainpage = driver.findElement(By.xpath("//div[contains(text(),'Sample Nested Iframe page')]"));
		String mainpagetext = mainpage.getText();
		System.out.println("Main page text is "+mainpagetext);
		
		
		
	}

}
