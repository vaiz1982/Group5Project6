Feature: Wishlist

  Scenario Outline: Validate adding a product to 'Wish List' page from the Search Results page
    Given Open the Application URL in any supported Browser
    When Click on My Account Drop menu
    And Click on Login option
    And Enter valid email address into the E-Mail Address field - "<email>"
    And Enter valid password into the Password field - "<password>"
    And Click on Login button
    And Enter any existing Product name into the Search text box field - "<Search Criteria>"
    And Click on the button having search icon
    And Click on the Product displayed in the Search results
    And Click on Add to Wish List option of a product that is displayed in the Search Results page
    Then Success message with text - Success: You have added Product Name to your wish list! should be displayed
    When Click on the wish list! link in the displayed success message
    Then Product should be successfully displayed in the My Wish List page
    Examples:
      | email                     | password | Search Criteria |
      | pavanoltraining@gmail.com | 12345    | iMac            |


  Scenario Outline: Validate adding the multiple products to the 'My Wish List' page
    Given Open the Application URL in any supported Browser
    When Click on My Account Drop menu
    And Click on Login option
    And Enter valid email address into the E-Mail Address field - "<email>"
    And Enter valid password into the Password field - "<password>"
    And Click on Login button
    And Enter any existing Product name into the Search text box field - "<Search Criteria1>"
    And Click on the button having search icon
    And Click on the Product displayed in the Search results
    And Click on Add to Wish List option of a product that is displayed in the Search Results page
    And Clear the search box
    And Enter any existing Product name into the Search text box field - "<Search Criteria2>"
    And Click on the button having search icon
    And Click on the Product displayed in the Search results for second product
    And Click on Add to Wish List option of a product that is displayed in the Search Results page
    Then Success message with text - Success: You have added Product Name to your wish list! should be displayed
    When Click on the wish list! link in the displayed success message
    Then Two products should be successfully displayed in the My Wish List page
    Examples:
      | email                     | password | Search Criteria1 | Search Criteria2         |
      | pavanoltraining@gmail.com | 12345    | iMac             | Samsung SyncMaster 941BW |