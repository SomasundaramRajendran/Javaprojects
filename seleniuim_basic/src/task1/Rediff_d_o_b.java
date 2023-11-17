package task1;

import java.time.Duration;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff_d_o_b {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Murugan/selenium driver/chromedriver-win64/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		
		WebElement date=driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Day')]"));
		Select ab= new Select(date);
		ab.selectByValue("25");
		
		List<WebElement> abc=ab.getOptions();
		System.out.println("----day----");
		for(int i=0;i<abc.size();i++)
		{
			
			System.out.println(abc.get(i).getText());
		}
		
		WebElement month=driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Month')]"));
		Select ac=new Select(month);
		ac.selectByValue("12");
		List<WebElement>acc=ac.getOptions();
		System.out.println("----month----");
		for(int i=0;i<acc.size();i++)
		{
			
			System.out.println(acc.get(i).getText());
		}
		
		WebElement year=driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Year')]"));
		Select ad= new Select(year);
		ad.selectByValue("1998");
		
		List<WebElement>adc=ad.getOptions();
		System.out.println("----year----");
		for(int i=0;i<adc.size();i++)
		{
			
			System.out.println(adc.get(i).getText());
		}
		
	}

}
