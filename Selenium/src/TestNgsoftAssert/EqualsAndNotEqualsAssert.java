package TestNgsoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EqualsAndNotEqualsAssert {
	SoftAssert soft = new SoftAssert();
	
  @Test
  public void Mymethod() 
  {
	  
	  String a ="Pune";
	  String b = "Mumbai";
	  String c = "Pune";
	  soft.assertNotEquals(a,b, "strings are not matching ,TC is failed");
	  
	  soft.assertNotEquals(a, c, "Strings are matching,TC is failed");
	  soft.assertAll();
  }
  @Test
  public void mymethod1()
  {
	  int a =10;
	  int b = 20;
	  int c = 10;
	  soft.assertEquals(a, c, "integers are not matching TC is failed");
	  soft.assertAll();
  }
 
}
