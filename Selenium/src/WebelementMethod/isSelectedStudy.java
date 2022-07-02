package WebelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedStudy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
        WebElement Checkbox = driver.findElement(By.id("checkBoxOption1"));
        if (Checkbox.isSelected())
        {
        	System.out.println("Checkbox is already selected");
        }
        else {
        	System.out.println("Selecting checkbox now ");
        	Checkbox.click();
        }
        if(Checkbox.isSelected()) {
        	System.out.println("Checkbox is selected");
        }
        else {
			System.out.println("Failed To select Checkbox");
		}
	}

}
