Feature: Forgot Password
#  1. Enter registered email address into the E-Mail address field
#  2. Enter new password into the Password field
#  3. Click on Login button
  Background:
    Given I navigate to OpenCart web page
    Then I go to login page

  Scenario: Validate logging into the Application with the old password after resetting it
    Given Enter registered email address into the E-Mail address field
    When Enter new password into the Password field
    And Click on Login button
    Then Verify user can not login with invalid password


