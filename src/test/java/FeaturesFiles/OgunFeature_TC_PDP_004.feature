Feature: Product Display Page
#  1. Enter any existing Product name into the Search text box field --iMAC
#  2. Click on the button having search icon
#  3. Click on the Product displayed in the Search results
#  4. Check the Price with tax and Price Ex Tax in the displayed Product Display Page

  Background:
    Given I navigate to OpenCart web page

    Scenario: Validate the Price of the Product with and without tax is displayed in the Product Display Page
      When Enter any existing Product name into the Search text box field --iMAC
      And Click on the button having search icon
      And Click on the Product displayed in the Search results
      Then Check the Price with tax and Price Ex Tax in the displayed Product Display Page

