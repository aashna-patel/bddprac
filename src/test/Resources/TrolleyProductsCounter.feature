Feature: trolley products counter
  As an end user
  I want to be able to see the trolley size
  So that I can see how many products are present in Trolley

  @TrolleyProductsCounter
  Scenario: increasing quantity of the product
    Given I am on homepage
    When I search for product "adidas"
    And I select a product "Adidas Power V 25.75L Backpack - Grey"
    And I click add to trolley
    And I click go to trolley
    And I increase the quantity "3"
    Then I should be able to see "3" products in trolley

    @TrolleyProductCounter2
    Scenario: adding multiple products
      Given I am on homepage
      When I search for product "adidas"
      And I select a product "Adidas Power V 25.75L Backpack - Grey"
      And I click add to trolley
      And I click continue Shopping
      And I search for product "chandelier"
      And I select a product "Argos Home Inspire 5 Light Chandelier - Clear"
      And I click add to trolley
      Then I should be able to see "2" products in trolley

