@login @smoke 
Feature: Login Page Validation
  
  @positive  @loginpositive
  Scenario Outline: Login Page Validatiton with valid data 
    When I entered the username "<username>" 
    And I entered the password "<password>" 
    And I Click the Login button
    Then I validate that Student Information Page Exist
	Examples:
   	|username		 |     password	     		 |
   	| 	Admin		 |		Neotech$123    	 	 |	

@negative 
  Scenario Outline: Login Page Validatiton with empty data 
    When I entered the username "<username>" 
    And I entered the password "<password>" 
    And I Click the Login button
    Then I validate Student Information Page 
   	
   	Examples:
   	|username|password	 |
   	| 			 |			   	 |
   	|	Admin	 |					 |
    |				 |Neotech$123|
   	| Neo		 | neo123		 |
   	
   	
   	  Scenario: Login and Validate subtab existence
    Given I enter the username and password
    And I Click the Login button
    And I clicked the Student Tab
    Then I validated each individual sub-tab


	@newStudentLogin
  Scenario Outline: Login Page Validatiton with valid new user data 
			When I enter the "<username>" , "<password>" and click the Login button
			Then I validate the student "<StudentId>", "<StudentName>", "<GradeSection>", "<UserName>"
			
			
			
			Examples:
   		|username| password |StudentId|		StudentName		|GradeSection|UserName|
			| Gumus	 | iremkop	|		944		|		Irem Gumus		|12th Grade	 |Gumus		|