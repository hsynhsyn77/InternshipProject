Feature: Human Positions

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Human Positions Steps

    And Click on the Human Positions in the left Nav
    And Create a Positions "<name>" , "<shortName>"
    When Edit the Positions "<name>" change "<name2>"
    Then User delete "<name>"

    Examples:
      | name   | name2      | shortName |
      | grup20 | grup20edit | grup20oglu      |