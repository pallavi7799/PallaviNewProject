package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//span[@class='user-id']") private WebElement ActualUSerID;
	@FindBy(xpath = "//a[@target='_self']") private WebElement loguotbutton;
	
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String ActualuserID()
	{
		 String actualuserID=ActualUSerID.getText();
		return actualuserID;
	}
     public String validateUserID(String expectedUsername)
	{
		String actualUserID = ActualUSerID.getText();
		String expetctedUserID = expectedUsername;
		if(actualUserID.equals(expetctedUserID))
		{
		System.out.println("User ID matching TC is Passed");
		}
		else {
		System.out.println("User ID not matching TC is Failed");
		}
		return expetctedUserID;
		
		}
     
     public void logout() throws InterruptedException
     {
    	 ActualUSerID.click();
    	 Thread.sleep(200);
    	 loguotbutton.click();
     }

}
