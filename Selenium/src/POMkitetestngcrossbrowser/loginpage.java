package POMkitetestngcrossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	//initialize datamember/Variable
	
	@FindBy(id = "userid")  private WebElement UN ;
	
	@FindBy(id = "password") private WebElement PWD ;
	
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginbutton;

	//Create Constructor
	
	public loginpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
 
	}
	
	//create method
	
	public void sendusername() 
	{
		UN.sendKeys("ELR321");
	}
	
	public void sendpassword()
	{
		PWD.sendKeys("Dhana1111");
	}
	
	public void clickonloginbutton()
	{
		loginbutton.click();
	}

}
