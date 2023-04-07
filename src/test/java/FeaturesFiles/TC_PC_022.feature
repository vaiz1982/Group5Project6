Feature: Product Compare

  Scenario: Validate Page Title, Page Heading and Page URL of the Product Comparison page
    Given I navigate to OpenCart webpage
    And I enter any existing Product name into the Search text box field
    And I click search icon
    When Select Compare this Product option on the Product that is displayed in the search results
    And Click on the Product Comparison link in the displayed success message
    Then I should see proper Page Title, Page Heading and Page URL of the Product Comparison page are displayed.