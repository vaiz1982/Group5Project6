Feature: Search Functionality

  Scenario Outline: Validate List and Grid views when multiple Products are displayed in the search results
    Given Open the Application URL in any supported Browser
    When Enter the search criteria in the Search text box field which can result in multiple products - "<Search Criteria>"
    When Click on the button having search icon
    Then More than one products should be displayed in the search results page
    When Select List option
    Then Multiple product should be displayed in the List view without any problems and all the options (Add to Cart, Wish List and Compare Product) are working. Also User should be able to navigate to Product Display Page of products by clicking on Images and Product Name.
    When Select Grid option
    Then Multiple product should be displayed in the Grid view without any problems and all the options (Add to Cart, Wish List and Compare Product) are working. Also User should be able to navigate to Product Display Page of products by clicking on Images and Product Name.
    Examples:
      | Search Criteria |
      | Mac             |