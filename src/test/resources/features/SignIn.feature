@tag
Feature: Validate Sign in feature

Background: 

		Given The user is on sign in page
		
  Scenario Outline: Validate login functionality with invalid credentials
  
    When The user enters username as "<username>" and password as "<password>"
    And The user clicks on login button
    Then The user should receive an error message as "<error message>" and login status is "<status>"

    Examples: 
      | username  | password 	| error message  								|	status	|
      | 					|		 	 		  | Please fill out this field. 	|	Fail		|
      |		user 		|     			| Please fill out this field. 	|	Fail		|
    	|		user		|	pass			| Invalid Username and Password |	Fail		|	
      |	ninjafox	|	pass			| Please check your password		|	Fail		|
      
  @valid_input
  Scenario: Validate login functionality with valid credentials
 
  	When The user enters valid username and password and clicks on login button
    Then The user should be redirected to Home Page with the message "You are logged in" 
    And Username should be on the navigation bar next to sign out button
    When The user clicks on Sign out button
    Then The user should be redirected to Home Page with the message "Logged out successfully" 
    
  @tag1
  Scenario: Validate sign in page to register page navigation
  
    When The user clicks on Register button
    Then The user should be redirected to Register Page