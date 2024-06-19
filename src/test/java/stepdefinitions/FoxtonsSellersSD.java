package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.FoxtonsSellersPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

import static org.testng.Assert.assertEquals;

public class FoxtonsSellersSD {
    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    FoxtonsSellersPage foxtonsSellers = new FoxtonsSellersPage(driver);

    @Given("User on Foxtons seller page")
    public void user_on_Foxtons_seller_page() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.get(foxtonsSellers.ExpectedURLStage);
        }
        else{
            driver.get(foxtonsSellers.ExpectedURLQA);
        }
        CommonMethods.clickCookie(driver);
        CommonMethods.I_AmWait(driver,foxtonsSellers.view_amazing_benefits);
    }

    @When("User clicks on View Amazing benefits button")
    public void user_clicks_on_View_Amazing_benefits_button() {
        foxtonsSellers.click_view_amazing_benefits();
    }

    @Then("User Should be able to view full features List")
    public void user_Should_be_able_to_view_to_full_features_List() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "myfoxtons/seller#fullFeatureList";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "myfoxtons/seller#fullFeatureList";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on signup for my foxtons button")
    public void user_clicks_on_signup_for_my_foxtons_button() {
        foxtonsSellers.click_SignUpFoxtons();
    }

    @Then("User Should be able to navigate to Create Account page")
    public void user_Should_be_able_to_navigate_to_Create_Account_page() {
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
