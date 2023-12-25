@studentValidation
Feature: Student s subtab validation

  Scenario: Login and Validate subtab existence
    Given I enter the username and password
    And I Click the Login button
    And I clicked the Student Tab
#    Then I validated each individual sub-tab
