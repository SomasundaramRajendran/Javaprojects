package task1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Murugan/selenium driver/chromedriver-win64/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		
		driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("SOMASUNDARAM R");
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("somu");
		driver.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("123456");
		driver.findElement(By.xpath("//input[(@id='newpasswd1')]")).sendKeys("123456");
		driver.findElement(By.xpath("//input[contains(@name,'altemail')]")).sendKeys("somu.r98@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'mobno')]")).sendKeys("8122172722");
		
		WebElement date=driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Day')]"));
		Select ab= new Select(date);
		ab.selectByValue("25");
		WebElement month=driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Month')]"));
		Select ac=new Select(month);
		ac.selectByValue("12");
		WebElement year=driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Year')]"));
		Select ad= new Select(year);
		ad.selectByValue("1998");
		driver.findElement(By.xpath("//input[@value='m']")).click();
		
        WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
		
		Select a=new Select(country);
		a.selectByValue("99");
		
		WebElement city=driver.findElement(By.xpath("//select[starts-with(@name,'city')]"));
		Select c=new Select(city);
		c.selectByValue("Chennai");
		
	}

}
