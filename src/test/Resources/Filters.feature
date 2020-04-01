Feature: filter
  As an end user
  I want to apply filters
  So that I can find desired product

  @ReviewFilter @f
  Scenario: filter by review
    Given I am on homepage
    When I search for product "Nike"
    And I apply filter review "2or more"
    Then I should be able to see refined results review "2"

  @CategoryFilter @f
  Scenario: filter by category
    Given I am on homepage
    When I search for product "nike"
    And I apply filter category "Smart watches"
    Then I should be able to see refined results category "Watch"

  @TypeFilter @f
  Scenario: filter by type
    Given I am on homepage
    When I search for product "nike"
    And I apply filter type "Holdalls"
    Then I should see refined results of type "Holdall"

  @ignore
  Scenario: filter by backpack capacity
    Given I am on homepage
    When I search for product "Nike"
    And I apply filter backpackCapacity "11"
    Then I should be able to see refined results of backpack capacity "11"

  @PriceFilter @f
  Scenario: filter by price
    Given I am on homepage
    When I search for product "Nike"
    And I apply filter price "£250 - £500"
    Then I should be able to see refined results price "250"

  @ColourFilter @f @ignore
  Scenario: filter by colour
    Given I am on homepage
    When I search for product "Nike"
    And I apply filter colour "Blue"
    Then I should be able to see refined results colour "Blue"

  @SelectTwoFilters @f
  Scenario: filter by type and price
    Given I am on homepage
    When I search for product "nike"
    And I apply filter type "Holdalls" and price "£20 - £25"
    Then I should be able to see "Holdall" and "£20 - £25"