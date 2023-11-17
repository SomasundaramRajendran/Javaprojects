package com.tcs.money.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.tcs.money.utilis.Testutil;

public class Testbase 
{
		
	File f;
	FileInputStream b;
	Properties pro;
	public static WebDriver driver;
public Testbase()
{
	try
	{
    f =new File(".//src//main//java//com//tcs//money//config//config.properties");
    b=new FileInputStream(f);
    pro=new Properties();
    pro.load(b);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}


}
public void open()
{
	String a=pro.getProperty("browsername");
	if(a.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", pro.getProperty("chromepath"));
		driver =new ChromeDriver();
		
	}
	else if(a.equalsIgnoreCase("Edge"))
	{
		System.setProperty("webdriver.edge.driver", pro.getProperty("edgepath"));
		driver=new EdgeDriver();
	}
	else if(a.equalsIgnoreCase("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver", pro.getProperty("Firefox"));
		driver=new FirefoxDriver();
	}
	else
	{
		System.out.println("given browsername is wrong");
	}
	driver.get(pro.getProperty("url"));
	Testutil.Maximizewindow();
	Testutil.Implicitwait();
	Testutil.Screenshot();


}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
