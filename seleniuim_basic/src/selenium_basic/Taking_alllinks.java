package selenium_basic;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taking_alllinks {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murugan\\selenium driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> li = driver.findElements(By.tagName("a"));    //use findelements to get all elements in list
		System.out.println(li.size());
		
		Iterator<WebElement> it=li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText()+"===>"+it.next().getAttribute("href"));
		}

	
	}

}
