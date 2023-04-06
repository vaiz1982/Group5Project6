Feature: Shopping Cart
#  1. Click on Estimate Shipping & Taxes section
#  2. Select any Country from the Country dropdown field
#  3. Select any State from the Region/State field
#  4. Enter any Post Code of the above selected State in Post Code field
#  5. Click on Get Quotes button
#  6. Select the radio button and Click on Cancel button

  Background:
    Given I navigate to OpenCart web page

    Scenario: Validate Estimate Shipping and Taxes functionality in the 'Shopping Cart' page is not applied on cancelling
      When Click on Estimate Shipping & Taxes section
      And Select any Country from the Country dropdown field
      And  Select any State from the Region/State field
      And Enter any Post Code of the above selected State in Post Code field
      And Click on Get Quotes button
      Then Select the radio button and Click on Cancel button

#      MANUALLY TEST

