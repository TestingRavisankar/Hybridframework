package com.inetbank.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetbank.pageobjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass

{ 
	@Test
	public void LoginTest()
	{
		System.out.println("Logintest");			
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		lp.setpassword(password);
		lp.ClickSubmit();
		
	//Validations
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))
			{
				Assert.assertTrue(true);
				//logger.info("Successfully Entered");
			}
			else
			{
				Assert.assertTrue(false);
				//logger.info("Failed to Enter");
			}
	}
	
	@Test
	public void LoginTest1()
	{
		System.out.println("Logintest1");		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		lp.setpassword(password);
		lp.ClickSubmit();
		
	//Validations
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))
			{
				Assert.assertTrue(true);
				//logger.info("Successfully Entered");
			}
			else
			{
				Assert.assertTrue(false);
				//logger.info("Failed to Enter");
			}
	}
	
	@Test
	public void LoginTest2()
	{
		System.out.println("Logintest2");			
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		lp.setpassword(password);
		lp.ClickSubmit();
		
	//Validations
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))
			{
				Assert.assertTrue(true);
				//logger.info("Successfully Entered");
			}
			else
			{
				Assert.assertTrue(false);
				//logger.info("Failed to Enter");
			}
	}
}
