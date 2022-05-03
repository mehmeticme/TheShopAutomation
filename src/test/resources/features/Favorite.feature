@favorite @regression
Feature: As a user I want to login to shopping website and add items to my favorite


  Scenario Outline: As a user I login to website and add <productName> to my favorite and remove it from from my favorite
    Given I am on the happy shop landing page
    And I click on Login button
    Then I enter "admin" into username field
    And I enter "shopapp" into password field
    Then I click on login button
    And I land on Products page
    Then I click on "<filterName>" from Filter By Brand field
    And I validate products displayed correctly
    Then I click on "<productName>" from products list
    And I click on favorite button to add it to my favorite
    Then I click on My Favorites from navigation bar
    And I validate that "<expectedItemName>" is added to my favorite successfully
    And I click on Products from navigation bar
    Then I click on "<filterName>" from Filter By Brand field
    And I validate products displayed correctly
    Then I click on "<productName>" from products list
    And I click on unFavorite button to remove it to my favorite
    Then I click on My Favorites from navigation bar
    And I validate that "<expectedItemName>" is removed from my favorites list successfully

    Examples:
      | filterName        |              productName              |    expectedItemName                     |
      | Nike              | Nike Running Shoes                    |   Nike Running Shoes                    |
      | DressBarn         | Secret Agent Pants - Average Length   |   Secret Agent Pants - Average Length   |
      | DR2               | DR2 Split Neck Casual Top                |   DR2 Split Neck Casual Top             |


