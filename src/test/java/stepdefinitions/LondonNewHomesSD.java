package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LondonNewHomesPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

import static org.testng.Assert.assertEquals;

public class LondonNewHomesSD {

    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    LondonNewHomesPage LondonNewHomes = new LondonNewHomesPage(driver);

    //Scenario 1
    @Given("User on London New Builds and Home page")
    public void user_on_London_New_Builds_and_Home_page() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        CommonMethods.clickCookie(driver);
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.get(LondonNewHomes.ExpectedURLStage);
        }
        else{
            driver.get(LondonNewHomes.ExpectedURLQA);
        }
    }

    @When("User clicks on View all New Homes CTA")
    public void user_clicks_on_View_all_New_Homes_CTA() {
        CommonMethods.ScrollIntoView(driver,LondonNewHomes.View_all_new_homes);
        LondonNewHomes.click_View_all_new_homes();
    }

    @Then("User should be able to navigate to New Homes search page")
    public void user_should_be_able_to_navigate_to_New_Homes_search_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "buy/buy_newhomes";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "buy/buy_newhomes";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }
    //Scenario 2
    @When("User clicks on Help to Buy Options CTA")
    public void user_clicks_on_Help_to_Buy_Options_CTA() {

      //  CommonMethods.ScrollIntoView(driver,LondonNewHomes.Help_to_Buy_Options);
      //  LondonNewHomes.click_Help_to_Buy_Options();
    }

    @Then("User should be able to navigate to Help to Buy Options page")
    public void user_should_be_able_to_navigate_to_Help_to_Buy_Options_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "buy/buy_newhomes#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "buy/buy_newhomes#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 3
    @When("User clicks on Find a New Home CTA")
    public void user_clicks_on_Find_a_New_Home_CTA() {
        CommonMethods.ScrollIntoView(driver,LondonNewHomes.Find_a_New_Home);
        LondonNewHomes.click_Find_a_New_Home();
    }

    @Then("User should be able to navigate to Find a New Home page")
    public void user_should_be_able_to_navigate_to_Find_a_New_Home_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "buy/buy_newhomes";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "buy/buy_newhomes";
        }
        System.out.println(actualURL);
        System.out.println(ExpectedURL);
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 4
    @When("User clicks on View developments CTA")
    public void user_clicks_on_View_developments_CTA() {
        CommonMethods.ScrollIntoView(driver,LondonNewHomes.View_developments);
        LondonNewHomes.click_View_developments();
    }

    @Then("User should be able to navigate to View developments page")
    public void user_should_be_able_to_navigate_to_View_developments_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "buy/buy_newhomes";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "buy/buy_newhomes";
        }
        System.out.println(actualURL);
        System.out.println(ExpectedURL);
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 5
    @When("User clicks on View New Homes CTA")
    public void user_clicks_on_View_New_Homes_CTA() {
        CommonMethods.ScrollIntoView(driver,LondonNewHomes.View_New_Homes);
        LondonNewHomes.click_View_New_Homes();
    }

    @Then("User should be able to navigate to View New Homes page")
    public void user_should_be_able_to_navigate_to_View_New_Homes_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "buy/buy_newhomes";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "buy/buy_newhomes";
        }
        System.out.println(actualURL);
        System.out.println(ExpectedURL);
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 6
    @When("User clicks on Luxury New Homes CTA")
    public void user_clicks_on_Luxury_New_Homes_CTA() {
        CommonMethods.ScrollIntoView(driver,LondonNewHomes.Luxury_New_Homes);
        LondonNewHomes.click_Luxury_New_Homes();
    }

    @Then("User should be able to navigate to Luxury New Homes page")
    public void user_should_be_able_to_navigate_to_Luxury_New_Homes_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "search?newhomes=1&price_to=250000&search_type=SS&sold=1&submit_type=search";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "search?newhomes=1&price_to=250000&search_type=SS&sold=1&submit_type=search";
        }
        System.out.println(actualURL);
        System.out.println(ExpectedURL);
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 7
    @When("User clicks on Mid range New Homes CTA")
    public void user_clicks_on_Mid_range_New_Homes_CTA() {
        CommonMethods.ScrollIntoView(driver,LondonNewHomes.Mid_range_New_Homes);
        LondonNewHomes.click_Mid_range_New_Homes();
    }

    @Then("User should be able to navigate to Mid range New Homes page")
    public void user_should_be_able_to_navigate_to_Mid_range_New_Homes_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "search?newhomes=1&price_from=250000&price_to=1000000&search_type=SS&sold=1&submit_type=search";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "search?newhomes=1&price_from=250000&price_to=1000000&search_type=SS&sold=1&submit_type=search";
        }
        System.out.println(actualURL);
        System.out.println(ExpectedURL);
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 8
    @When("User clicks on Affordable New Homes CTA")
    public void user_clicks_on_Affordable_New_Homes_CTA() {
     //   CommonMethods.ScrollIntoView(driver,LondonNewHomes.Affordable_New_Homes);
        LondonNewHomes.click_Affordable_New_Home();
    }

    @Then("User should be able to navigate to Affordable New Homes page")
    public void user_should_be_able_to_navigate_to_Affordable_New_Homes_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "search?newhomes=1&price_from=1000000&search_type=SS&sold=1&submit_type=search";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "search?newhomes=1&price_from=1000000&search_type=SS&sold=1&submit_type=search";
        }
        System.out.println(actualURL);
        System.out.println(ExpectedURL);
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

}
