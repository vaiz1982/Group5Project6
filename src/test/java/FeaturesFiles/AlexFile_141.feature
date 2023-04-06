Feature: Product Display Page

  Scenario: Validate the UI of 'Product Display' page
  Given Enter any existing Product name into the Search text box field - <Refer Test Data>
  When Click on the button having search icon
  And Click on the Product displayed in the Search results (Validate ER-1)
  Then Proper UI adhering to the UI checklist should be displayed for the complete 'Product Display' page functionality
