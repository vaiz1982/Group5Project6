Feature: Product Compare

  Scenario: Validate adding the product for comparison from Featured section on Home Page
    Given Navigate to OpenCart web page
    When I hover over the Compare this Product option from one of the Products displayed in the Featured section of the home page
    Then Tool tip with the text Compare this Product should be displayed
    And I Select Compare This Product option
    Then Success message with text - ' Success: You have added Product Name to your product comparison!' should be displayed
    And I click on product comparison link from the success message
    Then I should be taken to the Product Comparison page with the details of the Product added for comparison.

  Scenario Outline: Validate that more than 4 products cannot be added to the 'Product Comparison' page
    Given  Navigate to OpenCart web page
    When I enter "<product1>" into the Search field
    And click on the Search button
    And I Select Compare This Product option
    When I enter "<product2>" into the Search field
    And click on the Search button
    And I Select Compare This Product option
    When I enter "<product3>" into the Search field
    And click on the Search button
    And I Select Compare This Product option
    When I enter "<product4>" into the Search field
    And click on the Search button
    And I Select Compare This Product option
    When I enter "<product5>" into the Search field
    And click on the Search button
    And I Select Compare This Product option
    When I click on product comparison link from the success message
    Then I should see last four products are displayed in the product comparison page with all the proper product details and the buttons
    Then The first added product should be removed from the product comparison page
    Examples:
      | product1 | product2 | product3    | product4     | product5    |
      | iMac     | iPhone   | MacBook Air | Apple Cinema | MacBook Pro |


