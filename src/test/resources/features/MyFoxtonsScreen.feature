@website
Feature: Verify My Foxtons Screen For Non-LoggedIn Users

#My foxtons button is thorwing error so that all cases are failing
  Scenario: User should be able to access Login Screen From My Foxtons Screen
    Given User on Home Screen
    When User access Foxtons Page
    When User clicks on Sign In button
    Then User should navigate to Login Screen

  Scenario: User should be able to access Login Screen From My Foxtons Screen from register btn
    Given User on Home Screen
    When User access Foxtons Page
    When User clicks on Regiser button
    Then User should navigate to Registration Screen

  Scenario: User should be able to access My Foxtons Lanlord Screen from landlord card
    Given User on Home Screen
    When User access Foxtons Page
    When User clicks on My Foxtons Landlord Card
    Then User should naviate to My Foxtons Landlord Screen

  Scenario: User should be able to access My Foxtons Lanlord Screen from seller card
    Given User on Home Screen
    When User access Foxtons Page
    When User clicks on My Foxtons Seller Card
    Then User should naviate to My Foxtons Seller Screen

  Scenario: User should be able to access My Foxtons Lanlord Screen from rental card
    Given User on Home Screen
    When User access Foxtons Page
    When User clicks on My Foxtons Rental Card
    Then User should naviate to My Foxtons Rental Screen

  Scenario: User should be able to access My Foxtons Landlord Screen from buyer card
    Given User on Home Screen
    When User access Foxtons Page
    When User clicks on My Foxtons Buyer Card
    Then User should naviate to My Foxtons Buyer Screen