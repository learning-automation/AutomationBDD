Feature: Login to application

  Background:
     * read data for application

  @smoke
  @regression
  @testingwitData
  Scenario: login to application failure
    * read data for testcase "tc001.properties"
    Given user navigate to application
    When user enter the username "username"
    And user enter the password "password"
    And user clicks on login button
    Then user should be able to see error message as "errorMsg"