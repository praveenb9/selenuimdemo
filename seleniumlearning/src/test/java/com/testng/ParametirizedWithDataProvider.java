package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametirizedWithDataProvider {

	WebDriver driver;
	
//	@Test(dataProvider="OrangeHRMlogin")
//	public void OrangeHRMlogin(String username,String password) throws Exception {
//		
//	WebDriverManager.chromedriver().setup();
//	driver=new ChromeDriver();       
//	
//	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
//	driver.manage().window().maximize();
//	
//	driver.findElement(By.id("txtUsername")).sendKeys(username);
//	driver.findElement(By.id("txtPassword")).sendKeys(password);
//	Thread.sleep(2000);
//	driver.findElement(By.id("btnLogin")).click();
//	
//	Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/dashboard",driver.getCurrentUrl());
//	System.out.println(driver.getCurrentUrl());
//	System.out.println("User is able to login sucessfully");
//	
//	}
	
	@Test(dataProvider="Facebooklogin")
	public void loginTofacebook(String username,String password) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();       
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
	driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);

	driver.findElement(By.id("loginbutton")).click();

	System.out.println("User is able to login sucessfully");
	
	}
	
	@DataProvider(name="OrangeHRMlogin")
	public Object[][] passData() {

	Object[][] data=new Object[3][2];
	 		//username
			data[0][0]="frank";
			//password
			data[0][1]="demo1";

			data[1][0]="joshi";
			data[1][1]="demo123";

			data[2][0]="Admin";
			data[2][1]="admin123";

			return data;

	}
	
	@DataProvider(name = "Facebooklogin")
	public Object[][] passFBData() {

		Object[][] data=new Object[1][2];
		 		//username
				data[0][0]="9010080951";
				//password
				data[0][1]="praveen99";

//				data[1][0]="joshi";
//				data[1][1]="demo123";
//
//				data[2][0]="9010080951";
//				data[2][1]="praveen99";

				return data;

		}
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
}
