Feature: Logout Functionality
#  1. Click on Logout option from the Right Column
#  2. Click on Continue button
  Background:
    Given I navigate to OpenCart web page
    Then I go to login page
    And I enter email and password and click login button

  Scenario: Validate Logging out by selecting Logout option from Right Column options
    Given Click on Logout option from the Right Column
    And Click on Continue button
    Then User should be taken to the Home page

#    AUTOMATION TESTING DONE

