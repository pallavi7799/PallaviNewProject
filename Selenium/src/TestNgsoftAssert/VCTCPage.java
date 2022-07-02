package TestNgsoftAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VCTCPage {
	@FindBy(xpath = "//h1[text()='Welcome To Practice Page']")  private WebElement Headingtext;
	
	@FindBy(xpath = "//input[@id='displayed-text']")private WebElement textbox;
	
	@FindBy(xpath = "//input[@value='Radio1']")private WebElement radiobutton;
	
	public VCTCPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validatetext()
	{
	String ActualText = Headingtext.getText();
	return ActualText;
	
	}
	
	public void checkVisibility()
	{
		boolean result = textbox.isDisplayed();
	}
	
	public void radiobuttonSelect()
	{
		boolean result1 = radiobutton.isSelected();
	}
	public void selectradioButton()
	{
		radiobutton.click();
	}
}
