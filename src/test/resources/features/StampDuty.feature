@website
Feature:As an anonymous user I should be able to calculate stamp duty tax for my property

 #Scenario: 1
  Scenario: User should be able to enter property purchase price
    Given User on Stamp Duty page
    When User enter property purchase price "450000"
    Then User should be able to enter property purchase price "450,000"

    #Scenario: 2
  Scenario: User should be able to see error message
    Given User on Stamp Duty page
    When User clicks on Calculate button
    Then User should be able to see "Purchase price is required" error

        #Scenario: 3
  Scenario: User should be able to see error message
    Given User on Stamp Duty page
    When User enter invalid property purchase price "abc"
    And User clicks on Calculate button
    Then User should be able to see "Invalid purchase price" error

     #Scenario: 4
  Scenario: User should be able to calculate stamp duty
    Given User on Stamp Duty page
    When User enter property purchase price "450000"
    And User clicks on Calculate button
    Then User should be able to see stamp duty "19,000"
    And User should to able to see Total rate "4.20%"
    And User should to able to see Total Due "£19,000"
    And User should be able to see recalculate button

     #Scenario: 5
  Scenario: User should be able to calculate stamp duty as first time buyer
    Given User on Stamp Duty page
    When User enter property purchase price "450000"
    And User clicks on First time buyer checkbox
    And User clicks on Calculate button
    Then User should be able to see stamp duty "10,250"
    And User should to able to see Total rate "2.30%"
    And User should to able to see Total Due "10,250"
    And User should be able to see recalculate button

     #Scenario: 6
  Scenario: User should be able to calculate stamp duty if Property is a buy-to-let or second home
    Given User on Stamp Duty page
    When User enter property purchase price "450000"
    And User clicks on Property is a buy-to-let or second home checkbox
    And User clicks on Calculate button
    Then User should be able to see stamp duty "32,500"
    And User should to able to see Total rate "7.20%"
    And User should to able to see Total Due "32,500"
    And User should be able to see recalculate button

       #Scenario: 7
  Scenario: User should be able to calculate stamp duty as UK Residents
    Given User on Stamp Duty page
    When User enter property purchase price "450000"
    And User clicks on Uk Residents checkbox
    And User clicks on Calculate button
    Then User should be able to see stamp duty "10,000"
    And User should to able to see Total rate "2.20%"
    And User should to able to see Total Due "10,000"
    And User should be able to see recalculate button

        #Scenario: 8
  Scenario: User should be able to calculate stamp duty as first time buyer and uk resident
    Given User on Stamp Duty page
    When User enter property purchase price "450000"
    And User clicks on First time buyer checkbox
    And User clicks on Uk Residents checkbox
    And User clicks on Calculate button
    Then User should be able to see stamp duty "1,250"
    And User should to able to see Total rate "0.30%"
    And User should to able to see Total Due "1,250"
    And User should be able to see recalculate button

            #Scenario: 8
  Scenario: User should be able to calculate stamp duty as first time buyer and Property is a buy-to-let or second home
    Given User on Stamp Duty page
    When User enter property purchase price "450000"
    And User clicks on First time buyer checkbox
    And User clicks on Property is a buy-to-let or second home checkbox
    And User clicks on Calculate button
    Then User should be able to see stamp duty "32,500"
    And User should to able to see Total rate "7.20%"
    And User should to able to see Total Due "32,500"
    And User should be able to see recalculate button

    #Scenario: 9
  Scenario: User should be able to calculate stamp duty as first time buyer and Property is a buy-to-let or second home and Uk resident
    Given User on Stamp Duty page
    When User enter property purchase price "450000"
    And User clicks on First time buyer checkbox
    And User clicks on Property is a buy-to-let or second home checkbox
    And User clicks on Uk Residents checkbox
    And User clicks on Calculate button
    Then User should be able to see stamp duty "23,500"
    And User should to able to see Total rate "5.20%"
    And User should to able to see Total Due "23,500"
    And User should be able to see recalculate button

       #Scenario: 10
  Scenario: User should be able to recalculate
    Given User on Stamp Duty page
    When User enter property purchase price "450000"
    And User clicks on Property is a buy-to-let or second home checkbox
    And User clicks on Uk Residents checkbox
    And User clicks on Calculate button
    And User enter property purchase price "260,000"
    And User clicks on recalculate button
    Then User should be able to see stamp duty "8,300"
    And User should to able to see Total rate "3.20%"
    And User should to able to see Total Due "8,300"
    And User should be able to see recalculate button