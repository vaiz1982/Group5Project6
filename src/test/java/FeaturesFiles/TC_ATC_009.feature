Feature: Product Display Page

  Scenario: Validate the Add to Cart page functionality in all the supported environments
    Given I navigate to OpenCart webpage
    And I enter any existing Product name into the Search text box field
    And I click search icon
    When I click on Add To Cart on the displayed product
    Then I should see the Success Message displayed