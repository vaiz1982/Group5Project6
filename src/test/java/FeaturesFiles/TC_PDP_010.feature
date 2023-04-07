Feature: Product Display Page

  Scenario: Validate the User is able to write a review for the Product from the Reviews tab of Product Display Page
    Given I navigate to OpenCart webpage
    And I enter any existing Product name into the Search text box field such as Apple Cinema Thirty
    And I click search icon
    And  Click on the Product displayed in the Search results
    Then Click on the Reviews tab of the Product in the displayed Product Display page
    When I Enter your name into the Your Name text field
    And I Enter review text into the Your Review text are field
    And Select any radio button to give the rating and Click on Continue button
    Then Success message with text Thank you for your review. It has been submitted to the webmaster for approval. should be displayed