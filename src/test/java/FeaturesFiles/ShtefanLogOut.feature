Feature: Logout Functionality

#  1. Click on 'My Account' Dropmenu
#  2. Select 'Logout' option
#  3. Click on Browser back button (Verify ER-1)

  Scenario Outline: Validate logging out and browsing back
    Given I navigate to OpenCart web page
    Then I go to login page
    And I enter "<email>" and invalid "<password>" and click login button
    Then Click on logout button
    Then Click on browser back option

    Examples:
      | email               | password  |
      | shtefan@test.com | qwerty123 |