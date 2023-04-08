Feature: Login Functionality

  Scenario: Validate logging into the Application using valid credentials TC_LF_001
    Given I navigate to OpenCart web page
    When I go to login page
    Then I should be navigated to Login page
    And I enter email and password and click login button
    Then I should get logged in and taken to the Account page
