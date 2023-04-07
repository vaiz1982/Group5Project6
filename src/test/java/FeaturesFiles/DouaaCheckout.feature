Feature: Checkout

  Scenario Outline: Validate navigating to Checkout page from 'Shopping Cart' page
    Given Open the Application URL in any supported Browser
    When Enter any existing Product name into the Search text box field - "<Search Criteria>"
    And Click on the button having search icon
    And Click on the Product displayed in the Search results
    And Click on Add to Cart button
    And Click on the shopping cart! link in the displayed success message
    And Click on Checkout button in the Shopping Cart page
    Then User should be taken to the checkout page
    Examples:
      | Search Criteria |
      | iMac            |

  Scenario Outline: Validate adding comments about your order in the 'Delivery Method' section of Checkout page
    Given Open the Application URL in any supported Browser
    When Click on My Account Drop menu
    And Click on Login option
    And Enter valid email address into the E-Mail Address field - "<email>"
    And Enter valid password into the Password field - "<password>"
    And Click on Login button
    And Enter any existing Product name into the Search text box field - "<Search Criteria>"
    And Click on the button having search icon
    And Click on the Product displayed in the Search results
    And Click on Add to Cart button
    And Click on the shopping cart! link in the displayed success message
    And Click on Checkout button in the Shopping Cart page
    And Click on continuePaymentAddressButton button
    And Click on continueShippingAddressButton button
    And Enter any text into the Add Comments About Your Order text field
    And Click on continueShippingMethod button
    Then Comment entered should be displayed as it is in the Payment Method section
    When Select the Terms & Conditions checkbox field
    And Click on continuePaymentMethod button
    And Click on Confirm Order button
    Then Order should be placed and User should be taken to Success page (Proper details should be displayed in the Order Success page)
    Examples:
      | email                     | password | Search Criteria |
      | pavanoltraining@gmail.com | 12345    | iMac            |