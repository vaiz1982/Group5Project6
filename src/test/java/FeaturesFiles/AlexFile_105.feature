Feature: Product Compare
  Scenario: Validate the 'Product Comparison' functionality in all the supported environments
  Given Enter any existing Product name into the Search text box field - <Refer Test Data>
  When Click on the button having search icon
  And Select 'Compare this Product' option on the Product that is displayed in the search results
  And Click on the 'Product Comparison' link in the displayed success message (Validate ER-1)
  Then Product  Comparison' functionality should work correctly in all the supported environments