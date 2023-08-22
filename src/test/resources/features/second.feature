Feature: Parametrized tests

  Scenario: Parametrization of steps
    Given is Browser Open
    * is Login PageOpen
    When user "atrostyanko@gmail.com" password "Qwertyu_1" loged in
    Then title is "All Projects"
    And  project id is 123456

Scenario: Parametrization of steps RegExp
    Given is Browser Open
    * is Login PageOpen
    When admin atrostyanko@gmail.com password "Qwertyu_1" loged in
    Then title is "All Projects"
    And  project id is 123456
  And all elements "are" visible

  Scenario Outline: Parameterisation with value tables
    Given is Browser Open
    * is Login PageOpen
    When admin <username> password "<password>" loged in
    Then project id is <prId>
    Examples:
      | username               | password  | prId   |
      | atrostyanko@gmail.com  | Qwertyu_1 | 123456 |
      | atrostyanko1@gmail.com | Qwertyu_2 | 12     |

