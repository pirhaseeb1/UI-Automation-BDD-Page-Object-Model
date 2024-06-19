package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.ShortLetsPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

import static org.testng.Assert.assertEquals;

public class ShortLetsSD {

    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    ShortLetsPage ShortLets = new ShortLetsPage(driver);

    // Scenario 1
    @Given("User on Short Let Services For Landlords page")
    public void user_on_Short_Let_Services_For_Landlords_page() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        CommonMethods.clickCookie(driver);
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.get(ShortLets.ExpectedURLStage);
        }
        else{
            driver.get(ShortLets.ExpectedURLQA);
        }
    }

    @When("User clicks on Find me tenants CTA")
    public void user_clicks_on_Find_me_tenants_CTA() {
        CommonMethods.I_AmWait(driver,ShortLetsPage.Find_me_tenants);
        CommonMethods.ScrollIntoView(driver,ShortLetsPage.Find_me_tenants);
        ShortLets.click_Find_me_tenants();
        
    }

    @Then("User should be able to navigate to Find me tenants page")
    public void user_should_be_able_to_navigate_to_Find_me_tenants_page() throws InterruptedException {
        Thread.sleep(2000);
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +  "landlord/contact/find-tenants/short-lets";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "landlord/contact/find-tenants/short-lets";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    // Scenario 2
    @When("User clicks on Contact us CTA")
    public void user_clicks_on_Contact_us_CTA() {

        CommonMethods.ScrollIntoView(driver,ShortLetsPage.Contact_us);
        ShortLets.click_Contact_us();
    }

    @Then("User should be able to navigate to Contact us page")
    public void user_should_be_able_to_navigate_to_Contact_us_page() throws InterruptedException {
        Thread.sleep(2000);
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +  "landlord/enquiry/short-lets";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "landlord/enquiry/short-lets";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }
    // Scenario 3
    @When("User clicks on Contact us CTA2")
    public void user_clicks_on_Contact_us_CTA2() {

        CommonMethods.ScrollIntoView(driver,ShortLetsPage.Contact_us_under_Lucrative);
        ShortLets.click_Contact_us_under_Lucrative();
    }

    @Then("User should be able to navigate to Contact us")
    public void user_should_be_able_to_navigate_to_Contact_us() throws InterruptedException {
        Thread.sleep(2000);
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +  "landlord/enquiry/short-lets";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "landlord/enquiry/short-lets";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    // Scenario 4
    @When("User clicks on Getting Started CTA")
    public void user_clicks_on_Getting_Started_CTA() {
        CommonMethods.ScrollIntoView(driver,ShortLetsPage.Get_started_under_Increased_choice);
        ShortLets.click_Get_started_under_Increased_choice();;
    }

    @Then("User should be able to navigate to Getting Started page")
    public void user_should_be_able_to_navigate_to_Getting_Started_page() throws InterruptedException {
        Thread.sleep(2000);
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +  "landlord/contact/find-tenants/short-lets";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "landlord/contact/find-tenants/short-lets";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 5

    @When("User clicks on Getting Started CTA4")
    public void user_clicks_on_Getting_Started_CTA4() {

        CommonMethods.ScrollIntoView(driver,ShortLetsPage.Get_started_under_High_calibre);
        ShortLets.click_Get_started_under_High_calibre();
    }

    //Scenario 6
    @When("User clicks on Getting Started CTA5")
    public void user_clicks_on_Getting_Started_CTA5() {

        CommonMethods.ScrollIntoView(driver,ShortLetsPage.Get_started_under_Short_lets);
        ShortLets.click_Get_started_under_Short_lets();
    }
    //Scenario 7

    @When("User clicks on Getting Started CTA6")
    public void user_clicks_on_Getting_Started_CTA6() {
        CommonMethods.ScrollIntoView(driver,ShortLetsPage.Get_started_under_Lettings);
        ShortLets.click_Get_started_under_Lettings();
    }
}
