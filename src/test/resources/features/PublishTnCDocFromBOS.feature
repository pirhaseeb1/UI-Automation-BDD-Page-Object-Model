Feature: Verify the publishing and unpublishing of Terms and Conditions document from BOS for a logged in user and the appearance and disappearance of Get Started CTA for that user on the Foxtons portal, as detailed in FQA-559.

  #Scenario: 1
  Scenario: User should be able to login to the Foxtons Portal
    Given User accesses the Login screen to verify the appearance or disappearance of Get Started CTA
    When User enters valid email address, password and clicks on the Sign In button to verify the appearance or disappearance of Get Started CTA
    Then User should be navigated to the User Profile screen to verify the appearance or disappearance of Get Started CTA

  #Scenario: 2
  Scenario: User should be able to view the Instruct Foxtons Overview page for a selected property
    Given User accesses the Login screen to verify the appearance or disappearance of Get Started CTA
    When User enters valid email address, password and clicks on the Sign In button to verify the appearance or disappearance of Get Started CTA
    And User clicks on the desired property on Foxtons Portal to verify the appearance or disappearance of Get Started CTA
    Then User should be navigated to the Instruct Foxtons Overview page for the selected property to verify the appearance or disappearance of Get Started CTA

  #Scenario: 3
  Scenario: User should be able to login to the BOS system to publish or unpublish the Terms and Conditions document for a user
    Given User accesses the BOS system login screen to publish or unpublish the Terms and Conditions document for a user
    When User enters valid credentials for BOS system to publish or unpublish the Terms and Conditions document for a user
    Then User should be navigated to the home screen of the BOS system to publish or unpublish the Terms and Conditions document for a user

  #Scenario: 4
  Scenario: User should not be able to see Get Started CTA on the Instruct Foxtons Overview page for the selected property if the Terms and Conditions document for the user is not published via BOS
    Given The Terms and Conditions document for the desired property of the user is not published via BOS
    And User is logged in to Foxtons Portal to verify the appearance or disappearance of Get Started CTA on the Instruct Foxtons Overview page
    When User clicks on the desired property on Foxtons Portal to verify the appearance or disappearance of Get Started CTA
    Then There should not be a Get Started CTA on the Instruct Foxtons Overview page for the selected property

  #Scenario: 5
  Scenario: User should be able to see Get Started CTA on the Instruct Foxtons Overview page for the selected property if the Terms and Conditions document for the user is published via BOS
    Given The Terms and Conditions document for the desired property of the user is published via BOS
    And User is logged in to Foxtons Portal to verify the appearance or disappearance of Get Started CTA on the Instruct Foxtons Overview page
    When User clicks on the desired property on Foxtons Portal to verify the appearance or disappearance of Get Started CTA
    Then There should be a Get Started CTA on the Instruct Foxtons Overview page for the selected property
