package POMkitetestngcrossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	@FindBy(xpath = "//span[@class='user-id']") private WebElement Actualuser;
	
	@FindBy(xpath = "//a[@target='_self']")private WebElement logoutlink ;
	
	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickonActualuser()
	{
		Actualuser.click();
	}
	
	public void clockonlogout()
	{
		logoutlink.click();
	}

}
