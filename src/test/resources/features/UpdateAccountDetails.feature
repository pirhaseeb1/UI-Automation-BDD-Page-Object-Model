@portal
Feature: Verify that a signed in user who does not have active business with Foxtons can update the email address and login ID, as per FDP-172, as detailed in FQA-659

  # Scenario 1
  @portal-release-1
  Scenario: User should be taken to a new page from the User Profile page where they can update their email address
    Given User access Sign In Screen
    Given User enters valid email address
    Given User enters valid password
    Given Users clicks on Sign In button
    Given User clicks on the Profile link from the navigation bar
    Given User is navigated to the User Profile page
    When User is on the update contact details section on the User Profile page
    When User clicks on the update email address CTA on the update contact details section on the User Profile page
    Then User should be navigated to a new page from the User Profile page where they can update their email address

  # Scenario 2
  @portal-release-1
  Scenario: User should be able to see proper heading and subheading on the Update Email Address page
    Given User access Sign In Screen
    Given User enters valid email address
    Given User enters valid password
    Given Users clicks on Sign In button
    Given User clicks on the Profile link from the navigation bar
    Given User is navigated to the User Profile page
    When User is on the update contact details section on the User Profile page
    When User clicks on the update email address CTA on the update contact details section on the User Profile page
    When User navigates to the Update Email Address page from the User Profile page
    Then User should see the main heading as "Update your email address" on the Update Email Address page
    Then User should see the subheading as "Updating your email address will also update your log-in ID" on the Update Email Address page

  # Scenario 3
  @portal-release-1
  Scenario: User should be able to see the change email address button enabling after entering confirm new email address on the Update Email Address page
    Given User access Sign In Screen
    Given User enters valid email address
    Given User enters valid password
    Given Users clicks on Sign In button
    Given User clicks on the Profile link from the navigation bar
    Given User is navigated to the User Profile page
    When User is on the update contact details section on the User Profile page
    When User clicks on the update email address CTA on the update contact details section on the User Profile page
    When User navigates to the Update Email Address page from the User Profile page
    When User enters new email on the Update Email Address page
    When User enters the same confirm new email as new email on the Update Email Address page
    Then User should see that the change email address button has been enabled on the Update Email Address page

  # Scenario 4
  @portal-release-1
  Scenario: User should be taken to the User Profile page if they click on the profile link from the navigation bar while on the Update Email Address page without changes being saved
    Given User access Sign In Screen
    Given User enters valid email address
    Given User enters valid password
    Given Users clicks on Sign In button
    Given User clicks on the Profile link from the navigation bar
    Given User is navigated to the User Profile page
    When User is on the update contact details section on the User Profile page
    When User clicks on the update email address CTA on the update contact details section on the User Profile page
    When User navigates to the Update Email Address page from the User Profile page
    When User enters new email on the Update Email Address page
    When User enters the same confirm new email as new email on the Update Email Address page
    When User clicks on the Profile link from the navigation bar
    Then User should be navigated to the User Profile page

  # Scenario 5
  @portal-release-1
  Scenario: User should be able to view their current email address, text field for new email and confirm email, and an update CTA on the Update Email Address page
    Given User access Sign In Screen
    Given User enters valid email address
    Given User enters valid password
    Given Users clicks on Sign In button
    Given User clicks on the Profile link from the navigation bar
    Given User is navigated to the User Profile page
    When User is on the update contact details section on the User Profile page
    When User clicks on the update email address CTA on the update contact details section on the User Profile page
    When User navigates to the Update Email Address page from the User Profile page
    Then User should view their current email address on the Update Email Address page
    Then User should view a text field for new email on the Update Email Address page
    Then User should view a text field for confirm email on the Update Email Address page
    Then User should view an update CTA on the Update Email Address page

  # Scenario 6
  @portal-release-1
  Scenario: User should be able to edit the new email text field on the Update Email Address page upon clicking on the field
    Given User access Sign In Screen
    Given User enters valid email address
    Given User enters valid password
    Given Users clicks on Sign In button
    Given User clicks on the Profile link from the navigation bar
    Given User is navigated to the User Profile page
    When User is on the update contact details section on the User Profile page
    When User clicks on the update email address CTA on the update contact details section on the User Profile page
    When User navigates to the Update Email Address page from the User Profile page
    When User clicks on the new email textbox on the Update Email Address page
    Then User should be able to enter text into the new email textbox on the Update Email Address page

  # Scenario 7
  @portal-release-1
  Scenario: User should be able to edit the confirm new email text field on the Update Email Address page upon clicking on the field
    Given User access Sign In Screen
    Given User enters valid email address
    Given User enters valid password
    Given Users clicks on Sign In button
    Given User clicks on the Profile link from the navigation bar
    Given User is navigated to the User Profile page
    When User is on the update contact details section on the User Profile page
    When User clicks on the update email address CTA on the update contact details section on the User Profile page
    When User navigates to the Update Email Address page from the User Profile page
    When User clicks on the confirm new email textbox on the Update Email Address page
    Then User should be able to enter text into the confirm new email textbox on the Update Email Address page

  # Scenario 8
  @portal-release-1
  Scenario: User should be able to click on the change email address button after filling all text fields on the Update Email Address page
    Given User access Sign In Screen
    Given User enters valid email address
    Given User enters valid password
    Given Users clicks on Sign In button
    Given User clicks on the Profile link from the navigation bar
    Given User is navigated to the User Profile page
    When User is on the update contact details section on the User Profile page
    When User clicks on the update email address CTA on the update contact details section on the User Profile page
    When User navigates to the Update Email Address page from the User Profile page
    When User enters new email on the Update Email Address page
    When User enters the same confirm new email as new email on the Update Email Address page
    Then User should be able to click on the change email address button on the Update Email Address page

  # Scenario 9
  @portal-release-1
  Scenario: User should be able to see a message to update their details to include first name, last name and a phone number on the Update Email Address page if the user has not updated first name, last name and phone number
    # Creating a new account for this test case so that it may execute till the end in case the configured account does not meet the criteria
    Given User access Registration Screen
    Given User enters email address
    Given User enters password
    Given User enters confirm password
    Given Users clicks on Sign Up button
    Given User has been navigated to Verify Account Screen
    Given User checks the account verification email and clicks on the verify your account link in the email
    Given User clicks on the Profile link from the navigation bar
    Given User is navigated to the User Profile page
    Given User is on the update contact details section on the User Profile page
    Given User has not updated their first name on the User Profile page
    Given User has not updated their last name on the User Profile page
    Given User has not updated their phone number on the User Profile page
    When User clicks on the update email address CTA on the update contact details section on the User Profile page
    When User navigates to the Update Email Address page from the User Profile page
    When User enters new email on the Update Email Address page
    When User enters the same confirm new email as new email on the Update Email Address page
    When User clicks on the change email address button on the Update Email Address page
    Then User should see a message to update their details to include first name, last name and a phone number on the Update Email Address page