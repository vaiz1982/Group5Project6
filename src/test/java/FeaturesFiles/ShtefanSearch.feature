Feature: Search Functionality

  Scenario: Validate searching for a product after login to the Application
#  1. Enter any existing product name into the 'Search' text box field - <Refer Test Data>
#  2. Click on the button having search icon (Validate ER-1)


    Given I navigate to OpenCart web page
    When I send a data to search
    And I click on the search icon


  Scenario: Validate 'Search' textbox field and the button
  having search icon are displayed on all the page of the Application
      # 1. Navigate to all the pages of the Application (Validate ER-1)

    Given I navigate to all pages of the Application
    Then I validate textbox and search icon are displayed on all the pages