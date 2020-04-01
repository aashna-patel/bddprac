Feature:login functionality
  As an end user
  I want to be able to login
  So that I can buy a product

  Background:
    Given I am on homepage
    When I click account

  @login
  Scenario: verifying the login credential is working correctly with valid userId and Password
    And I enter Email Address "aashna_patel@hotmail.com"
    And I enter password "aashna12"
    And I click Sign In Securely
    Then I should be logged in successfully

  @invalidLogin
  Scenario: verify the login credentials is working correctly with valid user ID and Invalid Password
    And I enter Email Address "aashna_patel@hotmail.com"
    And I enter password "abc123"
    And I click Sign In Securely
    Then I should not be able to log in successfully

  @invalidLogin
    Scenario: verify the login credentials is not working correctly with invalid user ID and Invalid Password
    And I enter Email Address "aashnapatel@hotmail.com"
    And I enter Email Address "abc123"
    Then I should not be able to log in successfully

    