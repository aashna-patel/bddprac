Feature: filter
  As an end user
  I want to apply filters
  So that I can find desired product

  @Test1 @ReviewTest
  Scenario: filter by review
    Given I am on homepage
    When I search for product "Nike"
    And I apply filter review "2or more"
    Then I should be able to see refined results review "2"

  @Test2 @CategoryTest
  Scenario: filter by category
    Given I am on homepage
    When I search for product "nike"
    And I apply filter category "Smart watches"
    Then I should be able to see refined results category "Watch"

  @Test3 @TypeTest
  Scenario: filter by type
    Given I am on homepage
    When I search for product "nike"
    And I apply filter type "Holdalls"
    Then I should see refined results of type "Holdall"

  @Test4 @BackPackCapacityTest
  Scenario: filter by backpack capacity
    Given I am on homepage
    When I search for product "Nike"
    And I apply filter backpackCapacity "11"
    Then I should be able to see refined results of backpack capacity "11"

    @Test5 @PriceFilterTest
      Scenario: filter by price
      Given I am on homepage
      When I search for product "Nike"
      And I apply filter price "£5 - £10"
      Then I should be able to see refined results price "5"

