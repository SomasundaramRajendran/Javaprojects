package selenium_basic;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Murugan\\\\selenium driver\\\\chromedriver-win64\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement Country=driver.findElement(By.name("country"));
		Select op =new Select(Country);
		op.selectByIndex(2);
		//op.selectByValue(null);
		//op.selectByVisibleText(null);
		List<WebElement> li=op.getOptions();
		System.out.println(li.size());
		
		/*for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i).getText());             //for method
		}*/
		Iterator<WebElement> it =li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());			//iterator method
		}

	}
}
