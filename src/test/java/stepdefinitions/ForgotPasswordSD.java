package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.ForgotPasswordPage;
import pages.YopmailPage;
import pages.ResetPasswordPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

import java.util.ArrayList;

import static org.testng.Assert.*;
import static pages.ForgotPasswordPage.forgotPasswordURL;
import static pages.RegistrationPage.UserEmail;

public class ForgotPasswordSD {
    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    ForgotPasswordPage fPPage = new ForgotPasswordPage(driver);
    YopmailPage yopmail = new YopmailPage(driver);
    ResetPasswordPage rPPage = new ResetPasswordPage(driver);
    public String phraseInVerifyAccountEmailSubject = "Welcome to My Foxtons";
    public String phraseInResetPasswordEmailSubject = "Password Request";
    public String phraseOnVerifyAccountCTA = "Verify your account";
    public String phraseOnResetPasswordCTA = "Reset your password";

    // Scenario 1

    @When("User sees the forgot password CTA on the My Foxtons Login page")
    public void userSeesTheForgotPasswordCTAOnTheMyFoxtonsLoginPage() {
        fPPage.isForgotPasswordCTAPresent();
    }

    @Then("The forgot password CTA on the My Foxtons Login page should be clickable")
    public void theForgotPasswordCTAOnTheMyFoxtonsLoginPageShouldBeClickable() {
        assertTrue(fPPage.isForgotPasswordCTAClickable());
    }

    // Scenario 2

    @When("User clicks on the forgot password CTA on the My Foxtons Login page")
    public void userClicksOnTheForgotPasswordCTAOnTheMyFoxtonsLoginPage() {
        fPPage.clickForgotPasswordCTA();
    }

    @Then("User should be navigated to the Forgot Password page")
    public void userShouldBeNavigatedToTheForgotPasswordPage() {
        CommonMethods.assertCustomEquals(forgotPasswordURL, driver.getCurrentUrl());
    }

    // Scenario 3

    @Given("User is on the Forgot Password page")
    public void userIsOnTheForgotPasswordPage() {
        fPPage.accessForgotPasswordPage();
    }

    @When("User types in an already existing email address on the Forgot Password page")
    public void userTypesInAnAlreadyExistingEmailAddressOnTheForgotPasswordPage() {
        fPPage.enterForgotPasswordEmail(UserEmail);
    }

    @Then("User should be able to click the continue CTA on the Forgot Password page")
    public void userShouldBeAbleToClickTheContinueCTAOnTheForgotPasswordPage() {
        assertTrue(fPPage.isContinueCTAClickable());
    }

    // Scenario 4

