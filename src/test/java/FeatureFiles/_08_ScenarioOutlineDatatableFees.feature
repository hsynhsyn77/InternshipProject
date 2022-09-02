#  Daha önceki Create a Fee, delete Fee Senaryosunu
#  Aşağıdaki 5 farklı değerler için çalıştırınız.
Feature: Fee Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Create a Fee, delete Fee
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | fees       |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput     | <ExamName>      |
      | codeInput     | <codeInput>     |
      | priorityInput | <priorityInput> |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog
      | <ExamName> |

    And Success message should be displayed

    Examples:
      | ExamName    | codeInput | priorityInput |
      | huseyinFee24 | 234225     | 4323434        |
      | huseyinFee25 | 234226     | 4323435        |
      | huseyinFee26 | 234227     | 4323436        |
      | huseyinFee27 | 234228     | 4323437        |
      | huseyinFee28 | 234229     | 4323438        |
