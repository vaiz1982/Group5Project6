Feature: Forgot Password

  Scenario: Validate User is able to reset the password
    Given Open the Application URL in any supported Browser
    When Click on Forgotten Password link from Login page
    Then User should be taken to Forgotten Password page
    When Enter the email address of an existing account for which you have forgot the password
    And Click on Continue button
    Then Success message with text - An email with a confirmation link has been sent your email address. should be displayed in green color
    When Check the registered email address for which the password got reset
    Then Validate that an email is received regarding resetting of the password to the registered email address
    When Click on the link for resetting the password from the received email body
    Then User should be taken Reset your Password page
    When Enter new password into the Password and Confirm fields
    And Click on Continue button
    Then Success message with text - Success: Your password has been successfully updated. should be displayed in green color and User should be navigated to Login page
    When Enter the email address into the E-Mail address field and the new reset password into the Password field
    And Click on Login button
    Then User should be able to login with the new password

  Scenario: Validate Page Heading, Page URL and Page Title of the 'Reset your Password' page
    Given Open the Application URL in any supported Browser
    And Click on Forgotten Password link from Login page
    And Enter the email address of an existing account for which you have forgot the password
    And Click on Continue button
    And Check the registered email address for which the password got reset
    When Click on the reset password link available in the email
    Then Check and verify the Page Heading, Page URL and Page Title

  Scenario: Validate the Password Reset functionality in all the supported environments
    Given Open the Application URL in any supported Browser
    When Click on Forgotten Password link from Login page
    Then User should be taken to Forgotten Password page

