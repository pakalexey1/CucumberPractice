Feature: Passing multiple parameters to the step
@dataTable
  Scenario: User searches for multiple items
    Given user is on Google search page
    Then user should be able to search for the following:
    |java|
    |selenium|
    |cucumber|
    |QA automation|
    |wooden spoon |