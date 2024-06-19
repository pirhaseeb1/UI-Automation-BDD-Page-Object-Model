@website
Feature: Verify Home Screen For Non-LoggedIn Users

#Scenario 1:
  Scenario: User should be able to access Foxtons Home Screen
    Given User on Foxtons Home Screen
    When User clicks on Foxtons logo
    Then User should navigate to Foxtons Home Screen

  #This scenario is failing because when MyFoxtons button is clicked the next page is not displayed
#Scenario 2:
  Scenario: User should be able to access My Foxtons Page
    Given User on Foxtons Home Screen
    When User clicks on My Foxtons CTA
    Then User should navigate to My Foxtons Screen

#Scenario 3:
  Scenario: User should be able to access Landlord Landing Screen
    Given User on Foxtons Home Screen
    When User clicks on Landlord Card
    Then User should navigate to Landlord Landing Screen

#Scenario 4:
  Scenario: User should be able to access Rent Property Landing Screen
    Given User on Foxtons Home Screen
    When User clicks on Rent Your Property Card
    Then User should navigate to Rent Your Property Landing Screen

#Scenario 5:
  Scenario: User should be able to access Buy Property Landing Screen
    Given User on Foxtons Home Screen
    When User clicks on Buy Property Card
    Then User should navigate to Buy Property Landing Screen

#Scenario 6:
  Scenario: User should be able to access Sale Property Landing Screen
    Given User on Foxtons Home Screen
    When User clicks on Sale Property Card
    Then User should navigate to Sale Property Landing Screen


  # This scenario is failing now because there no "Learn more" button now on Foxtons Home Screen Page
#Scenario 7:
  Scenario: User should be able to access My Foxtons Screen By Clicking Learn More
    Given User on Foxtons Home Screen
    When User clicks on Learn More Button
    Then User should navigate to My Foxtons Screen By Clicking Learn More