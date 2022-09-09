Feature: Human Resource Attestations
  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Human Resource Attestations
    And Click on the Attestations in the left Nav
    And Create on the Attestations name as "<name>"
    And Edit on the button "<name>" change "<name2>"
    And User delete on the Attestations "<name2>"

    Examples:
      | name    | name2 |
      | group23 | mebo |