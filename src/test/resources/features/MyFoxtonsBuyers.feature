@website
Feature:As an anonymous user I should be able to view benefits of my foxtons for buyer

  #Scenario: 1
  Scenario: User Should be able to navigate to My Foxtons page
    Given User on Foxtons buyer page
    When User clicks on Go To My Foxtons button
    Then User Should be able to navigate to My Foxtons page

    #Scenario: 2
  Scenario: User Should be able to navigate to SignIN page
    Given User on Foxtons buyer page
    When User clicks on sign_in button
    Then User Should be able to navigate to SignIN page

    #Scenario: 3
  Scenario: User Should be able to navigate to Create an Account page
    Given User on Foxtons buyer page
    When User clicks on register button
    Then User Should be able to navigate to Create an Account page



