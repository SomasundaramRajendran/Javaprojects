package ddf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Withoutexcel 
{
	WebDriver driver;
	@BeforeTest
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Murugan\\selenium driver\\chromedriver-win64\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	}
	
	@Test(dataProvider="a")
	public void Verifytest(String username, String password) throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='login1']")).clear();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		Thread.sleep(2000);
		
		
		
	}

	
	
	@AfterTest
	public void Tear()
	{
		driver.close();
	}
	
	@DataProvider(name="a")              //ddf main method---> give input to testng main method
	public Object[][] getdata()
	{
		Object[][] ob = new Object[4][2];
		
		ob[0][0] = "cts@gmail.com";
		ob[0][1] ="e123";
		
		ob[1][0]= "info@gmail.com";
		ob[1][1]="i124";
		
		ob[2][0]= "tech@gmail.com";
		ob[2][1]="h125";
		
		ob[3][0]="tcs@gmail.com";
		ob[3][1]="o126";
		
		
		return ob;
	}
	
	
	
}
