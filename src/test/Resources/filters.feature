Feature: filter
  As an end user
  I want to apply filters
  So that I can find desired product

  @Test @ReviewTest
  Scenario: filter by review
    Given I am on homepage
    When I search for product "Nike"
    And I apply filter review "2or more"
    Then I should be able to see refined results review "2"

  @Test @CategoryTest
  Scenario: filter by category
    Given I am on homepage
    When I search for product "nike"
    And I apply filter category "Smart watches"
    Then I should be able to see refined results category "Watch"

  @Test @TypeTest
  Scenario: filter by type
    Given I am on homepage
    When I search for product "nike"
    And I apply filter type "Holdalls"
    Then I should see refined results of type "Holdall"

  @Test @BackPackCapacityTest
  Scenario: filter by backpack capacity
    Given I am on homepage
    When I search for product "Nike"
    And I apply filter backpackCapacity "17.5"
    Then I should be able to see refined results of backpack capacity "17.5"

