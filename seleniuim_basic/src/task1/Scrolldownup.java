package task1;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldownup {

	public static void main(String[] args) throws InterruptedException 
	{
		/*System.setProperty("webdriver.chrome.driver", "C:/Users/Murugan/selenium driver/chromedriver-win64/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor ab=(JavascriptExecutor)driver;
	    ab.executeScript("window.scrollBy(0,500)");
	    
	    Thread.sleep(2000);
	    
	    ab.executeScript("window.scrollBy(0,-500)");*/
		System.setProperty("webdriver.chrome.driver", "C:/Users/Murugan/selenium driver/chromedriver-win64/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor ab=(JavascriptExecutor)driver;
	    ab.executeScript("window.scrollBy(0,500)");
	    
	    Thread.sleep(2000);
	    
	    ab.executeScript("window.scrollBy(0,-500)");

	}
}
