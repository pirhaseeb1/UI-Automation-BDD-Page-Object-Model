package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import testrunners.projectProperties;

import pages.PortalValuationPage;
import pages.SignOutPage;

import static org.testng.Assert.*;

public class SignOutSD {
    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    PortalValuationPage portalValuationPage = new PortalValuationPage(driver);
    SignOutPage signOutPage = new SignOutPage(driver);

    public static String Username = projectProperties.getProperty("USERNAME");
    public static String User_Password = projectProperties.getProperty("PASSWORD");

    @When("The user clicks on the logout button on top-left of the page")
    public void theUserClicksOnTheLogOutButton() {
        signOutPage.clickUsernameOnTopLeft();
        portalValuationPage.click_Logout();
    }

    @Then("The user should be asked a confirmation message to log out")
    public void theUserShouldBeAskedAConfirmationMessageToLogOut() {
        assertTrue(signOutPage.isConfirmLogoutPaneDisplayed());
    }

    @When("The user clicks on the logout button on logout confirmation pane")
    public void theUserClicksOnTheLogoutButtonOnLogoutConfirmationPane() {
        signOutPage.clickLogoutOnConfirmationPane();
    }

    @Then("The user should be logged out of My Foxtons")
    public void theUserShouldBeLoggedOutOfMyFoxtons() {
        assertTrue(signOutPage.isLoginURLFound());
    }

    @When("The user clicks on the cancel button on logout confirmation pane")
    public void theUserClicksOnTheCancelButtonOnLogoutConfirmationPane() {
        signOutPage.clickCancelOnConfirmationPane();
    }

    @Then("The user should stay on the page they were at")
    public void theUserShouldStayOnThePageTheyWereAt() {
        String currentURL = driver.getCurrentUrl();
        assertEquals(currentURL, SignOutPage.URLBeforeClickingCancel);
    }

    @Then("The user should remain logged in")
    public void theUserShouldRemainLoggedIn() {
        assertTrue(signOutPage.isUsernameOnTopLeftDisplayed());
    }
}
