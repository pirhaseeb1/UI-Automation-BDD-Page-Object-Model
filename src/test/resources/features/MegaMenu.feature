@website
Feature:Verify Main Page for anonymous user

  #Scenario: 1
  Scenario: User should be able to access the Buyer page
    Given User on Let process page
    When User clicks on Buy CTA of MegaMenu
    And User clicks on Buy Properties CTA
    Then User should be able to navigate to Buyer page

     #Scenario: 2
  Scenario: User should be able to access the Newhomes page
    Given User on Let process page
    When User clicks on Buy CTA of MegaMenu
    And User clicks on New build homes CTA
    Then User should be able to navigate to Newhomes page

   #Scenario: 3
  Scenario: User should be able to access the Buy mortgages page
    Given User on Let process page
    When User clicks on Buy CTA of MegaMenu
    And User clicks on Mortgages CTA
    Then User should be able to navigate to Buy mortgages page

   #Scenario: 4
  Scenario: User should be able to access the Mortgage calculator page
    Given User on Let process page
    When User clicks on Buy CTA of MegaMenu
    And User clicks on Mortgages CTA
    And User clicks on Mortgage calculator CTA
    Then User should be able to navigate to Mortgage calculator page

    #Scenario: 5 No longer available
  Scenario: User should be able to access the how much can I borrow page
    Given User on Let process page
    When User clicks on Buy CTA of MegaMenu
    And User clicks on Mortgages CTA


  #Scenario: 6
  Scenario: User should be able to access the Stampduty page
    Given User on Let process page
    When User clicks on Buy CTA of MegaMenu
    And User clicks on Stamp duty calculator CTA
    Then User should be able to navigate to Stampduty page

   #Scenario: 7
  Scenario: User should be able to access the Buy to let mortgages page
    Given User on Let process page
    When User clicks on Buy CTA of MegaMenu
    And User clicks on Buy to let CTA
    Then User should be able to navigate to Buy to let mortgages page

    #Scenario: 8 No longer available
  Scenario: User should be able to access tenant page
    Given User on Let process page
    When User clicks on Rent CTA of MegaMenu


    #Scenario: 9
  Scenario: User should be able to access Short term page
    Given User on Let process page
    When User clicks on Rent CTA of MegaMenu
    And User clicks on Short term rentals CTA
    Then User should be able to navigate to Short term page

    #Scenario: 10
  Scenario: User should be able to access Corporate home page
    Given User on Let process page
    When User clicks on Rent CTA of MegaMenu
    And User clicks on Corporate home rentals CTA
    Then User should be able to navigate to Corporate home page

    #Scenario: 11
  Scenario: User should be able to access Student housing page
    Given User on Let process page
    When User clicks on Rent CTA of MegaMenu
    And User clicks on Student housing CTA
    Then User should be able to navigate to Student housing page

      #Scenario: 12
  Scenario: User should be able to access the short lets page
    Given User on Let process page
    When User clicks on Let CTA of MegaMenu
    And User clicks on Short term lets CTA
    Then User should be able to navigate to short lets page

     #Scenario: 13
  Scenario: User should be able to access the Property Management page
    Given User on Let process page
    When User clicks on Let CTA of MegaMenu
    And User clicks on Property Management CTA
    Then User should be able to navigate to Property Management page

   #Scenario: 14 no longer available
  Scenario: User should be able to access the Prime page
    Given User on Let process page
    When User clicks on Let CTA of MegaMenu
   # And User clicks on Prime Lettings CTA
   # Then User should be able to navigate to Prime page

   #Scenario: 15
  Scenario: User should be able to access the Letting agents page
    Given User on Let process page
    When User clicks on Let CTA of MegaMenu
    And User clicks Letting agents CTA
    Then User should be able to navigate to Letting agents page

    #Scenario: 16
  Scenario: User should be able to access the Buy to let page
    Given User on Let process page
    When User clicks on Let CTA of MegaMenu
    And User clicks on Buy to lett CTA
    Then User should be able to navigate to Buy to let page

  #Scenario: 17
  Scenario: User should be able to access the yeild calculator page
    Given User on Let process page
    When User clicks on Let CTA of MegaMenu
    And User clicks on Rental yield calculator CTA
    Then User should be able to navigate to yield calculator page

     #Scenario: 18
  Scenario: User should be able to access the Sell My Home page
    Given User on Let process page
    When User clicks on Sell CTA of MegaMenu
    And User clicks on Sell My Home CTA
    Then User should be able to navigate to Sell My Home page

      #Scenario: 19 no longer available
  Scenario: User should be able to access the Sell My Home Fast page
    Given User on Let process page
    When User clicks on Sell CTA of MegaMenu
    And User clicks on Sell My Home CTA
  #  And User clicks on sell my home fast CTA
  #  Then User should be able to navigate to Sell My Home Fast page

        #Scenario: 20
  Scenario: User should be able to access the property valuation page
    Given User on Let process page
    When User clicks on Sell CTA of MegaMenu
    And User clicks on Property Valuation CTA
    Then User should be able to navigate to property valuation page

        #Scenario: 21 no longer available
  Scenario: User should be able to access the Online property valuation page
    Given User on Let process page
    When User clicks on Sell CTA of MegaMenu
    And User clicks on Property Valuation CTA
   # And User clicks on Online property valuation CTA
   # Then User should be able to navigate to Online property valuation page