package task1;

import java.time.Duration;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazontask1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murugan\\selenium driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement ab=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		Actions ac =new Actions(driver);
		ac.moveToElement(ab).perform();
		driver.findElement(By.xpath("//span[text()='Sign in' and @class='nav-action-inner']")).click();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("somu.r1998@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("192837465");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

		driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys("samsung m14");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
	
		
		String parent=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[@data-image-index='3']")).click();
		
		Set<String> child=driver.getWindowHandles();
		
		for(String aa:child)	
		{
			driver.switchTo().window(aa);
			if(!parent.equals(aa))
			{
				driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
				driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']")).click();
				
				driver.findElement(By.xpath("//div//span[@class='a-button-inner']/a[1]")).click();
				Thread.sleep(2000);		  
				WebElement quantity=driver.findElement(By.xpath("//select[@name='quantity']"));
				Select s=new Select(quantity);
				s.selectByValue("3");
				Thread.sleep(2000);
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		
		WebElement ad=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions as =new Actions(driver);
		as.moveToElement(ad).perform();
		
		driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
	}

}
