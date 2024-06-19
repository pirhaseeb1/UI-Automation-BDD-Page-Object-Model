@portal @website
Feature: Verify Registration Screen, as per FDP-50, as detailed in FQA-38.

  #Scenario 1
  @portal-release-1
  Scenario: User should be able to register with valid credentials
    Given User access Registration Screen
    When User enters email address
    When User enters password
    When User enters confirm password
    When Users clicks on Sign Up button
    Then User should be navigated to Verify Account Screen New

  #Scenario 2
  @portal-release-1
  Scenario: Both Password fields should be matched
    Given User access Registration Screen
    When User enters email address
    When User enters password
    When User enters different confirm password
    When Users clicks on Sign Up button
    Then Password doesn't match validation should be displayed

  #Scenario 3 facing captcha issue in this scenario
  @portal-release-1
  Scenario: One email id should be associated with only one account
    Given User access Registration Screen
    When User enters already existed email address
    When User enters password
    When User enters confirm password
    When Users clicks on Sign Up button
    Then User already exists validation should be displayed

  #Scenario 4
  @portal-release-1
  Scenario: The registration form should tell the user while creating a password that the new password must meet the conditions of at least 8 characters, 1 upper case letter, 1 lower case letter, 1 number and 1 special character.
    Given User access Registration Screen
    When User enters email address
    When User enters password that does not meet the required conditions
    Then The user should be able to see if the required conditions for a valid password are met as they type the new password

  #Scenario 5
  @portal-release-1
  Scenario: There should be a confirm password box on the registration form
    Given User access Registration Screen
    Then User should be able to see a confirm password box on the Registration page

  #Scenario 6
  @portal-release-1
  Scenario: User should be able to click on the cookies link under the register button
    Given User access Registration Screen
    When User clicks on the cookies link under the register button
    Then User should be taken to the appropriate page from the Registration page

  #Scenario 7
  @portal-release-1
  Scenario: User should be able to click on the privacy policy link under the register button
    Given User access Registration Screen
    When User clicks on the privacy policy link under the register button
    Then User should be taken to the appropriate page from the Registration page