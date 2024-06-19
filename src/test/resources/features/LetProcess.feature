@website
Feature:Verify Let Process for anonymous user

  #Scenario: 1
  Scenario: User should be able to access the Registration page
    Given User on Let process page
    When User clicks on Register now CTA
    Then User should be able to navigate to Registration page

     #Scenario: 2
  Scenario: User should be able to access the benefits of Registering page
    Given User on Let process page
    When User clicks on Benefits of Registering CTA
    Then User should be able to navigate to benefits of Registering page