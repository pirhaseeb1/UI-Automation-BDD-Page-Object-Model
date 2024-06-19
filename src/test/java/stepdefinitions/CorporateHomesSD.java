package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.bouncycastle.jcajce.provider.digest.Skein;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.CorporateHomesPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

import static org.testng.Assert.assertEquals;

public class CorporateHomesSD {

    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    String parentTab;
    CorporateHomesPage CorporateHomes = new CorporateHomesPage(driver);

    //Scenario 1
    @Given("User on RELOCATING TO LONDON page")
    public void user_on_RELOCATING_TO_LONDON_page() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.get(CorporateHomes.ExpectedURLStage);
        }
        else{
            driver.get(CorporateHomes.ExpectedURLQA);
        }
    }

    @When("User clicks on Enquire now CTA under RELOCATING TO LONDON")
    public void user_clicks_on_Enquire_now_CTA_under_RELOCATING_TO_LONDON() {
        CommonMethods.clickCookie(driver);
        CommonMethods.ScrollIntoView(driver,CorporateHomesPage.Enquire_now);
        CorporateHomes.click_Enquire_now();
    }

    @Then("User should be able to navigate to Enquire now page")
    public void user_should_be_able_to_navigate_to_Enquire_now_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "corporate/contact";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "corporate/contact";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);


    }
    //Scenario 2
    @When("User clicks on Tell us your requirements CTA under RELOCATING YOUR STAFF TO LONDON MADE EASY")
    public void user_clicks_on_Tell_us_your_requirements_CTA_under_RELOCATING_YOUR_STAFF_TO_LONDON_MADE_EASY() {
        CommonMethods.clickCookie(driver);
        CommonMethods.ScrollIntoView(driver,CorporateHomesPage.Tell_us_your_requirements);
        CorporateHomes.click_Tell_us_your_requirements();
    }

    @Then("User should be able to navigate to Tell us your requirements page")
    public void user_should_be_able_to_navigate_to_Tell_us_your_requirements_page() {
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "corporate/contact";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "corporate/contact";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }
    //Scenario 3
    @When("User clicks on Tell us your requirements CTA under LET US SEARCH FOR YOU")
    public void user_clicks_on_Tell_us_your_requirements_CTA_under_LET_US_SEARCH_FOR_YOU()  {
        CommonMethods.clickCookie(driver);
        CommonMethods.ScrollIntoView(driver,CorporateHomesPage.Tell_us_your_requirements_2);
        CorporateHomes.click_Tell_us_your_requirements_2();
    }
}
