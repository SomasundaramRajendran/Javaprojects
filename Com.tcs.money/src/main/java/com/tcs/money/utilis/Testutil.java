package com.tcs.money.utilis;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.tcs.money.base.Testbase;

import ru.yandex.qatools.htmlelements.element.Select;

public class Testutil extends Testbase
{
		public static void Maximizewindow()
		{
			driver.manage().window().maximize();
		}
		public static void Implicitwait()
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		public static void Screenshot()
		{
			try
			{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File(".//src//main//java//com//tcs//money//screen//fb"+System.currentTimeMillis()+".jpg"));
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		public static void Day(WebElement day,int d)
		   {
			   Select s= new Select(day);
			   s.selectByIndex(d);
		   }
			
			

		
		
		
		
		
		
		
		
}
