Feature: Google Search Functionality Title Verification
  User story: As a user, when I am on the Google search page I should be able search whatever I want and see relevant information

  @wip
  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types apple in the google search box and clicks enter
    Then user sees - Google Search is in the google title