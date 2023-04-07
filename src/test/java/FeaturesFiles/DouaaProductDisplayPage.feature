Feature: Product display page

  Scenario Outline: Validate that Product Name, Brand and Product Code are displayed in the Product Display Page
    Given Open the Application URL in any supported Browser
    When Enter any existing Product name into the Search text box field - "<Search Criteria>"
    And Click on the button having search icon
    And Click on the Product displayed in the Search results
    Then Check the Product Name, Brand and Product Code in the displayed Product Display Page
    Examples:
      | Search Criteria |
      | iMac            |

  Scenario Outline: Validate that Product Name, Brand and Product Code are displayed in the Product Display Page
    Given Open the Application URL in any supported Browser
    When Enter any existing Product name into the Search text box field - "<Search Criteria>"
    And Click on the button having search icon
    And Click on the Product displayed in the Search results
    Then Check the average and number of reviews under the Add to Cart page
    Examples:
      | Search Criteria |
      | iMac            |

  Scenario Outline: Validate navigating to the Product Display page by using the Product Image in the 'Shopping Cart' page
    Given Open the Application URL in any supported Browser
    When Enter any existing Product name into the Search text box field - "<Search Criteria>"
    And Click on the button having search icon
    And Click on the Product displayed in the Search results
    And Click on Add to Cart button
    And Click on shopping cart! link from the displayed success page
    And Click on the Product image from the displayed Shopping Cart page Then User should be taken to the Product Display page of the Product
    Examples:
      | Search Criteria |
      | iMac            |
