Feature: Wish List

  Scenario: Validate the removing the Product  from 'My Wish List' page
  Given Click on 'Modify your wish list' option
  When Click on 'Remove' icon option (Validate ER-1)
  Then Success message with text - 'Success: You have modified your wish list!' should be displayed, 'My Wish List' page should become empty and 'Your wish list is empty.' text should be displayed on the page.
