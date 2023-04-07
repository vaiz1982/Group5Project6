
Feature: Checkout

  Scenario: Validate text fields in Delivery Details of the Checkout page has Placeholders
  Given Enter any existing Product name into the Search text box field - <Refer Test Data>
  When Click on the button having search icon
  And Click on 'Add to Cart' button on the Product displayed in the Search results
  And Click on the 'shopping cart!' link in the displayed success message
  And Click on 'Checkout' button in the 'Shopping Cart' page
  And Click on 'Continue' button
  And Select 'I want to use a new address' radio option in the 'Delivery Details' section
  And Check all the text fields - First Name, Last Name, Company, Address1, Address 2, City and Post Code for Placeholder text (Validate ER-1)
  Then Proper Place Holder texts should be displayed in the text fields - First Name, Last Name, Company, Address1, Address 2, City and Post Code