Feature: Test OpenCart application

  Scenario: Test registeration of opencart
    Given Open registeration page of opencart
    When I enter valid data in required fields
      | fname | lname | email         | tele       | pass    | Cpass   |
      | Pooja | naik  | poo@gmail.com | 7899089846 | test123 | test123 |
    When I click on yes radio button
    When I click on check privacy policy
    When I click on continue button
    Then I should be able to register in opencart
