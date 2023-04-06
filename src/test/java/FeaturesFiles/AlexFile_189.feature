Feature: Shopping Cart

  Scenario: Validate Coupon code functionality in the 'Shopping Cart' page is having Placeholder
  Given Enter any existing Product name into the Search text box field - <Refer Test Data>
  When Click on the button having search icon
  And Click on the Product displayed in the Search results
  And Click on 'Add to Cart' button in the displayed 'Product Display' page
  And Click on the 'shopping cart!' link in the displayed success message
  And Click on 'Use Coupon Code' section
  And Check the 'Enter your coupon here' text field (Validate ER-1)
  Then Proper Place Holder text should be displayed inside the text field.
