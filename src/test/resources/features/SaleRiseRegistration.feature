Feature: Verify Registration/ Sign up

  Scenario: User should be able to register with valid credentials
    Given User access SaleRise Registration Screen
    When User enters email address
    And User enters password
    And Users clicks on Register button
    Then User should be navigated to SaleRise Admin Portal


  Scenario: One email id should be associated with only one account
    Given User access Registration Screen
    When User enters already existed email address
    When User enters password
    When Users clicks on Register button
    Then User already exists validation should be displayed
