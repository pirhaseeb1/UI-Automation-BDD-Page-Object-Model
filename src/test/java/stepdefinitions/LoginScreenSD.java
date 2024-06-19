package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.MyFoxtonsPage;
import pages.UserProfilePage;
import testrunners.projectProperties;
import utilities.CommonMethods;

import static org.testng.Assert.assertEquals;

public class LoginScreenSD {
    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    public static String Username = projectProperties.getProperty("USERNAME");
    public static String User_Password = projectProperties.getProperty("PASSWORD");

    //    Scenario 1
    @Given("User access Sign In Screen")
    public void user_access_Sign_In_Screen() {
        LoginPage lPage = new LoginPage(driver);
        lPage.accessLoginPage();
    }

    @When("User enters valid email address")
    public void user_enters_valid_email_address() {
        LoginPage lPage = new LoginPage(driver);
        lPage.enterEmail(Username);
    }

    @When("User enters valid password")
    public void user_enters_valid_password() {
        LoginPage lPage = new LoginPage(driver);
        lPage.enterPassword(User_Password);
    }

    @When("Users clicks on Sign In button")
    public void users_clicks_on_Sign_in_button() throws InterruptedException {
        LoginPage lPage = new LoginPage(driver);
        lPage.submitLogin();
        Thread.sleep(3000);
    }

    @Then("User should be navigated to User Profile screen")
    public void user_should_be_navigated_to_User_Profile_screen() throws InterruptedException {
        Thread.sleep(2000);
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "account/overview";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "account/overview";
        }
        System.out.println(actualURL);
        System.out.println(ExpectedURL);
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
        driver.quit();
    }

    //    Scenario 2

    @When("User enters invalid email address")
    public void user_enters_invalid_email_address() {
        LoginPage lPage = new LoginPage(driver);
        lPage.enterInvalidEmail();
    }

    @When("User enters invalid password")
    public void user_enters_invalid_password() {
        LoginPage lPage = new LoginPage(driver);
        lPage.enterInvalidPassword();
    }

    @Then("Incorrect credentials validation should be displayed")
    public void incorrect_credentials_validation_should_be_displayed() {
        LoginPage lPage = new LoginPage(driver);
        assertEquals(true, lPage.verifyValidation());
    }
}
