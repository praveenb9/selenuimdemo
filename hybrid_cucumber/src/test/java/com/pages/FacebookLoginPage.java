package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Library;

public class FacebookLoginPage extends Library{

	public FacebookLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//*[@id='email']" )
	WebElement usernameText;

	@FindBy(xpath = "//*[@id='pass']")
	WebElement passwordText;
	
	@FindBy(id = "loginbutton")
	WebElement loginButton;
	
	
	public void loginUser(String userName, String password) {
		
		usernameText.sendKeys(userName);
		passwordText.sendKeys(password);
		loginButton.click();
	}
}
