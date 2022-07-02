package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependOnMethodStudy {
	 @Test(priority = 0)
	  public void mymethod1() 
	  {
		 Reporter.log("My method1 is running",true);
	  }
	  
	 @Test(priority = -1)
	  public void mymethod2() 
	  {
		 Reporter.log("My method2 is running",true);
	  }
	 @Test(priority = 1)
	  public void mymethod3() 
	  {
		 Reporter.log("My method3 is running",true);
	  }
	 @Test(priority = -3,dependsOnMethods = "mymethod5")
	  public void mymethod4() 
	  {
		 Reporter.log("My method4 is running",true);
	  }
	 @Test(priority = 3)
	  public void mymethod5() 
	  {
		 Assert.fail();
		 Reporter.log("My method5 is running",true);
	  }
}
