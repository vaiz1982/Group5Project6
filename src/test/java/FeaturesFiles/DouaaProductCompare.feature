Feature: Product compare

  Scenario Outline: Validate adding the product for comparison from List View of Search Results page
    Given Open the Application URL in any supported Browser
    When Enter any existing Product name into the Search text box field - "<Search Criteria>"
    When Click on the button having search icon
    When Select List option
    When Hover the mouse cursor on Compare this Product option available on the Product that is displayed in the Search Results
    Then Tool tip with the text - Compare this Product should be displayed
    When Select Compare this Product option
    Then Success message with text - Success: You have added Product Name to your product comparison! should be displayed
    When Click on product comparison link from the displayed success message
    Then User should be taken to the Product Comparison page with the details of the Product that we have added for comparison.
    Examples:
      | Search Criteria |
      | iMac            |

  Scenario Outline: Validate the 'Product Comparison' page when only one product is added to the page for comparison
    Given Open the Application URL in any supported Browser
    When Enter any existing Product name into the Search text box field - "<Search Criteria>"
    And Click on the button having search icon
    And Click on the Product displayed in the Search results
    And Select Compare this Product option from product display page
    And Click on product comparison link from the displayed success message
    And Check the Product Comparison page having one product added to the page for comparison
    Then Validate that a single product is displayed in the Product Comparison page with all the proper product details and the buttons (Add to Cart and Remove buttons)
    Examples:
      | Search Criteria |
      | iMac            |