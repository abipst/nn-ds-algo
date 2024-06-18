@data_structures_intro @all
Feature: Validate Data Structures - Introduction module

Background:

		Given The user is on home page
		And The user goes to sign in page
		And The user enters valid username and password 
  	And The user clicks on login button
  	And The user goes to Data Structures - Introduction page 
    
  @navigation
  Scenario: Validate navigation from data structures-introduction page to time complexity page
  
    When The user clicks on Time Complexity link
    Then The user should be redirected to "time complexity" of Data structures-Introduction page 
    
  @side_panel
  Scenario: Validate side panel options of Data structures-Introduction page
  
  	Given The user is on Time complexity page
  	When The user clicks on "Time Complexity" link on the side panel of Data structures-Introduction page
    Then The user should be redirected to "time complexity" of Data structures-Introduction page
    When The user clicks on "Practice Questions" link on the side panel of Data structures-Introduction page
    Then The user should be redirected to "practice questions" of Data structures-Introduction page  
    
  @try_editor
  Scenario: Validate Try here button in time complexity page
  
  	Given The user is on Time complexity page
    When The user clicks on Try here button
    Then The user should be redirected to tryEditor page with a Run button to test
    
  @invalid_input
  Scenario Outline: Validate Try here button with invalid python code
  
    Given The user is on Time complexity page
    When The user clicks on Try here button
    Then The user should be redirected to tryEditor page with a Run button to test
    When The user enters invalid python code from excel sheet "<SheetName>" and row number <RowNumber>
    And The user clicks on Run button
    Then The user should see an alert to signal bad input 

    Examples: 
      | SheetName  | RowNumber 	|
      | Pythoncode |     0 			|
      | Pythoncode |     1 			|
    

  @valid_input
  Scenario Outline: Validate Try here button with valid python code
  
    Given The user is on Time complexity page
    When The user clicks on Try here button
    Then The user should be redirected to tryEditor page with a Run button to test
    When The user enters valid python code from excel sheet "<SheetName>" and row number <RowNumber>
    And The user clicks on Run button
    Then Console should display result 

    Examples: 
      | SheetName  | RowNumber 	|
      | Pythoncode |     0 			|
      | Pythoncode |     1 			|  		
      
	@integration
  Scenario: Validate sign out button from Data Structures - Introduction module  
    
  	When The user clicks on Sign out button
    Then The user should be redirected to Home Page with the message "Logged out successfully"
    