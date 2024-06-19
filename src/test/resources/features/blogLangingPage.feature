@website
Feature: As an anonymous user I want access to the blog landing page so that I can see all the blog articles
#   Scenario: 1
  Scenario: User should be able to access the blog page
    Given User on blog Landing page
    When User scroll through the page
    Then User should be able to see all the articles with the latest at the top

#    Scenario: 2
  Scenario: User should be able to see and select the blog categories from the left side panel.
    Given User on blog Landing page
    When User should be able to see the blog categories
    Then User should be able to select the blog categories

#    Scenario: 3
  Scenario: User when click on any of the filters (categories) then the relevant articles will populate.
    Given User on blog Landing page
    When User should be able click on any of the filter categories
    Then User should be able to see only relevant articles on the page

    #    Scenario: 4
  Scenario: User is on the blog landing page should give the option to navigate the page forward or backwards or select the the direct page jump
    Given User on blog Landing page
    When User should scroll on the blog landing page is not infinite scroll
    Then User should be able to see the option to navigate the page forward or backword