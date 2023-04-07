Feature: Navigation from Login Page
  Scenario: Validate user is able to navigate to different pages from Login page
    Given I navigate to OpenCart webpage
    Then I click on My Account drop menu
    And I click on Login button
    When I Click on Continue button under New Customer section
    Then I should be navigated to Register page
    And I navigate back to Login page
    Then I should be able to navigate to applicable options