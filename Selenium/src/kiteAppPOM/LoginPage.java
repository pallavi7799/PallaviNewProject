package kiteAppPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import kiteAppUtility.UtilityClassUsingProperty;

public class LoginPage {
	@FindBy(id = "userid")private WebElement UserID;
	@FindBy(id = "password")private WebElement PWD;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginButton;
	@FindBy(xpath = "(//span[@class='su-message'])[1]")private WebElement UserIdErrorMessage;
	@FindBy(xpath = "(//span[@class='su-message'])[2]")private WebElement PasswordErrorMessage;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String sendUserID1(String username) {
		UserID.sendKeys(username);
		return username;
	}

	public void sendpassword(String password) {
		PWD.sendKeys(password);
	}

	public void clickonloginbutton() {
		loginButton.click();
	}

	public String UserIdErrorMessage() throws IOException {
		String UserIDActualError = UserIdErrorMessage.getText();
		return UserIDActualError;
	}

	public String ValidateActualUserIDErrormsg() throws IOException {
		String ExpectedUserIDErrormsg = UtilityClassUsingProperty.readDataFromProperty("UserIDErrorMessage");
		return ExpectedUserIDErrormsg;
	}

	public String PasswordErrMSG() {
		String ActualPwdErrMsg = PasswordErrorMessage.getText();
		return ActualPwdErrMsg;
	}

	public String ValidatePwdErrMsg() throws IOException {
		String ExpectedPwdErrMsg = UtilityClassUsingProperty.readDataFromProperty("PasswordErrorMessage");
		return ExpectedPwdErrMsg;
	}

}
