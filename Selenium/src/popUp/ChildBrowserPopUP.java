package popUp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phonepe.com/");
		driver.manage().window().maximize();

		String mainpageID = driver.getWindowHandle();// by using getWindowHandle method we will get id of main page
		System.out.println("ID of MAin page is " + mainpageID);

		driver.findElement(By.xpath("//a[text()='Blog']")).click();
		Thread.sleep(1000);

		Set<String> allIDs = driver.getWindowHandles();// By using This Method we will get id's off main page and child browser's,
														//return type is set of Stings
       Iterator<String> alid = allIDs.iterator();
       //System.out.println(alid);
       
       String mainpage = alid.next();
      String childpage = alid.next();
       System.out.println("main page "+mainpage);
       System.out.println("child page "+childpage);
       while(alid.hasNext()) 
       {
    	   System.out.println(alid.next());
       }
       
		// to Get all IDs We need to convert set<Strings> to Array
		ArrayList<String> Ar = new ArrayList<>(allIDs);

//		String mainPage = (String) Ar.get(0);// Index Of Main Page stored in Refereance Variable
//		System.out.println("main Page id by getWindowHandles method " + mainPage);
//
//	    String ChildPage = Ar.get(1);// Index Of Child Browser Page stored in Refereance Variable
//		System.out.println("Id of Child Browser PopUp " + ChildPage);

		// To Perform Acr=tion on Child browser We need to change Selenium Focus From
		// Main Page to Child Page

		driver.switchTo().window(childpage); // Switch Selenium focus From MAin Page to Child Browser

		driver.findElement(By.xpath("//a[text()='Sign in']")).click(); // find element to perfom Action
		Thread.sleep(1000);
		driver.navigate().back();
		//driver.close(); // close child browser window with the help of webdrivers Close Method

		// Again if we want to perform action on main page then will have change
		// selenium focus from child browser to main page

		driver.switchTo().window(mainpage); // Switch selenium focus from child page to main page
		driver.findElement(By.xpath("//a[text()='Press']")).click();
		Thread.sleep(1000);

		//driver.quit(); // Quit method will close all windows opened by selenium

	}

}
