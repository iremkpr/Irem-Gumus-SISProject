
@homePageValidation @smoke @regression
Feature: Successful Login and Homepage Validation

  @homePositive 
  Scenario Outline: Login and Homepage Validation with valid data
    When I entered the username "<username>" 
    And I entered the password "<password>" 
    And I Click the Login button
    Then I validate Student Information Page 
    And I validate Announcement is visible
    And I validate url is as expected
   
	Examples: 
	    |	username	|			password	 			 |
	   	|	 Admin	 	|		Neotech$123		   	 |

  @homeNegative 
  Scenario Outline: Login Page Validatiton with invalid data 
    When I entered the username "<username>" 
    And I entered the password "<password>" 
    And I Click the Login button
   	
   	Examples:
     	|username|password	 |
	   	| 			 |			   	 |
	   	|	Admin	 |					 |
	    |				 |Neotech$123|
	   	| Neo		 | neo123		 |
	   	
  @newTeacherLogin 	
  Scenario Outline: Login with valid Teacher credentials 
    When I entered the username "<username>" 
    And I entered the password "<password>" 
	  And I Click the Login button
	  Then I validate the Teachers name "<profileName>"
	
	
		
	   	Examples:
     	|	username		|password	 | profileName|
     	|	iremGumus16	| iremkop	 | irem Gumus	|
	
  @ParentLogin 	
  Scenario Outline: Login with valid Parent credentials 
    When I entered the username "<username>" 
    And I entered the password "<password>" 
	  And I Click the Login button
	  Then I validate the all Tabs
	  And I validate the Parents name "<FullName >" and "<Address>"
	
	
		
	   	Examples:
     	|	username		|password	 | 		FullName		| Address|
     	|	diana				| diana	 	 | Princess Diana	|	123 Sessame St NY, 12345|
     	
	