Feature: Document Types

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Document Types Steps

    And Click on the Document in the left Nav
    And Create a Document "<name>"
    And Select Stage
    When Edit on the button "<name>" change "<name2>"
    Then User delete "<name2>"


    Examples:
      | name   |name2|
      | grup20 |grup20edit     |