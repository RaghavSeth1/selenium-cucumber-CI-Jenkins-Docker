#Author: raghav seth

Feature: Validate OrangeHRM User Management Scenarios


  Scenario: Add ESS User from Admin(User Management Portal)
    Given Login Page Navigated
    And I enter "Admin" and "admin123" on Login page and click login button
    Then I should see the Dashboard Page
    Then Navigate to Usermanagement and click on ADD
    Then All details with valid data
    Then Save the record
    Then Validate that the record displayed in the search table
