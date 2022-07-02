package kiteAppTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import kiteAppBaseClass.BaseclassUsingProperty;
import kiteAppPOM.HomePage;
import kiteAppPOM.LoginPage;
import kiteAppPOM.PinPage;
import kiteAppUtility.UtilityClassUsingProperty;
@Listeners(TestNGListners.Listners.class)
public class TestClassUsingProperty2 extends BaseclassUsingProperty {
	LoginPage login;
	PinPage pin;
	HomePage home;

	@BeforeClass
	public void OpenBrowser() throws IOException {
		launchbrowser();
		login = new LoginPage(driver);
		pin = new PinPage(driver);
		home = new HomePage(driver);
	}

	@BeforeMethod()
	public void KiteLogin() throws IOException {
		login.sendUserID1(UtilityClassUsingProperty.readDataFromProperty("UN1"));
		Reporter.log("Sending Username.....");
		login.sendpassword(UtilityClassUsingProperty.readDataFromProperty("PWD1"));
		Reporter.log("Sending Password.....");
		login.clickonloginbutton();
		Reporter.log("Clicking on login button");
	}

	@Test(priority = -1)
	public void ValidateUserIDErrorMsg() throws IOException {
		login.ValidateActualUserIDErrormsg();
		String ActualErrMSG = login.UserIdErrorMessage();
		String ExpectedErrorMsg = login.ValidateActualUserIDErrormsg();
		Assert.assertEquals(ActualErrMSG, ExpectedErrorMsg,"Actual and Expected userid error msg not matching tc is failed");
		Reporter.log("Actual and Expected UserId Error msg Are matching,TC is Passed", true);

	}

	@Test(priority = 1)
	public void ValidatePasswordErrMsg() throws IOException {
		login.ValidatePwdErrMsg();
		String ActualPwdErrmsg = login.PasswordErrMSG();
		String Expectedpwderrmsg = login.ValidatePwdErrMsg();
		Assert.assertEquals(ActualPwdErrmsg, Expectedpwderrmsg,"Actual and Expected Passwrd error msg not matching tc is failed");
		Reporter.log("Actual and Expected UserId Error msg Are matching,TC is Passed", true);
	}

	@AfterClass()
	public void logout() throws InterruptedException, IOException {
		driver.close();
	}

}
