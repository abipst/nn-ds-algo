@stack @all
Feature: Validate Stack module

  Background: 
    Given The user is on home page
    And The user goes to sign in page
    And The user enters valid username and password
    And The user clicks on login button
    And The user goes to Stack Page

  @stack_links
  Scenario: Verify all the submodule links in Stack page
    When User landed in Stack Page
    Then User should see all the links in Stack page

  @OperationsInStack_links
  Scenario: Verify all the links in Operations_in_Stack page
    Given User clicks on Operations in Stack submodule link
    Then User should see all the links in Stack page

  @operationsInStack_Submodules
  Scenario: Verify Submodules in Operations in Stack page
    When User is in the Operations in Stack page
    Then User should validate "Submodules" of Stack Page

  @sidePanel
  Scenario: Verify Side Navigation links in Operations in Stack page
    When User is in the Operations in Stack page
    Then User should be able to validate "Side Navigation" links in Stack page

  @stkPracticeQuest_sidenavigation
  Scenario: Verify Practice Question Side Navigation Link in Stack page
    When User Clicks on Practice Question link in Stack page
    Then User should be able validate practice question link in Stack page

  @operationsInStack_try_editor
  Scenario: Validate Try here button in operations In Stack page
    Given User is in the Operations in Stack page
    When The user clicks on Try here button in Stack page
    Then The user should be redirected to tryEditor page of Stack page

  @operationsInStack_invalid_input
  Scenario Outline: Validate Try here button with invalid python code in Stack
    Given User is in the Operations in Stack page
    When The user clicks on Try here button in Stack page
    Then The user should be redirected to tryEditor page of Stack page
    When The user enters invalid python code from excel sheet "<SheetName>" and row number <RowNumber> of Stack module
    And The user clicks on Run button in Stack module
    Then The user should see an alert to signal bad input in Stack module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @operationsInStack_input
  Scenario Outline: Validate Try here button with valid python code in Operation in Stack page
    Given User is in the Operations in Stack page
    When The user clicks on Try here button in Stack page
    Then The user should be redirected to tryEditor page of Stack page
    When The user enters valid python code from excel sheet "<SheetName>" and row number <RowNumber> of Stack module
    And The user clicks on Run button in Stack module
    Then Console should display result in Stack module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @implementation_try_editor
  Scenario: Validate Try here button in Implementation page
    Given User is in the Implementation in Stack page
    When The user clicks on Try here button in Stack page
    Then The user should be redirected to tryEditor page of Stack page

  @implementationInStack_invalid_input
  Scenario Outline: Validate Try here button with invalid python code in Implementation page
    Given User is in the Implementation in Stack page
    When The user clicks on Try here button in Stack page
    Then The user should be redirected to tryEditor page of Stack page
    When The user enters invalid python code from excel sheet "<SheetName>" and row number <RowNumber> of Stack module
    And The user clicks on Run button in Stack module
    Then The user should see an alert to signal bad input in Stack module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @implementationInStack_input
  Scenario Outline: Validate Try here button with valid python code in Implementation page
    Given User is in the Implementation in Stack page
    When The user clicks on Try here button in Stack page
    Then The user should be redirected to tryEditor page of Stack page
    When The user enters valid python code from excel sheet "<SheetName>" and row number <RowNumber> of Stack module
    And The user clicks on Run button in Stack module
    Then Console should display result in Stack module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @applications_try_editor
  Scenario: Validate Try here button in operations In Applications page
    Given User is in the Applications page
    When The user clicks on Try here button in Stack page
    Then The user should be redirected to tryEditor page of Stack page

  @applications_invalid_input
  Scenario Outline: Validate Try here button with invalid python code in Applications page
    Given User is in the Applications page
    When The user clicks on Try here button in Stack page
    Then The user should be redirected to tryEditor page of Stack page
    When The user enters invalid python code from excel sheet "<SheetName>" and row number <RowNumber> of Stack module
    And The user clicks on Run button in Stack module
    Then The user should see an alert to signal bad input in Stack module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @applications_input
  Scenario Outline: Validate Try here button with valid python code in Applications page
    Given User is in the Applications page
    When The user clicks on Try here button in Stack page
    Then The user should be redirected to tryEditor page of Stack page
    When The user enters valid python code from excel sheet "<SheetName>" and row number <RowNumber> of Stack module
    And The user clicks on Run button in Stack module
    Then Console should display result in Stack module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @stack_signOut
  Scenario: Validate sign out button from Stack module
    When The user clicks on Sign out button
    Then The user should be redirected to Home Page with the message "Logged out successfully"
