Feature: Add to cart
 Scenario Outline: Validate adding the product to Cart from 'Product Display' Page
   Given Open the Application URL in any supported Browser
   When Enter any existing Product name into the Search text box field - "<Search Criteria>"
   And Click on the button having search icon
   And Click on the Product displayed in the Search results
   And Click on Add to Cart button
   Then Success message with text - Success: You have added Product Name to your shopping cart! should be displayed
   When Click on the shopping cart! link in the displayed success message
   And Product should be successfully displayed in the Shopping Cart page
   Examples:
     | Search Criteria |
     | iMac            |