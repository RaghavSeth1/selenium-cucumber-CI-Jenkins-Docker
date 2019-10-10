#Author: raghav seth

Feature: Validate OrangeHRM Smoke Test Scenarios
Background: 
Given Login Page Navigated

@RS
  Scenario: Validate OrangeHRM title  
  Then Correct title should be displayed

 	 
  Scenario: Validate user able to login successfully - Valid Credential
    And I enter "Admin" and "admin123" on Login page and click login button
    Then I should see the Dashboard Page
    Then Logout of the Application
    
   
   Scenario: Validate user is denied access - Invalid Credential
    And I enter "Admin" and "admin122" on Login page and click login button
    Then Invalid Credentials Error is displayed
    
