Feature:Parameters GradeLevels

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: GradeLevels

    And Click on the GradeLevels in the left Nav
    And Create a GradeLevels "<name>" , "<shortName>" , "<order>"

    Examples:
      | name    | shortName       | order |
      | grup200 | grup20shortName | 4      |