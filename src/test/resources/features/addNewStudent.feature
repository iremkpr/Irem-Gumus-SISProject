@newStudent @smoke @regression
Feature: Student s subtab validation

  Scenario Outline: Login and add new student
    When I enter the username and password
    And I Clicked the Login button
    Then I clicked the Student Tab
    And I clicked the Add New button
    And Fill the new student's expected details "<stateId>", "<LastName>", "<FirstName>","<GradeLevel>","<Password>"
    Examples:
    |stateId|LastName	|FirstName|GradeLevel|Password| 
    |12345|	Gumus		|		Suna	|		12		 |iremgumus|