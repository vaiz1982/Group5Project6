Feature: Search Functionality

  Scenario: Validate Search using the text from the product description
    Given I navigate to OpenCart webpage
    When I don't enter anything into the Search text box and I click on Search icon
    And I enter iLife into the Search Criteria text box field
    And I select Search in product descriptions checkbox option and I click on Search button
    Then Product having the given text in its description should be displayed in the search results
