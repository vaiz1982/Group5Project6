Feature: Login Functionality

# 1. Click on 'My Account' Dropmenu
# 2. Click on 'Login' option
# 3. Enter invalid email address into the 'E-Mail Address' field - <Refer Test Data>
# 4. Enter invalid password into the 'Password' field - <Refer Test Data>
# 5. Click on 'Login' button (Validate ER-1)

  Scenario Outline: As a user, I should be able to log into the Application using
  invalid credentials (i.e. Invalid email address and Invalid Password)
    Given I navigate to OpenCart web page
    When I go to login page
    And I enter "<email>" and invalid "<password>" and click login button
    Then user should see the Warning message with the text Warning: No match for E-Mail Address and or Password. should be displayed
    Examples:
      | email               | password  |
      | shtefan@test.com | qwerty12345 |


