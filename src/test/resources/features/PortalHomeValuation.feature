@Portal
Feature:As a signed in user I want to book an Home valuation for my property


 #Scenario: 1
  Scenario: User should be able to navigate to Choose your valuation date page
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Home valuation Fold
    Then User should be able to navigate to Choose your valuation date page

  #Scenario: 2
  Scenario: User Should not be able to navigate to next page without Legal owner Property page
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Home valuation Fold

   #Scenario: 3
  Scenario: User should be able to see three timing cards
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Home valuation Fold
    And User clicks on date "29"
    Then User should be able to see three timing cards


   #Scenario: 4
  Scenario: User should be able to navigate to legal owner property page
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Home valuation Fold
    And User clicks on date "29"
    And User clicks on "12pm-2pm" timing card
    Then User should be able to navigate to legal owner property page

     #Scenario: 5
  Scenario: User Should be able to navigate to sales or rental valuation page
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Home valuation Fold
    And User clicks on date "29"
    And User clicks on "12pm-2pm" timing card
    And user clicks on "Yes" CTA as legal owner
    Then User Should be able to navigate to sales or rental valuation page

     #Scenario: 6
  Scenario: User Should be able to navigate to Excellent You are nearly there page
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Home valuation Fold
    And User clicks on date "29"
    And User clicks on "12pm-2pm" timing card
    And user clicks on "Yes" CTA as legal owner
    And User click on "Sales" CTA of Home valuation

      #Scenario: 7
  Scenario: User Should be able to navigate to best contact detail page
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Home valuation Fold
    And User clicks on date "29"
    And User clicks on "12pm-2pm" timing card
    And user clicks on "Yes" CTA as legal owner
    And User click on "Sales" CTA of Home valuation
    And User click on next CTA
    Then User Should be able to navigate to best contact detail page

  #Scenario: 8
  Scenario: User Should be able to validate contact detail
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Home valuation Fold
    And User clicks on date "29"
    And User clicks on "12pm-2pm" timing card
    And user clicks on "Yes" CTA as legal owner
    And User click on "Sales" CTA of Home valuation
    And User click on next CTA
    Then User Should be able to validate phoneNumber "46299454629" and email "5499264@foxtons.co.uk"

  #Scenario: 9
  Scenario: User Should be able to see What is your situation page
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Home valuation Fold
    And User clicks on date "29"
    And User clicks on "12pm-2pm" timing card
    And user clicks on "Yes" CTA as legal owner
    And User click on "Sales" CTA of Home valuation
    And User click on next CTA
    And User click on next CTA
    Then User should be able to see "Planning to sell" CTA in What is your situation page

   #Scenario: 10
  Scenario: User Should be able to validate Your request has been sent to our team
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Home valuation Fold
    And User clicks on date "29"
    And User clicks on "12pm-2pm" timing card
    And user clicks on "Yes" CTA as legal owner
    And User click on "Sales" CTA of Home valuation
    And User click on next CTA
    And User click on next CTA
    And User clicks on "Planning to sell" CTA
    Then User Should be able to validate Your request has been sent to our team