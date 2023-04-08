Feature: Search Functionality

  Scenario: Validate searching without providing any Product Name TC_SF_003
    Given I navigate to OpenCart web page
    When I Do not enter anything into the Search text box field and I Click on the button having search icon
    Then Message 'There is no product that matches the search criteria' should be displayed in the Search Results page

  Scenario: Validate the User can select how many products can be displayed in the Search Results TC_SF_015
    Given I navigate to OpenCart web page
    When I Enter the search criteria in the Search text box field which can result in mutliple products
    And I Click on the button having search icon
    Then More than one product should be displayed in the search results page
    When I Select the number of Products to be displayed from the Show dropdown
    Then The selected number of products should be displayed in the current search page

