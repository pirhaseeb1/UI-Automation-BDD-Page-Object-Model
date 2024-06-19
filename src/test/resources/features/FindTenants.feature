@website
Feature:Verify how foxtons can help Landlords find tenants for anonymous user

  Scenario: User should be able to access the Find Long Let Tenants Foxtons Page for long let from find tenants
    Given User on Foxtons Find Tenants page from find tenants
    When User clicks on Get Started CTA under OUR LETTINGS PACKAGES, Long let Card from find tenants
    Then User should navigate to Find Long Let Tenants Foxtons Page from find tenants

  Scenario: User sho  Given User on Foxtons Find Tenants pageuld be able to access the Find Long Let Tenants Foxtons Page for managed long let from find tenants
    Given User on Foxtons Find Tenants page from find tenants
    When User clicks on Get Started CTA under OUR LETTINGS PACKAGES, Managed Long let Card from find tenants
    Then User should navigate to Find Managed Long Let Tenants Foxtons Page from find tenants

  Scenario: User should be able to access the Find Long Let Tenants Foxtons Page for managed short let from find tenants
    Given User on Foxtons Find Tenants page from find tenants
    When User clicks on Get Started CTA under OUR LETTINGS PACKAGES, Managed Short let Card from find tenants
    Then User should navigate to Find Short Let Tenants Foxtons Page from find tenants

  Scenario: User should be able to access the Find Tenants Foxtons Page for long let from find tenants
    Given User on Foxtons Find Tenants page from find tenants
    When User clicks on Whats included CTA under OUR LETTINGS PACKAGES, Long let Card from find tenants
    Then User should navigate to Find Tenants from find tenants

  Scenario: User should be able to access the Property Management page from find tenants
    Given User on Foxtons Find Tenants page from find tenants
    When User clicks on Whats included CTA under OUR LETTINGS PACKAGES, Managed Long let Card from find tenants
    Then User should navigate to Property Management page from find tenants

  Scenario: User should be able to access the Short Let services for Landlord page from find tenants
    Given User on Foxtons Find Tenants page from find tenants
    When User clicks on Whats included CTA under OUR LETTINGS PACKAGES, Managed Short let Card from find tenants
    Then User should navigate to Short Let services for Landlord page from find tenants