package task1;

import java.time.Duration;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff_country {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Murugan/selenium driver/chromedriver-win64/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		
		WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
		
		Select ab=new Select(country);
		ab.selectByValue("99");
		List<WebElement> ad=ab.getOptions();
		System.out.println("===country====");
		Iterator<WebElement>adc=ad.iterator();
		while(adc.hasNext())
		{
			System.out.println(adc.next().getText());
		}
		
		
		WebElement city=driver.findElement(By.xpath("//select[starts-with(@name,'city')]"));
		Select ac=new Select(city);
		ac.selectByValue("Chennai");
		
	    List<WebElement> abc =	ac.getOptions();
	    Iterator<WebElement> abcd=abc.iterator();
	    System.out.println("===city===");
	    while(abcd.hasNext())
	    {
	    	System.out.println(abcd.next().getText());
	    }
		
		
		

	}

}
