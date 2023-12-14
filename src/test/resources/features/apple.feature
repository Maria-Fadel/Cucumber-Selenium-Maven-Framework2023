Feature: eat apple
  Background:
    Given There are in the basket just {basket}
  Scenario Outline: I want to eat just 3 apples
    When I can eat {eat} right now
    Then The rest of apples will be {rest} apple

    Examples:
      | basket | eat | rest |
      |    7   |  3  |  4   |