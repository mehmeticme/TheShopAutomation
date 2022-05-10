@checkOut @regression
Feature: As a user I want to checkout my shopping cart

  Scenario: As a user I checkout items in my shopping card
    Given I am on the happy shop landing page
    And I click on Login button
    Then I enter "admin" into username field
    And I enter "shopapp" into password field
    Then I click on login button
    And I land on Products page
    And I click on My Cart from navigation bar
    Then I enter "testUser@example.com" into email field
    And I enter "Test User" into name field
    And I enter "4242424242424242" into card number field
    And I enter "0525" into expiration date field
    And I enter "111" into cvs field
    Then I enter "12345" into zipCode field
    Then I click on submit payment button
    And I validate "Thank you for your purchase" text is being displayed after clicking on submit button


