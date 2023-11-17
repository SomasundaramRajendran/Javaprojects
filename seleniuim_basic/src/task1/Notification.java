package task1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {

	public static void main(String[] args) 
	{
		/*ChromeOptions ab = new ChromeOptions();
		ab.addArguments("--disable-notification");
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Murugan/selenium driver/chromedriver-win64/chromedriver.exe");
		WebDriver driver =new ChromeDriver(ab);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));*/
		
		
		ChromeOptions ab = new ChromeOptions();
		ab.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Murugan/selenium driver/chromedriver-win64/chromedriver.exe");
		WebDriver driver =new ChromeDriver(ab);
		driver.get("https://www.placementstore.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

}
