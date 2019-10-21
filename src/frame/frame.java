package frame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class frame {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		//by iframe number
		driver.switchTo().frame(0);
		
		// By webelement of frame
		//WebElement elemnet= driver.findElement(By.xpath("//*[@id='content']/iframe"));
		//driver.switchTo().frame(elemnet);
		String text= driver.findElement(By.id("draggable")).getText();
		System.out.println(text);
		
		
		
		
		
		

		
		
		
		
		
	}

}
