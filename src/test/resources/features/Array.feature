@tag
Feature: Validate Array module

Background:

		Given Signed in user is on Array page
 
  @tag1
  Scenario: Validate navigation from Array page to Arrays in Python page

    When The user clicks on "Arrays in Python" link available in array home page
    Then The user should be redirected to "Arrays in Python" page under array module
    When The user clicks on "Try here" button
    Then The user should be redirected to tryEditor page with a Run button to test
      
  @tag1
  Scenario: Validate navigation from Array page to 	 page
  
    When The user clicks on "Arrays Using List" link available in array home page
    Then The user should be redirected to "Arrays Using List" page under array module
    When The user clicks on "Try here" button
    Then The user should be redirected to tryEditor page with a Run button to test
    
  @tag1
  Scenario: Validate navigation from Array page to Basic Operations in Lists page

    When The user clicks on "Basic Operations in Lists" link available in array home page
    Then The user should be redirected to "Basic Operations in Lists" page under array module
		When The user clicks on "Try here" button
    Then The user should be redirected to tryEditor page with a Run button to test
    
  @tag1
  Scenario: Validate navigation from Array page to Applications of Array page
  
    When The user clicks on "Applications of Array" link available in array home page
    Then The user should be redirected to "Applications of Array" page under array module
    When The user clicks on "Try here" button
    Then The user should be redirected to tryEditor page with a Run button to test
	
  @tag1
  Scenario: Validate Try here button on Applications of Array page with invalid python code
  
  	Given The user is on "Applications of Array" page under array module
    When The user clicks on "Try here" button
    Then The user should be redirected to tryEditor page with a Run button to test
    When The user enters invalid python code to the texteditor
    Then The user should see an alert to signal bad input

  @tag2
  Scenario Outline: Validate Try here button on Applications of Array page with valid python code
  
    Given The user is on "Applications of Array" page under array module
    When The user clicks on "Try here" button
    Then The user should be redirected to tryEditor page with a Run button to test
    When The user enters valid python code from excel sheet "<SheetName>" and row number "<RowNumber>"
    And The user clicks on "Run" button
    Then Console should display reuslt "<Result>" 

    Examples: 
      | SheetName  | RowNumber 	| Result  |
      | Pythoncode |     0 			|  				|
      | Pythoncode |     1 			|     		|
      
  @tag1
  Scenario: Validate side panel options of Array page
  
  	Given The user is on "Applications of Array" page under array module
  	When The user clicks on "Arrays in Python" link on the side panel of array page
    Then The user should be redirected to "Arrays in Python" page under array module
  	When The user clicks on "Arrays Using List" link on the side panel of array page
    Then The user should be redirected to "Arrays Using List" page under array module
    When The user clicks on "Basic Operations in Lists" link on the side panel of array page
    Then The user should be redirected to "Basic Operations in Lists" page under array module
    When The user clicks on "Applications of Array" link on the side panel of array page
    Then The user should be redirected to "Applications of Array" page under array module  
    
  @tag1
 	Scenario: Validate navigation from array page to Practice Questions page
  
  	Given The user is on "Applications of Array" page under array module
  	When The user clicks on "Practice Questions" link on the side panel of array page
    Then The user should be redirected to "Practice Questions" page under array module
  
    
 @tag1
  Scenario: Validate navigation from Practice Questions page to Search the array page
  
    Given The user is on "Practice Questions" page under array module
    When The user clicks on "Search the array" link available in practice questions page
    Then The user should be redirected to Question page contains a question,a tryEditor to write code with Run and Submit buttons        
      
  Scenario: Validate navigation from Practice Questions page to Max Consecutive Ones page
  
    Given The user is on "Practice Questions" page under array module
    When The user clicks on "Max Consecutive Ones" link available in practice questions page
    Then The user should be redirected to Question page contains a question,a tryEditor to write code with Run and Submit buttons      
      
  Scenario: Validate navigation from Practice Questions page to Find Numbers with Even Number of Digits page
  
    Given The user is on "Practice Questions" page under array module
    When The user clicks on "Find Numbers with Even Number of Digits" link available in practice questions page
    Then The user should be redirected to Question page contains a question,a tryEditor to write code with Run and Submit buttons 
    
  Scenario: Validate navigation from Practice Questions page to Squares of a  Sorted Array page
  
    Given The user is on "Practice Questions" page under array module
    When The user clicks on "Squares of a  Sorted Array" link available in practice questions page
    Then The user should be redirected to Question page contains a question,a tryEditor to write code with Run and Submit buttons     
  
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      