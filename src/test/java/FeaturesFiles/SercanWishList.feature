Feature: Wishlist

  Scenario: Validate navigating to 'My Wish List' page from the 'Footer' options

    Given Navigate to OpenCart web page
    When I navigate to login page
    And I enter email and password and click login button
    And I Click on the Wish List link in the Footer options
    Then I should be taken to the My Wish List page