Feature: Forgotten Password
  Scenario: Validate 'Forgotten Password' link is available in the Login page and is working
    Given I navigate to OpenCart webpage
    When I click on My Account drop menu
    Then I click on Login button
    And I click on Forgotten Password link
    Then I should be on Forgotten Password Page
