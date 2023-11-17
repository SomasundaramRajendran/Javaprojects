package selenium_basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Murugan/selenium driver/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.fb.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement a=	driver.findElement(By.linkText("Forgotten password?"));
		Actions b = new Actions(driver);
		b.contextClick(a).build().perform();	//perform right click mouse action = mouse event
		b.contextClick(a).doubleClick().perform()  ;        //perform left click mouse action = mouse event
		
		

	}

}
