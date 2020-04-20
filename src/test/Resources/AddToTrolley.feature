Feature: adding product to trolley
  As an end user
  I want to add product to the trolley
  So that I can buy the product I desire

  @basket @AddToTrolley
  Scenario: adding one product to trolley
    Given I am on homepage
    When I search for product "nike"
    And I apply filter type "Holdalls"
    And I select a product "Nike Brasilia Small Holdall - Pink"
    And I click add to trolley
    And I click go to trolley
    Then I should be able to see product "Nike Brasilia Small Holdall - Pink" in trolley

  @quantityTest @AddToTrolley
  Scenario: increasing the quantity in trolley
    Given I am on homepage
    When I search for product "adidas"
    And I select a product "Adidas Starlancer VI Size 5 Football - Blue"
    And I click add to trolley
    And I click go to trolley
    And I increase the quantity "2"
    Then I should be able to see refined quantity size "2"

  @quantityTest2 @AddToTrolley
  Scenario: increasing the quantity of products on product description page
    Given I am on homepage
    When I search for product "Adidas"
    And I select a product "Adidas Bum Bag - Black"
    And I increase the quantity on product description page to "3"
    And I click add to trolley
    And I click go to trolley
    Then I should be able to see refined quantity size "3"

  @addTwoProducts @AddToTrolley
  Scenario: adding two different products to trolley
    Given I am on homepage
    When I search for product "adidas"
    And I select a product "Adidas Boxing Focus Mitt Pads - Black and Gold"
    And I click add to trolley
    And I click continue Shopping
    And I search for another product "watch"
    And I select a product "Huawei Watch GT 2 Smart Watch"
    And I click add to trolley
    And I click go to trolley
    Then I should be able to see "2" products in trolley
    And I should be able to see "Adidas Boxing Focus Mitt Pads - Black and Gold" and "Huawei Watch GT 2 Smart Watch" in Trolley

    @addRandomProduct @AddToTrolley
      Scenario: adding random product to trolley
      Given I am on homepage
      When I search for product "Nike"
      And I select a random product
      And I remember that name
      And I click add to trolley
      And I click go to trolley
      Then I should be able to see that product in trolley


  @addToBasket @AddToTrolley
  Scenario Outline:adding multiple products
    Given I am on homepage
    When I search for product "<BrandName>"
    And I select a product <product>
    And I click add to trolley
    And I click go to trolley
    Then I should be able to see <product> in Trolley
    Examples:
      | BrandName | product                                          |
      | nike      | "Nike Radiate Club Phantom 24L Backpack - Beige" |
      | adidas    | "Adidas Euro Size 5 Football - White"            |
      | puma      | "Puma Core Base 14L Backpack - Black and Gold"   |