package testNGXmlStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class FailedXMLStudy {
	@Test()
	  public void mymethod1() 
	  {
		 Reporter.log("My method 1 is running",true);
	  }
	 @Test()
	  public void mymethod2() 
	  {
		// Assert.fail();
		 Reporter.log("My method 2 is running",true);
	  }
	 @Test()
	  public void mymethod3() 
	  {
		 Reporter.log("My method 3 is running",true);
	  }
	 @Test()
	  public void mymethod4() 
	  {
		 Reporter.log("My method 4 is running",true);
	  }
	 @Test()
	  public void mymethod5() 
	  {
		 Assert.fail();
		 Reporter.log("My method 5 is running",true);
	  }
}
