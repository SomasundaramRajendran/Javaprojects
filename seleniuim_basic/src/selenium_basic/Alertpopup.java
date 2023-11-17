package selenium_basic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Murugan/selenium driver/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		
		Alert alt=driver.switchTo().alert();
		
		Thread.sleep(2000);
		//alt.accept();     // for click ok button
		//alt.dismiss()   // for click cancel button if any
		//alt.sendKeys(null)  // for to put any value in alert pop box
		String a=alt.getText();  // for to get text in aler pop
		System.out.println(a); 
		
	}

}
