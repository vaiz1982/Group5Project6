Feature: Shopping Cart

  Scenario:Validate Coupon code functionality in the Shopping Cart page by not providing any coupon code
    Given I navigate to OpenCart webpage
    When I enter any existing Product name into the Search text box field
    And I click search icon
    Then I click on the Product displayed in the Search results
    And I click Add to Cart button in the displayed Product Display page
    When I Click on the shopping cart! link in the displayed success message
    And I click on Use Coupon Code section
    When I click on Apply Coupon without entering any coupon code
    Then Warning message with text - Warning: Please enter a coupon code! should be displayed
