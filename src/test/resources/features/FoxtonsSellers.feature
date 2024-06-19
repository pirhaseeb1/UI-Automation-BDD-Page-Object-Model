@website
Feature:As an anonymous user I should be able to view benefits of my foxtons for sellers

  #Scenario: 1
  Scenario: User Should be able to view to full features List
    Given User on Foxtons seller page
    When User clicks on View Amazing benefits button
    Then User Should be able to view full features List

    #Scenario: 2
  Scenario: User Should be able to navigate to Create Account page
    Given User on Foxtons seller page
    When User clicks on signup for my foxtons button
    Then User Should be able to navigate to Create Account page