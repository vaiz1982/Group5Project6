Feature: Forgot Password
  Scenario: Validate Breadcrumb of the Forgotten Password page
    Given I navigate to OpenCart webpage
    And I click on My Account drop menu
    And I click on Login button
    When I click on Forgotten Password link
    Then A proper working Breadcrumb should be displayed on the Forgotten Password page