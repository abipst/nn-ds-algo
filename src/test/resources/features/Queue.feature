@queue @all
Feature: Validate Queue module

  Background: 
    Given The user is on home page
    And The user goes to sign in page
    And The user enters valid username and password
    And The user clicks on login button
    And The user goes to Queue Page

  @queue_links @submodules
  Scenario: Verify all the submodule links in queue page
    Given User landed in Queue Page
    When User should see all the links in Queue page
    Then User should validate "Links" of submodules Queue Page
    And User should validate "Submodules" Pages

  @implementationOfQueueinPythonLinks
  Scenario: Verify all the links in Implementation of Queue in Python page
    Given User clicks on Implementation of Queue in Python submodule link
    Then User should see all the links in Queue page

  @sidePanel
  Scenario: Verify Side Navigation links in Implementation of Queue in Python page
    When User clicks on Implementation of Queue in Python submodule link
    Then User should validate "Side Navigation" of submodules Queue Page

  @stkPracticeQuest_sidenavigation
  Scenario: Verify Practice Question Side Navigation Link in Queue page
    When User Clicks on Practice Question link in Queue page
    Then User should be able to validate practice question link

  @implementationOfQueueinPython_try_editor
  Scenario: Validate Try here button in operations In Queue page
    Given User is in the Implementation Of Queue in Python page
    When The user clicks on Try here button in Queue page
    Then The user should be redirected to tryEditor page of Queue page

  @implementationOfQueueinPython_invalid_input
  Scenario Outline: Validate Try here button with invalid python code in Queue
    Given User is in the Implementation Of Queue in Python page
    When The user clicks on Try here button in Queue page
    Then The user should be redirected to tryEditor page of Queue page
    When The user enters invalid python code from excel sheet "<SheetName>" and row number <RowNumber> of Queue module
    And The user clicks on Run button in Queue module
    Then The user should see an alert to signal bad input in Queue module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @implementationOfQueueinPython_input
  Scenario Outline: Validate Try here button with valid python code in Operation in Queue page
    Given User is in the Implementation Of Queue in Python page
    When The user clicks on Try here button in Queue page
    Then The user should be redirected to tryEditor page of Queue page
    When The user enters valid python code from excel sheet "<SheetName>" and row number <RowNumber> of Queue module
    And The user clicks on Run button in Queue module
    Then Console should display result in Queue module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @implementationUsingCollections_try_editor
  Scenario: Validate Try here button in Implementation using collections.deque page
    Given User is in the Implementation using collections.deque page
    When The user clicks on Try here button in Queue page
    Then The user should be redirected to tryEditor page of Queue page

  @implementationUsingCollections_invalid_input
  Scenario Outline: Validate Try here button with invalid python code in Implementation using collections.deque page
    Given User is in the Implementation using collections.deque page
    When The user clicks on Try here button in Queue page
    Then The user should be redirected to tryEditor page of Queue page
    When The user enters invalid python code from excel sheet "<SheetName>" and row number <RowNumber> of Queue module
    And The user clicks on Run button in Queue module
    Then The user should see an alert to signal bad input in Queue module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @implementationUsingCollections_input
  Scenario Outline: Validate Try here button with valid python code in Implementation using collections.deque page
    Given User is in the Implementation using collections.deque page
    When The user clicks on Try here button in Queue page
    Then The user should be redirected to tryEditor page of Queue page
    When The user enters valid python code from excel sheet "<SheetName>" and row number <RowNumber> of Queue module
    And The user clicks on Run button in Queue module
    Then Console should display result in Queue module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @implementationUsingArray_try_editor
  Scenario: Validate Try here button in Implementation using array page
    Given User is in the Implementation using array page
    When The user clicks on Try here button in Queue page
    Then The user should be redirected to tryEditor page of Queue page

  @ImplementationUsingArray_invalid_input
  Scenario Outline: Validate Try here button with invalid python code in Implementation using array page
    Given User is in the Implementation using array page
    When The user clicks on Try here button in Queue page
    Then The user should be redirected to tryEditor page of Queue page
    When The user enters invalid python code from excel sheet "<SheetName>" and row number <RowNumber> of Queue module
    And The user clicks on Run button in Queue module
    Then The user should see an alert to signal bad input in Queue module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @ImplementationUsingArray_input
  Scenario Outline: Validate Try here button with valid python code in Implementation using array page
    Given User is in the Implementation using array page
    When The user clicks on Try here button in Queue page
    Then The user should be redirected to tryEditor page of Queue page
    When The user enters valid python code from excel sheet "<SheetName>" and row number <RowNumber> of Queue module
    And The user clicks on Run button in Queue module
    Then Console should display result in Queue module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @queueOperations_try_editor
  Scenario: Validate Try here button in Queue Operations page
    Given User is in the Queue Operations page
    When The user clicks on Try here button in Queue page
    Then The user should be redirected to tryEditor page of Queue page

  @queueOperations_invalid_input
  Scenario Outline: Validate Try here button with invalid python code in Queue Operations page
    Given User is in the Queue Operations page
    When The user clicks on Try here button in Queue page
    Then The user should be redirected to tryEditor page of Queue page
    When The user enters invalid python code from excel sheet "<SheetName>" and row number <RowNumber> of Queue module
    And The user clicks on Run button in Queue module
    Then The user should see an alert to signal bad input in Queue module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @queueOperations_input
  Scenario Outline: Validate Try here button with valid python code in Queue Operations page
    Given User is in the Queue Operations page
    When The user clicks on Try here button in Queue page
    Then The user should be redirected to tryEditor page of Queue page
    When The user enters valid python code from excel sheet "<SheetName>" and row number <RowNumber> of Queue module
    And The user clicks on Run button in Queue module
    Then Console should display result in Queue module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @queue_signOut
  Scenario: Validate sign out button from Queue module
    When The user clicks on Sign out button
    Then The user should be redirected to Home Page with the message "Logged out successfully"
