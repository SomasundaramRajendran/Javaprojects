package ddf;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Withexcel 
{
	WebDriver driver;
	
	@BeforeTest
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murugan\\selenium driver\\chromedriver-win64\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.microfocus.com/logout.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test(dataProvider = "z")
	public void Verifytest(String username,String password) throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
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
	@DataProvider(name="z")
	public Object[][] getdata() throws IOException
	{
		Excel ex = new Excel("C:\\Users\\Murugan\\Desktop\\data.xlsx");
		
	   int row=	ex.getrow("Sheet1");
	   int col= ex.getcolumn("Sheet1");
	   
	   Object[][] ob =new Object[row][col];
	   
	   for(int i=0;i<row;i++)
	   {
		   for(int j=0;j<col;j++)
		   {
			   ob[i][j] = ex.getsheet("Sheet1", i, j);
		   }
	   }
		return ob;
	}
}
