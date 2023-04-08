Feature: Add To Cart Functionality

  Scenario: Validate adding the product to Cart from the Related Products section of the Product Display Page TC_ATC_004
    Given I navigate to OpenCart web page
    When I Enter Apple Cinema name into the Search text box field
    And I Click on the button having search icon
    And I Click on the Product displayed in the Search results
    And I Click on Add to Cart button on one of the Products displayed in the Related Products section of the displayed Product Display page
    And I Click on the shopping cart link in the displayed success message
