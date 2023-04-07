Feature: Shopping Cart

  Scenario:Validate the 'Shopping Cart' functionality in all the supported environments
    Given Open the Application URL in any supported Browser
    Then Check the Shopping Cart functionality in all the supported environments

  Scenario Outline:Validate updating the quantity of the Product in the 'Shopping Cart' page to a negative or zero or a non-numerical value
    Given Open the Application URL in any supported Browser
    When Enter any existing Product name into the Search text box field - "<Search Criteria>"
    And Click on the button having search icon
    And Click on the Product displayed in the Search results
    And Click on Add to Cart button
    Then Success message with text - Success: You have added Product Name to your shopping cart! should be displayed
    When Click on the shopping cart! link in the displayed success message
    And Enter negative value or zero or non-numerical value into the Quantity field of the Product in the displayed Shopping Cart page
    And Click on Update icon option
    Then Proper warning message should be displayed informing the User to provide a positive numerical value
    Examples:
      | Search Criteria |
      | iMac            |

  Scenario Outline: Validate Estimate Shipping and Taxes functionality in the 'Shopping Cart' page by providing all the fields
    Given Open the Application URL in any supported Browser
    When Enter any existing Product name into the Search text box field - "<Search Criteria>"
    And Click on the button having search icon
    And Click on the Product displayed in the Search results
    And Click on Add to Cart button
    And Click on the shopping cart! link in the displayed success message
    And Click on Estimate Shipping & Taxes section
    And Select any Country from the Country dropdown field - "<Country>"
    And Select any State from the Region or State field - "<State>"
    And Enter any Post Code of the above selected State in Post Code field - "<Post Code>"
    And Click on Get Quotes button
    Then Please select the preferred shipping method to use on this order dialog should be displayed.
    And Flat Shipping Rate - '$5.00' radio button should be displayed in the displayed dialog and is not selected by default
    When Select the radio button and Click on Apply Shipping button
    Then Success message with text - Success: Your shipping estimate has been applied! should be displayed
    And Flat Shipping Rate should be displayed and added to the Total Price
    Examples:
      | Search Criteria | Country       | State      | Post Code |
      | iMac            | United States | California | 90007     |