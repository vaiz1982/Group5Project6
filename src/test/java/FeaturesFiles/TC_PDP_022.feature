Feature: Product Display Page

  Scenario: Validate Related Products section in Product Display page
    Given I navigate to OpenCart webpage
    And I enter any existing Product name into the Search text box field
    And I click search icon
    And I click on the Product displayed in the Search results
    When I Click on the Related Products section in the displayed Product Display Page
    Then User should see the Product displayed in the Related Products section and is able ot click it and navigate to the Product Display Page of it