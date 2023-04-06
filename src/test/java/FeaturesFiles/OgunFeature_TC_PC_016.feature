Feature: Product Compare
#  1. Enter any existing Product name into the Search text box field --iMAC
#  2. Click on the button having search icon
#  3. Select Compare this Product option on the Product that is displayed in the search results
#  4. Enter the same Product name into the Search text box field
#  5. Click on the button having search icon
#  6. Select Compare this Product option on the Product that is displayed in the search results
#  7. Click on the Product Comparison link in the displayed success message
#  8. Check the Product Comparison page having the same product added twice to the page for comparison

  Background:
    Given I navigate to OpenCart web page

    Scenario:Validate the Product Comparison page when the same product is added twice to the page for comparison
      When Enter any existing Product name into the Search text box field --iMAC
      And  Click on the button having search icon
      And Select Compare this Product option on the Product that is displayed in the search results
      And Enter the same Product name into the Search text box field
      And Click on the button having search icon
      And Select Compare this Product option on the Product that is displayed in the search results
      And Click on the Product Comparison link in the displayed success message
      Then Check the Product Comparison page having the same product added twice to the page for comparison


