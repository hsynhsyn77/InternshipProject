Feature: Subject Categories

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Subject Categories

    And Click on the Subject in the left Nav
    And Create a Subject "<name>" , "<code>"
    When Edit the Subject "<name>" change "<name2>"
    Then User delete "<name>"

    Examples:
      | name   | name2      | code |
      | grup20 | grup20edit | 1234 |