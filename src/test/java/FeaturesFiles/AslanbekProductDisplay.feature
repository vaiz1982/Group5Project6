Feature: Product Display

  Scenario: Validate the default quantity for the Product is displayed as 1 in the Product Display Page, when there is no minimum quantity set for the Product TC_PDP_005
    Given I navigate to OpenCart web page
    When I Enter any existing Product name into the Search text box field, which has no minimum quantity set
    And I Click on the button having search icon
    And I Click on the Product displayed in the Search results
    Then Default quantity should be displayed 1 for this product which has not minimum quantity set
    When I Update the quantity by increasing it to more than one and click on Add to Cart button
    Then Quantity should get updated accordingly and the User should be able to add the Product to cart without any issues

  Scenario: Validate submitting a review without filling the mandatory fields TC_PDP_017
    Given I navigate to OpenCart web page
    When I Enter any existing Product name into the Search text box field, which has no minimum quantity set
    And I Click on the button having search icon
    And I Click on the Product displayed in the Search results
    And I Select the Reviews tab of the Product in the displayed Product Display page
    And I Do not provide Name, Your Review and Ratings and click on Continue button
    Then Proper warning messages informing the User to fill the mandatory fields to submit the review should be displayed

  Scenario: Validate navigating to the Product Display page by using the Product Image in the 'Cart' button toggle box TC_PDP_029
    Given I navigate to OpenCart web page
    When I go to login page
    Then I should be navigated to Login page
    And I enter email and password and click login button
    When I Enter any existing Product name into the Search text box field, which has no minimum quantity set
    And I Click on the button having search icon
    And I Click on Add to Cart option on the product that is displayed in the Search Results
    And I Click on Cart button which is in black color beside the search icon button on the top of the page
    And I Click on the Product Image in the displayed toggle box
    Then User should be taken to the Product Display page of the Product
