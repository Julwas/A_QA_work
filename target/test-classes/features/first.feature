Feature: E2ETest

  Scenario: Succesful Login
    Given start browser
    * open login page
    When user enter username standard_user and psw secret_sauce
    * user click login button
    Then products page is open

Scenario: Shoping
  Given user add product to cart button
  * open shopping Cart
  * user click checkout Button
  When user enter firstName Julia and lastName Wasilewska and zipCode 123
  * user click continueButton
  * user click finish Checkout Button
  Then user click backHomeButton

