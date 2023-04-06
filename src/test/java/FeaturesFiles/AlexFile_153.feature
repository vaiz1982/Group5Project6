Feature: Wish List
  # "1. User should be taken to Home page (In this website, 'Your Store' text is the logo)
  #2. Success message with text - 'Success: You have added Product Name to your wish list!' should be displayed
  #3. Product should be successfully displayed in the 'My Wish List' page"

  Scenario: Validate adding a product to 'Wish List' page from the Product that is displayed in the 'Featured' section of 'Home' page
  Given Click on the 'Store logo' (Validate ER-1)
  When Scroll down till the 'Featured' section on the Home page is displayed
  And Click on 'Add to Wish List' option on a product that is displayed in the 'Featured' section (Validate ER-2)
  And Click on the 'wish list!' link in the displayed success message (Validate ER-3)
  And User should be taken to Home page (In this website, 'Your Store' text is the logo)
  And Success message with text - 'Success: You have added Product Name to your wish list!' should be displayed
  Then Product should be successfully displayed in the 'My Wish List' page"