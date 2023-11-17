package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task4_withoutrun {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions ab=new ChromeOptions();				//use this method to run browser background
		ab.addArguments("--headless");
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Murugan/selenium driver/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(ab);
		
		driver.get("https://demo.guru99.com/test/newtours");
		
		driver.manage().window().maximize();
		
		String title=driver.findElement(By.linkText("Demo Site")).getText();
		System.out.println(title);
		
		String bc=driver.getCurrentUrl();
		System.out.println(bc);
		
		
		
		

	}

}
