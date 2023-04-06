Feature:

# test 1
  Scenario: (TS_002)  Login Functionality
    Given I navigate to OpenCart web page
    When  Click on My Account Dropmenu
    And Click on Login option
    And Enter valid email address into the E-Mail Address
#  pavanoltraining@gmail.com
    And Enter valid password into the Password
# 12345
    And Click on Login button
    And Click on Browser back button
    Then User should not logged out
# done???????????????????????????????


  # test 2
  Scenario:  (TS_002) Login Functionality
    Given I navigate to OpenCart web page
    When Click on My Account Dropmenu
    And Click on Login option
    Then Login page UI should adhere to the UI checklist
# done????????????????????????????????????


  # test 3
  Scenario: (TS_003)  Logout Functionality
    Given I navigate to OpenCart web page
    Then I go to login page
    And I enter email and password and click login button
    When Click on My Account Dropmenu
    And Click on Login option
    Then Logout functionality should work correctly in all the supported environments
# done?????????????????????????????????????????


    # test 4
  Scenario: (TS_005)  Search Functionality
    Given I navigate to OpenCart web page
    When Enter any existing product name into the Search text box field
    And Click on the button having search icon
    And Select List option
    And Click on the Image of the Product and name of the product
    And Repeat Steps one to two and Select Grid option
    And Click on the Image of the Product and name of the product
    Then  Single product should be dislayed in the
# List view without any problems and all the options (Add to Cart, Wish List and Compare Product) are working
    Then User should be navigated to the Product Display Page of the product
    Then Single product should be dislayed in the Grid view without any problems and all the options  are working
# (Add to Cart, Wish List and Compare Product)
    Then User should be navigated to the Product Display Page of the product
# done????????????????????????????????????????????????????????


  # test 5
  # iMac
  # Success: You have added Product Name to your product comparison!
  # should be displayed
  # Compare this Product should be displayed
  Scenario:  (TS_006)  Product Compare
    Given I navigate to OpenCart web page
    When Enter any existing product name into the Search text box field
    And Click on the button having search icon
    And Click on the Product displayed in the Search results
    Then  Tool tip with the text
    And Hover the mouse cursor on Compare this Product option from the displayed Product Display Page
    And Select Compare this Product option
    And Success message with text
    And Click on product comparision link from the displayed success message
    And User should be taken to the Product Comparison page with the details of the Product that we have added for comparision.



    # test 6
  Scenario: (TS_006)  Product Compare 2
    Given I navigate to OpenCart web page
    When Enter any existing product name into the Search text box field
# iMac
  When Click on the button having search icon
    And Click on the Product displayed in the Search results
  And Select Compare this Product option from the displayed Product Display Page
    Then  Success message with text
# Success: You have added Product Name to your product comparison!' should be displayed
  And Click on the Product Name link in the displayed success message
    Then User should be navigated to the respective Product Display Page
  And Click on the Product Comparison link in the displayed success message
    Then User shluld be taken to the Prdocut Comparison page

# done????????????????????????????????????????????????????

    # test 7
  Scenario: (TS_007) Product Display Page
    Given I navigate to OpenCart web page
    When Enter any existing product name into the Search text box field
# iMac
    And Click on the button having search icon
    And Click on the Product displayed in the Search results
    And Click on the main bigger sized Thumbnail image displayed on the Product Display Page
    And Click on < and > options
  And Click on x option or press ESC keyboard key when the thumbnails are displayed in Light box view
    And Click on the normal sized Thumbnail images and repeat the steps fife to six
    Then Light box view of the main Thumbnail image should be displayed with options to view the previous and next Thumnail images in Light box view.
    Then User should be able to navigate to other thumbnail images in the Light box view
    Then Light box view should close and the focus should go to the Product Display Page.
   Then Light box view of the selected Thumbnail image should be displayed with options to view the previous and next Thumnail images in Light box view.  User should be able to navigate to other thumbnail images in the Light box view. Light box view should close and the focus should go to the Product Display Page.
# done ????????????????????????????????????????????????????????????


    # test 8
  Scenario:  (TS_007)  Product Display Page 2
    Given I navigate to OpenCart web page
    When Enter any existing product name into the Search text box field
# iMac
    And Click on the button having search icon
    And Click on the Product displayed in the Search results
    And Click on Write a review link under Add to Cart button of the Product Display page
    Then Reviews tab in the Product Display page should come to the focus.
