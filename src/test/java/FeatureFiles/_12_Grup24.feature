Feature:Parameters Discounts

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: GradeLevels

    And Click on the Discounts in the left Nav
    And Create a Discounts "<description>" , "<code>" , "<priority>"
    Then User delete "<description>"


    Examples:
      | description | code            | priority |
      | grup200     | grup20shortName | 4        |

            # tamamlandı çalışıyor