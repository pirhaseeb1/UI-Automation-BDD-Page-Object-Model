package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import pages.UserProfilePage;
import utilities.CommonMethods;

import static org.testng.Assert.*;

public class UpdateAccountDetailsSD {
    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    UserProfilePage userProfilePage = new UserProfilePage(driver);

    // Test data

    public String newEmailAddress = "";
    public String confirmNewEmailAddress = "";

    // Scenario 1
    @When("User is on the update contact details section on the User Profile page")
    public void userIsOnTheUpdateContactDetailsSectionOnTheUserProfilePage() {
        userProfilePage.scrollToUpdateContactDetailsSection();
    }

    @When("User clicks on the update email address CTA on the update contact details section on the User Profile page")
    public void userClicksOnTheUpdateEmailAddressCTAOnTheUpdateContactDetailsSectionOnTheUserProfilePage() {
        userProfilePage.clickUpdateEmailAddressCTA();
    }

    @Then("User should be navigated to a new page from the User Profile page where they can update their email address")
    public void userShouldBeNavigatedToANewPageFromTheUserProfilePageWhereTheyCanUpdateTheirEmailAddress() {
        assertTrue(userProfilePage.updateEmailAddressSectionIsOpened());
    }

    // Scenario 2

    @When("User navigates to the Update Email Address page from the User Profile page")
    public void userNavigatesToTheUpdateEmailAddressPageFromTheUserProfilePage() {
        userProfilePage.updateEmailAddressSectionIsOpened();
    }

    @Then("User should see the main heading as \"Update your email address\" on the Update Email Address page")
    public void userShouldSeeTheMainHeadingAsOnTheUpdateEmailAddressPage() {
        assertFalse(userProfilePage.getUpdateEmailAddressHeading().isEmpty());
    }

    @Then("User should see the subheading as \"Updating your email address will also update your log-in ID\" on the Update Email Address page")
    public void userShouldSeeTheSubheadingAsOnTheUpdateEmailAddressPage() {
        assertFalse(userProfilePage.getUpdateEmailAddressSubheading().isEmpty());
    }

    // Scenario 3

    @When("User enters new email on the Update Email Address page")
    public void userEntersNewEmailOnTheUpdateEmailAddressPage() {
        newEmailAddress = CommonMethods.generateValidYopmailEmailID();
        userProfilePage.enterNewEmail(newEmailAddress);
    }

    @When("User enters the same confirm new email as new email on the Update Email Address page")
    public void userEntersConfirmNewEmailOnTheUpdateEmailAddressPage() {
        confirmNewEmailAddress = newEmailAddress;
        userProfilePage.enterConfirmNewEmail(confirmNewEmailAddress);
    }

    @Then("User should see that the change email address button has been enabled on the Update Email Address page")
    public void userShouldSeeThatTheChangeEmailAddressButtonHasBeenEnabledOnTheUpdateEmailAddressPage() {
        assertTrue(userProfilePage.isChangeEmailAddressButtonEnabled());
    }

    // Scenario 5

    @Then("User should view their current email address on the Update Email Address page")
    public void userShouldViewTheirCurrentEmailAddressOnTheUpdateEmailAddressPage() {
        assertEquals(userProfilePage.getCurrentEmailAddress(), LoginScreenSD.Username);
    }

    @Then("User should view a text field for new email on the Update Email Address page")
    public void userShouldViewATextFieldForNewEmailOnTheUpdateEmailAddressPage() {
        assertTrue(userProfilePage.isNewEmailTextboxPresent());
    }

    @Then("User should view a text field for confirm email on the Update Email Address page")
    public void userShouldViewATextFieldForConfirmEmailOnTheUpdateEmailAddressPage() {
        assertTrue(userProfilePage.isConfirmNewEmailTextboxPresent());
    }

    @Then("User should view an update CTA on the Update Email Address page")
    public void userShouldViewAnUpdateCTAOnTheUpdateEmailAddressPage() {
        assertTrue(userProfilePage.isChangeEmailAddressButtonPresent());
    }

    // Scenario 6

    @When("User clicks on the new email textbox on the Update Email Address page")
    public void userClicksOnTheNewEmailTextboxOnTheUpdateEmailAddressPage() {
        userProfilePage.clickNewEmailTextbox();
    }

    @Then("User should be able to enter text into the new email textbox on the Update Email Address page")
    public void userShouldBeAbleToEnterTextIntoTheNewEmailTextboxOnTheUpdateEmailAddressPage() {
        assertTrue(userProfilePage.isNewEmailTextboxEnabled());
    }

    // Scenario 7

    @When("User clicks on the confirm new email textbox on the Update Email Address page")
    public void userClicksOnTheConfirmNewEmailTextboxOnTheUpdateEmailAddressPage() {
        userProfilePage.clickConfirmNewEmailTextbox();
    }

    @Then("User should be able to enter text into the confirm new email textbox on the Update Email Address page")
    public void userShouldBeAbleToEnterTextIntoTheConfirmNewEmailTextboxOnTheUpdateEmailAddressPage() {
        assertTrue(userProfilePage.isConfirmNewEmailTextboxEnabled());
    }

    // Scenario 8

    @Then("User should be able to click on the change email address button on the Update Email Address page")
    public void userShouldBeAbleToClickOnTheChangeEmailAddressButtonOnTheUpdateEmailAddressPage() {
        assertTrue(userProfilePage.isChangeEmailAddressButtonClickable());
    }

    // Scenario 9

    @Given("User has not updated their first name on the User Profile page")
    public void userHasNotUpdatedTheirFirstNameOnTheUserProfilePage() {
        if (!userProfilePage.getFirstName().isEmpty())
            throw new SkipException("First Name should not be set! Skipping test case");
    }

    @Given("User has not updated their last name on the User Profile page")
    public void userHasNotUpdatedTheirLastNameOnTheUserProfilePage() {
        if(!userProfilePage.getLastName().isEmpty())
            throw new SkipException("Last Name should not be set! Skipping test case");
    }

    @Given("User has not updated their phone number on the User Profile page")
    public void userHasNotUpdatedTheirPhoneNumberOnTheUserProfilePage() {
        if(!userProfilePage.getPhoneNumber().isEmpty())
            throw new SkipException("Phone Number should not be set! Skipping test case");
    }

    @When("User clicks on the change email address button on the Update Email Address page")
    public void userClicksOnTheChangeEmailAddressButtonOnTheUpdateEmailAddressPage() {
        userProfilePage.clickChangeEmailAddressButton();
    }

    @Then("User should see a message to update their details to include first name, last name and a phone number on the Update Email Address page")
    public void userShouldSeeAMessageToUpdateTheirDetailsToIncludeFirstNameLastNameAndAPhoneNumberOnTheUpdateEmailAddressPage() {
        assertTrue(userProfilePage.isUpdateContactDetailsMessagePresent());
    }
}