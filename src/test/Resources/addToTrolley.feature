Feature: adding product to trolley
  As an end user
  I want to add product to the trolley
  So that I can buy the product I desire

  @basket
  Scenario: adding one product to trolley
    Given I am on homepage
    When I search for product "nike"
    And I apply filter category "Smart watches"
    And I select a product "Apple Watch Nike S5 GPS 40mm"
    And I click add to trolley
    And I click go to trolley
    Then I should be able to see product "Apple Watch Nike S5 GPS 40mm" in trolley

  @quantityTest
  Scenario: increasing the quantity in trolley
    Given I am on homepage
    When I search for product "adidas"
    And I apply filter category "Footballs"
    And I select a product "Adidas Starlancer VI Size 5 Football - Blue"
    And I click add to trolley
    And I click go to trolley
    And I increase the quantity "2"
    Then I should be able to see refined quantity size "2"

  @addTwoProducts
  Scenario: adding two different products to trolley
    Given I am on homepage
    When I search for product "adidas"
    And I select a product "Adidas Power V 25.75L Backpack - Grey"
    And I click add to trolley
    And I click continue Shopping
    And I search for product "watch"
    And I select a product "Skagen Kulor Blue Silicone Strap Watch"
    And I click add to trolley
    And I click go to trolley
    Then I should be able to see "2" products in trolley


