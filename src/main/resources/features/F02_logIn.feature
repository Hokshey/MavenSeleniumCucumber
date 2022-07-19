@smoke
Feature: Login
  Scenario:SC2- User could log in with valid email and password
    Given user navigate to log in page
    When user enter valid email and password and submit
    Then user log in successfully

    # Login with invalid
  Scenario:SC2- User could log in with invalid email and password
    Given user navigate to log in page
    When user enter invalid email and password and submit
    Then user log in unsuccessfully