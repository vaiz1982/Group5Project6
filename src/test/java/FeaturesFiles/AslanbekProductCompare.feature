Feature: Product Compare

  Scenario: Validate adding the product for comparison from Grid View of Product Category or Sub Category page TC_PC_005
    Given I navigate to OpenCart web page
    When I Hover the mouse on any Menu say Desktops and select Show All Desktops option
    And In the displayed Desktops category page, I select Grid View option
    And I Hover the mouse cursor on Compare this Product option available on the Product that is displayed in the Product Category page
    Then Tool tip with the text - Compare this Product should be displayed
    When I Select Compare this Product option
    Then Success message with text - Success: You have added Product Name to your product comparison! should be displayed
    When I Click on product comparison link from the displayed success message
    And User should be taken to the Product Comparison page with the details of the Product that we have added for comparison.

  Scenario: Validate the 'Product Comparison' page when three products are added to the page for comparison TC_PC_017
    Given I navigate to OpenCart web page
    When I Enter any existing Product name into the Search text box field
    And I Click on the button having search icon
    And I Select Compare this Product option
    And I Repeat Steps 1 to 3, three times until three different products are added to the Product Comparison page
    And I Click on product comparison link from the displayed success message
    Then In the Product Comparison page should be three products added to the page for comparison
