Feature: Shopping Cart

  Scenario: Continue shopping from the 'Shopping Cart' page
  Given Enter any existing Product name into the Search text box field - <Refer Test Data>
  When Click on the button having search icon
  And Click on the Product displayed in the Search results
  And Click on 'Add to Cart' button in the displayed 'Product Display' page
  And Click on the 'shopping cart!' link in the displayed success message
  And Provide complete details into the 'Use Coupon Code', 'Estimate Shipping & Taxes' and 'Use Gift Certificate' sections
  And Click on 'Continue Shopping' button (Validate ER-1)
  Then User should be taken to 'Home' Page