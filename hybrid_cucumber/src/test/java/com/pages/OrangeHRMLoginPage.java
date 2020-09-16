package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Library;

public class OrangeHRMLoginPage extends Library{

	public OrangeHRMLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id ="txtUsername" )
	WebElement usernameText;
	
	@FindBy(id = "txtPassword")
	WebElement passwordText;
	
	@FindBy(id = "btnLogin")
	WebElement loginButton;
	
//	@FindBy(xpath = "//*[@id='menu_admin_viewAdminModule']")
//	WebElement adminButton;
	
	
	public void loginUser(String userName, String password) {
		
		usernameText.sendKeys(userName);
		passwordText.sendKeys(password);
	}
	
	public void submit()
	{
		loginButton.click();

	}
}
