@portal @website
Feature: Verify Login Screen, as per FDP-2, as detailed in FQA-34

  @portal-release-1
  Scenario: User should be able to login with valid credentials
    Given User access Sign In Screen
    When User enters valid email address
    When User enters valid password
    When Users clicks on Sign In button
    Then User should be navigated to User Profile screen

# this case is failing because of a bug in functionality
  @portal-release-1
  Scenario: User should be prompted with validation when tries incorrect credentials
    Given User access Sign In Screen
    When User enters invalid email address
    When User enters invalid password
    When Users clicks on Sign In button
    Then Incorrect credentials validation should be displayed
