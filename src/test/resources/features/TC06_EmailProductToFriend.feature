@Run
Feature: email a friend
  Background:
    Given user at home screen and click on login button
    When user enters "mohamed001@yahoo.com" address
    And user enters "123456"
    And user click on login button
    Then user should be logged in successfully
    Given user at the home screen and enter product name in search bar
    And user click on search button
    And user click on product title
    Then user should be directed to product screen successfully
  Scenario: user sent a email to recommend a product
    Given user at the product screen and click on email a friend button
    When user enter friend email
    And user enter personal message
    And user click on send message button
    Then friend should receive message successfully
