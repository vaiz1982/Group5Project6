Feature: My Account

  Scenario: Validate navigating to 'My Account' page on login
    Given I navigate to OpenCart webpage
    And I click on My Account drop menu
    And I click on Login button
    When I enter valid email and password and click login button
    Then I should get logged in and taken to the Account page