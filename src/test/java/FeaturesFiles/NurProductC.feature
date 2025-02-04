Feature: Product Compare
#  1. Enter any existing Product name into the Search text box field - <Refer Test Data>
#  2. Click on the button having search icon
#  3. Click on 'Product Compare' link displayed in the Search Results page (Validate ER-1)

  Background:
    Given I navigate to OpenCart web page
    When I go to login page
    And I enter email and password and click login button

  Scenario: (TC_PC_008) Validate navigating to 'Product Compare' page from Search results page
    And  I send a data to search
    And I click on the search icon
    And I click on product compare link
    Then user should see Product comparison page
#  1. Enter any existing Product name into the Search text box field - <Refer Test Data>
#  2. Click on the button having search icon
#  3. Select 'Compare this Product' option on the Product that is displayed in the search results
#  4. Click on the 'Product Comparison' link in the displayed success message
#  5. Click on 'Add to Cart' button of the Product from the 'Product Comparison' page (Validate ER-1)

  Scenario Outline:(TC_PC_020) Validate adding the Products to cart from the 'Product Comparison' page
    And I send a "<data>" to search
    And I click on the search icon
    And I click on the compare this product
    And I click on the product comparison link in the success message
    And I click on the add to cart button
    And I click on the shopping cart
    Then user should see the shopping cart
    Examples:
      | data |
      | iMac |