Feature: Checkout

  Background:
    Given I navigate to OpenCart webpage
    And I click on My Account drop menu
    And I click on Login button
    When I enter email and password and click login button
    Then I should be taken to My Account page
  Scenario: Validate Checkout as SignedIn User (SignIn Checkout) by entering new address into the mandatory fields of the Delivery Details section during checkout
    When I enter any existing Product name into the Search text box field
    And I click search icon
    And I click on Add To Cart on the displayed product
    And I Click on the shopping cart! link in the displayed success message
    When I Click on Checkout button in the Shopping Cart page
    Then I Click on Continue button on confirmShippingAddress
    And I Select I want to use a new address radio option
    And I Enter details only into the mandatory fields - First Name, Last Name, Address, City, Country and Region State
    And I click on Continue button after new address
    And I click on Continue button after delivery method
    When I Select the Terms & Conditions checkbox field
    And I Click on Continue button after payment method
    When I click on Confirm Order button
    Then Order should be placed and User should be taken to Success page (Proper details should be displayed in the Order Success page)