Feature: new test for cucumber

 Scenario: a simple test without a body

   Scenario: a simple test with Given
     Given start browser

Scenario: a simple test with Given and When
     Given start browser
     When the login page is open

  Scenario: a simple test with Given and When and Then
    Given start browser
    When the login page is open
    Then is username file visible

Scenario: a simple test with Given and When and Then AND
    Given start browser
    And password field is displayed
    When the login page is open
    Then is username file visible

  Scenario: a simple test with  But
    Given start browser
    And password field is displayed
    Then is username file visible
    But is password field not displayed

