@website
Feature: Verify the Instruct Foxtons form to let the property of an anonymous user, as per FDW-403, as detailed in FQA-484

  #Scenario: 1
  Scenario: User should be able to access the Instruct Foxtons page
    Given The Home Screen is opened
    When User accesses the Instruct Foxtons URL
    And User should navigate to the Instruct Foxtons page
    Then Verify the Instruct Foxtons page

  #Scenario: 2
  Scenario: User should be able to see proper subheading on the Instruct Foxtons page
    Given The Home Screen is opened
    When User accesses the Instruct Foxtons URL
    And User should navigate to the Instruct Foxtons page
    And User sees the subheading on the Instruct Foxtons page
    # Only checking if some text is present because we are not supposed to do exact text based checks
    Then User should see that the subheading contains some text on the Instruct Foxtons page

  #Scenario: 3
  Scenario: User should be able to fill the Rental Price text field on the Instruct Foxtons page
    Given The Home Screen is opened
    When User accesses the Instruct Foxtons URL
    And User should navigate to the Instruct Foxtons page
    And User enters some text in the Rental Price text field on the Instruct Foxtons page
    Then The Rental Price text field on the Instruct Foxtons page should contain the text that the user entered

  #Scenario: 4
  Scenario: User should be able to see a calendar when they click on the When do you need tenants field on the Instruct Foxtons page
    Given The Home Screen is opened
    When User accesses the Instruct Foxtons URL
    And User should navigate to the Instruct Foxtons page
    And User clicks on When do you need tenants field on the Instruct Foxtons page
    Then A calendar should pop up beside the When do you need tenants field on the Instruct Foxtons page

  #Scenario: 5
  Scenario: The date should be filled in YYYY-MM-DD format after selection from the calendar on the When do you need tenants field on the Instruct Foxtons page
    Given The Home Screen is opened
    When User accesses the Instruct Foxtons URL
    And User should navigate to the Instruct Foxtons page
    And User picks a date from the calendar on the When do you need tenants field on the Instruct Foxtons page
    Then The date field should be automatically filled in a YYYY-MM-DD format in the When do you need tenants field on the Instruct Foxtons page

  #Scenario: 6
#  Scenario: User should be able to see a Post code field with a Find UK Address CTA on the Instruct Foxtons page
    Given The Home Screen is opened
    When User accesses the Instruct Foxtons URL
    And User should navigate to the Instruct Foxtons page
    Then There should be a Postcode field with a Find UK Address CTA on the Instruct Foxtons page

  #Scenario: 7
  Scenario: User should be able to see a Select Address dropdown upon clicking on the Find UK Address CTA on the Instruct Foxtons page
    Given The Home Screen is opened
    When User accesses the Instruct Foxtons URL
    And User should navigate to the Instruct Foxtons page
    And User enters a valid post code in the Postcode field and clicks on the Find UK Address CTA on the Instruct Foxtons page
    Then The Select Address dropdown field should appear on the Instruct Foxtons page

  #Scenario: 8
  Scenario: User should be able to see Address, Town and Post Code fields after selecting an address from the Select Address dropdown on the Instruct Foxtons page
    Given The Home Screen is opened
    When User accesses the Instruct Foxtons URL
    And User should navigate to the Instruct Foxtons page
    And User enters a valid post code in the Postcode field and clicks on the Find UK Address CTA on the Instruct Foxtons page
    And User selects an address from the Select Address dropdown that appeared on the Instruct Foxtons page
    Then The form should reload to show filled Address, Town and Post Code fields on the Instruct Foxtons page

  #Scenario: 9
  Scenario: User should be able to see a Titles drop down, First Name and Last Name text fields in the About You section on the Instruct Foxtons page
    Given The Home Screen is opened
    When User accesses the Instruct Foxtons URL
    And User should navigate to the Instruct Foxtons page
    Then There should be a Titles drop down, First Name and Last Name text fields in the About You section on the Instruct Foxtons page

  Scenario: 10
  Scenario: User should be able to see an Email and Phone text fields in the About You section on the Instruct Foxtons page
    Given The Home Screen is opened
    When User accesses the Instruct Foxtons URL
    And User should navigate to the Instruct Foxtons page
    Then There should be Email and Phone text fields in the About You section on the Instruct Foxtons page

  #Scenario: 11
  Scenario: User should be able to see a check box option to choose to receive follow up information on the Instruct Foxtons page
    Given The Home Screen is opened
    When User accesses the Instruct Foxtons URL
    And User should navigate to the Instruct Foxtons page
    Then There should be a check box option to choose to receive follow up information on the Instruct Foxtons page

  #Scenario: 12
  Scenario: User should be able to view a success message letting the user know the form was submitted when the user clicks on the Send request CTA on the Instruct Foxtons page
    Given The Home Screen is opened
    When User accesses the Instruct Foxtons URL
    And User should navigate to the Instruct Foxtons page
    And User clicks on the Send request CTA after filling out all fields with relevant data on the Instruct Foxtons page
    Then User should see a success message letting the user know the form was submitted when the user clicks on the Send request CTA on the Instruct Foxtons page

  #Scenario: 13
  Scenario: User should be able to view a success message with heading Thank You when the user clicks on the Send request CTA on the Instruct Foxtons page
    Given The Home Screen is opened
    When User accesses the Instruct Foxtons URL
    And User should navigate to the Instruct Foxtons page
    And User clicks on the Send request CTA after filling out all fields with relevant data on the Instruct Foxtons page
    Then User should see a success message with heading Thank You when the user clicks on the Send request CTA on the Instruct Foxtons page

  #Scenario: 14
  Scenario: User should be able to view a success message with a subheading when the user clicks on the Send request CTA on the Instruct Foxtons page
    Given The Home Screen is opened
    When User accesses the Instruct Foxtons URL
    And User should navigate to the Instruct Foxtons page
    And User clicks on the Send request CTA after filling out all fields with relevant data on the Instruct Foxtons page
    Then User should see a success message with a subheading when the user clicks on the Send request CTA on the Instruct Foxtons page

  #Scenario: 15
  Scenario: User should be able to view a success message with a CTA for view My Foxtons features when the user clicks on the Send request CTA on the Instruct Foxtons page
    Given The Home Screen is opened
    When User accesses the Instruct Foxtons URL
    And User should navigate to the Instruct Foxtons page
    And User clicks on the Send request CTA after filling out all fields with relevant data on the Instruct Foxtons page
    Then User should see a success message with a CTA for view My Foxtons features when the user clicks on the Send request CTA on the Instruct Foxtons page

  #Scenario: 16
  Scenario: User should be able to view a success message with a CTA for visiting Alexander Hall when the user clicks on the Send request CTA on the Instruct Foxtons page
    Given The Home Screen is opened
    When User accesses the Instruct Foxtons URL
    And User should navigate to the Instruct Foxtons page
    And User clicks on the Send request CTA after filling out all fields with relevant data on the Instruct Foxtons page
    Then User should see a success message with a CTA for visiting Alexander Hall when the user clicks on the Send request CTA on the Instruct Foxtons page