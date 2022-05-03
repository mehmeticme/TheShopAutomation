@signUp @regression
Feature: As a user I want to signup to shopping website

  @successfulSignUp
  Scenario Outline: As a user I enter correct information and sign up successfully
    Given I am on the happy shop landing page
    And I click on Sign Up button from  happy shop landing page
    Then I generate username and enter it into username field for sign up page
    And I enter "<email>" into email field for sign up page
    And I enter "<firstName>" into first name field for sign up page
    And I enter "<lastName>" into last name field for sign up page
    And I enter "<password>" into password field for sign up page
    And I enter "<address>" into address field for sign up page
    And I enter "<phone>" into phone field for sign up page
    Then I click on Sign Up button
    And I validate I am on landing page after sign up


    Examples:
    |         email               | firstName     | lastName     |  password     |              address              |         phone         |
    | testUser01@example.com      | Enes          |  Sevik       |  password123  | 123 Home Address                  |      123-234-2323     |
    | testUser02@example.com      | Elon          |  Musk        |  tesla123     | 324 Home Address                  |      111-222-3333     |
    | testUser03@example.com      | Sarah         |  White       |  sarah123     | 2547 Work Address                 |      555-222-6666     |