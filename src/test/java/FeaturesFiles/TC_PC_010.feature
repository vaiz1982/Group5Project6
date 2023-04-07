Feature: Product Compare

  Scenario: Validate "Product Compare" page when no products are added for comparison
    Given I navigate to OpenCart webpage
    When I hover over on any Menu say Desktops
    And I select Show All Desktops option
    And In the displayed Desktops category page, click on Product Compare(Zero) link
    Then You have not chosen any products to compare. should be displayed on the page