Feature: Etsy

  Background:
    Given User is on Etsy home page

  Scenario: Etsy Title Verification
    Then User sees title is as expected
      #Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

  @withoutParam
  Scenario: Etsy Search Functionality Title Verification (without parameterization)
    When User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title

  @withParam
  Scenario: Etsy Search Functionality Title Verification (with parameterization)
    When User types "Wooden Spoon" in the search box
    And User clicks search button
    Then User sees "Wooden Spoon" is in the title