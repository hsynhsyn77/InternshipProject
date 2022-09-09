Feature: Fields

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Fields Steps

    And Click on the Fields in the left Nav
    And Create a field "<name>","<code>"
    And Select the field type
    When Edit the fields "<name>" change "<name2>"
    Then User delete "<name>"

    Examples:
      | name   | name2      | code |
      | grup20 | grup20edit | 34343|