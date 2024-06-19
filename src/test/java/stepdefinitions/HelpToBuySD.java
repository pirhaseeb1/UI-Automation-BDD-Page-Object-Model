package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HelpToBuyPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

import static org.testng.Assert.assertEquals;

public class HelpToBuySD {

    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    HelpToBuyPage HelpToBuy = new HelpToBuyPage(driver);

    //Scenario 1
    @Given("User on help to buy page")
    public void user_on_help_to_buy_page() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.navigate().to(HelpToBuy.ExpectedURLStage);
        }
        else{
            driver.navigate().to(HelpToBuy.ExpectedURLQA);
        }
    }

    @When("User clicks on View Help to Buy homes CTA")
    public void user_clicks_on_View_Help_to_Buy_homes_CTA() {
        CommonMethods.ScrollIntoView(driver,HelpToBuyPage.View_Help_to_Buy_homes);
        HelpToBuy.click_View_Help_to_Buy_homes();

    }

    @Then("User should be able to navigate to help to buy homes page")
    public void user_should_be_able_to_navigate_to_help_to_buy_homes_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "buy/helptobuy#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") +  "buy/helptobuy#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 2
    @When("User clicks on help to buy London CTA")
    public void user_clicks_on_help_to_buy_London_CTA() {
        CommonMethods.ScrollIntoView(driver,HelpToBuyPage.Help_to_Buy_London);
        HelpToBuy.click_Help_to_Buy_London();

    }

    @Then("User should be able to navigate to help to buy London page")
    public void user_should_be_able_to_navigate_to_help_to_buy_London_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "buy/helptobuy#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") +  "buy/helptobuy#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 3
    @When("User clicks on Help to Buy properties under London Equity Loan CTA")
    public void user_clicks_on_Help_to_Buy_properties_under_London_Equity_Loan_CTA() {
        CommonMethods.ScrollIntoView(driver,HelpToBuyPage.Help_to_Buy_properties);
        HelpToBuy.click_Help_to_Buy_properties();
    }

    @Then("User should be able to navigate to Help to Buy properties page")
    public void user_should_be_able_to_navigate_to_Help_to_Buy_properties_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "buy/helptobuy#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") +  "buy/helptobuy#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 4
    @When("User clicks on Help to Contact US CTA under London Equity Loan")
    public void user_clicks_on_Help_to_Contact_US_CTA_under_London_Equity_Loan() {
//        CommonMethods.I_AmWait(driver,HelpToBuyPage.Contact_us);
//        CommonMethods.ScrollIntoView(driver,HelpToBuyPage.Contact_us);
        HelpToBuy.click_Contact_us();
    }

    @Then("User should be able to navigate to Help to Contact Us")
    public void user_should_be_able_to_navigate_to_Help_to_Contact_Us() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "buy/helptobuy#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") +  "buy/helptobuy#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 4
    @When("User clicks on Help to Buy South East CTA")
    public void user_clicks_on_Help_to_Buy_South_East_CTA() {
        CommonMethods.ScrollIntoView(driver,HelpToBuyPage.Help_to_Buy_South_East);
        HelpToBuy.click_Help_to_Buy_South_East();
    }

    @Then("User should be able to navigate to Help to Buy South East page")
    public void user_should_be_able_to_navigate_to_Help_to_Buy_South_East_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "buy/helptobuy#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") +  "buy/helptobuy#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 6
    @When("User clicks on Help to Help to Buy FAQs CTA")
    public void user_clicks_on_Help_to_Help_to_Buy_FAQs_CTA() {
        CommonMethods.ScrollIntoView(driver,HelpToBuyPage.Help_to_Buy_FAQs);

        HelpToBuy.click_Help_to_Buy_FAQs();
    }

    @Then("User should be able to navigate to Help to Help to Buy FAQs page")
    public void user_should_be_able_to_navigate_to_Help_to_Help_to_Buy_FAQs_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "buy/helptobuy#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") +  "buy/helptobuy#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 7

    @When("User clicks on Help to Buy Learn More CTA under Find a help to buy agent")
    public void user_clicks_on_Help_to_Buy_Learn_More_CTA_under_Find_a_help_to_buy_agent() {
        CommonMethods.ScrollIntoView(driver,HelpToBuyPage.Learn_more);
        HelpToBuy.click_Learn_more();
    }

    @Then("User should be able to navigate to Learn More Page about Find a help to buy agent")
    public void user_should_be_able_to_navigate_to_Learn_More_Page_about_Find_a_help_to_buy_agent() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "buy/helptobuy#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") +  "buy/helptobuy#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 8
    @When("User clicks on Help to Buy Learn More CTA under SHARED OWNERSHIP")
    public void user_clicks_on_Help_to_Buy_Learn_More_CTA_under_SHARED_OWNERSHIP() {
        CommonMethods.ScrollIntoView(driver,HelpToBuyPage.Learn_more_2);
        HelpToBuy.click_Learn_more_2();
    }

    @Then("User should be able to navigate to Learn More Page about SHARED OWNERSHIP")
    public void user_should_be_able_to_navigate_to_Learn_More_Page_about_SHARED_OWNERSHIP() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "buy/helptobuy#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") +  "buy/helptobuy#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

}


