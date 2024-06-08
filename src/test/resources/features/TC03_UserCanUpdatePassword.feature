@Run
Feature: changePassword
  Background:
    Given user at home screen and click on login button
    When user enters "mohamed002@yahoo.com" address
    And user enters "123456"
    And user click on login button
    Then user should be logged in successfully
  Scenario: User Can Change Password
    Given user at home screen and click on my account button
    When user tap on change password button
    And user enter old password
    And user enter new password
    And user confirm new password
    And user click on change password button
    Then password should be changed successfully

