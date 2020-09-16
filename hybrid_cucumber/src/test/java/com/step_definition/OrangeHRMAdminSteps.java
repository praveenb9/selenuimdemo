package com.step_definition;

import com.baseclass.Library;
import com.pages.OrangeHRMAdminPage;
import com.pages.OrangeHRMLoginPage;
import com.selenium_reusablefuntion.SeleniumUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMAdminSteps extends Library{

	OrangeHRMLoginPage loginPage;
	OrangeHRMAdminPage adminPage;
	SeleniumUtility utility;
	
	@Given("To Open Admin functionlity of OrangeHrm")
	public void to_Open_Admin_functionlity_of_OrangeHrm() {
		browserSetUp();
		loginPage=new OrangeHRMLoginPage(driver);
		loginPage.loginUser(properties.getProperty("username"),properties.getProperty("password"));
		loginPage.submit();
	    adminPage = new OrangeHRMAdminPage(driver);
	    adminPage.adminMenu();
	}

	@When("To Enter Username")
	public void to_Enter_Username() {
	    adminPage = new OrangeHRMAdminPage(driver);
	    adminPage.enterUserName(properties.getProperty("username"));
	}

	@Then("Select UserRole")
	public void select_UserRole() {
	    adminPage = new OrangeHRMAdminPage(driver);
	    utility = new SeleniumUtility(driver);
	    utility.dropdown(adminPage.getUserRole(), properties.getProperty("userRole"));
	}

	@Then("To Enter EmployeeName")
	public void to_Enter_EmployeeName() {
	    adminPage = new OrangeHRMAdminPage(driver);
	    adminPage.enterEmployee(properties.getProperty("empname"));
	}

	@Then("Select Status")
	public void select_Status() {
		 adminPage = new OrangeHRMAdminPage(driver);
		    utility = new SeleniumUtility(driver);
		    utility.dropdown(adminPage.getStatus(), properties.getProperty("status"));
	}

	@Then("Click Search Button")
	public void click_Search_Button() {
		 adminPage = new OrangeHRMAdminPage(driver);
		 adminPage.search();
	}

	@Then("Take the Screenshot and the Title")
	public void take_the_Screenshot_and_the_Title() {
	    utility = new SeleniumUtility(driver);
	    utility.to_take_screenshot("admin");
	}

	@Then("Close the browser")
	public void close_the_browser() {
	   tearDown();
	}
}
