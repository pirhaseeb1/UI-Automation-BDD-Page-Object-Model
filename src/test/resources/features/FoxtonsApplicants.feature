@website
Feature:Verify Applicants for My Foxtons As a Anonymous User

  #Scenario: 1
  Scenario: User should be able to access My Foxtons Applicants Page As a Anonymous User
    Given User accesses home screen
    When User enters the url of My Foxtons Applicants Page
    Then My Foxtons Applicants Page should be opened

    #Scenario: 2
  Scenario: User should be able to access home screen from Application Page
    Given User accesses home screen
    When User enters the url of My Foxtons Applicants Page
    When User clicks on Foxtons Logo
    Then Home Page should be opened

    #Scenario: 3
  Scenario: User should be able to access My Foxtons Page from Application Page
    Given User accesses home screen
    When User enters the url of My Foxtons Applicants Page
    When User clicks on My Foxtons button
    Then My Foxtons Page should be opened

    #Scenario: 4
  Scenario: User should be able to access registration screen when clicks on register As a Buyer button
    Given User accesses home screen
    When User enters the url of My Foxtons Applicants Page
    When User clicks on Register As a Buyer
    Then User should be navigated to registration screen
