Feature: Shopping Cart

  Scenario: Validate navigating to Shopping Cart page using the View Cart option in the Cart block
    Given I navigate to OpenCart webpage
    When I enter any existing Product name into the Search text box field
    And I click search icon
    And I Click on Add to Cart button on the Product displayed in the Search results
    And I Click on Cart button which is displayed in black color on the top of the page beside the search icon button
    When I click on View Cart option in the displayed Cart block
    Then I should be taken to the Shopping Cart page