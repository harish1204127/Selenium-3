package windowhandle;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Windowhandle {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// main window
		driver.get("http://demo.guru99.com/popup.php");
		// total windows - 1
		Set<String> winIds = driver.getWindowHandles();
		System.out.println("Total browsers-> "+winIds.size());
		Iterator<String> it= winIds.iterator();
		System.out.println(it.next());
		
		driver.findElement(By.xpath("/html/body/p/a")).click();
		System.out.println("************************");
		// main and tab    --- main  - 2
		Thread.sleep(4000);
		winIds = driver.getWindowHandles();
		System.out.println("Total windows->"+ winIds.size());
		it= winIds.iterator();
		String mainWindowId = it.next();
		String tabWinId = it.next();
		System.out.println(mainWindowId);
		System.out.println(tabWinId);
		
		driver.switchTo().window(tabWinId);
		
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("harishtech2008@gmail.com");
		
		driver.close(); // tab window
		//driver.quit(); // close all the windows
		driver.switchTo().window(mainWindowId);

		// close - rediff popup
		// hdfc
	}

}
