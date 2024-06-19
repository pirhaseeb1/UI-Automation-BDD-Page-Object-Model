@portal
Feature: As a signed out user I need to be able to reset my password for My Foxtons so that in case i forget my password I can reset it, as per FDP-146, as detailed in FQA-655.

  # Scenario 1
  @portal-release-1
  Scenario: User should be able to click on forgot password CTA on the My Foxtons Login page
    Given User access Sign In Screen
    When User sees the forgot password CTA on the My Foxtons Login page
    Then The forgot password CTA on the My Foxtons Login page should be clickable

  # Scenario 2
  @portal-release-1
  Scenario: User should navigate to the Forgot Password page when he clicks on on forgot password CTA the My Foxtons Login page
    Given User access Sign In Screen
    When User clicks on the forgot password CTA on the My Foxtons Login page
    Then User should be navigated to the Forgot Password page

  # Scenario 3
  @portal-release-1
  Scenario: User should be able to click the continue CTA when they type in their email address on the Forgot Password page
    Given User is on the Forgot Password page
    When User types in an already existing email address on the Forgot Password page
    Then User should be able to click the continue CTA on the Forgot Password page

  # Scenario 4
  @portal-release-1
  Scenario: User should be sent a confirmation message letting them know a reset link has been sent to their given email when he clicks the continue CTA on the Forgot Password page
    Given User access Registration Screen
    Given User enters email address
    Given User enters password
    Given User enters confirm password
    Given Users clicks on Sign Up button
    Given User has been navigated to Verify Account Screen
    Given User checks the account verification email and clicks on the verify your account link in the email
    Given The user clicks on the logout button on top-left of the page
    Given The user clicks on the logout button on logout confirmation pane
    Given User is on the Forgot Password page
    When User types in an already existing email address on the Forgot Password page
    When User clicks on the continue CTA on the Forgot Password page
    Then User should be presented with a message that the reset password link has been sent to the email address

  # Scenario 5
  @portal-release-1
  Scenario: User should land on the Reset Password page when the reset link in the email is clicked
    Given User access Registration Screen
    Given User enters email address
    Given User enters password
    Given User enters confirm password
    Given Users clicks on Sign Up button
    Given User has been navigated to Verify Account Screen
    Given User checks the account verification email and clicks on the verify your account link in the email
    Given The user clicks on the logout button on top-left of the page
    Given The user clicks on the logout button on logout confirmation pane
    Given User is on the Forgot Password page
    Given User types in an already existing email address on the Forgot Password page
    Given User clicks on the continue CTA on the Forgot Password page
    Given User checks the reset password email and clicks on the reset password link in the email
    Then User should land on the Reset Password page

  # Scenario 6
  @portal-release-1
  Scenario: User should be able to edit the new password text field and view the password policy on the Reset Password page
    Given User access Registration Screen
    Given User enters email address
    Given User enters password
    Given User enters confirm password
    Given Users clicks on Sign Up button
    Given User has been navigated to Verify Account Screen
    Given User checks the account verification email and clicks on the verify your account link in the email
    Given The user clicks on the logout button on top-left of the page
    Given The user clicks on the logout button on logout confirmation pane
    Given User is on the Forgot Password page
    Given User types in an already existing email address on the Forgot Password page
    Given User clicks on the continue CTA on the Forgot Password page
    Given User checks the reset password email and clicks on the reset password link in the email
    When User clicks on the new password text field on the Reset Password page
    Then User should be able to edit the new password text field on the Reset Password page
    Then The user should be able to see if the required conditions for a valid password are met as they type the new password

  # Scenario 7
  @portal-release-1
  Scenario: User should be able to edit the confirm new password text field on the Reset Password page
    Given User access Registration Screen
    Given User enters email address
    Given User enters password
    Given User enters confirm password
    Given Users clicks on Sign Up button
    Given User has been navigated to Verify Account Screen
    Given User checks the account verification email and clicks on the verify your account link in the email
    Given The user clicks on the logout button on top-left of the page
    Given The user clicks on the logout button on logout confirmation pane
    Given User is on the Forgot Password page
    Given User types in an already existing email address on the Forgot Password page
    Given User clicks on the continue CTA on the Forgot Password page
    Given User checks the reset password email and clicks on the reset password link in the email
    When User clicks on the confirm new password text field on the Reset Password page
    Then User should be able to edit the confirm new password text field on the Reset Password page

  # Scenario 8
  @portal-release-1
  Scenario: The confirm new password text field show show that it does not match if it does not match with the new password on the Reset Password page
    Given User access Registration Screen
    Given User enters email address
    Given User enters password
    Given User enters confirm password
    Given Users clicks on Sign Up button
    Given User has been navigated to Verify Account Screen
    Given User checks the account verification email and clicks on the verify your account link in the email
    Given The user clicks on the logout button on top-left of the page
    Given The user clicks on the logout button on logout confirmation pane
    Given User is on the Forgot Password page
    Given User types in an already existing email address on the Forgot Password page
    Given User clicks on the continue CTA on the Forgot Password page
    Given User checks the reset password email and clicks on the reset password link in the email
    When User enters a password that fulfils the password policy in the new password text field on the Reset Password page
    When User enters a different password in the confirm new password text field on the Reset Password page
    Then Passwords do not match validation should be displayed on the Reset Password page

  # Scenario 9
  @portal-release-1
  Scenario: The confirm new password text field show show that it does not match if it matches exactly with the new password on the Reset Password page
    Given User access Registration Screen
    Given User enters email address
    Given User enters password
    Given User enters confirm password
    Given Users clicks on Sign Up button
    Given User has been navigated to Verify Account Screen
    Given User checks the account verification email and clicks on the verify your account link in the email
    Given The user clicks on the logout button on top-left of the page
    Given The user clicks on the logout button on logout confirmation pane
    Given User is on the Forgot Password page
    Given User types in an already existing email address on the Forgot Password page
    Given User clicks on the continue CTA on the Forgot Password page
    Given User checks the reset password email and clicks on the reset password link in the email
    When User enters a password that fulfils the password policy in the new password text field on the Reset Password page
    When User enters the same password in the confirm new password text field on the Reset Password page
    Then Passwords do not match validation should not be displayed on the Reset Password page

  # Scenario 10
  @portal-release-1
  Scenario: User should be taken to a screen giving a password update confirmation message if the user enters proper values in new password and confirm new password fields and press the continue CTA on the Reset Password page
    Given User access Registration Screen
    Given User enters email address
    Given User enters password
    Given User enters confirm password
    Given Users clicks on Sign Up button
    Given User has been navigated to Verify Account Screen
    Given User checks the account verification email and clicks on the verify your account link in the email
    Given The user clicks on the logout button on top-left of the page
    Given The user clicks on the logout button on logout confirmation pane
    Given User is on the Forgot Password page
    Given User types in an already existing email address on the Forgot Password page
    Given User clicks on the continue CTA on the Forgot Password page
    Given User checks the reset password email and clicks on the reset password link in the email
    When User enters a password that fulfils the password policy in the new password text field on the Reset Password page
    When User enters the same password in the confirm new password text field on the Reset Password page
    When User clicks on the continue CTA on the Reset Password page
    Then User should be taken to a screen giving a password update confirmation message

  # Scenario 11
  @portal-release-1
  Scenario: User should be navigated to the sign in page if the user clicks on the back to sign in CTA on the Reset Password page
    Given User access Registration Screen
    Given User enters email address
    Given User enters password
    Given User enters confirm password
    Given Users clicks on Sign Up button
    Given User has been navigated to Verify Account Screen
    Given User checks the account verification email and clicks on the verify your account link in the email
    Given The user clicks on the logout button on top-left of the page
    Given The user clicks on the logout button on logout confirmation pane
    Given User is on the Forgot Password page
    Given User types in an already existing email address on the Forgot Password page
    Given User clicks on the continue CTA on the Forgot Password page
    Given User checks the reset password email and clicks on the reset password link in the email
    When User enters a password that fulfils the password policy in the new password text field on the Reset Password page
    When User enters the same password in the confirm new password text field on the Reset Password page
    When User clicks on the continue CTA on the Reset Password page
    When User clicks on the back to sign in CTA on the Reset Password page
    Then User should navigate to Login Screen