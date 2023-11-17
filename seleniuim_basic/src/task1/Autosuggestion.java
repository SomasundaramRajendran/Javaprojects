package task1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murugan\\selenium driver\\chromedriver-win64\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("java 8");
	    List<WebElement> a= driver.findElements(By.xpath("//li //div[@class='lnnVSe' and @aria-label='java 8 download']"));  //use findelements for more suggestion 
	    
	    for(WebElement ss:a)
	    {
	    	if(ss.getText().equals("java 8 download"))
	    	{
	    		Thread.sleep(2000);
	    		ss.click();
	    	}
	    		
	    
	    }
		
		
		
		
		
	}

}
