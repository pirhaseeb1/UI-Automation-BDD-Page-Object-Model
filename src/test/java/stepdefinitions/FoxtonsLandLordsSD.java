package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.FoxtonsLandlordsPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

import static org.testng.Assert.assertEquals;


public class FoxtonsLandLordsSD {
    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    FoxtonsLandlordsPage foxtonsLandlords = new FoxtonsLandlordsPage(driver);

    @Given("User on Foxtons landlords page")
    public void user_on_Foxtons_landlords_page() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.get(foxtonsLandlords.ExpectedURLStage);
        }
        else{
            driver.get(foxtonsLandlords.ExpectedURLQA);
        }
        CommonMethods.clickCookie(driver);
        CommonMethods.I_AmWait(driver,FoxtonsLandlordsPage.view_all_features);
    }

    @When("User clicks on view all features button")
    public void user_clicks_on_view_all_features_button() {

       foxtonsLandlords.click_view_all_features();
    }

    @Then("User Should be able to view all features List")
    public void user_Should_be_able_to_view_all_features_List() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "myfoxtons/landlord#fullFeatureList";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "myfoxtons/landlord#fullFeatureList";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on signup foxtons button")
    public void user_clicks_on_signup_foxtons_button() {
       foxtonsLandlords.click_signup_my_foxtons();
    }

    @Then("User Should be able to navigate to Registration Account page")
    public void user_Should_be_able_to_navigate_to_Registration_Account_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "auth/registration";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "auth/registration";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on signup foxtons button under instant rental notifications")
    public void user_clicks_on_signup_foxtons_button_under_instant_rental_notifications() {
        CommonMethods.ScrollIntoView(driver,FoxtonsLandlordsPage.signup_my_foxtons_instant_rental);
       foxtonsLandlords.click_signup_my_foxtons_instant_rental();
    }

    @Then("User Should be able to navigate to Registration Account page under instant rental notifications")
    public void user_Should_be_able_to_navigate_to_Registration_Account_page_under_instant_rental_notifications() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "auth/registration";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "auth/registration";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on signin or register button under Property Maintenance Streamlined")
    public void user_clicks_on_signin_or_register_button_under_Property_Maintenance_Streamlined() {
        CommonMethods.ScrollIntoView(driver,FoxtonsLandlordsPage.signInOrRegister);
       foxtonsLandlords.click_signInOrRegister();
    }

    @Then("User Should be able to navigate to Registration Account page under Property Maintenance Streamlined")
    public void user_Should_be_able_to_navigate_to_Registration_Account_page_under_Property_Maintenance_Streamlined() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "auth/registration";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "auth/registration";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on signup now button under One Click Tax Return")
    public void user_clicks_on_signup_now_button_under_One_Click_Tax_Return() {
        CommonMethods.ScrollIntoView(driver,FoxtonsLandlordsPage.signUp_Now);
        foxtonsLandlords.click_signUp_Now();
    }

    @Then("User Should be able to navigate to Registration Account page under One Click Tax Return")
    public void user_Should_be_able_to_navigate_to_Registration_Account_page_under_One_Click_Tax_Return() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "auth/registration";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "auth/registration";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }









}
