package POMkitetestngcrossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pinpage {
	
	@FindBy(id = "pin") private WebElement pin;
	
	@FindBy(xpath = "//button[@type='submit']") private WebElement  continuebutton;

    public Pinpage(WebDriver driver) 
    {
    	PageFactory.initElements(driver, this);
    }

    public void sendpin() 
    {
    	pin.sendKeys("982278");
	}
    
    public void clickoncontinuebutton()
    {
    	continuebutton.click();
    }
}