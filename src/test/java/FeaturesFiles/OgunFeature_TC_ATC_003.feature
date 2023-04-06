Feature: Add to Cart
#  1. Enter any existing Product name into the Search text box field --iMAC
#  2. Click on the button having search icon
#  3. Click on Add to Cart option on the product that is displayed in the Search Results
#  4. Click on Cart button which is in black color beside the search icon button on the top of the page
#  5. Click on View Cart option in the displayed box


  Background:
    Given I navigate to OpenCart web page

    Scenario: Validate adding the product to Cart from Search Results Page
      When Enter any existing Product name into the Search text box field --iMAC
      And Click on the button having search icon
      And Click on Add to Cart option on the product that is displayed in the Search Results
      And Click on Cart button which is in black color beside the search icon button on the top of the page
      Then Click on View Cart option in the displayed box


