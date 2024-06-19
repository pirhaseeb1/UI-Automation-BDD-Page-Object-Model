package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.ChangePasswordPage;
import pages.LoginPage;
import pages.UserProfilePage;
import testrunners.projectProperties;

import static org.testng.Assert.*;

public class ChangePasswordSD {
    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    ChangePasswordPage changePasswordPage = new ChangePasswordPage(driver);
    LoginPage lPage = new LoginPage(driver);

    public static String username = projectProperties.getProperty("USERNAME");
    public static String userPassword = projectProperties.getProperty("PASSWORD");
    public static String newPassword = projectProperties.getProperty("NEW_PASSWORD");

    // Scenario 1

    @When("User is logged in to Foxtons Portal to reach the change password fold on the User Profile page")
    public void userIsLoggedInToFoxtonsPortalToReachTheChangePasswordFoldOnTheUserProfilePage() {
        lPage.accessLoginPage();
        lPage.enterEmail(username);
        lPage.enterPassword(userPassword);
        lPage.submitLogin();
        changePasswordPage.overviewPageIsOpened();
    }

    @And("User clicks on the Profile link from the navigation bar")
    public void userClicksOnTheProfileLinkFromTheNavigationBar() {
        changePasswordPage.clickOnTheProfileLink();
    }

    @Then("User should be navigated to the User Profile page")
    public void userShouldBeNavigatedToTheUserProfilePage() {
        changePasswordPage.profilePageIsOpened();
        String expectedURL = UserProfilePage.ProfileURL;
        String actualURL = driver.getCurrentUrl();
        assertEquals(actualURL, expectedURL);
    }

    //Scenario 2

    @And("User is navigated to the User Profile page")
    public void userIsNavigatedToTheUserProfilePage() {
        changePasswordPage.profilePageIsOpened();
    }

    @When("User is on the change password fold on the User Profile page")
    public void userIsOnTheChangePasswordFoldOnTheUserProfilePage() {
        changePasswordPage.scrollToTheChangePasswordFold();
    }

    @Then("There should be a change password CTA on the User Profile page")
    public void thereShouldBeAChangePasswordCTAOnTheUserProfilePage() {
        assertTrue(changePasswordPage.changePasswordCTAIsPresent());
    }

    @And("That change password CTA on the User Profile page should be clickable")
    public void thatChangePasswordCTAOnTheUserProfilePageShouldBeClickable() {
        assertTrue(changePasswordPage.changePasswordCTAIsClickable());
    }

    // Scenario 3

    @And("User clicks on the change password CTA on the User Profile page")
    public void userClicksOnTheChangePasswordCTAOnTheUserProfilePage() {
        changePasswordPage.clickOnTheChangePasswordCTA();
    }

    @Then("User should be navigated to the Change My Password page")
    public void userShouldBeNavigatedToTheChangeMyPasswordPage() {
        assertTrue(changePasswordPage.changeMyPasswordPageIsOpened());
    }

    // Scenario 4

    @And("User is navigated to the Change My Password page")
    public void userIsNavigatedToTheChangeMyPasswordPage() {
        changePasswordPage.changeMyPasswordPageIsOpened();
    }

    @When("User clicks on the New password field on the Change My Password page")
    public void userClicksOnTheNewPasswordFieldOnTheChangeMyPasswordPage() {
        changePasswordPage.clickOnTheNewPasswordField();
    }

    @Then("User should see the password policy on the Change My Password page")
    public void userShouldSeeThePasswordPolicyOnTheChangeMyPasswordPage() {
        assertTrue(changePasswordPage.passwordConditions());
    }

    // Scenario 5

    @When("User clicks on the Current password field on the Change My Password page")
    public void userClicksOnTheCurrentPasswordFieldOnTheChangeMyPasswordPage() {
        changePasswordPage.clickOnTheCurrentPasswordField();
    }

    @Then("User should be able to enter text in the Current password field on the Change My Password page")
    public void userShouldBeAbleToEnterTextInTheCurrentPasswordFieldOnTheChangeMyPasswordPage() {
        changePasswordPage.enterTextInTheCurrentPasswordField(userPassword);
        String actualText = driver.findElement(By.xpath(changePasswordPage.currentPassword)).getAttribute("value");
        String expectedText = userPassword;
        assertEquals(actualText, expectedText);
    }

