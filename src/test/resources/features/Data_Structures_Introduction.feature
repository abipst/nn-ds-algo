@tag
Feature: Validate Data Structures - Introduction module

Background:

		Given The user is on home page
		And The user goes to sign in page
		And The user enters valid username and password 
  	And The user clicks on login button
  	And The user goes to Data Structures - Introduction page 
    
  @tag1
  Scenario: Validate navigation from data structures-introduction page to time complexity page
  
    When The user clicks on Time Complexity link
    Then The user should be redirected to "time complexity" of Data structures-Introduction page 
    
  @tag1
  Scenario: Validate side panel options of Data structures-Introduction page
  
  	Given The user is on Time complexity page
  	When The user clicks on "Time Complexity" link on the side panel of Data structures-Introduction page
    Then The user should be redirected to "time complexity" of Data structures-Introduction page
    When The user clicks on "Practice Questions" link on the side panel of Data structures-Introduction page
    Then The user should be redirected to "practice questions" of Data structures-Introduction page  
    
  @tag1
  Scenario: Validate Try here button in time complexity page
  
  	Given The user is on Time complexity page
    When The user clicks on Try here button
    Then The user should be redirected to tryEditor page with a Run button to test
    
  @tag1
  Scenario: Validate Try here button with invalid python code
  
  	Given The user is on Time complexity page
    When The user clicks on Try here button
    Then The user should be redirected to tryEditor page with a Run button to test
    When The user enters invalid python code to the texteditor
    Then The user should see an alert to signal bad input

  @tag2
  Scenario Outline: Validate Try here button with valid python code
  
    Given The user is on Time complexity page
    When The user clicks on Try here button
    Then The user should be redirected to tryEditor page with a Run button to test
    When The user enters valid python code from excel sheet "<SheetName>" and row number "<RowNumber>"
    And The user clicks on Run button
    Then Console should display reuslt "<Result>" 

    Examples: 
      | SheetName  | RowNumber 	| Result  |
      | Pythoncode |     0 			|  				|
      | Pythoncode |     1 			|     		|
