package com.tcs.money.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tcs.money.base.Testbase;

public class Login extends Testbase
{
	@FindBy(xpath="//input[@name='firstname']")
    WebElement Firstname;
    
    @FindBy(xpath="//select[@name='birthday_day']")
    public WebElement Daydropdown;
    
    @FindBy(xpath="//input[@value='1']")
    WebElement Femaleclick;
    
   
    
    public Login()
    {
    	super();
    	PageFactory.initElements(driver, this);
    }
    public void Verifyfirstname(String name)
    {
    	Firstname.sendKeys(name);
    }
    public  void Verifyclick()
    {
    	Femaleclick.click();
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
