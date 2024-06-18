@array @all
Feature: Validate Array module

Background:

		Given The user is on home page
		And The user goes to sign in page
		And The user enters valid username and password 
  	And The user clicks on login button
  	And The user goes to Array page
 
  @navigation
  Scenario: Validate navigation from Array page to Arrays in Python page

    When The user clicks on "Arrays in Python" link available in array home page
    Then The user should be redirected to "Arrays in Python" page under array module
     
  @try_editor
  Scenario: Validate Try here button in Arrays in Python page
  
  	When The user clicks on "Arrays in Python" link available in array home page
    And The user clicks on Try here button
    Then The user should be redirected to tryEditor page with a Run button to test
    
  @navigation
  Scenario: Validate navigation from Array page to Arrays Using List page
  
    When The user clicks on "Arrays Using List" link available in array home page
    Then The user should be redirected to "Arrays Using List" page under array module
    
  @try_editor
  Scenario: Validate Try here button in Arrays Using List page
  
  	When The user clicks on "Arrays Using List" link available in array home page
    And The user clicks on Try here button
    Then The user should be redirected to tryEditor page with a Run button to test
    
  @navigation
  Scenario: Validate navigation from Array page to Basic Operations in Lists page

    When The user clicks on "Basic Operations in Lists" link available in array home page
    Then The user should be redirected to "Basic Operations in Lists" page under array module
		
  @try_editor
  Scenario: Validate Try here button in Basic Operations in Lists page
  
  	When The user clicks on "Basic Operations in Lists" link available in array home page
    And The user clicks on Try here button
    Then The user should be redirected to tryEditor page with a Run button to test
    
  @navigation
  Scenario: Validate navigation from Array page to Applications of Array page
  
    When The user clicks on "Applications of Array" link available in array home page
    Then The user should be redirected to "Applications of Array" page under array module
	
	@try_editor
  Scenario: Validate Try here button in Applications of Array page
  
  	When The user clicks on "Applications of Array" link available in array home page
    And The user clicks on Try here button
    Then The user should be redirected to tryEditor page with a Run button to test
    
  @invalid_input
  Scenario Outline: Validate Try here button with invalid python code
  
    When The user clicks on "Applications of Array" link available in array home page
    And The user clicks on Try here button
    And The user enters invalid python code from excel sheet "<SheetName>" and row number <RowNumber>
    And The user clicks on Run button
    Then The user should see an alert to signal bad input 

    Examples: 
      | SheetName  | RowNumber 	|
      | Pythoncode |     0 			|
      | Pythoncode |     1 			|
    
  @valid_input
  Scenario Outline: Validate Try here button with valid python code
  
    When The user clicks on "Arrays in Python" link available in array home page
    And The user clicks on Try here button
    And The user enters valid python code from excel sheet "<SheetName>" and row number <RowNumber>
    And The user clicks on Run button
    Then Console should display result 

    Examples: 
      | SheetName  | RowNumber 	|
      | Pythoncode |     0 			|
      | Pythoncode |     1 			| 
      
  @side_panel
  Scenario: Validate side panel options of Array page
  
  	When The user clicks on "Applications of Array" link available in array home page
  	And The user clicks on "Arrays in Python" link on the side panel of array page
    Then The user should be redirected to "Arrays in Python" page under array module
  	When The user clicks on "Arrays Using List" link on the side panel of array page
    Then The user should be redirected to "Arrays Using List" page under array module
    When The user clicks on "Basic Operations in Lists" link on the side panel of array page
    Then The user should be redirected to "Basic Operations in Lists" page under array module
    When The user clicks on "Applications of Array" link on the side panel of array page
    Then The user should be redirected to "Applications of Array" page under array module  
    
  @navigation
 	Scenario: Validate navigation from array page to Practice Questions page
  
  	When The user clicks on "Arrays Using List" link available in array home page
  	And The user clicks on "Practice Questions" link on the side panel of array page
    Then The user should be redirected to "Practice Questions" page under array module
  
	@navigation @try_editor
  Scenario: Validate navigation from Practice Questions page to Search the array page
  	
  	When The user clicks on "Arrays Using List" link available in array home page
    And The user clicks on "Practice Questions" link on the side panel of array page
    And The user clicks on "Search the array" link available in practice questions page
    Then The user should be redirected to Question page contains a question,a tryEditor to write code with Run and Submit buttons     
         
  @invalid_input
  Scenario Outline: Validate invalid python code in Search the array page
  
    When The user clicks on "Arrays Using List" link available in array home page
    And The user clicks on "Practice Questions" link on the side panel of array page
    And The user clicks on "Search the array" link available in practice questions page
  	And The user enters invalid python code from excel sheet "<SheetName>" and row number <RowNumber>
    And The user clicks on Run button
    Then The user should see an alert to signal bad input

    Examples: 
      | SheetName  | RowNumber 	|
      | Pythoncode |     0 			|
      | Pythoncode |     1 			|   
    
  @valid_input
  Scenario Outline: Validate valid python code in Search the array page
  
    When The user clicks on "Arrays Using List" link available in array home page
    And The user clicks on "Practice Questions" link on the side panel of array page
    And The user clicks on "Search the array" link available in practice questions page
    And The user enters valid python code from excel sheet "<SheetName>" and row number <RowNumber>
    And The user clicks on Run button
    Then Console should display result

    Examples: 
      | SheetName  | RowNumber 	|
      | Pythoncode |     0 			|
      | Pythoncode |     1 			|
  
  @navigation @try_editor       
  Scenario: Validate navigation from Practice Questions page to Max Consecutive Ones page
  
    When The user clicks on "Arrays Using List" link available in array home page
    And The user clicks on "Practice Questions" link on the side panel of array page
    And The user clicks on "Max Consecutive Ones" link available in practice questions page
    Then The user should be redirected to Question page contains a question,a tryEditor to write code with Run and Submit buttons
    
  @invalid_input
  Scenario Outline: Validate invalid python code in Max Consecutive Ones page
  
    When The user clicks on "Arrays Using List" link available in array home page
    And The user clicks on "Practice Questions" link on the side panel of array page
    And The user clicks on "Max Consecutive Ones" link available in practice questions page
  	And The user enters invalid python code from excel sheet "<SheetName>" and row number <RowNumber>
    And The user clicks on Run button
    Then The user should see an alert to signal bad input

    Examples: 
      | SheetName  | RowNumber 	|
      | Pythoncode |     0 			|
      | Pythoncode |     1 			|   
    
  @valid_input
  Scenario Outline: Validate valid python code in Max Consecutive Ones page
  
    When The user clicks on "Arrays Using List" link available in array home page
    And The user clicks on "Practice Questions" link on the side panel of array page
    And The user clicks on "Max Consecutive Ones" link available in practice questions page
	  And The user enters valid python code from excel sheet "<SheetName>" and row number <RowNumber>
    And The user clicks on Run button
    Then Console should display result

    Examples: 
      | SheetName  | RowNumber 	|
      | Pythoncode |     0 			|
      | Pythoncode |     1 			|
  
  @navigation @try_editor  
  Scenario: Validate navigation from Practice Questions page to Find Numbers with Even Number of Digits page
  
    When The user clicks on "Arrays Using List" link available in array home page
    And The user clicks on "Practice Questions" link on the side panel of array page
    And The user clicks on "Find Numbers with Even Number of Digits" link available in practice questions page
    Then The user should be redirected to Question page contains a question,a tryEditor to write code with Run and Submit buttons
    
  @invalid_input
  Scenario Outline: Validate invalid python code in Find Numbers with Even Number of Digits page
  
    When The user clicks on "Arrays Using List" link available in array home page
    And The user clicks on "Practice Questions" link on the side panel of array page
    And The user clicks on "Find Numbers with Even Number of Digits" link available in practice questions page
  	And The user enters invalid python code from excel sheet "<SheetName>" and row number <RowNumber>
    And The user clicks on Run button
    Then The user should see an alert to signal bad input

    Examples: 
      | SheetName  | RowNumber 	|
      | Pythoncode |     0 			|
      | Pythoncode |     1 			|   
    
  @valid_input
  Scenario Outline: Validate valid python code in Find Numbers with Even Number of Digits page
  
    When The user clicks on "Arrays Using List" link available in array home page
    And The user clicks on "Practice Questions" link on the side panel of array page
    And The user clicks on "Find Numbers with Even Number of Digits" link available in practice questions page
	  And The user enters valid python code from excel sheet "<SheetName>" and row number <RowNumber>
    And The user clicks on Run button
    Then Console should display result

    Examples: 
      | SheetName  | RowNumber 	|
      | Pythoncode |     0 			|
      | Pythoncode |     1 			|
    
  @navigation @try_editor 
  Scenario: Validate navigation from Practice Questions page to Squares of a Sorted Array page
  
    When The user clicks on "Arrays Using List" link available in array home page
    And The user clicks on "Practice Questions" link on the side panel of array page
    And The user clicks on "Squares of a Sorted Array" link available in practice questions page
    Then The user should be redirected to Question page contains a question,a tryEditor to write code with Run and Submit buttons
    
 @invalid_input
  Scenario Outline: Validate invalid python code in Squares of a Sorted Array page
  
    When The user clicks on "Arrays Using List" link available in array home page
    And The user clicks on "Practice Questions" link on the side panel of array page
    And The user clicks on "Squares of a Sorted Array" link available in practice questions page
  	And The user enters invalid python code from excel sheet "<SheetName>" and row number <RowNumber>
    And The user clicks on Run button
    Then The user should see an alert to signal bad input

    Examples: 
      | SheetName  | RowNumber 	|
      | Pythoncode |     0 			|
      | Pythoncode |     1 			|   
    
  @valid_input
  Scenario Outline: Validate valid python code in Squares of a Sorted Array page
  
    When The user clicks on "Arrays Using List" link available in array home page
    And The user clicks on "Practice Questions" link on the side panel of array page
    And The user clicks on "Squares of a Sorted Array" link available in practice questions page
 	 	And The user enters valid python code from excel sheet "<SheetName>" and row number <RowNumber>
    And The user clicks on Run button
    Then Console should display result

    Examples: 
      | SheetName  | RowNumber 	|
      | Pythoncode |     0 			|
      | Pythoncode |     1 			|  
        
  @integration
  Scenario: Validate sign out button from Array module  
    
  	When The user clicks on Sign out button
    Then The user should be redirected to Home Page with the message "Logged out successfully"
    
    
    