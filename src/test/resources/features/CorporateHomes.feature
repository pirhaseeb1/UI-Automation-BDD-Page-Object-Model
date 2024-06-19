@website
Feature: As an anonymous user I want to learn more about the relocation services offered by foxtons

#Scenario: 1
Scenario: User Should be able to navigate to Enquire now page
Given User on RELOCATING TO LONDON page
When User clicks on Enquire now CTA under RELOCATING TO LONDON
Then User should be able to navigate to Enquire now page

#Scenario: 2
Scenario: User Should be able to navigate to Tell us your requirements page
Given User on RELOCATING TO LONDON page
When User clicks on Tell us your requirements CTA under RELOCATING YOUR STAFF TO LONDON MADE EASY
Then User should be able to navigate to Tell us your requirements page

#Scenario: 3
Scenario: User Should be able to navigate to Tell us your requirements page under LET US SEARCH FOR YOU
Given User on RELOCATING TO LONDON page
When User clicks on Tell us your requirements CTA under LET US SEARCH FOR YOU
Then User should be able to navigate to Tell us your requirements page

