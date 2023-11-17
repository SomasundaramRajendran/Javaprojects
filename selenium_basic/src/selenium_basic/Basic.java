package selenium_basic;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Basic
	{

		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murugan\\software.exe");
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("http://www.fb.com");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			driver.manage().window().minimize();
			
			Thread.sleep(3000);
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			driver.close();

		}

	}



