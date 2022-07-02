package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage
{
    @FindBy(xpath = "//input[@type='text']")private WebElement textbox;
    @FindBy(xpath = "//button[@type='submit']")private WebElement Search;
    
    public homepage(WebDriver driver) 
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void sendtext()
    {
    	textbox.sendKeys("iphone 13");
    }
    
    public void clickonsearchbutton()
    {
    	Search.click();
    }
}
