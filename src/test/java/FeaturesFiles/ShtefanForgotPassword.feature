Feature: TC004 Forgot Password Functionality

#  1. Click on 'Forgotten Password' link from Login page
#  2. Enter an email address for which the Account doesn't exist in the application
#  3. Click on 'Continue' button

  Scenario: Validate resetting the password for a non-registered account
    Given I navigate to OpenCart web page
    Then I go to login page
    And I click on forgotten password button
    Then I enter email which doesnt exist and click on Continue button

