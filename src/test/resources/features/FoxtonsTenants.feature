@website
Feature:As an anonymous user I should be able to view benefits of my foxtons for tenants

  #Scenario: 1
  Scenario: User Should be able to view to full features List on foxton tenants page
    Given User on Foxtons tenants page
    When User clicks on View Amazing benefits button on foxton tenants page
    Then User Should be able to view to full features List on foxton tenants page

    #Scenario: 2
  Scenario: User Should be able to navigate to Create Account or registration page
    Given User on Foxtons tenants page
    When User clicks on signup for my foxtons button on foxton tenants page
    Then User Should be able to navigate to Create Account or registration page