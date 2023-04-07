Feature: Product Display Page

  Scenario: Validate all the extra available options in the Product Display page
    Given I navigate to OpenCart webpage
    And I enter any existing Product name into the Search text box field such as Apple Cinema Thirty
    And I click search icon
    When I click on the Apple Cinema Thirty displayed in the Search results
    Then I should be able to select all the available options