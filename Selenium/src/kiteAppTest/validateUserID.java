package kiteAppTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAppBaseClass.BaseClass;
import kiteAppPOM.HomePage;
import kiteAppPOM.LoginPage;
import kiteAppPOM.PinPage;
import kiteAppUtility.UtilityClass;
import net.bytebuddy.utility.nullability.AlwaysNull;

public class validateUserID extends BaseClass {
	
	HomePage home;
	LoginPage login;
	PinPage pin;
	
@BeforeClass
public void Openbrowser() {
	luanchbrowser();
	home = new HomePage(driver);
	login = new LoginPage(driver);
	pin = new PinPage(driver);
}
@BeforeMethod
public void loginTokite() throws EncryptedDocumentException, IOException {
	login.sendUserID1(UtilityClass.ReaddataFromExcel(0, 0));
	login.sendpassword(UtilityClass.ReaddataFromExcel(0, 1));
	login.clickonloginbutton();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	pin.SendPin(UtilityClass.ReaddataFromExcel(0, 2));
	pin.Clickoncontiue();
}
@Test
public void ValidateKiteUserID() throws EncryptedDocumentException, IOException {
	String actualUserID = home.ActualuserID();
	String ExpectedUserID = UtilityClass.ReaddataFromExcel(0, 0);
	Assert.assertEquals(actualUserID, ExpectedUserID, "Actual and Exected User Id are not matching,TC is Failed");
	Reporter.log("Actual and Expected UserId Are matching,TC is Passed",true);
	UtilityClass.takeScreenshot(driver);
}
@AfterMethod
public void Kitelogout() throws InterruptedException {
	home.logout();
}
@AfterClass
public void closebrowser() {
	driver.close();
}
}
