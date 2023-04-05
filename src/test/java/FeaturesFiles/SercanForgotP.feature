Feature: Forgot Password

  Scenario Outline:
    Given Navigate to OpenCart web page
    When I navigate to login page
    And I click on the Forgotten Password link
    And Enter any "<invalidFormattedEmailAddress>" into the E-Mail Address field
    And I click on Continue button
    Then Warning message informing the User to provide a valid formatted email address should be displayed
    Examples:
      | invalidFormattedEmailAddress |
      | sercan7        |
      | sercan7@       |
      | sercan7@gmail  |
      | sercan7@gmail. |

