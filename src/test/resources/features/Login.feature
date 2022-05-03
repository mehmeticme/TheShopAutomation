@login @regression
Feature: As a user I want to login to shopping website
  @successfulLogin
  Scenario: As a user I enter correct credentials and login successfully
    Given I am on the happy shop landing page
    And I click on Login button
    Then I enter "admin" into username field
    And I enter "shopapp" into password field
    Then I click on login button
    And I land on Products page

  @wrongUsernameLogin
  Scenario: As a user I enter wrong username and I see error message
    Given I am on the happy shop landing page
    And I click on Login button
    Then I enter "test" into username field
    And I enter "shopapp" into password field
    Then I click on login button
    And I see invalid login error message

  @wrongPasswordLogin
  Scenario: As a user I enter wrong password and I see error message
    Given I am on the happy shop landing page
    And I click on Login button
    Then I enter "admin" into username field
    And I enter "wrongPassword" into password field
    Then I click on login button
    And I see invalid login error message

  @wrongCredentialsLogin
  Scenario: As a user I enter wrong username and password and I see error message
    Given I am on the happy shop landing page
    And I click on Login button
    Then I enter "test123" into username field
    And I enter "psw123" into password field
    Then I click on login button
    And I see invalid login error message
