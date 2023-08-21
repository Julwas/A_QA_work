Feature: Параметризированные тесты
  Scenario: Параметризация степов
    Given is Browser Open
    * is Login PageOpen
    When user "atrostyanko@gmail.com" password "Qwertyu_1" loged in
    Then title is "All Projects"
    And  project id is 123456