@website
Feature: As an anonymous user I should be able to see a section prompting me to explore other features available on the Foxton’s website by providing me with relevant and clickable links

  #Scenario: 1
  Scenario: User should be able to see a hero image with text on top of it indicating that I am on the Mortgages page
    Given User on buy mortgage page
    When User checks Mortgages page hero image
    Then Mortgages page hero image should have expected title and subtitles

  #Scenario: 2
  Scenario: User should see a CTA Visit Alexander Hall which upon clicking should take user to Alexander Hall Mortgage expert advice page
    Given User on buy mortgage page
    When User clicks on Visit Alexander Hall button
    Then System should take user to Alexander Hall Mortgage expert advice page

    # Commenting this scenario because its not implemented
#    #Scenario: 3
#  Scenario:I should be able to see a section prompting me to explore other features available on the Foxton’s website by providing me with relevant and clickable links
#    Given User on buy mortgage page
#    When User click on other features available
#    Then user should be redirected to relevant pages

   #Scenario: 4
  Scenario: User should be able to see a fold with card name Moving home mortgages
    Given User on buy mortgage page
    When User clicks on the CTA of Moving home mortgages that is view mortgages
    Then System takes user to to the Alexander Hall Moving Home mortgages page

  #Scenario: 5
  Scenario: User should be able to see a fold with card name Remortgages
    Given User on buy mortgage page
    When User clicks on the CTA of Remortgages that is view mortgages
    Then System takes user to to the  Alexander Hall Remortgaging page

  #Scenario: 6
  Scenario: User should be able to see a fold with card name Do you have questions
    Given User on buy mortgage page
    When User clicks on the CTA of Do you have questions that is contact form
    Then System takes user to to the Alexander Hall Contact Us form page