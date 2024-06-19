
Feature: Verify the guide to property selling process for anonymous user, as per FDW-124, as detailed in FQA-462

  #Scenario: 1
  Scenario: User should be able to access the Property Selling Process page
    Given The Home Screen is opened
    When User accesses the Property Selling Process URL
    Then User should navigate to the Property Selling Process Page

  #Scenario: 2
  Scenario: User should be able to see a hero image on the Property Selling Process page with proper heading and subtext
    Given User is on the Property Selling Process page
    When User sees the hero image on the Property Selling Process Page
    Then User should see proper heading and subtext on the hero image on the Property Selling Process Page

  #Scenario: 3
  Scenario: User should be able to see a CTA “Register Now“ on the hero image on the Property Selling Process page
    Given User is on the Property Selling Process page
    When User sees the hero image on the Property Selling Process Page
    Then User should see a CTA “Register Now“ on the hero image on the Property Selling Process Page

  #Scenario: 4
  Scenario: User should navigate to My Foxtons Registration page when he clicks on the CTA “Register Now“ on the Property Selling Process page
    Given User is on the Property Selling Process page
    When User clicks on the CTA “Register Now“ on the Property Selling Process Page
    Then User should navigate to My Foxtons Registration page

  #Scenario: 5
  Scenario: User should be able to see a section "WE'LL HELP YOU ALL THE WAY" with 9 steps on a horizontal scroll on the Property Selling Process page
    Given User is on the Property Selling Process page
    When User scrolls down below the hero image
    Then User should see a help section with proper heading
    And User should see a horizontal carousel containing 9 steps in the help section

  #Scenario: 6
  Scenario: User should be able to see appropriate heading and a CTA with appropriate text on Step 1 on the Property Selling Process page
    Given User is on the Property Selling Process page
    When User sees the Step 1 of the help section
    Then User should see that the heading of Step 1 is "Accurate Rental Valuation"
    And User should see that there is a CTA with text "Arrange a Valuation"

  #Scenario: 7
  Scenario: User should navigate to the Property Valuation page when user clicks on the "Arrange a Valuation" CTA under Step 1 on the Property Selling Process page
    Given User is on the Property Selling Process page
    When User clicks on the "Arrange a Valuation" CTA under Step 1 of the help section
    Then User should navigate to the Property Valuation page

  #Scenario: 8
  Scenario: User should be able to see appropriate heading and a CTA with appropriate text on Step 2 on the Property Selling Process page
    Given User is on the Property Selling Process page
    When User sees the Step 2 of the help section
    Then User should see that the heading of Step 2 is "Select an estate agent"
    And User should see that there is a CTA with text "About My Foxtons"

  #Scenario: 9
  Scenario: User should navigate to the My Foxtons for Sellers page when user clicks on the "About My Foxtons" CTA under Step 2 on the Property Selling Process page
    Given User is on the Property Selling Process page
    When User clicks on the "About My Foxtons" CTA under Step 2 of the help section
    Then User should navigate to the My Foxtons for Sellers page

  #Scenario: 10
  Scenario: User should be able to see appropriate heading and a CTA with appropriate text on Step 3 on the Property Selling Process page
    Given User is on the Property Selling Process page
    When User sees the Step 3 of the help section
    Then User should see that the heading of Step 3 is "Instruct a solicitor"
    And User should see that there is a CTA with text "About Conveyan"

  #Scenario: 11
  Scenario: User should navigate to the Conveyancing page when user clicks on the "About Conveyan" CTA under Step 3 on the Property Selling Process page
    Given User is on the Property Selling Process page
    When User clicks on the "About Conveyan" CTA under Step 3 of the help section
    Then User should navigate to the Conveyancing page

  #Scenario: 12
  Scenario: User should be able to see appropriate heading on Step 4 on the Property Selling Process page
    Given User is on the Property Selling Process page
    When User sees the Step 4 of the help section
    Then User should see that the heading of Step 4 is "Property Presentation"

  #Scenario: 13
  Scenario: User should be able to see appropriate heading and an embedded link on the part of a subtext on Step 5 on the Property Selling Process page
    Given User is on the Property Selling Process page
    When User sees the Step 5 of the help section
    Then User should see that the heading of Step 5 is "Find a Buyer"
    And User should see that there is an embedded link on the part of a subtext "instruct Foxtons to sell your property"

  #Scenario: 14
  Scenario: User should navigate to the Valuation page when user clicks on the link on the subtext under Step 5 on the Property Selling Process page
    Given User is on the Property Selling Process page
    When User clicks on the link on the subtext under Step 5 of the help section
    Then User should navigate to the Property Valuation page

  #Scenario: 15
  Scenario: User should be able to see appropriate heading on Step 6 on the Property Selling Process page
    Given User is on the Property Selling Process page
    When User sees the Step 6 of the help section
    Then User should see that the heading of Step 6 is "Accompanied Viewings"

  #Scenario: 16
  Scenario: User should be able to see appropriate heading and an embedded link on the part of a subtext on Step 7 the Property Selling Process page
    Given User is on the Property Selling Process page
    When User sees the Step 7 of the help section
    Then User should see that the heading of Step 7 is "Receive Offers"
    And User should see that there is an embedded link on the part of a subtext "My Foxtons"

  #Scenario: 17
  Scenario: User should navigate to the My Foxtons for Sellers page when user clicks on the link on the subtext under Step 7 on the Property Selling Process page
    Given User is on the Property Selling Process page
    When User clicks on the link on the subtext under Step 7 of the help section
    Then User should navigate to the My Foxtons for Sellers page

  #Scenario: 18
  Scenario: User should be able to see appropriate heading on Step 8 on the Property Selling Process page
    Given User is on the Property Selling Process page
    When User sees the Step 8 of the help section
    Then User should see that the heading of Step 8 is "Accept an offer"

  #Scenario: 19
  Scenario: User should be able to see appropriate heading on Step 9 on the Property Selling Process page
    Given User is on the Property Selling Process page
    When User sees the Step 9 of the help section
    Then User should see that the heading of Step 9 is "Completion"

  #Scenario: 20
  Scenario: User should be able to see a section prompting to explore other features available on the Foxtons website by providing me with relevant and clickable links on the Property Selling Process page
    Given User is on the Property Selling Process page
    When User scrolls down below the help section
    Then User should see a section prompting to explore other features available on the Foxtons website
    And User should see that the section provides relevant links that are clickable

  #Scenario: 21
  Scenario: User should be able to see the Foxtons website footer at the bottom of the Property Selling Process page
    Given User is on the Property Selling Process page
    When User scrolls down to the end of the Property Selling Process page
    Then User should see the Foxtons website footer at the bottom of the page


