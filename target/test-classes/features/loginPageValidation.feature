@login
Feature: Login Page Validation
  
  @positive 
  Scenario: Login Page Validatiton with valid data 
    When I Enter the  username
    And I Enter the  password
    And I Click the Login button
    Then I validate that Student Information Page Exist


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
   	
