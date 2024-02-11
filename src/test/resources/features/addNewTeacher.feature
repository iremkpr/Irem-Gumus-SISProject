@teacher @smoke @regression
Feature: Validation of Add new Teacher functionality

  
  Scenario: Add new teacher with valid data
      When I enter the username, password and Login button
			Then I clicked the Staff/Faculty Tab and Add New button
			And I clicked the Add New button
			Then I provide the all required informations