package com.testng;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.seleniumtest.WrapperMethods;

public class FlipKartLogin {

	WrapperMethods wrapper=new WrapperMethods();
	
	@BeforeTest
	public void launchApp()
	{
		wrapper.insertapp("https://www.flipkart.com/");

	}
	
	@BeforeMethod
	public void login()
	{
	wrapper.enterbyxapth("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input", "7285985964");
	wrapper.enterbyxapth("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input", "praveen99");
	wrapper.clickbyxpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button");
	}
	
	@Test
	public void admin() throws IOException
	{
		wrapper.enterbyxapth("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input", "mobiles");
		wrapper.clickbyxpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg");
		wrapper.takesnap("src/test/resources/screenshots/filebin.png");
	}
	@AfterMethod
	public void closeApp()
	{
		System.out.println(wrapper.driver.getTitle());
	}
	@AfterTest
	public void tearDown()
	{
		wrapper.closeapp();
	}
}
