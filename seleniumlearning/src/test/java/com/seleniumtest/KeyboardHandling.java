package com.seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardHandling {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
//		 driver.get("https://www.facebook.com/");
		 
//		 driver.findElement(By.id("email")).sendKeys("Manikanta");
		 
		 
//		 action.sendKeys(Keys.TAB).perform();
//		 action.sendKeys("FGAGA").perform();
//		 action.sendKeys(Keys.ENTER).perform();
		 
		 Actions action =new Actions(driver);
		 
		 driver.navigate().to("https://www.redbus.in/");
		 
		 driver.findElement(By.id("src")).sendKeys("hy");
		 
		 action.sendKeys(Keys.DOWN).perform();
		 action.sendKeys(Keys.DOWN).perform();
		 action.sendKeys(Keys.ENTER).perform();
	}

}
