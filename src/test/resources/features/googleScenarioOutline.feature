Feature: Data Driven Testing using Scenario Outline

  @google_scenario_outline
  Scenario Outline: Google capital cities search

    Given user is on Google search page
    When user searches for "<country>" capital
    Then user should see "<capital>" in the result
    Examples:
      | country     | capital          |
      | Turkey      | Ankara           |
      | Ukraine     | Kyiv             |
      | Bulgaria    | Sofia            |
      | Afghanistan | Kabul            |
      | USA         | Washington, D.C. |
      | Tajikistan  | Dushanbe         |