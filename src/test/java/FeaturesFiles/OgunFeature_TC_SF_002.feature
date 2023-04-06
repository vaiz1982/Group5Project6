Feature: Search Functionality
#  1. Enter non existing product name into the Search text box field
#  2. Click on the button having search icon
  Background:
    Given I navigate to OpenCart web page

  Scenario: Validate searching with a non existing Product Name
    Given Enter non existing product name into the Search text box field
    When Click on the button having search icon
    Then Verify shopping car is empty

#THERE IS A BUG FAILED


