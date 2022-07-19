@smoke
Feature: Registration
  Scenario:SC1- User could register with valid data
    Given user navigate to home page and click register Tab
    When user enter valid data to Your Personal Details section
    And user enter valid data to Company Details section
    And user enter valid data to Your Password section
    And user click register button
    Then Registration done successfully