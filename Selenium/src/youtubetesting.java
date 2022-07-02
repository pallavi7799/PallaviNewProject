import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubetesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\ChromDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");

	}

}
