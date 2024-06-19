package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.HelpToBuyLondonPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

import static org.testng.Assert.assertEquals;


public class HelpToBuyLondonSD {

    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    WebElement element;
    HelpToBuyLondonPage HelpToBuy = new HelpToBuyLondonPage(driver);

    //Scenario 1

    @Given("User on help to buy page london")
    public void user_on_help_to_buy_page_london() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.get(HelpToBuy.ExpectedURLStage);
        }
        else{
            driver.get(HelpToBuy.ExpectedURLQA);
        }
    }

    @When("User clicks on Help to buy Properties CTA")
    public void user_clicks_on_Help_to_buy_Properties_CTA() {

        CommonMethods.ScrollIntoView(driver,HelpToBuy.Help_Buy_Properties);
       HelpToBuy.click_Help_Buy_Properties();
    }

    @Then("User should be able to navigate to Help to buy Properties page")
    public void user_should_be_able_to_navigate_to_Help_to_buy_Properties_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "buy/helptobuy/equity-loan#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") +  "buy/helptobuy/equity-loan#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 2
    @When("User clicks on Foxtons FAQ sheet for the Help to Buy scheme CTA")
    public void user_clicks_on_Foxtons_FAQ_sheet_for_the_Help_to_Buy_scheme_CTA() {
        CommonMethods.ScrollIntoView(driver,HelpToBuy.Foxtons_FAQ_sheet_Help_Buy_scheme);
        HelpToBuy.click_Foxtons_FAQ_sheet_Help_Buy_scheme();
    }

    @Then("User should be able to navigate to Foxtons FAQ sheet for the Help to Buy scheme page")
    public void user_should_be_able_to_navigate_to_Foxtons_FAQ_sheet_for_the_Help_to_Buy_scheme_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "buy/helptobuy/equity-loan#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") +  "buy/helptobuy/equity-loan#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 3
    @When("User clicks on Help to buy Properties under Help to Buy London equity loan CTA")
    public void user_clicks_on_Help_to_buy_Properties_under_Help_to_Buy_London_equity_loan_CTA() {
        CommonMethods.ScrollIntoView(driver,HelpToBuy.Help_Buy_Properties_alongSide_contact_us);
        HelpToBuy.click_Help_Buy_Properties_alongSide_contact_us();
    }

    //Scenario 4
    @When("User Clicks on Who is Help to Buy London for Fold")
    public void user_Clicks_on_Who_is_Help_to_Buy_London_for_Fold() {
        CommonMethods.ScrollIntoView(driver,HelpToBuy.Who_is_Help_to_Buy_London);
        HelpToBuy.click_Who_is_Help_to_Buy_London();
    }

    @When("User clicks on Find a Help to Buy Property CTA")
    public void user_clicks_on_Find_a_Help_to_Buy_Property_CTA() {
        CommonMethods.ScrollIntoView(driver,HelpToBuy.Find_a_Help_to_Buy_Property);
        HelpToBuy.click_Find_a_Help_to_Buy_Property();;
    }

    @Then("User should be able to navigate to Find a Help to Buy Property page")
    public void user_should_be_able_to_navigate_to_Find_a_Help_to_Buy_Property_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "buy/helptobuy/equity-loan#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") +  "buy/helptobuy/equity-loan#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 5
    @When("User Clicks on How does Help to Buy London work for Fold")
    public void user_Clicks_on_How_does_Help_to_Buy_London_work_for_Fold() {
        CommonMethods.ScrollIntoView(driver,HelpToBuy.How_does_Help_to_Buy_London_work);
        HelpToBuy.click_How_does_Help_to_Buy_London_work();
    }

    @When("User clicks on Find a Help to Buy Property CTA2")
    public void user_clicks_on_Find_a_Help_to_Buy_Property_CTA2() {
        CommonMethods.ScrollIntoView(driver,HelpToBuy.Find_a_Help_to_Buy_Property_under_Buy_London_work);
        HelpToBuy.click_Find_a_Help_to_Buy_Property_under_Buy_London_work();;
    }

    @Then("User should be able to navigate to Find a Help to Buy Property")
    public void user_should_be_able_to_navigate_to_Find_a_Help_to_Buy_Property() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "buy/helptobuy/equity-loan#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") +  "buy/helptobuy/equity-loan#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 6
    @When("User Clicks on What properties can I buy with Help to Buy London for Fold")
    public void user_Clicks_on_What_properties_can_I_buy_with_Help_to_Buy_London_for_Fold() {
        CommonMethods.ScrollIntoView(driver,HelpToBuy.What_properties_can_I_buy_with_Help_to_Buy_London);
        HelpToBuy.click_What_properties_can_I_buy_with_Help_to_Buy_London();
    }


    @When("User clicks on Find a Help to Buy Property CTA3")
    public void user_clicks_on_Find_a_Help_to_Buy_Property_CTA3() {
        CommonMethods.ScrollIntoView(driver,HelpToBuy.Find_a_Help_to_Buy_Property_under_What_properties_can_I_buy);
        HelpToBuy.click_Find_a_Help_to_Buy_Property_under_What_properties_can_I_buy();;
    }

    //Scenario 7
    @When("User Clicks on What about outside of London Fold")
    public void user_Clicks_on_What_about_outside_of_London_Fold() {
        CommonMethods.ScrollIntoView(driver,HelpToBuy.What_about_outside_of_London);
        HelpToBuy.click_What_about_outside_of_London();
    }
    @When("User clicks on Find a Help to Buy Property CTA4")
    public void user_clicks_on_Find_a_Help_to_Buy_Property_CTA4() {
        CommonMethods.ScrollIntoView(driver,HelpToBuy.Find_a_Help_to_Buy_Property_under_What_about_outside_of_London);
        HelpToBuy.click_Find_a_Help_to_Buy_Property_under_What_about_outside_of_London();;
    }

    //Scenario 8
    @When("User Clicks on How do I pay back the Help to Buy London equity loan Fold")
    public void user_Clicks_on_How_do_I_pay_back_the_Help_to_Buy_London_equity_loan_Fold() {
        CommonMethods.ScrollIntoView(driver,HelpToBuy.Pay_back_Help_to_Buy_London_equity_loan);
        HelpToBuy.click_Pay_back_Help_to_Buy_London_equity_loan();
    }
    @When("User clicks on Find a Help to Buy Property CTA5")
    public void user_clicks_on_Find_a_Help_to_Buy_Property_CTA5() {
        CommonMethods.ScrollIntoView(driver,HelpToBuy.Find_a_Help_to_Buy_Property_under_Buy_London_equity_loan);
        HelpToBuy.click_Find_a_Help_to_Buy_Property_under_Buy_London_equity_loan();;
    }
}
