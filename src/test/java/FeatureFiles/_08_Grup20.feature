Feature:School Categories

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: School Categories

    And Click on the School in the left Nav
    And Create a School "<name>" , "<shortName>" , "<capacity>"
    When Edit the School "<name>" change "<name2>"
    Then User Just Delete "<name2>"

    Examples:
      | name   | name2      | shortName | capacity |
      | grup20 | grup20edit | grup20ler | 4        |