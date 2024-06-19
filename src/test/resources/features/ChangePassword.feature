@portal
Feature: Verify the change password feature on the profile page for a registered user, as per FDP-126, as detailed in FQA-618

  #Scenario 1
  @portal-release-1
  Scenario: User should be able to access the User Profile page
    Given The Home Screen is opened
    When User is logged in to Foxtons Portal to reach the change password fold on the User Profile page
    And User clicks on the Profile link from the navigation bar
    Then User should be navigated to the User Profile page

  #Scenario 2
  @portal-release-1
  Scenario: User should be able to see a change password CTA on the User Profile page
    Given User is logged in to Foxtons Portal to reach the change password fold on the User Profile page
    And User clicks on the Profile link from the navigation bar
    And User is navigated to the User Profile page
    When User is on the change password fold on the User Profile page
    Then There should be a change password CTA on the User Profile page
    And That change password CTA on the User Profile page should be clickable

  #Scenario 3
  @portal-release-1
  Scenario: User should be able to click on the change password CTA on the User Profile page
    Given User is logged in to Foxtons Portal to reach the change password fold on the User Profile page
    And User clicks on the Profile link from the navigation bar
    And User is navigated to the User Profile page
    When User is on the change password fold on the User Profile page
    And User clicks on the change password CTA on the User Profile page
    Then User should be navigated to the Change My Password page

  #Scenario 4
  @portal-release-1
  Scenario: User should be able to see the password policy on the Change My Password page
    Given User is logged in to Foxtons Portal to reach the change password fold on the User Profile page
    And User clicks on the Profile link from the navigation bar
    And User is navigated to the User Profile page
    And User is on the change password fold on the User Profile page
    And User clicks on the change password CTA on the User Profile page
    And User is navigated to the Change My Password page
    When User clicks on the New password field on the Change My Password page
    Then User should see the password policy on the Change My Password page

  #Scenario 5
  @portal-release-1
  Scenario: User should be able to click on and edit the Current password field on the Change My Password page
    Given User is logged in to Foxtons Portal to reach the change password fold on the User Profile page
    And User clicks on the Profile link from the navigation bar
    And User is navigated to the User Profile page
    And User is on the change password fold on the User Profile page
    And User clicks on the change password CTA on the User Profile page
    And User is navigated to the Change My Password page
    When User clicks on the Current password field on the Change My Password page
    Then User should be able to enter text in the Current password field on the Change My Password page

  #Scenario 6
  @portal-release-1
  Scenario: User should be able to click on and edit the New password field on the Change My Password page
    Given User is logged in to Foxtons Portal to reach the change password fold on the User Profile page
    And User clicks on the Profile link from the navigation bar
    And User is navigated to the User Profile page
    And User is on the change password fold on the User Profile page
    And User clicks on the change password CTA on the User Profile page
    And User is navigated to the Change My Password page
    When User clicks on the New password field on the Change My Password page
    Then User should be able to enter text in the New password field on the Change My Password page

  #Scenario 7
  @portal-release-1
  Scenario: User should be able to click on and edit the Confirm new password field on the Change My Password page
    Given User is logged in to Foxtons Portal to reach the change password fold on the User Profile page
    And User clicks on the Profile link from the navigation bar
    And User is navigated to the User Profile page
    And User is on the change password fold on the User Profile page
    And User clicks on the change password CTA on the User Profile page
    And User is navigated to the Change My Password page
    When User clicks on the Confirm new password field on the Change My Password page
    Then User should be able to enter text in the Confirm new password field on the Change My Password page

  #Scenario 8
  @portal-release-1
  Scenario: User should be able to see whether the new password meets the conditions on the Change My Password page
    Given User is logged in to Foxtons Portal to reach the change password fold on the User Profile page
    And User clicks on the Profile link from the navigation bar
    And User is navigated to the User Profile page
    And User is on the change password fold on the User Profile page
    And User clicks on the change password CTA on the User Profile page
    And User is navigated to the Change My Password page
    When User clicks on the New password field on the Change My Password page
    And User enters a new password in the New password field on the Change My Password page
    Then User should see whether the new password meets the conditions on the Change My Password page

  #Scenario 9
  @portal-release-1
  Scenario: User should be able to see when the New password and Confirm new password do not match on the Change My Password page
    Given User is logged in to Foxtons Portal to reach the change password fold on the User Profile page
    And User clicks on the Profile link from the navigation bar
    And User is navigated to the User Profile page
    And User is on the change password fold on the User Profile page
    And User clicks on the change password CTA on the User Profile page
    And User is navigated to the Change My Password page
    When User clicks on the New password field on the Change My Password page
    And User enters a new password in the New password field on the Change My Password page
    And User clicks on the Confirm new password field on the Change My Password page
    And User enters a text different than the new password in the Confirm new password field on the Change My Password page
    Then User should see that the New password and Confirm new password do not match on the Change My Password page

  #Scenario 10
  @portal-release-1
  Scenario: User should be able to see when the New password and Confirm new password match on the Change My Password page
    Given User is logged in to Foxtons Portal to reach the change password fold on the User Profile page
    And User clicks on the Profile link from the navigation bar
    And User is navigated to the User Profile page
    And User is on the change password fold on the User Profile page
    And User clicks on the change password CTA on the User Profile page
    And User is navigated to the Change My Password page
    When User clicks on the New password field on the Change My Password page
    And User enters a new password in the New password field on the Change My Password page
    And User clicks on the Confirm new password field on the Change My Password page
    And User enters a text same as the new password in the Confirm new password field on the Change My Password page
    Then User should see that the New password and Confirm new password match on the Change My Password page

  #Scenario 11
  @portal-release-1
  Scenario: User should be able to see an error message on the Change My Password page when the Current password is not verified with the existing password
    Given User is logged in to Foxtons Portal to reach the change password fold on the User Profile page
    And User clicks on the Profile link from the navigation bar
    And User is navigated to the User Profile page
    And User is on the change password fold on the User Profile page
    And User clicks on the change password CTA on the User Profile page
    And User is navigated to the Change My Password page
    When User clicks on the Current password field on the Change My Password page
    And User enters password that is not verified with the existing password in the Current password field on the Change My Password page
    And User clicks on the New password field on the Change My Password page
    And User enters a new password in the New password field on the Change My Password page
    And User clicks on the Confirm new password field on the Change My Password page
    And User enters a text same as the new password in the Confirm new password field on the Change My Password page
    And User clicks on the Update button on the Change My Password page
    Then User should see an error message on the Change My Password page when the Current password is not verified with the existing password