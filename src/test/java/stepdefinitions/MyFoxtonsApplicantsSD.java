package stepdefinitions;
import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.MyFoxntonsApplicantsPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

import static org.testng.Assert.assertEquals;

public class MyFoxtonsApplicantsSD {
    WebDriver driver = FoxtonsBrowserDrivers.getDriver();

    //    Scenario 1
    @Given("User accesses home screen")
    public void user_accesses_home_screen() {

    }

    @When("User enters the url of My Foxtons Applicants Page")
    public void user_enters_the_url_of_My_Foxtons_Applicants_Page() {
        MyFoxntonsApplicantsPage FAPage = new MyFoxntonsApplicantsPage(driver);
        FAPage.accessApplicantsPage();
    }

    @Then("My Foxtons Applicants Page should be opened")
    public void my_Foxtons_Applicants_Page_should_be_opened() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +  "myfoxtons/applicants";
        }
        else{
            ExpectedURL =  projectProperties.getProperty("QA_URL") + "myfoxtons/applicants";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
        driver.quit();
    }

    //    Scenario 2
    @When("User clicks on Foxtons Logo")
    public void user_clicks_on_Foxtons_Logo() {
        MyFoxntonsApplicantsPage FAPage = new MyFoxntonsApplicantsPage(driver);
        FAPage.clickLogo();
    }

    @Then("Home Page should be opened")
    public void home_Page_should_be_opened() {
        assertEquals("https://fxweb-staging.foxtons-cloud.link/", MyFoxntonsApplicantsPage.ExpectedHomeURL);
        driver.quit();
    }

//    Scenario 3

    @When("User clicks on My Foxtons button")
    public void user_clicks_on_My_Foxtons_button() {
        MyFoxntonsApplicantsPage FAPage = new MyFoxntonsApplicantsPage(driver);
        FAPage.clickMyFoxtonsCTA();
    }

    @Then("My Foxtons Page should be opened")
    public void my_Foxtons_Page_should_be_opened() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +  "myfoxtons/applicants";
        }
        else{
            ExpectedURL =  projectProperties.getProperty("QA_URL") + "myfoxtons/applicants";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
        driver.quit();
    }

//    Scenario 4

    @When("User clicks on Register As a Buyer")
    public void user_clicks_on_Register_As_a_Buyer() {
        MyFoxntonsApplicantsPage FAPage = new MyFoxntonsApplicantsPage(driver);
        FAPage.clickBuyerRegistration();
    }

    @Then("User should be navigated to registration screen")
    public void user_should_be_navigated_to_registration_screen() {
        String actualURL = driver.getCurrentUrl();

        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +  "auth/login";
        }
        else{
            ExpectedURL =  projectProperties.getProperty("QA_URL") + "auth/login";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
        driver.quit();
    }

//    Scenario

    @When("User clicks on Register As a Tenant")
    public void user_clicks_on_Register_As_a_Tenant() {
        MyFoxntonsApplicantsPage FAPage = new MyFoxntonsApplicantsPage(driver);
        FAPage.clickTenantRegistration();
    }
}


