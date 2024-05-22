
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Validate navigation to home page
  
  	When The user clicks on get started button
  	Then The user should be redirected to 
  
    Given The user is already on Home Page
    And The user is not signed in
    Then The user should see NumpyNinja icon
    And The user should see Data structures dropdown with 6 options
    And The user should see Register and Sign in buttons
    


