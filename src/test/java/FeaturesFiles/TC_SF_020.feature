Feature: Search Functionality

  Scenario: Validate Page Heading, Page URL and Page Title of the 'Search' page
    Given I navigate to OpenCart webpage
    When I enter mac into the Search box
    And I click search icon
    Then A proper Page Heading, Page URL and Page Title should be displayed for Search page