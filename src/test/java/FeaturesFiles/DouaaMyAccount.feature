Feature: My Account
  Scenario Outline: Validate Breadcrumb in 'My Account' page
    Given Open the Application URL in any supported Browser
    When Click on My Account Drop menu
    And Click on Login option
    And Enter valid email address into the E-Mail Address field - "<email>"
    And Enter valid password into the Password field - "<password>"
    And Click on Login button
    And Click on My Account Drop menu and select My Account option
    Then Validate the Breadcrumb in the displayed My Account page
    Examples:
      | email                     | password |
      | pavanoltraining@gmail.com | 12345    |