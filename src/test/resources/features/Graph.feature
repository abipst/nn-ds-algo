@graph @all
Feature: Graph feature

  Background: 
    Given The user is on home page
    And The user goes to sign in page
    And The user enters valid username and password
    And The user clicks on login button
    And The user clicks on Graph get started link and navigated to graph page1

  @graph_link
  Scenario: Graph link validation
    When The User clicks on the Graph hyperlink which is available on the Graph page1 side panel
    Then The user should able to navigate into another Graph page from current Graph page
    And The user should able to capture the Graph page2 attribute

  @graph_invalidcode
  Scenario Outline: Validate Graph Try here button with invalid python code
    Given user is navigated from graph page1 to the Graph page2
    When The user click on Grpah page2 Try here navigation button
    Then The user should able to navigate into Try Editor text box field
    When The user enters invalid python code from excel sheet "<SheetName>" and row number <RowNumber> into the text box
    And The user clicks the Run button
    Then The user should see an alert

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @graph_Tryvalidation
  Scenario Outline: Validate Grpah page Try here link and Try Editor text box field with valid python code
    Given user is navigated from graph page1 to the Graph page2
    When The user click on Grpah page2 Try here navigation button
    Then The user should able to navigate into Try Editor text box field
    When The user enters valid python code from excel sheet "<SheetName>" and row number <RowNumber> into the text box
    And The user clicks the Run button
    Then The user should able to get the output on the console

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @graph_Repre_link
  Scenario: Graph Representations link validation
    When The user clicks on Graph Representations link which is available on the Graph page1 side panel
    Then The user should able to navigate into Graph Representations page
    And The user should able to capture Graph Representations page attribute

  @graph_Repre_invalidcode
  Scenario Outline: Validate Graph Representations Try here button with invalid python code
    Given user is on graph representation page
    When The user clicks on Try here button
    Then The user should able to navigate into Try Editor text box field
    When The user enters invalid python code from excel sheet "<SheetName>" and row number <RowNumber> into the text box
    And The user clicks the Run button
    Then The user should see an alert

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @graph_Repre_Tryvalidcode
  Scenario Outline: Graph Representations Try here link and Try Editor text box field validation with valid python code
    Given user is on graph representation page
    When The user clicks on Try here button
    Then The user should able to navigate into Try Editor text box field
    When The user enters valid python code from excel sheet "<SheetName>" and row number <RowNumber> into the text box
    And The user clicks the Run button
    Then The user should able to get the output on the console

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @graph_practice
  Scenario: Graph module practice question link validation
    Given user is on graph representation page
    When The user clicks on practice questions "practice questions" link
    Then The user should able to navigate into practice questions "practice questions" page

  @integration
  Scenario: Validate sign out button from Data Graph module
    When The user clicks on Sign out button
    Then The user should be redirected to Home Page with the message "Logged out successfully"
