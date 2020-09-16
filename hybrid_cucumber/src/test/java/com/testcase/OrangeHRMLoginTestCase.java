package com.testcase;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.OrangeHRMLoginPage;
import com.selenium_reusablefuntion.SeleniumUtility;

public class OrangeHRMLoginTestCase extends Library{
	
	OrangeHRMLoginPage loginPage;
	SeleniumUtility utility;
	@BeforeTest
	public void launchApp()
	{
		browserSetUp();
		logger.info("Browser Launch");

	}

	@Test
	public void login()
	{
		loginPage=new OrangeHRMLoginPage(driver);
		
		loginPage.loginUser(properties.getProperty("username"),properties.getProperty("password"));
		logger.info("Login in Successful");

	}
	
	@AfterTest
	public void closeApp()
	{
		utility=new SeleniumUtility(driver);
		utility.getTitle();
		utility.to_take_screenshot("login");
		tearDown();
		logger.info("Closing Browser");

	}
}
