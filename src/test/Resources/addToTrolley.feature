Feature: adding product to basket
  As an end user
  I want to add product to the basket
  So that I can buy the product I desire

  @basket
  Scenario: adding one product to basket
    Given I am on homepage
    When I search for product "nike"
    And I select a product ""
    And I click add to trolley
    Then I should be able to see product "" in trolley