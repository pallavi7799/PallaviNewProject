package pom2;

import java.time.Duration;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAppBaseClass.BaseClass;

public class TestClass extends BaseClass {
	
	homepage home;
	resultpage result;
	
	@BeforeClass
	public void openbrowser()
	{
		luanchbrowser();
		home = new homepage(driver);
		result = new resultpage(driver);
	}
	
	@BeforeMethod
	public void searchmobile()
	{
		home.sendtext();
		home.clickonsearchbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		result.SelectminValue();
		result.voidSelectmaxValue();
	}
	
  @Test
  public void verifyResult() 
  {
	  
  }
}
