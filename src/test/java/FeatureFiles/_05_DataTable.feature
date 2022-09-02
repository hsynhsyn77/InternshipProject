Feature: Datatable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Create Country
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | Countries  |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | huseyinCountry2 |
      | codeInput | 223311          |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog
      | huseyinCountry2 |
    And Success message should be displayed


  Scenario: Create a Nationality
    And Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | nationalities |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | huseyinNat2 |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog
      | huseyinNat2 |

    And Success message should be displayed


  Scenario: Create a Fee, delete Fee
    And Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | fees |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | huseyinFee2 |
      | codeInput | 23422 |
      | priorityInput | 432343 |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

  And User delete item from Dialog
     | huseyinFee |

    And Success message should be displayed







