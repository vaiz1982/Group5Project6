Feature: Checkout
#  1. Enter any existing Product name into the Search text box field
#  2. Click on the button having search icon
#  3. Click on Add to Cart button on the Product displayed in the Search results
#  4. Click on the shopping cart! link in the displayed success message
#  5. Click on Checkout button in the Shopping Cart page
#  6. Select Guest Checkout option in the New Customer section of the displayed Checkout page
#  7. Click on Continue button
#  8. Enter details into all the fields
#  9. Click on Continue button
#  10. Click on Continue button
#  11. Select Terms and Conditions checkbox
#  12. Click on Continue button
#  13. Click on Confirm Order button

  Scenario: Validate Guest Checkout
    Given Enter any existing Product name into the Search text box field
    When Click on the button having search icon
    And Click on Add to Cart button on the Product displayed in the Search results
    And Click on the shopping cart! link in the displayed success message
    And Click on Checkout button in the Shopping Cart page
    And Select Guest Checkout option in the New Customer section of the displayed Checkout page
    And Click on Continue button
    And Enter details into all the fields
    And Click on Continue button
    And Click on Continue button
    And Select Terms and Conditions checkbox
    And Click on Continue button
    Then Click on Confirm Order button

