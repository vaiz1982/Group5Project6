Feature: Login Functionality

  Scenario Outline: Validate Logging out from the Application and browsing back using Browser back button
    Given Open the Application URL in any supported Browser
    When Click on My Account Drop menu
    And Click on Login option
    And Enter valid email address into the E-Mail Address field - "<email>"
    And Enter valid password into the Password field - "<password>"
    And Click on Login button
    And Click on My Account Drop menu and select Logout option
    And Click on Browser back button
    Then User should not get logged in again
    Examples:
      | email                     | password |
      | pavanoltraining@gmail.com | 12345    |

    Scenario: Validate the Login page functionality in all the supported environments
      Given Open the Application URL in any supported Browser
      When Click on My Account Drop menu
      And Click on Login option
      Then Login functionality should work correctly in all the supported environments