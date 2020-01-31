package com.inetbank.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)	
	
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
				
	}
	
		@FindBy(name="uid")
		@CacheLookup
		WebElement txtUserName;
		
		@FindBy(xpath="//input[@name='password']")
		@CacheLookup
		WebElement txtpassword;
		
		@FindBy(name="btnLogin")
		@CacheLookup
		WebElement btnLogin;
		
		
		//Action Methods
		public void setUserName(String uname)
				{
			txtUserName.sendKeys(uname);
		}
		
		public void setpassword(String password)
		{
			txtpassword.sendKeys(password);
		}
		
		public void ClickSubmit()
		{
			btnLogin.click();
		}
		
		
	
}
