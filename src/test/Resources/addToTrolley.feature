Feature: adding product to basket
  As an end user
  I want to add product to the basket
  So that I can buy the product I desire

  @basket
  Scenario: adding one product to basket
    Given I am on homepage
    When I search for product "nike"
    And I apply filter category "Smart watches"
    And I select a product "Apple Watch Nike S5 GPS 40mm"
    And I click add to trolley
    Then I should be able to see product "Apple Watch Nike S5 GPS 40mm" in trolley