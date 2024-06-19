@website
Feature: As an anonymous user I want to know why i should choose a new build

#Scenario: 1
Scenario: User Should be able to navigate to New Homes search page
Given User on London New Builds and Home page
When User clicks on View all New Homes CTA
Then User should be able to navigate to New Homes search page

#Scenario: 2 No longer available
Scenario: User Should be able to navigate to Help to Buy Options page under under the fold “Affordable with Help to Buy“
Given User on London New Builds and Home page
When User clicks on Help to Buy Options CTA


#Scenario: 3
Scenario: User Should be able to navigate to Find a New Home page  under the fold “Move in Fast“
Given User on London New Builds and Home page
When User clicks on Find a New Home CTA
Then User should be able to navigate to Find a New Home page

#Scenario: 4
Scenario: User Should be able to navigate to View developments page under the fold “Minimal Maintenance“
Given User on London New Builds and Home page
When User clicks on View developments CTA
Then User should be able to navigate to View developments page

#Scenario: 5
Scenario: User Should be able to navigate to View New Homes page under the fold “High Specifications“
Given User on London New Builds and Home page
When User clicks on View New Homes CTA
Then User should be able to navigate to View New Homes page

#Scenario: 6
Scenario: User Should be able to navigate to Luxury New Homes page
Given User on London New Builds and Home page
When User clicks on Luxury New Homes CTA
Then User should be able to navigate to Luxury New Homes page

#Scenario: 7
Scenario: User Should be able to navigate to Mid range New Homes page
Given User on London New Builds and Home page
When User clicks on Mid range New Homes CTA
Then User should be able to navigate to Mid range New Homes page

#Scenario: 8
Scenario: User Should be able to navigate to Affordable New Homes page
Given User on London New Builds and Home page
When User clicks on Affordable New Homes CTA
Then User should be able to navigate to Affordable New Homes page