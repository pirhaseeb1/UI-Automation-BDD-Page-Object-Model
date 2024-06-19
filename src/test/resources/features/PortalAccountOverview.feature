Feature: As an anonymous user I should be able to learn about My account home schemes

    #Scenario: 1
  Scenario: User Should be able to navigate to Get started Now page under let
    Given User on Foxtons overview Home page After logging In
    When User clicks on Get started now CTA under let
    Then User should be able to navigate to Get started now page under let
       #Scenario: 2
  Scenario: User Should be able to navigate to Get started Now page under sell
    Given User on Foxtons overview Home page After logging In
    When User clicks on Get started now CTA under sell
    Then User should be able to navigate to Get started now page under sell
       #Scenario: 3
  Scenario: User Should be able to navigate to Get started Now page under rent
    Given User on Foxtons overview Home page After logging In
    When User clicks on Get started now CTA under Rent
    Then User should be able to navigate to Get started now page under rent
       #Scenario: 4
  Scenario: User Should be able to navigate to Get started Now page under buy
    Given User on Foxtons overview Home page After logging In
    When User clicks on Get started now CTA under Buy
    Then User should be able to navigate to Get started now page under buy
       #Scenario: 5
  Scenario: User Should be able to navigate to Start your journey page under letting
    Given User on Foxtons overview Home page After logging In
    When User clicks on Start your journey CTA under letting
    Then User should be able to navigate to Start your journey page under letting

           #Scenario: 6
  Scenario: User Should be able to navigate to Start your journey page under Renting
    Given User on Foxtons overview Home page After logging In
    When User clicks on Start your journey CTA under Renting
    Then User should be able to navigate to Start your journey page under Renting

           #Scenario: 7
  Scenario: User Should be able to navigate to Start your journey page under Selling
    Given User on Foxtons overview Home page After logging In
    When User clicks on Start your journey CTA under Selling
    Then User should be able to navigate to Start your journey page under Selling

               #Scenario: 8
  Scenario: User Should be able to navigate to Start your journey page under Buying
    Given User on Foxtons overview Home page After logging In
    When User clicks on Start your journey CTA under Buying
    Then User should be able to navigate to Start your journey page under Buying


           #Scenario: 9
  Scenario: User Should be able to navigate to Learn more page under letting
    Given User on Foxtons overview Home page After logging In
    When User clicks on Learn more CTA under letting
    Then User should be able to navigate to Learn more Letting page

           #Scenario: 10
  Scenario: User Should be able to navigate to Learn more under Renting
    Given User on Foxtons overview Home page After logging In
    When User clicks on Learn more CTA under Renting
    Then User should be able to navigate to Learn more Renting page

           #Scenario: 11
  Scenario: User Should be able to navigate to Learn more page under Selling
    Given User on Foxtons overview Home page After logging In
    When User clicks on Learn more CTA under Selling
    Then User should be able to navigate to Learn more Selling page

               #Scenario: 12
  Scenario: User Should be able to navigate to Learn more page under Buying
    Given User on Foxtons overview Home page After logging In
    When User clicks on Learn more CTA under Buying
    Then User should be able to navigate to Learn more Buying page

                          #Scenario: 13
  Scenario: User Should be able to navigate to Learn more page under Want expert mortgage advice
    Given User on Foxtons overview Home page After logging In
    When User clicks on Learn more CTA under Want expert mortgage advice
    Then User should be able to navigate to Learn more expert mortage page

                       #Scenario: 14
  Scenario: User Should be able to navigate to profile page
    Given User on Foxtons overview Home page After logging In
    When User clicks on Profile CTA
    Then User should be able to navigate to profile page

                       #Scenario: 15
  Scenario: User Should be able to see update your password
    Given User on Foxtons overview Home page After logging In
    When User clicks on Profile CTA
    And user clicks on change password CTA under change my password
    Then User should be able to see "Update your Password" update your password

                      #Scenario: 16
  Scenario: User Should be able to navigate to Alerts page
    Given User on Foxtons overview Home page After logging In
    When User clicks on Alerts CTA
    Then User should be able to navigate to Alerts page

                     #Scenario: 17
  #Scenario: User Should be able to navigate to contacts page
  #  Given User on Foxtons overview Home page After logging In
   # When User clicks on CONTACT CTA
  #  Then User should be able to see "Roberto Freddi" Contacts details

                        #Scenario: 18
 # Scenario: User Should be able to see search results
   # Given User on Foxtons overview Home page After logging In
    #When User clicks on search property CTA under My properties
   # And User enter valid "2a High" property
    #And User click search CTA
    #Then User should be able to see "2a High Street South London E6 6ES" searched results

                   #Scenario: 19
  #Scenario: User Should be able to see filtered properties
    #Given User on Foxtons overview Home page After logging In
   # When User clicks on Filter CTA
   # And User click on "Right to Rent check for Tenant" CTA of Lettings Doc
    #And User click on Apply CTA
    #Then User should be able to see "2a High Street South London E6 6ES" filtered property


               #Scenario: 20
  #Scenario: User Should be able to see All properties under My properties
   # Given User on Foxtons overview Home page After logging In
   #When User clicks on All CTA under My properties
   # Then User should be able to see "RENT" All properties

           #Scenario: 21
 # Scenario: User Should be able to see Rent properties under My properties
   # Given User on Foxtons overview Home page After logging In
  #  When User clicks on RENT CTA under My properties
   # Then User should be able to see "13 Ellesmere Court Ellesmere Road London W4 4QJ" Rent properties

           #Scenario: 22
  #Scenario: User Should be able to see Let properties under My properties
  #  Given User on Foxtons overview Home page After logging In
   # When User clicks on LET CTA under My properties
    #Then User should be able to see "2a High Street South London E6 6ES" Let properties

               #Scenario: 23
  #Scenario: User Should be able to see Sell properties under My properties
   # Given User on Foxtons overview Home page After logging In
   # When User clicks on SELL CTA under My properties
   # Then User should be able to see "1 Adelaide Court 75 Boston Road London W7 3SA" Sell properties

                         #Scenario: 24
  #Scenario: User Should be able to navigate to Support page
   # Given User on Foxtons overview Home page After logging In
   # When User clicks on SUPPORT CTA
   # Then User should be able to navigate Support page


                   #Scenario: 25
  #Scenario: User Should be able to see Allfiltered properties
    #Given User on Foxtons overview Home page After logging In
    #When User clicks on Filter CTA
   # And User click on lettings CTA
    #And User click on Rent CTA
    #And User click on Preparation CTA
    #And User click on Property CTA
   # And User click on Instruction CTA
    #And User click on Tenancy CTA
   # And User click on Landlord CTA
   # And User click on Application CTA
   # And User click on External CTA
   # And User click on Tenant CTA
   # And User click on TenancyAgreement CTA
   # And User click on Standing CTA
    #And User click on Right CTA
    #And User click on Compliance CTA
    #And User click on Energy CTA
    #And User click on Gas CTA
   # And User click on Electrical CTA
   # And User click on Portable CTA
    #And User click on Fire CTA
    #And User click on Legionnaires CTA
    #And User click on Propertyapplication CTA
    #And User click on Propertygranted CTA
    #And User click on AML CTA
   # And User click on TenantVisa CTA
   # And User click on InventoryCheckin CTA
   # And User click on InventoryCheckout CTA
   # And User click on HowtoRentGuide CTA
   # And User click on Deposit CTA
   # And User click on Apply CTA
   # Then User should be able to see "13 Ellesmere Court Ellesmere Road London W4 4QJ" Allfiltered property



                           #Scenario: 26
  #Scenario: User Should be able to navigate to overview page after select all options of receive email
   # Given User on Foxtons overview Home page After logging In
   # When User clicks on Alerts CTA
   # And User click on propertyalerts
   # And User click on openhouse
   # And User click on Foxtonsmonthly
   # And User click on newhomesInvestment
   # And User click on FoxtonsFeedback
   # And User click on Landlordtransaction
   # And User click on Issuealerts
    #And User click on Marketing
    #And User click on ValuationEnquiry
    #And User click on selectall
    #Then User Should be able to navigate to overview page after select all options of receive email

