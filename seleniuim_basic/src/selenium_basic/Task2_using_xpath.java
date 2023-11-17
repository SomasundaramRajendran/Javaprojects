package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2_using_xpath {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Murugan\\\\selenium driver\\\\chromedriver-win64\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("SOMASUNDARAM");
		
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("R");
		
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8122172722");
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("somu.r@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("6/10b vedhantham street");
		
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("kanchipuram");
		
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Tamilnadu");
				
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("631501");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("somu25");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("123456");
		
		WebElement country=driver.findElement(By.name("country"));
		
		Select zx = new Select(country);
		
		zx.selectByVisibleText("ANTARCTICA");
		
		Thread.sleep(3000);
		
		driver.close();
		
				

		
		

	}

}
