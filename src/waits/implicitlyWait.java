package waits;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class implicitlyWait {

	/**
	 * @param args
	 *We should note that implicit waits will be in place for the entire time the browser is open. 
	 *This means that any search for elements on the page could take the time the implicit wait is set for.
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// main window
		driver.get("http://demo.guru99.com/popup.php");
		
	}

}
