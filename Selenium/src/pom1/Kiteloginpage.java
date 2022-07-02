package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage {
	
	@FindBy(xpath = "//input[@type='text']") private WebElement UserID;
	@FindBy(id = "password") private WebElement PWD;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	
	public Kiteloginpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//method with parameter
	public void sendUserID(String username)
	{
		UserID.sendKeys(username);
	}
	
	public void sendpassword(String password) 
	{
		PWD.sendKeys(password);
	}
	
	public void clickonloginbutton()
	{
		loginButton.click();
	}

}
