package TestNGListners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kiteAppBaseClass.BaseclassUsingProperty;

public class Listners implements ITestListener {
	BaseclassUsingProperty b = new BaseclassUsingProperty();

	@Override
	public void onTestFailure(ITestResult result) {
		String TCName = result.getName();
		try {
			b.takeScreenshot(TCName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ITestListener.super.onTestFailure(result);
		Reporter.log("Failed TC name is " + result.getName(), true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String TCName = result.getName();
		try {
			b.takeScreenshot(TCName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Success TC name is " + result.getName(), true);
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

}
