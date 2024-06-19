@website
Feature:Verify Learn about mortgage services offered when buying homes or letting for anonymous user

  #Scenario: 1
  Scenario: User should be able to access the Alexander Hall Homepage
    Given User on buy-to-let mortgages page
    When User clicks on Visit Alexander Hall CTA
    Then User should navigate to Alexander Hall’s website Homepage

   #Scenario: 2
  Scenario: User should be able to access the Alexander Hall Best Buy to let Mortgage Deals and rates Page
    Given User on buy-to-let mortgages page
    When User clicks on View Mortgages CTA under NEW BUY-TO-LET MORTGAGE Card
    Then User should navigate to Alexander Hall’s website buy to let mortgage page

  #Scenario: 3
  Scenario: User should be able to access the Alexander Hall Best Buy to let Mortgage Deals and rates page
    Given User on buy-to-let mortgages page
    When User clicks on View Mortgages CTA under BUY-TO-LET REMORTGAGE Card
    Then User should navigate to Alexander Hall’s website buy to let mortgage page

  #Scenario:4
  Scenario: User should be able to access the Alexander Hall Contact form page
    Given User on buy-to-let mortgages page
    When User clicks on Contact Form CTA under MIGRATE FROM RESIDENTIAL MORTGAGE Card
    Then User should navigate to Alexander Hall’s Contact Alexander Hall mortgages, London, UK  page

   #Scenario: 5
  Scenario: User should be able to access the Alexander Hall Homepage from CTA under Buy to let Advice
    Given User on buy-to-let mortgages page
    When User clicks on Visit Alexander Hall CTA under BUY-TO-LET MORTGAGE ADVICE
    Then User should navigate to Alexander Hall’s Homepage

    ## For Scenario 6,7 and 8, separate "Then" were created.because URL after clicking on every button has changed now

  # Scenario: 6
  Scenario: User should be able to access the Find Long Let Tenants Foxtons Page for long let
    Given User on buy-to-let mortgages page
    When User clicks on Get Started CTA under OUR LETTINGS PACKAGES, Long let Card
    Then User should navigate to Find Long Let Tenants Foxtons Page

  #Scenario: 7
  Scenario: User should be able to access the Find Long Let Tenants Foxtons Page for managed long let
    Given User on buy-to-let mortgages page
    When User clicks on Get Started CTA under OUR LETTINGS PACKAGES, Managed Long let Card
    Then User should navigate to Find Managed Long Let Tenants Foxtons Page

  #Scenario: 8
  Scenario: User should be able to access the Find Long Let Tenants Foxtons Page for managed short let
    Given User on buy-to-let mortgages page
    When User clicks on Get Started CTA under OUR LETTINGS PACKAGES, Managed Short let Card
    Then User should navigate to Find Short Let Tenants Foxtons Page

  #Scenario: 9
  Scenario: User should be able to access the Find Tenants Foxtons Page for long let
    Given User on buy-to-let mortgages page
    When User clicks on Whats included CTA under OUR LETTINGS PACKAGES, Long let Card
    Then User should navigate to Find Tenants

  #Scenario: 10
  Scenario: User should be able to access the Property Management page
    Given User on buy-to-let mortgages page
    When User clicks on Whats included CTA under OUR LETTINGS PACKAGES, Managed Long let Card
    Then User should navigate to Property Management page

  #Scenario: 11
  Scenario: User should be able to access the Short Let services for Landlord page
    Given User on buy-to-let mortgages page
    When User clicks on Whats included CTA under OUR LETTINGS PACKAGES, Managed Short let Card
    Then User should navigate to Short Let services for Landlord page

#  #Scenario: 12
  Scenario: User should be able to see three heading under EXPLORE FOXTONS
    Given User on buy-to-let mortgages page
    When User scrolls down to Explore Foxtons heading
    Then User should find Our Services, Landlord advice, Landlord tools static headings