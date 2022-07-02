package testNGXmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupStudy {
	 @Test(groups = "Sanity")
	  public void mymethod1() 
	  {
		 Reporter.log("My method1 is running",true);
	  }
	  
	 @Test(groups = "Regration")
	  public void mymethod2() 
	  {
		 Reporter.log("My method2 is running",true);
	  }
	 @Test(groups = "Regration")
	  public void mymethod3() 
	  {
		 Reporter.log("My method3 is running",true);
	  }
	 @Test(groups = "Sanity")
	  public void mymethod4() 
	  {
		 Reporter.log("My method4 is running",true);
	  }
	 @Test(groups = "Sanity")
	  public void mymethod5() 
	  {
		 Reporter.log("My method5 is running",true);
	  }
}
