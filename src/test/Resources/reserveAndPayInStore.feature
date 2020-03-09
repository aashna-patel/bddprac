Feature: reservation and Pay In-Store
  As an end user
  I want to be able to reserve and pay in-store
  So that I can reserve and buy a product which I desire


  @ReserveAndPayin-store
  Scenario:
    Given I am on homepage
    When I search for product "nike"
    And I select a product "Nike Hayward 2.0 25L Backpack - Valerian Blue"
    And I click add to trolley
    And I click go to trolley
    And I check availability "E12"
    And I click collection
    And I select a store
    And I click continue
    And I click Reserve And Pay in-store


