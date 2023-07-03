@Search_Cars
Feature: Acceptance testing to validate search cars page is working
  in order to validate that
  the search cars page is working fine
  Scenario: Validate search cars page
    Given user on the home page "https://www.carsguide.com.au/"
    When move to the menu
    And clicks on "search cars" link
    And select car brand as "BMW" from select car dropdown
    And select car model as "1 SERIES" from model
    And select location as "Australia" from location
    Then clicks update
    And the page title should contain "Bmw 1 Series for sale South east"





