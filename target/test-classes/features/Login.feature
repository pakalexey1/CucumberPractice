@Regression
Feature: Library app login feature
  User Story: As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

  Accounts are: librarian, student, admin

#  Similar to TestNG @BeforeMethod. Background is running before each scenario
  Background: For each scenario user is on the libabry login page
    Given user is on the library login page

  @Librarian @employee @smoke
  Scenario: Login as a librarian
#    Given user is on the library login page
    When user enters librarian's username
    And user enters librarian's password
    Then user should see dashboard

    @Student @smoke
    Scenario: Login as a student
#      Given user is on the library login page
      When user enters student's username
      And user enters student's password
      Then user should see dashboard

      @Admin @smoke
      Scenario: Login as an admin
#        Given user is on the library login page
        When user enters admin's username
        And user enters admin's password
        Then user should see dashboard