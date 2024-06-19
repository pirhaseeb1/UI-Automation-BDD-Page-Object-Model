package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.PublishTnCDocFromBOSpage;
import testrunners.projectProperties;
import utilities.CommonMethods;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PublishTnCDocFromBOSSD {

    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    PublishTnCDocFromBOSpage publishTnCDocFromBOS = new PublishTnCDocFromBOSpage(driver);
    public static String username = projectProperties.getProperty("USERNAME_SECONDARY");
    public static String desiredPropertyExpectedText = "1C The Village, 101 Amies Street, London, SW11 2JW";
    // public static String username = "3585467@foxtons.co.uk";
    // public static String desiredPropertyExpectedText = "021 River Mill One, Station Road, London, SE13 5FL";
    public static String password = projectProperties.getProperty("PASSWORD");
    public static String BOSUsername = projectProperties.getProperty("USERNAME_BOS");
    public static String BOSPassword = projectProperties.getProperty("PASSWORD_BOS");

    @Given("User accesses the Login screen to verify the appearance or disappearance of Get Started CTA")
    public void user_accesses_Login_screeen_to_verify_the_appearance_or_disappearance_of_Get_Started_CTA() {
        publishTnCDocFromBOS.accessLoginPage();
    }

    @When("User enters valid email address, password and clicks on the Sign In button to verify the appearance or disappearance of Get Started CTA")
    public void user_enters_valid_email_address_password_and_clicks_on_Sign_In_button_to_verify_the_appearance_or_disappearance_of_Get_Started_CTA() {
        publishTnCDocFromBOS.enterEmail(username);
        publishTnCDocFromBOS.enterPassword(password);
        publishTnCDocFromBOS.submitLogin();
    }

    @Then("User should be navigated to the User Profile screen to verify the appearance or disappearance of Get Started CTA")
    public void verify_navigation_to_the_Login_page() {
        String actualURL = driver.getCurrentUrl();
        String ExpectedURL = publishTnCDocFromBOS.userProfileURL;
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);

    }

    @And("User clicks on the desired property on Foxtons Portal to verify the appearance or disappearance of Get Started CTA")
    public void user_clicks_on_a_desired_property() {
        publishTnCDocFromBOS.clickOnTheDesiredProperty(desiredPropertyExpectedText);
    }

    @Then("User should be navigated to the Instruct Foxtons Overview page for the selected property to verify the appearance or disappearance of Get Started CTA")
    public void verify_navigation_to_Instruct_Foxtons_Overview_page_for_the_selected_property() {
        String actualURL = driver.getCurrentUrl();
        String ExpectedURL = publishTnCDocFromBOS.propertyURLSubstring;
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @Given("User accesses the BOS system login screen to publish or unpublish the Terms and Conditions document for a user")
    public void user_accesses_BOS_login_screen_to_publish_or_unpublish_the_Terms_and_Conditions_document_for_a_user() {
        publishTnCDocFromBOS.accessBOSLoginPage();
    }

    @When("User enters valid credentials for BOS system to publish or unpublish the Terms and Conditions document for a user")
    public void user_enters_valid_credentials_for_BOS_to_publish_or_unpublish_the_TnC_document_for_a_user() {
        publishTnCDocFromBOS.enterBOSUsername(BOSUsername);
        publishTnCDocFromBOS.enterBOSPassword(BOSPassword);
        publishTnCDocFromBOS.submitBOSLogin();
    }

    @Then("User should be navigated to the home screen of the BOS system to publish or unpublish the Terms and Conditions document for a user")
    public void verify_navigation_to_BOS_home_screen() {
        driver.findElement(By.xpath(publishTnCDocFromBOS.BOSLogoutLinkElement)).isDisplayed();
    }

    @Given("The Terms and Conditions document for the desired property of the user is not published via BOS")
    public void theTermsAndConditionsDocumentForTheDesiredPropertyOfTheUserIsNotPublishedViaBOS() {
        publishTnCDocFromBOS.accessBOSLoginPage();
        publishTnCDocFromBOS.enterBOSUsername(BOSUsername);
        publishTnCDocFromBOS.enterBOSPassword(BOSPassword);
        publishTnCDocFromBOS.submitBOSLogin();
        publishTnCDocFromBOS.navigateToLettingsDocumentsTabForTheDesiredPropertyInBOS(username, desiredPropertyExpectedText);
        publishTnCDocFromBOS.unpublishTnCDocIfNeeded();
    }

    @And("User is logged in to Foxtons Portal to verify the appearance or disappearance of Get Started CTA on the Instruct Foxtons Overview page")
    public void user_is_logged_in_to_Foxtons_Portal_to_verify_Get_Started_CTA_on_the_Instruct_Foxtons_Overview_page() {
        publishTnCDocFromBOS.openANewTab();
        publishTnCDocFromBOS.accessLoginPage();
        publishTnCDocFromBOS.enterEmail(username);
        publishTnCDocFromBOS.enterPassword(password);
        publishTnCDocFromBOS.submitLogin();
    }

    @Then("There should not be a Get Started CTA on the Instruct Foxtons Overview page for the selected property")
    public void thereShouldNotBeAGetStartedCTAOnTheInstructFoxtonsOverviewPageForTheSelectedProperty() {
        assertTrue(publishTnCDocFromBOS.verifyAbsenceOfGetStartedCTA());
    }

    @Given("The Terms and Conditions document for the desired property of the user is published via BOS")
    public void theTermsAndConditionsDocumentForTheDesiredPropertyOfTheUserIsPublishedViaBOS() {
        publishTnCDocFromBOS.accessBOSLoginPage();
        publishTnCDocFromBOS.enterBOSUsername(BOSUsername);
        publishTnCDocFromBOS.enterBOSPassword(BOSPassword);
        publishTnCDocFromBOS.submitBOSLogin();
        publishTnCDocFromBOS.navigateToLettingsDocumentsTabForTheDesiredPropertyInBOS(username, desiredPropertyExpectedText);
        publishTnCDocFromBOS.publishTnCDocIfNeeded();
    }

    @Then("There should be a Get Started CTA on the Instruct Foxtons Overview page for the selected property")
    public void thereShouldBeAGetStartedCTAOnTheInstructFoxtonsOverviewPageForTheSelectedProperty() {
        assertTrue(publishTnCDocFromBOS.verifyPresenceOfGetStartedCTA());
    }

}
