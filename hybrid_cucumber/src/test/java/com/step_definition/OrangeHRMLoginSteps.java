package com.step_definition;

import com.baseclass.Library;
import com.pages.OrangeHRMLoginPage;
import com.selenium_reusablefuntion.SeleniumUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMLoginSteps extends Library {

	OrangeHRMLoginPage loginPage;
	SeleniumUtility utility;

	@Given("To Launch the Browser and navigate to the Url")
	public void to_Launch_the_Browser_and_navigate_to_the_Url() {
		
	  browserSetUp();
	  logger.info("Browser launched");
	}

	@When("To Enter Username and Password")
	public void to_Enter_Username_and_Password() {
		loginPage=new OrangeHRMLoginPage(driver);
		loginPage.loginUser(properties.getProperty("username"),properties.getProperty("password"));
		  logger.info("Entered username and password");

	}

	@Then("To Click the Submit button")
	public void to_Click_the_Submit_button() {
		loginPage=new OrangeHRMLoginPage(driver);
	  loginPage.submit();
	  logger.info("login successful");

	}

	@Then("To ake he Screeshot and the Title")
	public void to_ake_he_Screeshot_and_the_Title() {
		utility=new SeleniumUtility(driver);
		utility.to_take_screenshot("login");
		  logger.info("Taken Screenshot");
		utility.getTitle();
		
	}


}
