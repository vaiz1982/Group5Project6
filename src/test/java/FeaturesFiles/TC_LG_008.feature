Feature: Logout Functionality

  Background:
    Given I navigate to OpenCart webpage
    And I click on My Account drop menu
    And I click on Login button
    When I enter email and password and click login button
    Then I should get logged in and taken to the Account page

  Scenario: Validate logging out and login in immediately after logout
    And I click on My Account drop menu
    When I click on Logout button
    Then I should be logged out and taken to the Account Logout page
    And I click on My Account drop menu
    And I click on Login button
    When I enter email and password and click login button
    Then I should get logged in and taken to the Account page

