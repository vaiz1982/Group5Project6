Feature: Forgot Password

  Scenario: Validate logging into the Application with the old password when you have initiated the resetting password process and have not reset the password TC_FP_004
    Given I navigate to OpenCart web page
    When I go to login page
    And I Click on Forgotten Password link from Login page
    And I Enter the email address of an existing account for which you have forgot the password
    And I Click on Continue button
    And I enter email and password and click login button
    Then I should get logged in and taken to the Account page

  Scenario: Verifty Placehold text is displayed in the 'E-Mail Address' field of 'Forgotten Password' page TC_FP_016
    Given I navigate to OpenCart web page
    When I go to login page
    And I Click on Forgotten Password link from Login page
    Then Proper Placeholder text is displayed inside the E-Mail Address fields  of the Forgotten Password page

