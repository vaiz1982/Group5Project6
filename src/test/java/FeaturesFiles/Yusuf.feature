Feature: Go to the OpenCart web page

  Scenario: Validate logging into the Application not using any credentials
    Given I navigate to OpenCart web page
    Then I go to login page
    And click login button
    Then Warning message should be displayed

    Scenario: Validate navigating to Forgotten Password page
      Given I navigate to OpenCart web page
      Then I go to login page
      And click forgotten password option
      Then user should navigated to forgotten password page

      Scenario: Validate to searched product displayed
        Given I navigate to OpenCart web page
        Then Click on the search icon
        And Enter any existing product name into the Search Criteria text box field
        And Click on Search button
        Then Searched product should be displayed in the search results

        Scenario: Validate navigating to 'Product Compare' page from Product Category page
          Given I navigate to OpenCart web page
          Then I hover over to Desktops
          And I click to Show All Desktops
          And I click to Product Compare link
          Then User should be taken to Product Compare page
