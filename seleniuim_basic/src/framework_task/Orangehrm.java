package framework_task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Orangehrm 
{
	WebDriver driver;
	@BeforeTest
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Murugan\\\\\\\\selenium driver\\\\\\\\chromedriver-win64\\\\\\\\chromedriver-win64\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
	@Test(priority=1)
	public void VerifyTitle()
	{
		String ab=driver.getTitle();
		System.out.println(ab);
	}
	@Test(priority=2)
	public void VerifyCurrenturl()
	{
		String ac=driver.getCurrentUrl();
		System.out.println(ac);
	}
	@Test(priority=3)
	public void VerifyUsername()
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
	}
	@Test(priority=4)
	public void VerifyPassword()
	{
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	}
	@Test(priority=5)
	public void VerifyLogin()
	{
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	@Test(priority=6)
	public void VerifyAdmin()
	{
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
	}
	
	@Test(priority=7)
	public void VerifyUsername1()
	{
		driver.findElement(By.xpath("//div[@class='oxd-form-row']/div/div/div/div[2]/input")).sendKeys("Admin");
		
		
	}
	@Test(priority=8)
	public void VerifyUSerrole()
	{
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
		driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div")).click();
		
		/*Select bb=new Select(aa);
		bb.selectByVisibleText("Admin");*/
		
	}
	@Test(priority=9)
	public void VerifyEmployeename()
	{
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("R.SOMU");
	}
	
	@Test(enabled=false)
	public void VerifyStatus()
	{
		
	}
	
	
	@AfterTest
	public void Tear()
	{
		//driver.close();
	}
	
	
	
	
	
}
