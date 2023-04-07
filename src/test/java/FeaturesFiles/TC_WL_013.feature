Feature: Wish List

  Background:
    Given I navigate to OpenCart webpage
    And I click on My Account drop menu
    And I click on Login button
    When I enter email and password and click login button
    Then I should get logged in and taken to the Account page

  Scenario:Validate the My Wish List page when there are no products added
    Given I navigate to my Wish List
    And I should see text Your wish list is empty.
    When I Click on Continue button
    Then I should be taken to My Account page