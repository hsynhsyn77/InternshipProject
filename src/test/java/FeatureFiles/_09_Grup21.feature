Feature:School Departments

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: School Departments

    And Click on the Departments in the left Nav
    And Create a Departments "<name>" , "<code3>"
    When Edit the Departments "<name>" change "<name2>"

    Examples:
      | name   | name2      | code3 |
      | grup200 | grup200edit | 20 |