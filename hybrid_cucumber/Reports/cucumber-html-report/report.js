$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/testcase.feature");
formatter.feature({
  "name": "To Test The OrangeHrm Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Test the Login Functionality of OrangeHrm",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To Launch the Browser and navigate to the Url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.step_definition.OrangeHRMLoginSteps.to_Launch_the_Browser_and_navigate_to_the_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Enter Username and Password",
  "keyword": "When "
});
formatter.match({
  "location": "com.step_definition.OrangeHRMLoginSteps.to_Enter_Username_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Click the Submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_definition.OrangeHRMLoginSteps.to_Click_the_Submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To ake he Screeshot and the Title",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_definition.OrangeHRMLoginSteps.to_ake_he_Screeshot_and_the_Title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_definition.OrangeHRMLoginSteps.to_Close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Test the Admin Functionality of OrangeHrm",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To Open Admin functionlity of OrangeHrm",
  "keyword": "Given "
});
formatter.match({
  "location": "com.step_definition.OrangeHRMAdminSteps.to_Open_Admin_functionlity_of_OrangeHrm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Enter Username",
  "keyword": "When "
});
formatter.match({
  "location": "com.step_definition.OrangeHRMAdminSteps.to_Enter_Username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select UserRole",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_definition.OrangeHRMAdminSteps.select_UserRole()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Enter EmployeeName",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_definition.OrangeHRMAdminSteps.to_Enter_EmployeeName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Status",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_definition.OrangeHRMAdminSteps.select_Status()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Search Button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_definition.OrangeHRMAdminSteps.click_Search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Take the Screenshot and the Title",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_definition.OrangeHRMAdminSteps.take_the_Screenshot_and_the_Title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_definition.OrangeHRMAdminSteps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});