@Search_Cars
Feature: Acceptance testing to validate search cars page is working
  in order to validate that
  the search cars page is working fine
  Scenario: Validate search cars page
    Given user on the home page "https://www.carsguide.com.au/"
    When user move to the menu
    And user clicks on "search cars" link
    And user select car brand as "BMW" from




