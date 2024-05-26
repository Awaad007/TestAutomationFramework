Feature: Register
  @Run
  Scenario: TC-01-Register-User can Register to website
    Given user at register screen
    When user enter frist name
    And user enter last name
    And user enter email address
    And user enter password
    And user confrim password
    And click on rigster button
    Then user should be registered successfully
