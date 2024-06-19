package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.FoxtonsTenantsPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

import static org.testng.Assert.assertEquals;

public class FoxtonsTenantsSD {
    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    FoxtonsTenantsPage foxtonsTenants = new FoxtonsTenantsPage(driver);

    @Given("User on Foxtons tenants page")
    public void user_on_Foxtons_tenants_page() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.get(foxtonsTenants.ExpectedURLStage);
        }
        else{
            driver.get(foxtonsTenants.ExpectedURLQA);
        }
        CommonMethods.clickCookie(driver);
        CommonMethods.I_AmWait(driver,foxtonsTenants.view_amazing_benefits);
    }

    @When("User clicks on View Amazing benefits button on foxton tenants page")
    public void user_clicks_on_View_Amazing_benefits_button_on_foxton_tenants_page() {
        foxtonsTenants.click_view_amazing_benefits();
       
    }

    @Then("User Should be able to view to full features List on foxton tenants page")
    public void user_Should_be_able_to_view_to_full_features_List_on_foxton_tenants_page() {
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "myfoxtons/tenants#fullFeatureList";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") +  "myfoxtons/tenants#fullFeatureList";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on signup for my foxtons button on foxton tenants page")
    public void user_clicks_on_signup_for_my_foxtons_button_on_foxton_tenants_page() {
       foxtonsTenants.click_SignUpFoxtons();
    }

    @Then("User Should be able to navigate to Create Account or registration page")
    public void user_Should_be_able_to_navigate_to_Create_Account_or_registration_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "auth/registration";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") +  "auth/registration";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }
}
