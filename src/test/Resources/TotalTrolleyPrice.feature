Feature: total price in trolley
  As an end user
  I want to verify the total price gets updated when I add a product to trolley
  So that I can see the total price to buy all the products in the basket


  @totalPrice
  Scenario: total price in trolley
    Given I am on homepage
    When I search for product "Adidas Power V 25.75L Backpack - Grey"
    And I click add to trolley
    And I click continue Shopping
    And I search for product "Nike Heritage 2.0 25L Backpack - Black"
    And I click add to trolley
    And I click go to trolley
    Then I should be able to see the updated price