    @Given("User checks the account verification email and clicks on the verify your account link in the email")
    public void userChecksTheAccountVerificationEmailAndClicksOnTheVerifyYourAccountLinkInTheEmail() {
        yopmail.openYopmailInANewTab();
        yopmail.enterEmailAddressOnYopmailAndOpenInbox(UserEmail);
        yopmail.locateAndOpenFoxtonsEmailOnYopmail(phraseInVerifyAccountEmailSubject);
        yopmail.clickCTAInTheFoxtonsEmailOnYopmail(phraseOnVerifyAccountCTA);
        fPPage.accountOverviewPageIsOpened();

        ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));
    }

    @When("User clicks on the continue CTA on the Forgot Password page")
    public void userClicksOnTheContinueCTAOnTheForgotPasswordPage() {
        fPPage.clickContinueCTA();
    }

    @Then("User should be presented with a message that the reset password link has been sent to the email address")
    public void userShouldBePresentedWithAMessageThatTheResetPasswordLinkHasBeenSentToTheEmailAddress() {
        assertTrue(fPPage.isResetPasswordInfoPresent());
    }

    // Scenario 5

    @Given("User checks the reset password email and clicks on the reset password link in the email")
    public void userChecksTheResetPasswordEmailAndClicksOnTheResetPasswordLinkInTheEmail() {
        yopmail.openYopmailInANewTab();
        yopmail.enterEmailAddressOnYopmailAndOpenInbox(UserEmail);
        yopmail.locateAndOpenFoxtonsEmailOnYopmail(phraseInResetPasswordEmailSubject);
        yopmail.clickCTAInTheFoxtonsEmailOnYopmail(phraseOnResetPasswordCTA);

        ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));
    }

    @Then("User should land on the Reset Password page")
    public void userShouldLandOnTheResetPasswordPage() {
        assertTrue(rPPage.isResetPasswordPageOpened());
    }

    // Scenario 6

    @When("User clicks on the new password text field on the Reset Password page")
    public void userClicksOnTheNewPasswordTextFieldOnTheResetPasswordPage() {
        rPPage.clickResetNewPasswordField();
    }

    @Then("User should be able to edit the new password text field on the Reset Password page")
    public void userShouldBeAbleToEditTheNewPasswordTextFieldOnTheResetPasswordPage() {
        assertTrue(rPPage.isResetNewPasswordFieldEditable());
    }

    // Scenario 7

    @When("User clicks on the confirm new password text field on the Reset Password page")
    public void userClicksOnTheConfirmNewPasswordTextFieldOnTheResetPasswordPage() {
        rPPage.clickResetConfirmNewPasswordField();
    }

    @Then("User should be able to edit the confirm new password text field on the Reset Password page")
    public void userShouldBeAbleToEditTheConfirmNewPasswordTextFieldOnTheResetPasswordPage() {
        assertTrue(rPPage.isResetConfirmNewPasswordFieldEditable());
    }

    // Scenario 8

    @When("User enters a password that fulfils the password policy in the new password text field on the Reset Password page")
    public void userEntersAPasswordThatFulfilsThePasswordPolicyInTheNewPasswordTextFieldOnTheResetPasswordPage() {
        rPPage.enterNewPassword(projectProperties.getProperty("RESET_PASSWORD"));
    }

    @When("User enters a different password in the confirm new password text field on the Reset Password page")
    public void userEntersADifferentPasswordInTheConfirmNewPasswordTextFieldOnTheResetPasswordPage() {
        rPPage.enterConfirmNewPassword(projectProperties.getProperty("RESET_PASSWORD") + "abc");
        rPPage.clickResetNewPasswordField();
    }

    @Then("Passwords do not match validation should be displayed on the Reset Password page")
    public void passwordsDoNotMatchValidationShouldBeDisplayedOnTheResetPasswordPage() {
        assertTrue(rPPage.passwordNotMatched());
    }

    // Scenario 9

    @When("User enters the same password in the confirm new password text field on the Reset Password page")
    public void userEntersTheSamePasswordInTheConfirmNewPasswordTextFieldOnTheResetPasswordPage() {
        rPPage.enterConfirmNewPassword(projectProperties.getProperty("RESET_PASSWORD"));
        rPPage.clickResetNewPasswordField();
    }

    @Then("Passwords do not match validation should not be displayed on the Reset Password page")
    public void passwordsDoNotMatchValidationShouldNotBeDisplayedOnTheResetPasswordPage() {
        assertFalse(rPPage.passwordNotMatched());
    }

    // Scenario 10

    @When("User clicks on the continue CTA on the Reset Password page")
    public void userClicksOnTheContinueCTAOnTheResetPasswordPage() {
        rPPage.clickContinueCTA();
    }

    @Then("User should be taken to a screen giving a password update confirmation message")
    public void userShouldBeTakenToAScreenGivingAPasswordUpdateConfirmationMessage() {
        assertTrue(rPPage.isPasswordUpdatedTextPresent());
    }

    // Scenario 11

    @When("User clicks on the back to sign in CTA on the Reset Password page")
    public void userClicksOnTheBackToSignInCTAOnTheResetPasswordPage() {
        rPPage.clickBackToSignInButton();
    }
}
