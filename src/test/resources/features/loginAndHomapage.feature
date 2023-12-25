
@homePageValidation
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
    Then I validate alert
   	
   	Examples:
     	|username|password	 |
   	| 			 |			   	 |
   	|	Admin	 |					 |
    |				 |Neotech$123|
   	| Neo		 | neo123		 |
   	