    // Scenario 6

    @Then("User should be able to enter text in the New password field on the Change My Password page")
    public void userShouldBeAbleToEnterTextInTheNewPasswordFieldOnTheChangeMyPasswordPage() {
        changePasswordPage.enterTextInTheNewPasswordField(userPassword);
        String actualText = driver.findElement(By.xpath(changePasswordPage.newPassword)).getAttribute("value");
        String expectedText = userPassword;
        assertEquals(actualText, expectedText);
    }

    // Scenario 7

    @When("User clicks on the Confirm new password field on the Change My Password page")
    public void userClicksOnTheConfirmNewPasswordFieldOnTheChangeMyPasswordPage() {
        changePasswordPage.clickOnTheConfirmNewPasswordField();
    }

    @Then("User should be able to enter text in the Confirm new password field on the Change My Password page")
    public void userShouldBeAbleToEnterTextInTheConfirmNewPasswordFieldOnTheChangeMyPasswordPage() {
        changePasswordPage.enterTextInTheConfirmPasswordField(userPassword);
        String actualText = driver.findElement(By.xpath(changePasswordPage.confirmPassword)).getAttribute("value");
        String expectedText = userPassword;
        assertEquals(actualText, expectedText);
    }

    // Scenario 8

    @And("User enters a new password in the New password field on the Change My Password page")
    public void userEntersANewPasswordInTheNewPasswordFieldOnTheChangeMyPasswordPage() {
        changePasswordPage.enterTextInTheNewPasswordField(newPassword);
    }

    @Then("User should see whether the new password meets the conditions on the Change My Password page")
    public void userShouldSeeWhetherTheNewPasswordMeetsTheConditionsOnTheChangeMyPasswordPage() {
        assertTrue(changePasswordPage.passwordConditions());
    }

    // Scenario 9

    @And("User enters a text different than the new password in the Confirm new password field on the Change My Password page")
    public void userEntersATextDifferentThanTheNewPasswordInTheConfirmNewPasswordFieldOnTheChangeMyPasswordPage() {
        changePasswordPage.enterTextInTheNewPasswordField(newPassword);
        changePasswordPage.enterTextInTheConfirmPasswordField(newPassword + "abc");
    }

    @Then("User should see that the New password and Confirm new password do not match on the Change My Password page")
    public void userShouldSeeThatTheNewPasswordAndConfirmNewPasswordDoNotMatchOnTheChangeMyPasswordPage() {
        assertTrue(changePasswordPage.isPasswordMatchingErrorPresentOrNot());
    }

    // Scenario 10

    @And("User enters a text same as the new password in the Confirm new password field on the Change My Password page")
    public void userEntersATextSameAsTheNewPasswordInTheConfirmNewPasswordFieldOnTheChangeMyPasswordPage() {
        changePasswordPage.enterTextInTheConfirmPasswordField(newPassword);
    }

    @Then("User should see that the New password and Confirm new password match on the Change My Password page")
    public void userShouldSeeThatTheNewPasswordAndConfirmNewPasswordMatchOnTheChangeMyPasswordPage() {
        assertFalse(changePasswordPage.isPasswordMatchingErrorPresentOrNot());
    }

    // Scenario 11

    @And("User enters password that is not verified with the existing password in the Current password field on the Change My Password page")
    public void userEntersPasswordThatIsNotVerifiedWithTheExistingPasswordInTheCurrentPasswordFieldOnTheChangeMyPasswordPage() {
        changePasswordPage.enterTextInTheCurrentPasswordField(userPassword + "abc");
    }

    @And("User clicks on the Update button on the Change My Password page")
    public void userClicksOnTheUpdateButtonOnTheChangeMyPasswordPage() {
        changePasswordPage.clickOnTheUpdateButton();
    }

    @Then("User should see an error message on the Change My Password page when the Current password is not verified with the existing password")
    public void userShouldSeeAnErrorMessageOnTheChangeMyPasswordPageWhenTheCurrentPasswordIsNotVerifiedWithTheExistingPassword() {
        assertTrue(changePasswordPage.isPasswordValidationErrorPresentOrNot());
    }
}
