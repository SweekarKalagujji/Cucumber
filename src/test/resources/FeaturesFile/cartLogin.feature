Feature: To test for OpenCart application

  Scenario: Test Login for cart with valid data
    Given Open login page for OpenCart application
    When Enter valid data for required field
      | email           | password |
      | pooja24@gmail.com | test@123  |
    When Click on continue button
    Then it should Login
