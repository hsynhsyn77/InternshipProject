Feature: Human Resource Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Human Resource
    And Click on the element in the left Nav
    And Create on the name as "<name>"
    And User delete "<name>"

    Examples:
      | name    |
      | group20 |



