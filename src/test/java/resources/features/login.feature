Feature: Login Feature
  In order to perform successful login
  As a User
  I can login with correct username and password

  Scenario Outline:user navigates to the facebook homepage as a user
    Given user navigates to the facebook homepage
    When user validates the homepage title
    Then user enters "<username>" username
    And user enters "<password>" password
    And user clicks on the signing button
    Examples:
      | username | password |
      | valid    | valid    |
      | valid    | invalid  |
      | invalid  | valid    |
      | invalid  | invalid  |




