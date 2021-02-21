Feature: Wikipedia

  Background:
    Given User is on Wikipedia home page
    When User types Steve Jobs in the wiki search box and clicks search button

  @title
  Scenario: Wikipedia Search Functionality Title Verification
    Then User sees Steve Jobs is in the wiki title

  @header
  Scenario: Wikipedia Search Functionality Header Verification
    Then User sees Steve Jobs is in the main header

  @image
  Scenario: Wikipedia Search Functionality Image Header Verification
    Then User sees Steve Jobs is in the image header
