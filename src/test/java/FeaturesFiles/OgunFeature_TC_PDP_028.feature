Feature: Product Display Page
#  1. Enter any existing Product name into the Search text box field --iMAC
#  2. Click on the button having search icon
#  3. Click on the Product displayed in the Search results
#  4. Click on Add to Cart button
#  5. Click on Checkout button in the displayed Shopping Cart page
#  6. Click on Continue buttons and select any mandatory checkboxes until you reach the Confirm Order section
#  7. Click on Product Name link in the Confirm Order section

  Background:
    Given I navigate to OpenCart web page

    Scenario:Validate navigating to the Product Display page by using the Product Name link in the Confirm Order sectioon of the Checkout page
      When Enter any existing Product name into the Search text box field --iMAC
      And Click on the button having search icon
      And  Click on the Product displayed in the Search results
      And Click on Add to Cart button
      And Click on Checkout button in the displayed Shopping Cart page
      And Click on Continue buttons and select any mandatory checkboxes until you reach the Confirm Order section
      Then Click on Product Name link in the Confirm Order section


#      TEST MANUALLY DONE