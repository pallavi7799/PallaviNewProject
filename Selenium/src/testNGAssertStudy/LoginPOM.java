package testNGAssertStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM 
{
	@FindBy(id = "userid") WebElement UserID;
	@FindBy(id = "password")  WebElement Password;
	@FindBy(xpath = "//button[@type='submit']") WebElement LoginButton;
    @FindBy(xpath = "//h2[text()='Login to Kite']") WebElement text;


public LoginPOM(WebDriver driver) 
{
	PageFactory.initElements(driver,this);
}
public  String ActualText()
{
 return text.getText();
}
public String SenduserId()
    {
	UserID.sendKeys("ELR321");
	return null;
	}
public void SendPassword()
    {
	Password.sendKeys("Dhana1111");
	}
public void ClickLoginButton()
    {
	LoginButton.click();
	
	}

}