Feature: Product Display Page
#  1. Enter any existing Product name into the Search text box field --iMAC
#  2. Click on the button having search icon
#  3. Click on the Product displayed in the Search results
#  4. Click on the 'x reviews' link in the Product Display page

  Background:
    Given I navigate to OpenCart web page

    Scenario: Validate 'reviews' link under the 'Add to Cart' button of Product Display Page
      When Enter any existing Product name into the Search text box field --iMAC
      And Click on the button having search icon
      And  Click on the Product displayed in the Search results
      Then Click on the x reviews link in the Product Display page

