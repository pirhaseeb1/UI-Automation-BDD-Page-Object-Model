package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.RegistrationPage;

import static org.testng.Assert.assertEquals;

public class EmailVerificationSD {

    WebDriver driver = FoxtonsBrowserDrivers.getDriver();

    //    Scenario 1
    @Given("User has completed the registration flow")
    public void user_has_completed_the_registration_flow() {
        RegistrationPage rPage = new RegistrationPage(driver);
        rPage.accessRegistrationPage();
        rPage.completeReg();
    }

    @When("User clicks on email verification link")
    public void user_clicks_on_email_verification_link() {
        RegistrationPage rPage = new RegistrationPage(driver);
        rPage.verifyEmail();
    }

    @Then("User should be navigated to User contact screen")
    public void user_should_be_navigated_to_User_contact_screen() {
        RegistrationPage rPage = new RegistrationPage(driver);
        assertEquals(true, rPage.userVerified());
    }

}
