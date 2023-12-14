Feature: Todo features
  Scenario: Should be able to add a todo
    Given User is in the todos page
    When User add a new todo
    Then Todo should be added correctly