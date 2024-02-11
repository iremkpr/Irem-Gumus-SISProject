
@enrollment @smoke @regression
Feature: Enroll the new added student

	Scenario: Find the new added user and enroll 
    When I enter the username and password
    And I Clicked the Login button
    Then I clicked the Student Tab
		And I select the Status 
		And I select the new added user from Total Students List
		And I click the Enroll on user information page	
		And I validate the user exist on the enrollments list