package framework_task;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Letskodeit_task 
{
	
	WebDriver driver;
    @BeforeTest
    public void Setup()
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murugan\\selenium driver\\chromedriver-win64\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @Test(priority=1)
    public void VerifyRadiobutton()
    {
        driver.findElement(By.xpath("//input[@id='benzradio']")).click();	 
    }
    @Test(priority=2)
    public void VerifyCheckbox()
    {
    	driver.findElement(By.xpath("//input[@id=\"benzcheck\"]")).click();
    }
    @Test(priority=3)
    public void VerifySwitchtowindow()
    {
    	String parent=driver.getWindowHandle();
    	driver.findElement(By.xpath("//button[text()='Open Window']")).click();
    	Set<String> child=driver.getWindowHandles();
    	
    	for(String aa:child)
    	{
    		driver.switchTo().window(aa);
    		if(!parent.equals(aa))
    		{
    			String Wtitle=driver.getTitle();
    		    Assert.assertEquals(Wtitle, "All Courses");
    		    
    		    
    		}
    		
    	}
    	driver.close();
    	driver.switchTo().window(parent);
    }
    @Test(priority=4)
  
    public void VerifySwitchtab() throws InterruptedException
    {
    	String parent1=driver.getWindowHandle();
    	driver.findElement(By.xpath("//a[text()='Open Tab']")).click();
    	Set<String> child1=driver.getWindowHandles();
    	
    	for(String bb:child1)
    	{
    		driver.switchTo().window(bb);
    		if(!parent1.equals(bb))
    		{
    			WebElement ad=driver.findElement(By.xpath("//select[@name='categories']"));
    			Select af= new Select(ad);
    			af.selectByValue("1606");
    			Thread.sleep(2000);
    			
    		}
    	}
    	driver.close();
    	driver.switchTo().window(parent1);
    		
    	
    }
    @Test(priority=5)
    public void VerifySelectclass()
    {
    	WebElement ag=driver.findElement(By.xpath("//select[@id='carselect']"));
    	Select ah=new Select(ag);
    	ah.selectByVisibleText("Benz");
    	
    }
    @Test(priority=6)
    public void VerifyMultipleselect()
    {
    	WebElement aj=driver.findElement(By.xpath("//select[@name='multiple-select-example']"));
    	Select ak =new Select(aj);
    	ak.selectByVisibleText("Orange");
    }
    
    @Test(priority=7)
    public void VerifyAutosuggestion()
    {
    	driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("au");
    	List<WebElement> al=driver.findElements(By.xpath("//a[text()='API Automation']"));
    	
    	for(WebElement aa: al)
    	{
    		if(aa.getText().equals("API Automation"));
    		{
    			aa.click();
    		}
    	}
    	
    }
    @Test(priority=8)
    public void VerifyEnablebox()
    {
    	driver.findElement(By.xpath("//input[@id='enabled-example-input']")).sendKeys("Somu");
    }
    
    @Test(priority=9,enabled=false)
    public void VerifyElement_display() throws InterruptedException
    {
    	driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@id='show-textbox']")).click();
    	driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("Tester");
    }
    
    @Test(priority=15)
    public void VerifyAlertpopup() throws InterruptedException
    {
    	driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("somu");
    	driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
    	Alert alt=driver.switchTo().alert();
    	String a=alt.getText();
    	Assert.assertEquals(a, "Hello somu, share this practice page and share your knowledge");
    	System.out.println(a);
    	alt.dismiss();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("somu.r");
    	driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
        Alert alt1=  driver.switchTo().alert();
        String b=  alt1.getText();
        Assert.assertEquals(b, "Hello somu.r, Are you sure you want to confirm?");
        System.out.println(b);
        alt.dismiss();
       
    }
    
    @Test(priority=10)
    public void VerifyMouseover() throws InterruptedException
    {
    	WebElement c=driver.findElement(By.xpath("//button[text()='Mouse Hover']"));
    	Actions ac=new Actions(driver);
    	ac.moveToElement(c).perform();
    	driver.findElement(By.xpath("//a[text()='Top']")).click();
    	Thread.sleep(2000);
    	WebElement ca=driver.findElement(By.xpath("//button[text()='Mouse Hover']"));
    	Actions aca=new Actions(driver);
    	aca.moveToElement(ca).perform();
    	WebElement r=driver.findElement(By.xpath("//a[text()='Reload']"));
    	//Actions acb=new Actions(driver);
    	//aca.moveToElement(r).perform();
    	aca.contextClick(r).doubleClick().perform();
    	
    }
    @Test(priority=11)
    public void VerifyTable()
    {
     String b=	driver.findElement(By.xpath("//table[@id='product']/tbody/tr/td[2]")).getText();
     System.out.println(b);
     Assert.assertEquals(b, "Selenium WebDriver With Java");
     
    List<WebElement> row=driver.findElements(By.xpath("//table[@id='product']"));
    for(int i=0;i<row.size();i++) 
    {
    List<WebElement> col= 	driver.findElements(By.tagName("td"));
    	for(int j=0;j<col.size();j++)
    	{
    		String ad=col.get(j).getText();
    		System.out.println(ad);
    	}
    }
    }
    
    @Test(priority=12)
    public void VerifyScreenshot() throws IOException
    {
    	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileHandler.copy(src, new File("I:\\ss\\flipkark1.jpg"));
    }
    @Test(priority=13)
    public void VerifyScrolldownup() throws InterruptedException
    {
    	JavascriptExecutor ab=(JavascriptExecutor)driver;
    	ab.executeScript("window.scrollBy(0,500)");
    	Thread.sleep(2000);
    	ab.executeScript("window.scrollBy(0,-500)");
    }
    @Test(priority=14)
    public void VerifyFindtotalframes()
    {
    	List<WebElement> ae=driver.findElements(By.tagName("iframe"));
        int a=	ae.size();
        System.out.println("Total Frames="+a);
        for(int i=0;i<=a-1;i++)
        {
        String d= ae.get(i).getText();
        System.out.println(d);
        
        }
        for(WebElement aa:ae)
        {
        	String c=aa.getAttribute("id");
        	System.out.println(c);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	@AfterTest
	public void Tear()
	{
		//driver.close();
	}
	
	
	
	
	
}
