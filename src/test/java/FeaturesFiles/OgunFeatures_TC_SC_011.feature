Feature: Shopping Cart
#  1. Enter any existing Product name into the Search text box field --iMAC
#  2. Click on the button having search icon
#  3. Click on the Product displayed in the Search results
#  4. Click on Add to Cart button in the displayed Product Display page
#  5. Click on the shopping cart! link in the displayed success message
#  6. Validate Page Heading, Page Title and Page URL of the dispalyed Shopping Cart page

  Background:
    Given I navigate to OpenCart web page

    Scenario: Validate Page Heading, Page Title and Page URL of Shopping Cart page
      When Enter any existing Product name into the Search text box field --iMAC
      And Click on the button having search icon
      And Click on the Product displayed in the Search results
      And Click on Add to Cart button in the displayed Product Display page
      And Click on the shopping cart! link in the displayed success message
      Then Validate Page Heading, Page Title and Page URL of the dispalyed Shopping Cart page

#      MANUALLY DONE

