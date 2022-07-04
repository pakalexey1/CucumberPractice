Feature: User should be able to login with correct credentials

  Background:
    Given user is on the web table login page

  @webAppLogin
  Scenario:
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks login button
    Then user should see url contains orders


  Scenario: positive login scenario
    When user enters username "Test", password "Tester" and login
    Then user should see url contains orders


  Scenario: map data table practice
    When user enters below credentials
      | username | Test |
      | password | Tester |




# TC #: Login scenario
# 1- Open a chrome browser
# 2- Go to: https://web-table-2.cydeo.com/login
# 3- Enter username: Test
# 4- Enter password: Tester
# 5- Verify URL:
# Expected: URL should end with “orders”
#
# Note: Follow POM
# Try different ways of implementing this step: