Feature: login
  As an Argos user
  I want to be able to register
  So that I can login to my account

@registration @ignore
  Scenario: verify I am able to register successfully with all valid details
    Given I am on homepage
    When I click account
    And I click Register
    And I enter Email Address "aabbcc_123@gmail.com"
    And I click EmailSubmitButton
    And I choose "Ms"from drop down
    And I enter "Aashna" as first Name
    And I enter "Patel" as Last Name
    And I enter PostcodeInput "E12 6PO"
    And I click save and continue
    And I enter new password "Aashna123"
    And I retype new password "Aashna123"
    And I click save and continue
  Then I should be able to register successfully with argos




