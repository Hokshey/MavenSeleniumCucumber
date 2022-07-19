@smoke
Feature: RestPassword
  Scenario: SC3- User could reset his/her password successfully
    Given user navigate to log in page again
    When user click forget password button
    And user enter valid email

