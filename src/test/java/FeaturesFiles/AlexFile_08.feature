Feature: Login Functionality

Background:
Given I navigate to OpenCart web page
When I go to login page
And I enter email and password and click login button


Scenario: Validate E-Mail Address and Password text fields in the Login page have the place holder text
Given Click on 'My Account' Dropmenu
Then Click on 'Login' option (ER-1)"