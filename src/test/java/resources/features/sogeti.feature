@HomePage
Feature: Acceptance testing to validate home page is working
  in order to validate that
  the search home page is working fine
  Scenario: Validate home page
    Given user on the home page sogeti "https:www.sogeti.de"
    Then user gets text
    And user validates text contains "unsere angebot"





