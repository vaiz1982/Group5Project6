Feature: Login Functionality

  Background:
    Given Navigate to OpenCart web page
    When I navigate to login page


  Scenario Outline: Login to the application using valid credentials
    And I enter valid "<email>" and valid "<password>" and click login button
    Then I should be logged in and taken to the Account page
    Examples:
      | email             | password       |
      | sercan7@gmail.com | ronaldmcdonald |

  Scenario Outline: Validate logging into the Application using invalid email address and valid Password
    When I enter invalid "<email>" and valid "<password>" and click login button
    Then I should see a warning message with the text "<warningMessage>"
    Examples:
      | email               | password | warningMessage                                        |
      | xyzabc123@gmail.com | 12345    | Warning: No match for E-Mail Address and/or Password. |

  Scenario Template: Validate Logging into the Application after changing the password
    When I enter valid "<email>" and valid "<password>" and click login button
    And I click on change your password link
    And I enter "<newPassword>" into the Password and Password Confirm fields
    And I click on Continue button
    When I click on My Account dropmenu and select Logout Option
    When I navigate to login page
    When I enter valid "<email>" and valid "<password>" and click login button
    Then I should see a warning message with the text "<warningMessage>"
    And I clear the current email and password data
    When I enter new valid "<newEmail>" and new valid "<newPassword>" and click login button
    Then I should be logged in and taken to the Account page
    Examples:
      | email             | password  | warningMessage                                        | newEmail          | newPassword    |
      | sercan7@gmail.com | 123456789 | Warning: No match for E-Mail Address and/or Password. | sercan7@gmail.com | ronaldmcdonald |










