package selenium_basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_over {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Murugan/selenium driver/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement a=driver.findElement(By.xpath("//div[text()='Jobs']"));
		Actions b= new Actions(driver);
		b.moveToElement(a).perform();       // place cursor on the text
		
		driver.findElement(By.xpath("//div[text()='IT jobs']")).click();
		
	}

}
