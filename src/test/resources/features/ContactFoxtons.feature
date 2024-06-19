@website
Feature:Verify Contact Foxtons Form Submitting

  #Scenario: 1
  Scenario: User should be able to access Contact Foxtons Page
    Given Home Screen is opened
    When User access Contact Foxtons URL
    Then User should navigate to Contact Foxtons Page

   #Scenario: 2
  Scenario: User should be able to submit form with General Enquiry
    Given Home Screen is opened
    When User access Contact Foxtons URL
    When User selects General Enguiry Subject
    When User enters comments
    When User enters first name
    When User enters last name
    When User enters phone number
    When User enters email id
    When User submits the form
    Then User should see a success message

    #Scenario: 3
  Scenario: User should be able to submit form with Looking to Buy Subject
    Given Home Screen is opened
    When User access Contact Foxtons URL
    When User selects Looking to Buy Subject
    When User enters comments
    When User enters first name
    When User enters last name
    When User enters phone number
    When User enters email id
    When User submits the form
    Then User should see a success message

    #Scenario: 4
  Scenario: User should be able to submit form with Looking to Rent Subject
    Given Home Screen is opened
    When User access Contact Foxtons URL
    When User selects Looking to Rent Subject
    When User enters comments
    When User enters first name
    When User enters last name
    When User enters phone number
    When User enters email id
    When User submits the form
    Then User should see a success message

     #Scenario: 5
  Scenario: User should be able to submit form with Want to Sell Subject
    Given Home Screen is opened
    When User access Contact Foxtons URL
    When User selects Want to Sell Subject
    When User enters comments
    When User enters first name
    When User enters last name
    When User enters phone number
    When User enters email id
    When User submits the form
    Then User should see a success message

        #Scenario: 6
  Scenario: User should be able to submit form with Property Management Subject
    Given Home Screen is opened
    When User access Contact Foxtons URL
    When User selects Property Management Subject
    When User enters comments
    When User enters first name
    When User enters last name
    When User enters phone number
    When User enters email id
    When User submits the form
    Then User should see a success message

     #Scenario: 7 No longer present
  #Scenario: User should be able to submit form with Help to Buy Subject
  #  Given Home Screen is opened
  #  When User access Contact Foxtons URL
  #  When User selects Help to Buy Subject
  #  When User enters comments
  #  When User enters first name
  #  When User enters last name
  #  When User enters phone number
  #  When User enters email id
  #  When User submits the form
  #  Then User should see a success message

     #Scenario: 8
  Scenario: User should be able to submit form with Property Development Subject
    Given Home Screen is opened
    When User access Contact Foxtons URL
    When User selects Property Development Subject
    When User enters comments
    When User enters first name
    When User enters last name
    When User enters phone number
    When User enters email id
    When User submits the form
    Then User should see a success message

    #Scenario: 9 last 2 scenarios failing because of bug
  Scenario: User should be able to submit form with Complaints Subject
    Given Home Screen is opened
    When User access Contact Foxtons URL
    When User selects Complaints Subject
    When User enters comments
    When User enters first name
    When User enters last name
    When User enters phone number
    When User enters email id
    When User submits the form
    Then User should see a success message

     #Scenario: 10
  Scenario: User should be able to submit form with Feedbacks Subject
    Given Home Screen is opened
    When User access Contact Foxtons URL
    When User selects Feedbacks Subject
    When User enters comments
    When User enters first name
    When User enters last name
    When User enters phone number
    When User enters email id
    When User submits the form
    Then User should see a success message