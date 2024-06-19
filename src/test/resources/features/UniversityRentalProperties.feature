@website
Feature: Verify that an anonymous user can see all rental property options near a university, as per FDW-400, as detailed in FQA-565

  #Scenario: 1
  Scenario: User should be able to access the University page
    Given The Home Screen is opened
    When User accesses the University Rental Properties URL
    Then User should navigate to the University Rental Properties page

  #Scenario: 2
  Scenario: User should be able to see a hero image on the University Rental Properties page with proper heading and subtext
    Given User accesses the University Rental Properties URL
    When User sees the hero image on the University Rental Properties page
    Then User should see proper heading and subtext on the hero image on the University Rental Properties page

  #Scenario: 3
  Scenario: User should be able to see a section with a fold heading on the University Rental Properties page
    Given User accesses the University Rental Properties URL
    When User scrolls down below the hero image on the University Rental Properties page
    Then User should see the section with a fold heading on the University Rental Properties page

  #Scenario: 4
  Scenario: User should be able to see that the section with a fold heading lists all universities and colleges on the University Rental Properties page
    Given User accesses the University Rental Properties URL
    When User scrolls down below the fold heading in a section on the University Rental Properties page
    Then User should see the section with a fold heading lists all universities and colleges on the University Rental Properties page

  #Scenario: 5
  Scenario: User should be able to see name of the institution on a university card on the University Rental Properties page
    Given User accesses the University Rental Properties URL
    When User scrolls down below the fold heading in a section on the University Rental Properties page
    Then User should see name of the institution on a university card on the University Rental Properties page

  #Scenario: 6
  Scenario: User should be able to see address of the institution on a university card on the University Rental Properties page
    Given User accesses the University Rental Properties URL
    When User scrolls down below the fold heading in a section on the University Rental Properties page
    Then User should see address of the institution on a university card on the University Rental Properties page

  #Scenario: 7
  Scenario: User should be able to see postal code of the institution on a university card on the University Rental Properties page
    Given User accesses the University Rental Properties URL
    When User scrolls down below the fold heading in a section on the University Rental Properties page
    Then User should see postal code of the institution on a university card on the University Rental Properties page

  #Scenario: 8
  Scenario: User should be able to see a find accommodation link on a university card on the University Rental Properties page
    Given User accesses the University Rental Properties URL
    When User scrolls down below the fold heading in a section on the University Rental Properties page
    Then User should see a find accommodation link on a university card on the University Rental Properties page

  #Scenario: 9
  Scenario: Find Accommodation link should take the user to the search parameters with the university’s location from the University Rental Properties page
    Given User accesses the University Rental Properties URL
    When User scrolls down below the fold heading in a section on the University Rental Properties page
    And User clicks on the Find Accommodation link on a university card on the University Rental Properties page
    Then User should be taken to a page with search parameters with the university's location on the University Rental Properties page

  #Scenario: 10
  Scenario: User should be able to see that the university cards are displayed in a two rows and three columns per page format on the University Rental Properties page
    Given User accesses the University Rental Properties URL
    When User scrolls down below the fold heading in a section on the University Rental Properties page
    Then User should see that the university cards are displayed in a two rows and three columns per page format on the University Rental Properties page

  #Scenario: 11
  Scenario: User should be able to navigate through the university list by selecting next pages on the University Rental Properties page
    Given User accesses the University Rental Properties URL
    When User scrolls down below the fold heading in a section on the University Rental Properties page
    Then User should navigate through the university list by selecting next pages on the University Rental Properties page

  #Scenario: 12
  Scenario: User should be able to navigate through the university list by selecting previous pages on the University Rental Properties page
    Given User accesses the University Rental Properties URL
    When User scrolls down below the fold heading in a section on the University Rental Properties page
    Then User should navigate through the university list by selecting previous pages on the University Rental Properties page

  #Scenario: 13
  Scenario: User should be able to navigate through the university list by directly selecting the number of page on the University Rental Properties page
    Given User accesses the University Rental Properties URL
    When User scrolls down below the fold heading in a section on the University Rental Properties page
    Then User should navigate through the university list by directly selecting the number of page on the University Rental Properties page

  #Scenario: 14
  Scenario: User should be able to see the Foxtons website footer at the bottom of the University Rental Properties page
    Given User accesses the University Rental Properties URL
    When User scrolls down to the end of the University Rental Properties page
    Then User should see the Foxtons website footer at the bottom of the page
