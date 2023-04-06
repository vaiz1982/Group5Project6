Feature: Checkout
#  1. Click on Cart button which is displayed in black color on the top of the page beside the search icon button
#  2. Click on Checkout option in the displayed Cart block

  Background:
    Given I navigate to OpenCart web page

    Scenario: Validate navigating to Checkout page using Checkout option in the Cart block
      When  Click on Cart button which is displayed in black color on the top of the page beside the search icon button
      Then  Click on Checkout option in the displayed Cart block

