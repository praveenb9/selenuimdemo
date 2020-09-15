package com.testng;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.seleniumtest.WrapperMethods;


public class MakeMyTripAssignemnt {


	WebDriver driver;
WrapperMethods wrapper=new WrapperMethods();
	
	@BeforeTest
	public void launchApp()
	{
		wrapper.insertapp("https://www.makemytrip.com/");

	}
	
	@Test
	public void book() throws InterruptedException
	{
		wrapper.clickbyxpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[1]/a/span[1]");
	
	}
	
//	@AfterTest
//	public void tearDown()
//	{
//		wrapper.closeapp();
//	}
}
