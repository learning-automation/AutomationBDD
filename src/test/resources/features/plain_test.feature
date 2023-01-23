Feature: Login to application

  @smoke
  Scenario: login to application failure
    Given user navigate to application
    When user enter the username "admin"
    And user enter the password "admin"
    And user clicks on login button
    Then user should be able to see error message as "An internal error has occurred and has been logged."