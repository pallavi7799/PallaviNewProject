package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableStudy {
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
	 @Test(priority = 1,enabled = false)
	  public void mymethod3() 
	  {
		 Reporter.log("My method3 is running",true);
	  }
	 @Test(priority = -3)
	  public void mymethod4() 
	  {
		 Reporter.log("My method4 is running",true);
	  }
	 @Test(priority = 3)
	  public void mymethod5() 
	  {
		 Reporter.log("My method5 is running",true);
	  }
}
