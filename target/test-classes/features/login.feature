Feature:  Validation login functionality

  Scenario: Success Login
    Given open login page
    When user enter username atrostyanko@gmail.com and password Qwertyu_1
    * user clicks login button
    Then dashboard page is displayed

  Scenario: Incorrect Login (invalid username)
    Given open login page
    When user enter username atrostyanko1@gmail.com and password Qwertyu_1
    * user clicks login button
    Then error Email/Login or Password is incorrect. Please try again. is displayed

  Scenario: Incorrect Login (invalid password)
    Given open login page
    When user enter username atrostyanko@gmail.com and password Qwertyu_2
    * user clicks login button
    Then error Email/Login or Password is incorrect. Please try again. is displayed
