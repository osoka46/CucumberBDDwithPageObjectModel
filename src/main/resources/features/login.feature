Feature: Login Feature
  In order to perform successful login
  As a User
  I can login with correct username and password

  Scenario:
    Given user navigates to the facebook homepage
    When user validates the homepage title
    Then user enters username
    And user enters password
    And user clicks on the signing button

