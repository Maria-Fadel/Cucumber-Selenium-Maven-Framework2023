Feature: Todo features
  Scenario Outline: Should be able to add a todo
    Given User is in the todos page
    When User add to the list a "<new_todo>"
    Then The "<new_todo>" should be added correctly

    Examples:
      |  new_todo   |
      |     Java    |
      |     Python  |
      | JavaScript  |
      |   HTML      |
