@website
Feature: As an anonymous user I should be able to learn why i should use foxtons as a buyer

    #Scenario: 1

  Scenario: User should be able to see a hero image with title and a subtext.
    Given User on Why Use Foxtons Page
    When User checks the hero image
    Then image should have expected title and subtitles

    #Scenario: 2
  Scenario: User should see a CTA “Register Now“ which upon clicking should take user to My Foxtons Registration page.
    Given User on Why Use Foxtons Page
    When User clicks on Register Now button
    Then System takes user to Registration Page

    #Scenario: 3
  Scenario: User should see a fold with a title and subtext
    Given User on Why Use Foxtons Page
    When User checks the fold
    Then fold should have the expected title subtitle and points

    #Scenario: 4
  Scenario: User clicks on Started button on fold image
    Given User on Why Use Foxtons Page
    When User clicks on Get Started In Seconds Button
    Then User lands on Registration Page

    #Scenario: 5
  Scenario: User clicks on LearnMore button on fold image
    Given User on Why Use Foxtons Page
    When User clicks on Learn More CTA Button
    Then System should take user to Foxtons Register as a buyer or Register as a renter page

    #Scenario: 6
  Scenario: User should see a fold with a title “Get ahead of other buyers“ and the subtext
    Given User on Why Use Foxtons Page
    When User checks thousands of property fold
    Then card should have expected title and subtitle

    #Scenario: 7
  Scenario:User clicks on SearchNow button on fold image
    Given User on Why Use Foxtons Page
    When User clicks on Search Now
    Then User lands on Why Foxtons Page

