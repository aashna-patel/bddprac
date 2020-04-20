Feature: filter
  As an end user
  I want to apply filters
  So that I can find desired product

  @ReviewFilter @filter
  Scenario: filter by review
    Given I am on homepage
    When I search for product "Nike"
    And I apply filter review "4or more"
    Then I should be able to see refined results review "3.6"

  @CategoryFilter @filter
  Scenario: filter by category
    Given I am on homepage
    When I search for product "nike"
    And I apply filter category "Smart watches"
    Then I should be able to see refined results category "Watch"

  @TypeFilter @filter
  Scenario: filter by type
    Given I am on homepage
    When I search for product "nike"
    And I apply filter type "Holdalls"
    Then I should see refined results of type "Holdall"

  @ignore @BackPackCapacity @f
  Scenario: filter by backpack capacity
    Given I am on homepage
    When I search for product "Nike"
    And I apply filter backpackCapacity "11"
    Then I should be able to see refined results of backpack capacity "11"

  @PriceFilter @filter
  Scenario: filter by price
    Given I am on homepage
    When I search for product "Nike"
    And I apply filter price "£250 - £500"
    Then I should be able to see refined results price "250"

  @ColourFilter @filter
  Scenario: filter by colour
    Given I am on homepage
    When I search for product "Nike"
    And I apply filter colour "Blue"
    Then I should be able to see refined results colour "Blue"

  @SelectTwoFilters @filter
  Scenario: filter by type and price
    Given I am on homepage
    When I search for product "nike"
    And I apply filter type "Backpacks" and price "£20 - £25"
    Then I should be able to see "Backpack" and "£20 - £25"