
Feature: Etsy page titles

  Background:
    Given user is on the etsy homepage

  Scenario: Etsy title verification
    Then user sees the expected title "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone"

  @Etsy
  Scenario: Etsy search functionality title verification
    When User types "Wooden Spoon" in the search box
    And User clicks search button
    Then User sees "Wooden spoon" is in the title