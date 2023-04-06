Feature: My Account
#  1. Check the UI of the functionality related to My Account page

  Background: Login for the further use
    Given I navigate to OpenCart web page
    Then I go to login page
    And I enter email and password and click login button

    Scenario: Validate the UI of My Account page functionality
      And Check the UI of the functionality related to My Account page
