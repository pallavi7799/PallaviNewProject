package popUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenAndAlertpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\\\chromedriver101\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		//handelling hidden division popup,clicked on cancel button
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		//search for search box and typed iphone 13 pro
		driver.findElement(By.name("q")).sendKeys("iphone 13 pro");
		Thread.sleep(1000);
		//clicked on search button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		//selected iphone 13 pro pro
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 Pro (Gold, 256 GB)']")).click();
		//child window popupped up,to workon child we have switch focus from amin page to child page
		//to switch focus from main page to child page we need to finf id 
		//find id using driver.getwindowhandle or window handle
		//we cant itrate set so convert set to arraylist string
	    String mainpageid = driver.getWindowHandle();
	    //to get id of main page
		System.out.println(mainpageid);
		//to get id of all pages we need windowhandles,create object for that return type is set<string>
		//which doesn't support for loop 
		Set<String> allids = driver.getWindowHandles();
		//converting to arraylist
		ArrayList<String> ar=new ArrayList<>(allids);
		//assigned indexs
		String mainpage = ar.get(0);
		String childpage = ar.get(1);
		//get ids of both windows using for loop
		for(int i=0;i<=allids.size()-1;i++) {
			System.out.println(ar.get(i));}
		Thread.sleep(1000);
		//switch to child page
		driver.switchTo().window(childpage);
		Thread.sleep(10000);
	  //  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//click on 128gb option
		
		driver.findElement(By.xpath("//a[text()='128 GB']")).click();
		Thread.sleep(5000);
		driver.switchTo().window(mainpage);
		//disselect service options 
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[4]")).click();
		Thread.sleep(1000);
		driver.switchTo().window(childpage);
		//dis select by default seleted option
		//driver.findElement(By.xpath("(//div[@class='_24_Dny'])[6]")).click();
		Thread.sleep(5000);
		//click on add to cart option
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		//switch to main page again to perform other actions using
		driver.switchTo().window(mainpage);
		//click on compare
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[15]")).click();
		Thread.sleep(10000);
		 //click on compare popup
		driver.findElement(By.xpath("//a[@class='_11o22n']")).click();
		
		
	}

}
