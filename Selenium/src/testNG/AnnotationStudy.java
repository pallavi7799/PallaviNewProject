package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationStudy {
	 @Test()
	  public void mymethod() 
	  {
		 Reporter.log("My method is running",true);
	  }
	  
	  @AfterMethod
	  public void method1()
	  {
		  Reporter.log("After method is running",true);
	  }
	  
	  @BeforeMethod
	  public void method2()
	  {
		  Reporter.log("Before method is running",true);
	  }
	  
	  @BeforeClass
	  public void method3()
	  {
		  Reporter.log("Before class method running",true);
	  }
	  
	  @AfterClass
	  public void method4()
	  {
		  Reporter.log("After class method is running",true);
	  }
	  
	  @BeforeTest
	  public void method5()
	  {
		  Reporter.log("Before test is running",true);
	  }
	  
	  @AfterTest
	  public void method6()
	  {
		  Reporter.log("After test is running",true);
	  }

  }
