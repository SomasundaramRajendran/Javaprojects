package selenium_basic;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Openbrowserguru {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Murugan\\selenium driver\\edge\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours");
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.close();

	}

}
