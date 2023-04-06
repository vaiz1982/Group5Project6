Feature: Product Compare
#  1. Hover the mouse on any Menu say Desktops and select Show All Desktops option
#  2. In the displayed Desktops category page, select List View option
#  3. Hover the mouse cursor on Compare this Product option available on the Product that is displayed in the Product Category page
#  5. Select Compare this Product option
#  6. Click on product comparision link from the displayed success message
  Background:
   Given I navigate to OpenCart web page


  Scenario: Validate adding the product for comparision from List View of Product Category or Sub Category page
    When Hover the mouse on any Menu say Desktops and select Show All Desktops option
    And In the displayed Desktops category page, select List View option
    And Hover the mouse cursor on Compare this Product option available on the Product that is displayed in the Product Category page
    And Select Compare this Product option
    Then Click on product comparision link from the displayed success message

#
#  1. Tool tip with the text - 'Compare this Product' should be displayed
#  2. Success message with text - ' Success: You have added Product Name to your product comparison!' should be displayed
#  3. User should be taken to the 'Product Comparison' page with the details of the Product that we have added for comparision.
#

