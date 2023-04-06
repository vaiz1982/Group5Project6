Feature: Shopping Cart

  Scenario: Validate Image, Name, Model, Quantity, Unit Price and Total of the Product in the 'Shopping Cart' page
  Given Enter any existing Product name into the Search text box field - <Refer Test Data>
  When Click on the button having search icon
  And Click on the Product displayed in the Search results
  And Click on 'Add to Cart' button in the displayed 'Product Display' page
  And Click on the 'shopping cart!' link in the displayed success message
  And Check the Image Image, Name, Model, Quantity, Unit Price and Total of the Product in the displayed 'Shopping Cart' page (Validate ER-1)
  Then Correct Image, Name, Model, Quantity, Unit Price and Total of the Product should be displayed