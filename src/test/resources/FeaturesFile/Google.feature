Feature: Test for Google Application

  Background: 
    Given Google application must be open

  Scenario: Test for Google Page title
    # Given Google application must be open
    When I capture the current page tite
    Then it should match with Google

  Scenario: Test for valid data search
    # Given Google application must be open
    When I type valid keyword in search box
    Then it Google aplication should display valid result
