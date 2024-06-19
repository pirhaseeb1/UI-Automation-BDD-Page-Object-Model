@portal @website
Feature: Verify the verify email page, as per FDP-170 and FDP-335, as detailed in FQA-656 and FQA-658 respectively.

  # Scenario 1
  @portal-release-1
  Scenario: User should be able to navigate to the Verify Account Screen upon successful registration
    Given User access Registration Screen
    When User enters email address
    When User enters password
    When User enters confirm password
    When Users clicks on Sign Up button
    Then User should be navigated to Verify Account Screen

  # Scenario 2 captcha issue
  @portal-release-1
  Scenario: User should be able to see a message to verify the account every time he access My Foxtons
    Given User access Registration Screen
    When User enters email address
    When User enters password
    When User enters confirm password
    When Users clicks on Sign Up button
    When User has been navigated to Verify Account Screen
   # Then User should see a message to verify the account on Verify Account Page

  # Scenario 3 captcha issue
  @portal-release-1
  Scenario: User should receive a message on the Verify Account page that an email has been re-sent when "I haven’t received an email" button is clicked
    Given User access Registration Screen
    When User enters email address
    When User enters password
    When User enters confirm password
    When Users clicks on Sign Up button
    When User has been navigated to Verify Account Screen
    #When User clicks on the "I haven't received an email" button
    #Then User should see a message on the Verify Account page that an email has been re-sent