@website
Feature: Calculate the maximum mortgage loan amount you could borrow for anonymous user

  #Scenario: 1
  Scenario: User Should be able to calculate mortgage loan amount
    Given User on how much can i borrow page
    When User enter amount of 100 in Applicant one field
    And User enter amount of 100 in Applicant two field
    And User clicks on Calculate
    Then User should be able to see amount "£1,000" in you could borrow upto field

    #Scenario: 2
  Scenario: User Should not be able to see invalid amount error on entering invalid values
    Given User on how much can i borrow page
    When User enter invalid "abc" in Applicant one field
    And User enter  invalid "def" in Applicant two field
    And User clicks on Calculate
    Then User should able to see "Invalid amount" error on both fields

   #Scenario: 3
  Scenario: User Should be able to see recalculate CTA after calculate loan amount
    Given User on how much can i borrow page
    When User enter amount of 300 in Applicant one field
    And User enter amount of 300 in Applicant two field
    And User clicks on Calculate
    And User clicks "Re Calculate" CTA
    Then user should be on how much can i borrow page

    #Scenario: 4
  Scenario: User Should be able to view properties after calculating mortgage
    Given User on how much can i borrow page
    When User enter amount of 300 in Applicant one field for error
    And User enter amount of 300 in Applicant two field for error
    And User clicks on Calculate
    And User clicks on View Properties CTA
    Then User should be able to see "View Properties" CTA view Properties in title

    #Scenario: 5
  Scenario: User Should be able to calculate mortgage if Applicant one amount is given only
    Given User on how much can i borrow page
    When User enter amount of 100 in Applicant one field only
    And User clicks on Calculate
    Then User should be able to see "£500" from Applicant one


    #Scenario: 6
  Scenario: User Should not be able to calculate mortgage if Applicant one amount is not given
    Given User on how much can i borrow page
    When User enter amount of 100 in Applicant two field only
    And User clicks on Calculate
    Then User should not see error "Applicant one income is required"