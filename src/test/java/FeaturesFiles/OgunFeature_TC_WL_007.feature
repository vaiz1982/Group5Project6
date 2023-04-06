Feature: Wish List
#  1. Enter any existing Product name into the Search text box field --iMAC
#  2. Click on the button having search icon
#  3. Click on the Product displayed in the Search results
#  4. Click on Add to Wish List option in the displayed Product Display page
#  5. Click on the Wish List header option

  Background:
    Given I navigate to OpenCart web page
    And  I go to login page
    And I enter email and password and click login button

    Scenario: Validate navigating to My Wish List page using the Wish List header option

      When Enter any existing Product name into the Search text box field --iMAC
      And Click on the button having search icon
      And Click on the Product displayed in the Search results
      And Click on Add to Wish List option in the displayed Product Display page
      Then Click on the Wish List header option

