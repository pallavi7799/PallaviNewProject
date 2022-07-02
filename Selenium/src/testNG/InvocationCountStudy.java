package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountStudy {
  @Test(invocationCount = 2)
  public void method1() 
  {
	  Reporter.log("MEthod 1 is running",true);
  }
  
  @Test
  public void method2() 
  {
	  Reporter.log("MEthod 2 is running",true);
  }
  @Test
  public void method3() 
  {
	  Reporter.log("MEthod 3 is running",true);
  }
  
}
