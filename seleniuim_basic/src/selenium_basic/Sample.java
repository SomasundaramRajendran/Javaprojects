package selenium_basic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) throws IOException {
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Murugan\\\\selenium driver\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		/*WebElement aa=driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']"));
		Select bb=new Select(aa);
		//bb.selectByIndex(1);
		bb.selectByVisibleText("Admin");*/
		
		//driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'Admin')]")).click();
		
		
		
		
		
	}

}
