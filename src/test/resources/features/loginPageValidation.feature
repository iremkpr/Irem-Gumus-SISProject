@login
Feature: Login Page Validation
  
  @positive 
  Scenario: Login Page Validatiton with valid data 
    When I Enter the Username 
    And I Enter the Password
    And I Click the Login button
    Then I validate that Student Information Page Exist
   
