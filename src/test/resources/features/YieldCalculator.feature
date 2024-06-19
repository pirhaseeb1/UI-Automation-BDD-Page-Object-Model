@website
Feature:As an anonymous user verify yield calculator page
# removed cases related to what's included due to issue with selenium
  #Scenario: 1
  Scenario: User should be able to access the Ask us a question page
    Given User on yield calculator page
    When User clicks on Ask us a question CTA
    Then User should be able to navigate to Ask us a question page

      #Scenario: 2
  Scenario: User should be able to see all FAQS details
    Given User on yield calculator page
    When User clicks on rental yield FAQ CTA
    And User clicks on calculate rental yield FAQ CTA
    And User clicks on buy to let investment FAQ CTA
    And User clicks on rental yield in london FAQ CTA
    And User clicks on rental question FAQ CTA
    Then User should be able to see FAQS details

      #Scenario: 3
  Scenario: User should be able to access the Find tenant lettings page
    Given User on yield calculator page
    When User clicks on Get started CTA under Long let card
    Then User should be able to navigate to lettings page


      #Scenario: 5
  Scenario: User should be able to access the Find tenant managed page
    Given User on yield calculator page
    When User clicks on Get started CTA under managed long let
    Then User should be able to navigate to managed page

      #Scenario: 7
  Scenario: User should be able to access the Find tenant short lets page
    Given User on yield calculator page
    When User clicks on Get started CTA under managed short let
    Then User should be able to navigate to short let page

    #Scenario: 9
  Scenario: User Should be able to calculate yield for The purchase price of the property
    Given User on yield calculator page
    When User enter amount of 100000 in Purchase price field
    And User clicks on Other purchase costs CTA
    And User enter amount of 10 in Stamp duty field
    And User enter amount of 10 in Valuation fees field
    And User enter amount of 10 in Survey fees field
    And User enter amount of 10 in Legal fees field
    And User enter amount of 10 in Mortgage deposit field
    And User enter amount of 10 in Mortgage fees field
    And User enter amount of 10 in Refurbishment costs field
    And User enter amount of 10 in Other buying costs field
    And User enter amount of 50 in Monthly rent field
    And User enter amount of 300 in Yearly running costs field
    And User clicks on Other costs CTA
    And User enter amount of 10 in Monthly mortgage payment field
    And User enter amount of 10 in Repairs and maintenance field
    And User enter amount of 10 in Ground rent and service charges field
    And User enter amount of 10 in Insurance field
    And User enter amount of 10 in Utility bills payable by landlord field
    And User enter amount of 10 in Council tax field
    And User enter amount of 10 in Vacancy loss field
    And User clicks on Calculate Yield CTA
    Then User should be able to see calculated result "0.23%" Net Yeild

      #Scenario: 10
  Scenario: User Should be able to calculate yield for The current value of the property
    Given User on yield calculator page
    When User clicks on Calculate yield for CTA
    When User select option The current value of the property
    When User enter amount of 100000 in current price field
    And User enter amount of 50 in Monthly rent field
    And User enter amount of 300 in Yearly running costs field
    And User clicks on Other costs CTA
    And User enter amount of 10 in Monthly mortgage payment field
    And User enter amount of 10 in Repairs and maintenance field
    And User enter amount of 10 in Ground rent and service charges field
    And User enter amount of 10 in Insurance field
    And User enter amount of 10 in Utility bills payable by landlord field
    And User enter amount of 10 in Council tax field
    And User enter amount of 10 in Vacancy loss field
    And User clicks on Calculate Yield CTA
    Then User should be able to see calculated result "0.23%" Net Yeild

