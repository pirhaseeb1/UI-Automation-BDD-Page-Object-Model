package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.VerifyEmailPage;
import utilities.CommonMethods;

import static org.testng.Assert.assertTrue;
import static pages.RegistrationPage.UserEmail;

public class VerifyEmailSD {

    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    VerifyEmailPage vPage = new VerifyEmailPage(driver);

    // Scenario 1

    @Then("User should be navigated to Verify Account Screen")
    public void user_should_be_navigated_to_Verify_Account_Screen() {
        vPage.validate();
        String actualURL = driver.getCurrentUrl();
        CommonMethods.assertCustomEquals(actualURL, vPage.VerifyEmailURL);
    }

    // Scenario 2

    @Given("User has been navigated to Verify Account Screen")
    public void userHasBeenNavigatedToVerifyAccountScreen() {
        vPage.verifyAccountPageIsOpened();
    }

    @Then("User should see a message to verify the account on Verify Account Page")
    public void userShouldSeeAMessageToVerifyTheAccountOnVerifyAccountPage() {
        assertTrue(vPage.isVerifyAccountInfoPresent());
    }

    // Scenario 3

    @When("User clicks on the \"I haven't received an email\" button")
    public void userClicksOnTheIHaventReceivedAnEmailButton() {
        vPage.clickResendVerifyEmailButton();
    }

    @Then("User should see a message on the Verify Account page that an email has been re-sent")
    public void userShouldSeeAMessageOnTheVerifyAccountPageThatAnEmailHasBeenReSent() {
        assertTrue(vPage.isResendVerifyEmailInfoPresent(UserEmail));
    }
}
