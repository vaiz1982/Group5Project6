  Feature: Search Functionality

  Background:
    Given Navigate to OpenCart web page

  Scenario:Validate navigating to Search page from the Site Map page
    When I click on the site map link in the footer options
    And I click on the Search link from the Site Map page
    Then I should be navigated to Search Page

    Scenario: Validate searching by providing a search criteria which results in multiple products
      When I enter "Mac" in the Search text box
      And click on the Search button
      Then more then one product should be displayed in the search results page
