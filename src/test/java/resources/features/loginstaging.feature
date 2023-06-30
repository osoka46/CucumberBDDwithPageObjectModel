Feature: Login Feature - Staging
  In order to perform successful login
  As a User
  I can login with correct username and password
  Background:
    Given user navigates to the facebook homepage
    When user validates the homepage title

  Scenario:user navigates to the facebook homepage as a user on the Staging
    Then user enters "valid" username
    And user enters "invalid" password
    And user validates captcha image
    And user clicks on the signing button

  Scenario:user navigates to the facebook homepage as a user on the Staging
    Then user enters "valid" username
    And user enters "invalid" password
    And user validates captcha image
    And user clicks on the signing button




