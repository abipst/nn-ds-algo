@linkedlist @all
Feature: Verify Linked List module

  Background: User landed in Linked List Page
    Given The user is on home page
    And The user goes to sign in page
    And The user enters valid username and password
    And The user clicks on login button
    And The user goes to LinkedList Page

  @linkedList_submodule_links
  Scenario: Verify all the submodule links in Linked List page
    When User clicks on Introduction submodule link
    Then User validating all the submodules links in "LinkedList" page

  @linkedList_links
  Scenario: Verify all the links in Linked List page
    When User clicks on Introduction submodule link
    Then User should see all the links in linkedlist page

  @side_navigation
  Scenario: Verify Side Navigation links in Introduction page
    When User is in the Introduction of Linked list page
    Then User should be able to validate "Side Navigation" links in LinkedList page
    
   @practicequest_sidenavigation
   Scenario: Verify Practice Question Side Navigation Link in LinkedList page
   When User Clicks on Practice Question link 
   Then User should be able validate practice question page

  @linkedList_try_editor
  Scenario: Validate Try here button in Linked list page
    Given User is in the Introduction of Linked list page
    When The user clicks on Try here button in Linked list page
    Then The user should be redirected to tryEditor page of Linked list page

  @linkedList_invalid_input
  Scenario Outline: Validate Try here button with invalid python code in Linked list
    Given User is in the Introduction of Linked list page
    When The user clicks on Try here button in Linked list page
    Then The user should be redirected to tryEditor page of Linked list page
    When The user enters invalid python code from excel sheet "<SheetName>" and row number <RowNumber> of Linkedlist module
    And The user clicks on Run button in LinkedList module
    Then The user should see an alert to signal bad input in Linkedlist module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @linkedList_valid_input
  Scenario Outline: Validate Try here button with valid python code in Linked list page
    Given User is in the Introduction of Linked list page
    When The user clicks on Try here button in Linked list page
    Then The user should be redirected to tryEditor page of Linked list page
    When The user enters valid python code from excel sheet "<SheetName>" and row number <RowNumber> of Linkedlist module
    And The user clicks on Run button in LinkedList module
    Then Console should display result in LinkedList module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @creatingLinkedLIst_try_editor
  Scenario: Validate Try here button in Linked list page
    Given User is in the Creating Linked list page
    When The user clicks on Try here button in Linked list page
    Then The user should be redirected to tryEditor page of Linked list page

  @creatingLinkedLIst_invalid_input
  Scenario Outline: Validate Try here button with invalid python code in Linked list
    Given User is in the Creating Linked list page
    When The user clicks on Try here button in Linked list page
    Then The user should be redirected to tryEditor page of Linked list page
    When The user enters invalid python code from excel sheet "<SheetName>" and row number <RowNumber> of Linkedlist module
    And The user clicks on Run button in LinkedList module
    Then The user should see an alert to signal bad input in Linkedlist module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @creatingLinkedLIst_valid_input
  Scenario Outline: Validate Try here button with valid python code in Linked list page
    Given User is in the Creating Linked list page
    When The user clicks on Try here button in Linked list page
    Then The user should be redirected to tryEditor page of Linked list page
    When The user enters valid python code from excel sheet "<SheetName>" and row number <RowNumber> of Linkedlist module
    And The user clicks on Run button in LinkedList module
    Then Console should display result in LinkedList module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @typesOfLinkedList_try_editor
  Scenario: Validate Try here button in Linked list page
    Given User is in the Types of Linked list page
    When The user clicks on Try here button in Linked list page
    Then The user should be redirected to tryEditor page of Linked list page

  @typesOfLinkedList_invalid_input
  Scenario Outline: Validate Try here button with invalid python code in Linked list
    Given User is in the Types of Linked list page
    When The user clicks on Try here button in Linked list page
    Then The user should be redirected to tryEditor page of Linked list page
    When The user enters invalid python code from excel sheet "<SheetName>" and row number <RowNumber> of Linkedlist module
    And The user clicks on Run button in LinkedList module
    Then The user should see an alert to signal bad input in Linkedlist module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @typesOfLinkedList_valid_input
  Scenario Outline: Validate Try here button with valid python code in Linked list page
    Given User is in the Types of Linked list page
    When The user clicks on Try here button in Linked list page
    Then The user should be redirected to tryEditor page of Linked list page
    When The user enters valid python code from excel sheet "<SheetName>" and row number <RowNumber> of Linkedlist module
    And The user clicks on Run button in LinkedList module
    Then Console should display result in LinkedList module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @implement_Linked_List_in_Python_try_editor
  Scenario: Validate Try here button in Linked list page
    Given User is in the Implement Linked List in Python page
    When The user clicks on Try here button in Linked list page
    Then The user should be redirected to tryEditor page of Linked list page

  @implement_Linked_List_in_Python_invalid_input
  Scenario Outline: Validate Try here button with invalid python code in Linked list
    Given User is in the Implement Linked List in Python page
    When The user clicks on Try here button in Linked list page
    Then The user should be redirected to tryEditor page of Linked list page
    When The user enters invalid python code from excel sheet "<SheetName>" and row number <RowNumber> of Linkedlist module
    And The user clicks on Run button in LinkedList module
    Then The user should see an alert to signal bad input in Linkedlist module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @implement_Linked_List_in_Python_valid_input
  Scenario Outline: Validate Try here button with valid python code in Linked list page
    Given User is in the Implement Linked List in Python page
    When The user clicks on Try here button in Linked list page
    Then The user should be redirected to tryEditor page of Linked list page
    When The user enters valid python code from excel sheet "<SheetName>" and row number <RowNumber> of Linkedlist module
    And The user clicks on Run button in LinkedList module
    Then Console should display result in LinkedList module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @traversal_try_editor
  Scenario: Validate Try here button in Linked list page
    Given User is in the Traversal page
    When The user clicks on Try here button in Linked list page
    Then The user should be redirected to tryEditor page of Linked list page

  @traversal_invalid_input
  Scenario Outline: Validate Try here button with invalid python code in Linked list
    Given User is in the Traversal page
    When The user clicks on Try here button in Linked list page
    Then The user should be redirected to tryEditor page of Linked list page
    When The user enters invalid python code from excel sheet "<SheetName>" and row number <RowNumber> of Linkedlist module
    And The user clicks on Run button in LinkedList module
    Then The user should see an alert to signal bad input in Linkedlist module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @traversal_valid_input
  Scenario Outline: Validate Try here button with valid python code in Linked list page
    Given User is in the Traversal page
    When The user clicks on Try here button in Linked list page
    Then The user should be redirected to tryEditor page of Linked list page
    When The user enters valid python code from excel sheet "<SheetName>" and row number <RowNumber> of Linkedlist module
    And The user clicks on Run button in LinkedList module
    Then Console should display result in LinkedList module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @insertion_try_editor
  Scenario: Validate Try here button in Linked list page
    Given User is in the Insertion page
    When The user clicks on Try here button in Linked list page
    Then The user should be redirected to tryEditor page of Linked list page

  @insertion_invalid_input
  Scenario Outline: Validate Try here button with invalid python code in Linked list
    Given User is in the Insertion page
    When The user clicks on Try here button in Linked list page
    Then The user should be redirected to tryEditor page of Linked list page
    When The user enters invalid python code from excel sheet "<SheetName>" and row number <RowNumber> of Linkedlist module
    And The user clicks on Run button in LinkedList module
    Then The user should see an alert to signal bad input in Linkedlist module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @insertion_valid_input
  Scenario Outline: Validate Try here button with valid python code in Linked list page
    Given User is in the Insertion page
    When The user clicks on Try here button in Linked list page
    Then The user should be redirected to tryEditor page of Linked list page
    When The user enters valid python code from excel sheet "<SheetName>" and row number <RowNumber> of Linkedlist module
    And The user clicks on Run button in LinkedList module
    Then Console should display result in LinkedList module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @deletion_try_editor
  Scenario: Validate Try here button in Linked list page
    Given User is in the Deletion page
    When The user clicks on Try here button in Linked list page
    Then The user should be redirected to tryEditor page of Linked list page

  @deletion_invalid_input
  Scenario Outline: Validate Try here button with invalid python code in Linked list
    Given User is in the Deletion page
    When The user clicks on Try here button in Linked list page
    Then The user should be redirected to tryEditor page of Linked list page
    When The user enters invalid python code from excel sheet "<SheetName>" and row number <RowNumber> of Linkedlist module
    And The user clicks on Run button in LinkedList module
    Then The user should see an alert to signal bad input in Linkedlist module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |

  @deletion_valid_input
  Scenario Outline: Validate Try here button with valid python code in Linked list page
    Given User is in the Deletion page
    When The user clicks on Try here button in Linked list page
    Then The user should be redirected to tryEditor page of Linked list page
    When The user enters valid python code from excel sheet "<SheetName>" and row number <RowNumber> of Linkedlist module
    And The user clicks on Run button in LinkedList module
    Then Console should display result in LinkedList module

    Examples: 
      | SheetName  | RowNumber |
      | Pythoncode |         0 |
      | Pythoncode |         1 |
