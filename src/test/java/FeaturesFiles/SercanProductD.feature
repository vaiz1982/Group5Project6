Feature: Product Display

  Background:
    Given Navigate to OpenCart web page

  Scenario: Validate adding the product to 'Wish List' from the Product Display page
    When I navigate to login page
    And I enter email and password and click login button
    And I enter "iMac" in the Search text box
    And click on the Search button
    When I click on product displayed on the search results
    And I click on Add to Wish List option in the Product Display page
    Then Success message with text - 'Success: You have added Product Name to your wish list!' is displayed
    And click on the Wish List link in the success message
    Then I should be taken to the My Wish List page
    Then product added should be displayed in the Wish List page

    Scenario: Validate the Reward Points displayed in the Product Display page
      When I enter "Apple Cinema" in the Search text box
      When click on the Search button
      When I click on Apple Cinema on the search results
      Then correct reward points should be displayed



