package com.inetbanking.testCases;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws IOException
	{	
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		
		//System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("GTPL Bank Home Page"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}

}
