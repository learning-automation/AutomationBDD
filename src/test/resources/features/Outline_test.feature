Feature: Login to application

   @outline
  Scenario Outline: login to application failure
    Given user navigate to application
    When user enter the username "<users>"
    And user enter the password "<passwords>"
    And user clicks on login button
    Then user should be able to see error message as "An internal error has occurred and has been logged."

    Examples:
      | users  | passwords |
      | admin  | admin     |
      | pankaj | test      |
