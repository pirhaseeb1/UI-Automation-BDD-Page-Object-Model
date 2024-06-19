@website
Feature:As an anonymous user I should be able to view benefits of my foxtons for landlords

  #Scenario: 1
  Scenario: User Should be able to view all features List
    Given User on Foxtons landlords page
    When User clicks on view all features button
    Then User Should be able to view all features List

    #Scenario: 2
  Scenario: User Should be able to navigate to Registration Account page
    Given User on Foxtons landlords page
    When User clicks on signup foxtons button
    Then User Should be able to navigate to Registration Account page

#Scenario: 3
  Scenario: User Should be able to navigate to Registration Account page under instant rental notifications
    Given User on Foxtons landlords page
    When User clicks on signup foxtons button under instant rental notifications
    Then User Should be able to navigate to Registration Account page under instant rental notifications

#Scenario: 4
  Scenario: User Should be able to navigate to Registration Account page under Property Maintenance Streamlined
    Given User on Foxtons landlords page
    When User clicks on signin or register button under Property Maintenance Streamlined
    Then User Should be able to navigate to Registration Account page under Property Maintenance Streamlined

    #Scenario: 5
  Scenario: User Should be able to navigate to Registration Account page under One Click Tax Return
    Given User on Foxtons landlords page
    When User clicks on signup now button under One Click Tax Return
    Then User Should be able to navigate to Registration Account page under One Click Tax Return



