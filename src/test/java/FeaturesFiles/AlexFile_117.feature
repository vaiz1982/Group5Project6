Feature: Product Display Page

  Scenario: Validate all the fields in the 'Review' tab are mandatory fields
  Given Enter any existing Product name into the Search text box field  - <Refer Test Data>
  When Click on the button having search icon
  And Click on the Product displayed in the Search results
  And Click on the Reviews tab of the Product in the displayed 'Product Display' page (Validate ER-1)
  Then All the fields in the Reviews tab should be mandatory fields.