# done????????????????????????????????????????????????????????????


    # test 9
  Scenario: (TS_007)  Product Display Page 3
    Given I navigate to OpenCart web page
    When Enter any existing product name into the Search text box field
# Imac
    And Click on the button having search icon
    And Click on the Product displayed in the Search results
    And Click on Add to Cart button
    And Click on Product Name link from the displayed success page
    Then User should be taken to the Product Display page of the Product
 # done?????????????????????????????????????????


    # test 10
  Scenario:  (TS_007)  Product Display Page 4
    Given I navigate to OpenCart web page
    When Enter any existing product name into the Search text box field
# iMac
    And Click on the button having search icon
    And Click on the Product displayed in the Search results
    Then Product  Display page functionality should work correctly in all the supported environments
 # done?????????????????????????????????????????????????????





  Scenario: (TS_009)  Wish List
    Given I navigate to OpenCart web page
    When Hover the mouse on any of the menu option say Desktops
    And Click on Show All Desktops option
    And Select Mac subcategory option from the left side options
    # break here
    And Click on Add to Wish List option that is availble on any of the Products of the displayed Category or Sub-category pages
    And Click on the wish list! link in the displayed success message
    Then Success message with text for wish list
# 'Success: You have added Product Name to your wish list!' should be displayed
    Then Product should be successfully displayed in the My Wish List page
 # done ????????????????????????????????????????????????





  Scenario: (TS_009)  Wish List 2
    Given I navigate to OpenCart web page
    When One product is added to My Wish List page
    When  Click on Modify your wish list option
    And Click on Add to Cart icon option
    Then Success message with text for shopping cart
# 'Success: You have added Product Name to your shopping cart!' should ge displayed
 # bag bag bag !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!









  Scenario: (TS_010)  Shopping Cart
    Given I navigate to OpenCart web page
    When Enter any existing product name into the Search text box field
# iMac
    And Click on the button having search icon
    And Click on the Product displayed in the Search results
    And Click on Add to Cart button in the displayed Product Display page
    And Click on the shopping cart! link in the displayed success message
    And Enter a new quantity into the Quantity field of the Product in the displayed Shopping Cart page
    And Click on Update icon option
    Then Success message with text for modified
# ' Success: You have modified your shopping cart!' should be displayed
 # done ?????????????????????????????????????????????????????????????

  Scenario: (TS_010)  Shopping Cart 2
    Given I navigate to OpenCart web page
    Then add product to sh cart and navigate to shopCart page
    When Click on Estimate Shipping & Taxes section
    And Select any Country from the Country dropdown field
#  "Product Name: iMac
#   Country: United States
#   Region/State: California"

    And Select any State from the Region and State field
    And Click on Get Quotes button
    Then Flat Shipping Rate radio button  should be displayed in the displayed dialog and is not selected by default
    Then Please select the preferred shipping method to use on this order dialog should be displayed.
    And Select the radio button and Click on Apply Shipping button
    Then Success message with text for shipping
# ' Success: Your shipping estimate has been applied!' should be displayed
    Then Flat Shipping Rate should be displayed and added to the Total Price
  # done ???????????????????????????????????????????????????????



  Scenario: (TS_010)  Shopping Cart 3
    Given I navigate to OpenCart web page
    When Check the UI of the functionality related to Shopping Cart
    Then Proper UI adhering to the UI checklist should be displayed for the Shopping Cart functionality
  # done ??????????????????????????????????????????????????????

  Scenario:  (TS_012)  Checkout
    Given I navigate to OpenCart web page
    When Click on Checkout header option
    Then User should be taken to an empty Shopping Cart page instead of Checkout page
# done???????????????????????????????????????????????????????????????

  Scenario: (TS_012)  Checkout 2
    Given I navigate to OpenCart web page
    When Enter any existing product name into the Search text box field
# iMac
    And Click on the button having search icon
    And Click on Add to Cart button in the displayed Product Display page
    And Click on the shopping cart! link in the displayed success message
    And Click on Checkout button in the Shopping Cart page
    And Click on Continue button
    And Select I want to use a new address radio option
    And Don't enter anything into the fields of Delivery Details Section of Checkout page
    Then Proper field level warning messages should be displayed for all the mandatory fields in the Delivery Details section
# done ?????????????????????????????????????/??????????????????

  Scenario:  (TS_013)  My Account
    Given I navigate to OpenCart web page
    When Click on Site Map link in the Footer options
    And Click on My Account link in the displayed Site Map page
    Then User should be taken to My Account page
     # done??????????????????????????????????