package listBoxOrDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultiple {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
//		driver.findElement(By.name("websubmit")).click();
		
		WebElement listbox = driver.findElement(By.name("cars"));
		
		Select s = new Select(listbox);
		
        boolean result = s.isMultiple();
        
		System.out.println(result);
		
		s.selectByVisibleText("Volvo");
		Thread.sleep(1000);
		
		s.selectByVisibleText("Saab");
		Thread.sleep(1000);
		s.selectByVisibleText("Opel");
		Thread.sleep(1000);
		System.out.println(s.getFirstSelectedOption().getText());
		s.deselectByVisibleText("Volvo");
		
		WebElement element = s.getFirstSelectedOption();
		String text = element.getText();
		System.out.println(text);
//		
//		WebElement firstWebElement = s.getFirstSelectedOption();
//		String myText = firstWebElement.getText();
//		System.out.println("1st selected option is "+myText);
		
		for(int i=0;i<=s.getAllSelectedOptions().size()-1;i++)
		{
		System.out.println(s.getAllSelectedOptions().get(i).getText());
		}
	}

}
