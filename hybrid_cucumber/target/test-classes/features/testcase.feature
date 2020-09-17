Feature: To Test The OrangeHrm Application

Background: To Test the Login Functionality of OrangeHrm
Given To Launch the Browser and navigate to the Url
When To Enter Username and Password
Then To Click the Submit button
Then To ake he Screeshot and the Title


Scenario Outline: To Test the Admin Functionality of OrangeHrm
    Given To Open Admin functionlity of OrangeHrm
    When To Enter "<Username>"
    Then Select UserRole 
    Then To Enter EmployeeName
    Then Select Status
    Then Click Search Button
    Then Take the Screenshot and the Title
    Then Close the browser
    
    Examples:
    |Username|
    |Praveen|
    |Suresh|
    |Karthik|