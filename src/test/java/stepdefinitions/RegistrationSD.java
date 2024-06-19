package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.RegistrationPage;
import pages.VerifyEmailPage;
import utilities.CommonMethods;

import static org.testng.Assert.*;
import static utilities.CommonMethods.assertCustomNotEquals;

public class RegistrationSD {

    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    RegistrationPage rPage = new RegistrationPage(driver);

    //    Scenario 1
    @Given("User access Registration Screen")
    public void user_access_Registration_Screen() {
        rPage.accessRegistrationPage();
    }

    @When("User enters email address")
    public void user_enters_email_address() {
        rPage.enterEmail();
    }

    @When("User enters password")
    public void user_enters_password() {
        rPage.enterPassword();
    }

    @When("User enters confirm password")
    public void user_enters_confirm_password() {
        rPage.enterConfirmPassword();
    }

    @When("Users clicks on Sign Up button")
    public void users_clicks_on_Sign_Up_button() throws InterruptedException {
        rPage.clickRegister();
        Thread.sleep(5000);
    }

//    Scenario 2

    @When("User enters different confirm password")
    public void user_enters_different_confirm_password() {
        rPage.enterWrongPassword();
    }

    @Then("Password doesn't match validation should be displayed")
    public void password_doesn_t_match_validation_should_be_displayed() {
        assertEquals(true, rPage.passwordNotMatched());
    }

    // Scenario 3

    @When("User enters already existed email address")
    public void user_enters_already_existed_email_address() {
        rPage.enterAlreadyExistedEmail();
    }

    @Then("User already exists validation should be displayed")
    public void user_already_exists_validation_should_be_displayed() {
        assertTrue(rPage.alreadyRegistered());
    }

    // Scenario 4

    @When("User enters password that does not meet the required conditions")
    public void userEntersPasswordThatDoesNotMeetTheRequiredConditions() { rPage.enterInvalidPassword(); }

    @Then("The user should be able to see if the required conditions for a valid password are met as they type the new password")
    public void theUserShouldBeAbleToSeeThatTheRequiredConditionsForAValidPasswordAreNotMetAsTheyTypeTheNewPassword() {
        assertTrue(rPage.passwordConditions());
    }

    // Scenario 5

    @Then("User should be able to see a confirm password box on the Registration page")
    public void userShouldBeAbleToSeeAConfirmPasswordBoxOnTheRegistrationPage() {
        assertTrue(rPage.confirmPasswordBox());
    }

    // Scenario 6

    @When("User clicks on the cookies link under the register button")
    public void userClicksOnTheCookiesLinkUnderTheRegisterButton() { rPage.clickOnCookieLink(); }

    @Then("User should be taken to the appropriate page from the Registration page")
    public void userShouldBeTakenToTheAppropriatePageFromTheRegistrationPage() {
        assertCustomNotEquals(driver.getCurrentUrl(), rPage.RegistrationURL);
    }

    // Scenario 7

    @When("User clicks on the privacy policy link under the register button")
    public void userClicksOnThePrivacyPolicyLinkUnderTheRegisterButton() { rPage.clickOnPrivacyPolicyLink(); }
}
