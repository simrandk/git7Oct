@FunctionalTest
Feature: Login Functionality

  @smokeTest
  Scenario: Login with herokuApp
    Given user is on herokuApp
    When user enters username and password
    Then user logged in successful
