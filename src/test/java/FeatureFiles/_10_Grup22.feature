Feature:Parameters BankAccount

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: BankAccount

    And Click on the BankAccount in the left Nav
    And Create a BankAccount "<name>" , "<Iban>" , "<integrationCode>"
    When Edit the BankAccount "<name>" change "<name2>"

    Examples:
      | name    | name2        | Iban                        | integrationCode |
      | grup200 | grup2001edit | TR81 2332 4334 4554 6556 44 | 12346            |