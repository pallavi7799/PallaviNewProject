package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeoutstudy {
	@Test(priority = 0)
	  public void mymethod1() 
	  {
		 Reporter.log("My method 1 is running",true);
	  }
	  
	 @Test(priority = -1)
	  public void mymethod2() 
	  {
		 Reporter.log("My method 2 is running",true);
	  }
	  
	 @Test(timeOut = 100)
	  public void mymethod3() throws InterruptedException 
	  {
		 Reporter.log("My method 3 is running",true);
		 Thread.sleep(1000);
	  }
	 @Test(priority = -3)
	  public void mymethod4() 
	  {
		 Reporter.log("My method 4 is running",true);
	  }
	 @Test(priority = 3)
	  public void mymethod5() 
	  {
		 Reporter.log("My method 5 is running",true);
	  }

}
