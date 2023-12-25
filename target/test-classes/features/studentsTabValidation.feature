@studentValidation
Feature: Student s subtab validation

  Scenario: Login and Validate subtab existence
    When I enter the username and password
    And I Clicked the Login button
    Then I clicked the Student Tab
    Then I validated each individual sub-tab
    |TableName|
    |Parental|
    | Academic|
    |Override Final Grade|
    | Schedule|
    | Discipline Stats|
    |Personal| 
    |	Enrollment|
    |Notes|
    |E-Portfolio|
    |Program Enrollment|