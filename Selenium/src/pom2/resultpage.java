package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class resultpage {
	@FindBy(xpath = "(//select[@class='_2YxCDZ'])[1]")private WebElement minvalue;
	@FindBy(xpath = "(//select[@class='_2YxCDZ'])[2]")private WebElement maxvalue;
	
	public resultpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void SelectminValue()
	{
		Select s = new Select(minvalue);
		s.selectByIndex(4);
	}
	
	public void voidSelectmaxValue()
	{
		Select s1 = new Select(maxvalue);
		s1.selectByIndex(4);
	}
}
