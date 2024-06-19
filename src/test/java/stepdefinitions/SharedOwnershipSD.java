package stepdefinitions;
import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.SharedOwnershipPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

import static org.testng.Assert.assertEquals;

public class SharedOwnershipSD {

    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    SharedOwnershipPage SharedOwn = new SharedOwnershipPage(driver);

    //Scenario 1
    @Given("User on HELP TO BUY SHARED OWNERSHIP page")
    public void user_on_HELP_TO_BUY_SHARED_OWNERSHIP_page() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.get(SharedOwn.ExpectedURLStage);
        }
        else{
            driver.get(SharedOwn.ExpectedURLQA);
        }
    }

    @When("User clicks on Shared Ownership properties CTA")
    public void user_clicks_on_Shared_Ownership_properties_CTA() {
        CommonMethods.ScrollIntoView(driver,SharedOwnershipPage.Shared_Ownership_properties);
        SharedOwn.click_Shared_Ownership_properties();
    }

    @Then("User should be able to navigate to Shared Ownership properties page")
    public void user_should_be_able_to_navigate_to_Shared_Ownership_properties_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") +  "buy/helptobuy/shared-ownership#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "buy/helptobuy/shared-ownership#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 2
    @When("User clicks on Contact us CTA under HELP TO BUY SHARED OWNERSHIP")
    public void user_clicks_on_Contact_us_CTA_under_HELP_TO_BUY_SHARED_OWNERSHIP() {
        CommonMethods.ScrollIntoView(driver,SharedOwnershipPage.Shared_Contact_us);
        SharedOwn.click_Contact_us();
    }
    @Then("User should be able to navigate to Contact us Shared Ownership page")
    public void user_should_be_able_to_navigate_to_Contact_us_Shared_Ownership_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") +  "buy/helptobuy/shared-ownership#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "buy/helptobuy/shared-ownership#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }


    //Scenario 3
    @When("User clicks on Learn more CTA under Help to Buy equity loan")
    public void user_clicks_on_Learn_more_CTA_under_Help_to_Buy_equity_loan() {
        CommonMethods.ScrollIntoView(driver,SharedOwnershipPage.Help_Buy_Eq_Learn_more);
        SharedOwn.click_Help_Buy_Eq_Learn_more();
    }

    @Then("User should be able to navigate to Learn more page")
    public void user_should_be_able_to_navigate_to_Learn_more_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") +  "buy/helptobuy/shared-ownership#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "buy/helptobuy/shared-ownership#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 4
    @When("User clicks on Learn more CTA under Find a Help to Buy agent")
    public void user_clicks_on_Learn_more_CTA_under_Find_a_Help_to_Buy_agent() {
        CommonMethods.ScrollIntoView(driver,SharedOwnershipPage.Find_Buy_Agent_Learn_more);
        SharedOwn.click_Find_Buy_Agent_Learn_more();
    }
}
