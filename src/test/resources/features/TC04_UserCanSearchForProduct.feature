@Run
  Feature: search for product
    Background:
      Given user at home screen and click on login button
      When user enters "mohamed002@yahoo.com" address
      And user enters "654321"
      And user click on login button
      Then user should be logged in successfully
    Scenario: user can search for product
      Given user at the home screen and enter product name in search bar
      #When user select first item in the search list
      And user click on search button
      And user click on product title
      Then user should be directed to product screen successfully
