Feature:Parameters Nationalities

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Nationalities

    And Click on the Nationalities in the left Nav
    And Create a Nationalities "<name>"
    When Edit the Nationalities "<name>" change "<name2>"
    Then User delete "<name2>"
    Examples:
      | name   | name2      |
      | grup20 | GrupEdit20 |

                # tamamlandı çalışıyor
