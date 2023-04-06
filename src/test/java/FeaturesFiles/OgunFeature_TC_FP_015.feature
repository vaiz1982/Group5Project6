Feature: Forgot Password
#  1. Click on Forgotten Password link from Login page
#  2. Don't enter anything into the E-Mail Address field
#  3. Click on Continue button

  Background:
    Given I navigate to OpenCart web page
    Then I go to login page

    Scenario: Validate resetting the Password without providing the registered email address
      Given Click on Forgotten Password link from Login page
      When Don't enter anything into the E-Mail Address field
      And  Click on Continue button password forgotten page
      Then Verify warning message

      #THERE IS A BUG FAILED



