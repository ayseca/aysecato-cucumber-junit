Feature: Google search functionality



  Scenario: User search title verification
    Given User is on Google home page
    When User searches for apple
    Then User should see apple in the title