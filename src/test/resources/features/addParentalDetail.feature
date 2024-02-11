@addParent @smoke @regression
Feature: Add new primary, secondary parent Validation

	@positive 
  Scenario: Login and add new primary and secondary parental information
    When I enter the username, password and Login button
    Then I clicked the Student Tab	and Parental Sub-Tab
    And I select the new user from Total Students List
    Then I added new informations for Primary Parent   
    	|firstname|lastname|relational|
    	|Suna			|Koprek  | Mother		|
    And  I added new informations for Secondary Parent 
      |firstname|lastname|relational|
    	|Vahid		|Koprek  | Father		|
    	
