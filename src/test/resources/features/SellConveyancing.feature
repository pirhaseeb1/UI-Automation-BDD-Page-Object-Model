@website
Feature: As an anonymous user I should be able to access Sell Conveyancing Page

    #Scenario: 1
  Scenario: User should be able to see a hero image with text on top of it indicating that user is on the “Conveyancing” page with a subtext “Be sale ready Solicitors hand-picked for their expertise, speed & efficiency”
    Given User on Conveyancing Page
    When User checks the conveyancing card image
    Then conveyancing card should have expected title and subtitles

    #Scenario: 2
  Scenario: User should see a CTA “Get a quote“ which upon clicking should open up the mail application and fill in this email address in the 'To' section “info@conveyan.co.uk;“
    Given User on Conveyancing Page
    When User clicks on Get a Quote button
    Then System should open up the mail application

    #Scenario: 3
  Scenario: User should be able to see a marketing fold with a text on top of it “London's conveyancing experts“ and some subtext explaining the features and benefits of using the solicitor services of Conveyan
    Given User on Conveyancing Page
    When User checks the marketing fold card
    Then marketing fold card should have expected title subtitles and bullet points

        #Scenario: 4
   Scenario: User should be able to see a fold with Title: “Why use Conveyan“
     Given User on Conveyancing Page
     When User checks the fold card
     Then user see all the benefits and features of Conveyan services in a list format


      #Scenario: 5
   Scenario: User should be able to see a fold with Title: “Be sale ready with Conveyan“
     Given User on Conveyancing Page
     When User checks be sale ready card
     Then user see fold with Title Be sale ready with Conveyan and subtitle

      #Scenario: 6
   Scenario: User should be able to see a section prompting me to explore other features
     Given User on Conveyancing Page
     When User checks be explore foxtons section
     Then user should see relevant and clickable links

