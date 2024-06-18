@signin @all
Feature: Validate Sign in feature

Background: 
		Given The user is on home page
		And The user goes to sign in page
		
	@valid_input
  Scenario: Validate login functionality with valid credentials
 
  	When The user enters valid username and password 
  	And The user clicks on login button
    Then The user should be redirected to Home Page with the message "You are logged in" 
    And Username should be on the navigation bar next to sign out button
    When The user clicks on Sign out button
    Then The user should be redirected to Home Page with the message "Logged out successfully" 
		
	@invalid_input	
	Scenario Outline: Validate login functionality with invalid credentials by leaving username / password fields blank
  
    When The user enters invalid credentials "<invalid input>", "<username>" and "<password>"
    And The user clicks on login button
    Then The user should receive an "<error message>" for "<invalid input>" and login status is "<status>"

   	Examples: 
     	|	invalid input 													| username  		| password 			| 	error message  							|	status	|
      |	Username and password fields blank			| 							|		 	 		  		| Please fill out this field. 	|	Fail		|
      |	Username field blank										|								| pass3455			|	Please fill out this field. 	|	Fail		|
      |	password field blank										|	ninjafox 			| 							| Please fill out this field. 	|	Fail		|
	
	@invalid_input	
	Scenario Outline: Validate login functionality with invalid credentials
  
    When The user enters invalid credentials from excel sheet "<SheetName>" and row number <RowNumber>
    And The user clicks on login button
    Then The user should receive an error message for invalid input in sign in page

   	Examples:  
      | SheetName  	| RowNumber 	|
      | SignIn 			|     0 			|
      | SignIn 			|     1 			|
      | SignIn 			|     2 			|
   
  @integration
  Scenario: Validate sign in page to register page navigation
  
    When The user clicks on Register button in sign in page
    Then The user should be redirected to Register Page