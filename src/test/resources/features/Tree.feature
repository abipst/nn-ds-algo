@tree @all
Feature: Validate Tree module

Background:

		Given The user is on home page
		And The user goes to sign in page
		And The user enters valid username and password 
  	And The user clicks on login button
  	And The user goes to Tree page
 
  @navigation
  Scenario: Validate navigation from Tree page to Overview of Trees page

    When The user clicks on "Overview of Trees" link available in tree home page
    Then The user should be redirected to "Overview of Trees" page under tree module
     
  @try_editor
  Scenario: Validate Try here button in Overview of Trees page
  
  	When The user clicks on "Overview of Trees" link available in tree home page
    And The user clicks on Try here button
    Then The user should be redirected to tryEditor page with a Run button to test
    
  @navigation
  Scenario: Validate navigation from Tree page to Terminologies page

    When The user clicks on "Terminologies" link available in tree home page
    Then The user should be redirected to "Terminologies" page under tree module
		
  @try_editor
  Scenario: Validate Try here button in Terminologies page
  
  	When The user clicks on "Terminologies" link available in tree home page
    And The user clicks on Try here button
    Then The user should be redirected to tryEditor page with a Run button to test
    
  @navigation
  Scenario: Validate navigation from tree page to Types of Trees page
  
    When The user clicks on "Types of Trees" link available in tree home page
    Then The user should be redirected to "Types of Trees" page under tree module
	
	@try_editor
  Scenario: Validate Try here button in Types of Trees page
  
  	When The user clicks on "Types of Trees" link available in tree home page
    And The user clicks on Try here button
    Then The user should be redirected to tryEditor page with a Run button to test
    
	@navigation
  Scenario: Validate navigation from Tree page to Tree Traversals page

    When The user clicks on "Tree Traversals" link available in tree home page
    Then The user should be redirected to "Tree Traversals" page under tree module
     
  @try_editor
  Scenario: Validate Try here button in Tree Traversals page
  
  	When The user clicks on "Tree Traversals" link available in tree home page
    And The user clicks on Try here button
    Then The user should be redirected to tryEditor page with a Run button to test
    
  @navigation
  Scenario: Validate navigation from Tree page to Traversals-Illustration page

    When The user clicks on "Traversals-Illustration" link available in tree home page
    Then The user should be redirected to "Traversals-Illustration" page under tree module
		
  @try_editor
  Scenario: Validate Try here button in Traversals-Illustration page
  
  	When The user clicks on "Traversals-Illustration" link available in tree home page
    And The user clicks on Try here button
    Then The user should be redirected to tryEditor page with a Run button to test
    
  @navigation
  Scenario: Validate navigation from Tree page to Binary Trees page

    When The user clicks on "Binary Trees" link available in tree home page
    Then The user should be redirected to "Binary Trees" page under tree module
		
  @try_editor
  Scenario: Validate Try here button in Binary Trees page
  
  	When The user clicks on "Binary Trees" link available in tree home page
    And The user clicks on Try here button
    Then The user should be redirected to tryEditor page with a Run button to test
    
  @navigation
  Scenario: Validate navigation from Tree page to Types of Binary Trees page

    When The user clicks on "Types of Binary Trees" link available in tree home page
    Then The user should be redirected to "Types of Binary Trees" page under tree module
		
  @try_editor
  Scenario: Validate Try here button in Types of Binary Trees page
  
  	When The user clicks on "Types of Binary Trees" link available in tree home page
    And The user clicks on Try here button
    Then The user should be redirected to tryEditor page with a Run button to test
    
  @navigation
  Scenario: Validate navigation from Tree page to Implementation in Python page

    When The user clicks on "Implementation in Python" link available in tree home page
    Then The user should be redirected to "Implementation in Python" page under tree module
		
  @try_editor
  Scenario: Validate Try here button in Implementation in Python page
  
  	When The user clicks on "Implementation in Python" link available in tree home page
    And The user clicks on Try here button
    Then The user should be redirected to tryEditor page with a Run button to test
    
  @navigation
  Scenario: Validate navigation from Tree page to Binary Tree Traversals page

    When The user clicks on "Binary Tree Traversals" link available in tree home page
    Then The user should be redirected to "Binary Tree Traversals" page under tree module
		
  @try_editor
  Scenario: Validate Try here button in Binary Tree Traversals page
  
  	When The user clicks on "Binary Tree Traversals" link available in tree home page
    And The user clicks on Try here button
    Then The user should be redirected to tryEditor page with a Run button to test
    
  @navigation
  Scenario: Validate navigation from Tree page to Implementation of Binary Trees page

    When The user clicks on "Implementation of Binary Trees" link available in tree home page
    Then The user should be redirected to "Implementation of Binary Trees" page under tree module
		
  @try_editor
  Scenario: Validate Try here button in Implementation of Binary Trees page
  
  	When The user clicks on "Implementation of Binary Trees" link available in tree home page
    And The user clicks on Try here button
    Then The user should be redirected to tryEditor page with a Run button to test
    
  @navigation
  Scenario: Validate navigation from Tree page to Applications of Binary trees page

    When The user clicks on "Applications of Binary trees" link available in tree home page
    Then The user should be redirected to "Applications of Binary trees" page under tree module
		
  @try_editor
  Scenario: Validate Try here button in Applications of Binary trees page
  
  	When The user clicks on "Applications of Binary trees" link available in tree home page
    And The user clicks on Try here button
    Then The user should be redirected to tryEditor page with a Run button to test
    
  @navigation
  Scenario: Validate navigation from Tree page to Binary Search Trees page

    When The user clicks on "Binary Search Trees" link available in tree home page
    Then The user should be redirected to "Binary Search Trees" page under tree module
		
  @try_editor
  Scenario: Validate Try here button in Binary Search Trees page
  
  	When The user clicks on "Binary Search Trees" link available in tree home page
    And The user clicks on Try here button
    Then The user should be redirected to tryEditor page with a Run button to test
    
  @navigation
  Scenario: Validate navigation from Tree page to Implementation Of BST page

    When The user clicks on "Implementation Of BST" link available in tree home page
    Then The user should be redirected to "Implementation Of BST" page under tree module
		
  @try_editor
  Scenario: Validate Try here button in Implementation Of BST page
  
  	When The user clicks on "Implementation Of BST" link available in tree home page
    And The user clicks on Try here button
    Then The user should be redirected to tryEditor page with a Run button to test
    
  @invalid_input
  Scenario Outline: Validate Try here button with invalid python code in tree module
  
    When The user clicks on "Terminologies" link available in tree home page
    And The user clicks on Try here button
    And The user enters invalid python code from excel sheet "<SheetName>" and row number <RowNumber>
    And The user clicks on Run button
    Then The user should see an alert to signal bad input 

    Examples: 
      | SheetName  | RowNumber 	|
      | Pythoncode |     0 			|
      | Pythoncode |     1 			|
    
  @valid_input
  Scenario Outline: Validate Try here button with valid python code in tree module
  
    When The user clicks on "Terminologies" link available in tree home page
    And The user clicks on Try here button
    And The user enters valid python code from excel sheet "<SheetName>" and row number <RowNumber>
    And The user clicks on Run button
    Then Console should display result 

    Examples: 
      | SheetName  | RowNumber 	|
      | Pythoncode |     0 			|
      | Pythoncode |     1 			| 
      
  @side_panel
  Scenario: Validate side panel options of Tree page
  
  	When The user clicks on "Terminologies" link available in tree home page
  	And The user clicks on "Overview of Trees" link on the side panel of tree page
    Then The user should be redirected to "Overview of Trees" page under tree module
  	When The user clicks on "Terminologies" link on the side panel of tree page
    Then The user should be redirected to "Terminologies" page under tree module
    When The user clicks on "Types of Trees" link on the side panel of tree page
    Then The user should be redirected to "Types of Trees" page under tree module
    When The user clicks on "Tree Traversals" link on the side panel of tree page
    Then The user should be redirected to "Tree Traversals" page under tree module  
    When The user clicks on "Traversals-Illustration" link on the side panel of tree page
    Then The user should be redirected to "Traversals-Illustration" page under tree module
    When The user clicks on "Binary Trees" link on the side panel of tree page
    Then The user should be redirected to "Binary Trees" page under tree module
    When The user clicks on "Types of Binary Trees" link on the side panel of tree page
    Then The user should be redirected to "Types of Binary Trees" page under tree module 
    When The user clicks on "Implementation in Python" link on the side panel of tree page
    Then The user should be redirected to "Implementation in Python" page under tree module
    When The user clicks on "Binary Tree Traversals" link on the side panel of tree page
    Then The user should be redirected to "Binary Tree Traversals" page under tree module
    When The user clicks on "Implementation of Binary Trees" link on the side panel of tree page
    Then The user should be redirected to "Implementation of Binary Trees" page under tree module 
    When The user clicks on "Applications of Binary trees" link on the side panel of tree page
    Then The user should be redirected to "Applications of Binary trees" page under tree module
    When The user clicks on "Binary Search Trees" link on the side panel of tree page
    Then The user should be redirected to "Binary Search Trees" page under tree module
    When The user clicks on "Implementation Of BST" link on the side panel of tree page
    Then The user should be redirected to "Implementation Of BST" page under tree module 
    
  @navigation
 	Scenario: Validate navigation from Tree page to Practice Questions page
  
  	When The user clicks on "Terminologies" link available in tree home page
  	And The user clicks on "Practice Questions" link on the side panel of tree page
    Then The user should be redirected to "Practice Questions" page under tree module
    
  @integration
  Scenario: Validate sign out button from Tree module  
    
  	When The user clicks on Sign out button
    Then The user should be redirected to Home Page with the message "Logged out successfully"   
        
 