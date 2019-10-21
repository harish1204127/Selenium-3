package waits;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class explicitWait {

	/**
	 * @param args
	 you can set it up to wait for any condition you might like. Usually, 
	 you can use some of the prebuilt ExpectedConditions to wait for elements to become clickable, visible, invisible, etc.
	 
	 Explicit waits are used to halt the execution until the time a particular condition is met or the maximum time has elapsed.
	 WebDriver introduces classes like WebDriverWait and ExpectedConditions to enforce Explicit waits into the test scripts.
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// main window
		driver.get("http://demo.guru99.com/popup.php");
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/p/a")));
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		
	/*	new FluentWait<WebDriver>(driver)
	       .withTimeout(10, TimeUnit.SECONDS)
	       .pollingEvery(5, TimeUnit.SECONDS)
	       .ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/p/a")));

	*/	
	}

}
