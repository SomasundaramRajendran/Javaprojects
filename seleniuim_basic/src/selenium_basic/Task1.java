package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murugan\\selenium driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("SOMASUNDARAM");
		
		driver.findElement(By.name("lastName")).sendKeys("R");
		
		driver.findElement(By.name("phone")).sendKeys("8122172722");
		
		driver.findElement(By.id("userName")).sendKeys("somu25");
		
		driver.findElement(By.name("address1")).sendKeys("6/10b vedhantham street");
		
		driver.findElement(By.name("city")).sendKeys("Kanchipuram");
		
		driver.findElement(By.name("state")).sendKeys("Tamilnadu");
		
		driver.findElement(By.name("postalCode")).sendKeys("631501");
		
		driver.findElement(By.id("email")).sendKeys("somu.r1998@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("123456");
		
		driver.findElement(By.name("confirmPassword")).sendKeys("123456");
				
	}

}
