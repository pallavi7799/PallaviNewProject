package kiteAppTest;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
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
public class TestClassUsingProperty extends BaseclassUsingProperty {

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

	@BeforeMethod
	public void KiteLogin() throws IOException {
		login.sendUserID1(UtilityClassUsingProperty.readDataFromProperty("UN"));
		Reporter.log("Sending Username.....");
		login.sendpassword(UtilityClassUsingProperty.readDataFromProperty("PWD"));
		Reporter.log("Sending Password.....");
		login.clickonloginbutton();
		Reporter.log("Clicking on login button");
		pin.SendPin(UtilityClassUsingProperty.readDataFromProperty("PIN"));
		Reporter.log("Sending pin.....");
		pin.Clickoncontiue();
		Reporter.log("logged in successfully");

	}

	@Test
	public void ValidateKiteUserID() throws EncryptedDocumentException, IOException {
		String actualUserID = home.ActualuserID();
		String ExpectedUserID = UtilityClassUsingProperty.readDataFromProperty("UN");
		Assert.assertEquals(actualUserID, ExpectedUserID, "Actual and Exected User Id are not matching,TC is Failed");
		Reporter.log("Actual and Expected UserId Are matching,TC is Passed", true);
		// UtilityClassUsingProperty.takeScreenshot(driver);
	}

	@AfterMethod
	public void logout() throws InterruptedException {
		home.logout();
	}

	@AfterClass
	public void closebrowser() {
		driver.close();
	}
}
