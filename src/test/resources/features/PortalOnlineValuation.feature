@Portal
Feature:As a signed in user I want to book an online valuation for my property
@smoke @portal
  #Scenario: 1
  Scenario: User Should be able to see list of address by entering valid postcode
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    Then User should be able to see list of addresses

  #Scenario: 2
  Scenario: User Should be able to see error if no postcode is entered
    Given User on Property Valuation page
    When User enter invalid postcode ""
    When User clicks on refocus

  #Scenario: 3
  Scenario: User Should be able to see error message by entering invalid postcode
    Given User on Property Valuation page
    When User enter invalid postcode "ABC"
    And User clicks on refocus

  #Scenario: 4
  Scenario: User Should be able to navigate to "What type of valuation do you want" page by entering valid postcode
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    Then User should be able to navigate to What type of valuation do you want page

  #Scenario: 5
  Scenario: User Should be able to navigate to What type of building is it page
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Online valuation Fold
    Then User should be able to navigate to What type of building is it page

    #Scenario: 6
  Scenario: User Should not be able to navigate to next page without selecting building type
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Online valuation Fold

  #Scenario: 7
  Scenario: User Should be able to navigate to What kind of house is it page
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Online valuation Fold
    And User click on "house" CTA
    Then user should be able to navigate to What kind of house is it

    #Scenario: 8
  Scenario: User Should not be able to navigate to next page without selecting house kind
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Online valuation Fold
    And User click on "house" CTA

  #Scenario: 9
  Scenario: User Should be able to navigate to How many bedrooms does it have page
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Online valuation Fold
    And User click on "house" CTA
    And User clicks on "Detached" kind of house
    Then user should be able to navigate to How many bedrooms does it have

    #Scenario: 10
  Scenario: User Should not be able to navigate to next page without selecting no of bedrooms
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Online valuation Fold
    And User click on "house" CTA
    And User clicks on "Detached" kind of house

    #Scenario: 11
  Scenario: User Should be able to navigate to Are you the legal owner of the property page
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Online valuation Fold
    And User click on "house" CTA
    And User clicks on "Detached" kind of house
    And user clicks on "1" bedrooms
    Then user should be able to navigate to Are you the legal owner of the property

  #Scenario: 12
  Scenario: User Should not be able to navigate to next page without selecting legal owner
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Online valuation Fold
    And User click on "house" CTA
    And User clicks on "Detached" kind of house
    And user clicks on "1" bedrooms

    #Scenario: 13
  Scenario: User Should be able to validate the email
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Online valuation Fold
    And User click on "house" CTA
    And User clicks on "Detached" kind of house
    And user clicks on "1" bedrooms
    And user clicks on "Yes" CTA as legal owner
    Then User should be able to validate with email "5499264@foxtons.co.uk"

    #Scenario: 15
  Scenario: User Should be able to validate firstName and lastName
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Online valuation Fold
    And User click on "house" CTA
    And User clicks on "Detached" kind of house
    And user clicks on "1" bedrooms
    And user clicks on "Yes" CTA as legal owner
    And User click on next CTA

    #Scenario: 16
  Scenario: User Should be able to validate phoneNumber
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Online valuation Fold
    And User click on "house" CTA
    And User clicks on "Detached" kind of house
    And user clicks on "1" bedrooms
    And user clicks on "Yes" CTA as legal owner
    And User click on next CTA
    And User click on next CTA
    Then User should be able to validate phoneNumber "46299454629"

    #Scenario: 17
  Scenario: User Should be able to navigate to What is your situation page
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Online valuation Fold
    And User click on "house" CTA
    And User clicks on "Detached" kind of house
    And user clicks on "1" bedrooms
    And user clicks on "Yes" CTA as legal owner
    And User click on next CTA
    And User click on next CTA
    And User click on next CTA
    Then User should be able to see "Planning to sell" CTA in What is your situation page

    #Scenario: 18
  Scenario: User Should not be able to navigate to next page without selecting your situation
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Online valuation Fold
    And User click on "house" CTA
    And User clicks on "Detached" kind of house
    And user clicks on "1" bedrooms
    And user clicks on "Yes" CTA as legal owner
    And User click on next CTA
    And User click on next CTA
    And User click on next CTA

    #Scenario: 19
  Scenario: User Should be able to navigate to Your estimated valuation page
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Online valuation Fold
    And User click on "house" CTA
    And User clicks on "Detached" kind of house
    And user clicks on "1" bedrooms
    And user clicks on "Yes" CTA as legal owner
    And User click on next CTA
    And User click on next CTA
    And User click on next CTA
    And User clicks on "Planning to sell" CTA
    Then User should be able to navigate to Your estimated valuation page

    #Scenario: 20
  Scenario: User Should be able to see minimum and maximum sale price
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Online valuation Fold
    And User click on "house" CTA
    And User clicks on "Detached" kind of house
    And user clicks on "1" bedrooms
    And user clicks on "Yes" CTA as legal owner
    And User click on next CTA
    And User click on next CTA
    And User click on next CTA
    And User clicks on "Planning to sell" CTA
    Then User Should be able to see minimum "£18,550" and maximum "£34,450" sale price

    #Scenario: 21
  Scenario: User Should be able to see minimum and maximum rental price
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Online valuation Fold
    And User click on "house" CTA
    And User clicks on "Detached" kind of house
    And user clicks on "1" bedrooms
    And user clicks on "Yes" CTA as legal owner
    And User click on next CTA
    And User click on next CTA
    And User click on next CTA
    And User clicks on "Planning to sell" CTA
    And User click on Rental Price
    Then User Should be able to see minimum "£2,250" and maximum "£2,700" rental price

    #Scenario: 22
  Scenario: User Should be able to get online valuation of Flat
    Given User on Property Valuation page
    When User enter valid postcode "SW129AP"
    And User clicked on valid address "Oliver Bonas, 101-103 Balham High Road, London"
    And User clicked on Online valuation Fold
    And User click on "flat" CTA
    And User clicks on "Purpose Build" kind of house
    And user clicks on "1" bedrooms
    And user clicks on "Yes" CTA as legal owner
    And User click on next CTA
    And User click on next CTA
    And User click on next CTA
    And User clicks on "Planning to sell" CTA
    And User click on Rental Price
    Then User Should be able to see minimum "£2,250" and maximum "£2,700" rental price
