Feature: Shopping Cart

  Scenario: Validate Gift Certificate functionality in the Shopping Cart page for Placeholder
    Given I navigate to OpenCart webpage
    And I enter any existing Product name into the Search text box field
    And I click search icon
    When I click on the Product displayed in the Search results
    Then I click Add to Cart button in the displayed Product Display page
    And I Click on the shopping cart! link in the displayed success message
    When Click on Use Gift Certificate section
    Then I should see Enter your gift certificate code here displayed inside the text field