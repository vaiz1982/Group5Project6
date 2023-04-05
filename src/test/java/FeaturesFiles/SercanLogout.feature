Feature: Logout Functionality

  Scenario: Validate Logout option is not displayed under 'My Account' menu before logging in
    Given Navigate to OpenCart web page
    When I click on My Account drop menu
    Then Logout Option should not be displayed

