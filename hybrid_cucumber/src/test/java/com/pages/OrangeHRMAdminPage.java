package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OrangeHRMAdminPage {

	public OrangeHRMAdminPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "searchSystemUser_userName")
	WebElement userName;
	
	@FindBy(id = "searchSystemUser_userType")
	WebElement userType;
	
	@FindBy(id = "searchSystemUser_employeeName_empName")
	WebElement empName;
	
	@FindBy(id = "searchSystemUser_status")
	WebElement SystemUser_status;
	
	@FindBy(id = "searchBtn")
	WebElement searchBtn;
	
	@FindBy(xpath =  "//*[@id=\"menu_admin_viewAdminModule\"]/b")
	WebElement adminMenu;
	
	public void adminMenu()
	{
		adminMenu.click();
	}
	
	public void enterUserName(String uname)
	{
		userName.sendKeys(uname);
	}
	public WebElement getUserRole()
	{
		return userType;
	}
	
	public void enterEmployee(String employeeName)
	{
		empName.sendKeys(employeeName);
	}
	
	public WebElement getStatus()
	{
		return SystemUser_status;
	}
	
	public void search()
	{
		searchBtn.click();
	}
}
