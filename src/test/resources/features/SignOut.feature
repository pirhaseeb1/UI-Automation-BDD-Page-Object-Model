@portal @website
Feature: As a signed in user I should be able to sign out of My Foxtons account, as per FDP-446, as detailed in FQA-654

  # Scenario 1
  @portal-release-1
  Scenario: When a user clicks on the log out button then they will be asked a confirmation message
    Given User on Foxtons overview Home page After logging In
    When The user clicks on the logout button on top-left of the page
    Then The user should be asked a confirmation message to log out

  # Scenario 2
  @portal-release-1
  Scenario: When a user clicks on the sign out CTA on the logout confirmation message then they should be logged out of My Foxtons
    Given User on Foxtons overview Home page After logging In
    When The user clicks on the logout button on top-left of the page
    When The user clicks on the logout button on logout confirmation pane
    Then The user should be logged out of My Foxtons

  # Scenario 3
  @portal-release-1
  Scenario: When a user clicks on the cancel CTA on the logout confirmation message then they should stay on the page they were at and remain logged in
    Given User on Foxtons overview Home page After logging In
    When The user clicks on the logout button on top-left of the page
    When The user clicks on the cancel button on logout confirmation pane
    Then The user should stay on the page they were at
    Then The user should remain logged in