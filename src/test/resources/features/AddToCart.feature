@addToCart @regression
Feature: As a user I want to login to shopping website and add items to my Cart


  Scenario Outline: As a user I login to website and add an item to my cart and remove the item from my cart
    Given I am on the happy shop landing page
    And I click on Login button
    Then I enter "admin" into username field
    And I enter "shopapp" into password field
    Then I click on login button
    And I land on Products page
    Then I click on "<filterName>" from Filter By Brand field
    And I validate products displayed correctly
    Then I click on "<productName>" from products list
    And I click on Add to Cart
    Then I click on My Cart from navigation bar
    And I validate that "<expectedItemName>" is added to my cart successfully
    Then I click on remove button for "<productName>"
    And I validate that "<productName>" is removed from my cart successfully

    Examples:
    | filterName        |              productName              |    expectedItemName                     |
    | Adidas            | Adidas Kaptir 2.0                     |   Adidas Kaptir 2.0                     |
    | DressBarn         | Secret Agent Pants - Average Length   |   Secret Agent Pants - Average Length   |
    | Athlete           | Sundown Sweatshirt                    |   Sundown Sweatshirt                    |


