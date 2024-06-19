package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LetProcessPage;
import pages.PortalValuationPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

import static org.testng.Assert.assertEquals;
import static pages.PortalValuationPage.sign_in;

public class LetProcessSD {

    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    LetProcessPage PortalLetProcess = new LetProcessPage(driver);

    @Given("User on Let process page")
    public void user_on_Let_process_page() throws InterruptedException {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            CommonMethods.clickCookie(driver);
            driver.get(PortalLetProcess.ExpectedURLStage);
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, PortalLetProcess.ExpectedURLStage);
            // commented this line out to check the behaviour of line above
            // Assert.assertTrue(ActualUrl.contains(PortalLetProcess.ExpectedURLStage));
        }
        else{
            CommonMethods.clickCookie(driver);
            driver.get(PortalLetProcess.ExpectedURLQA);
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, PortalLetProcess.ExpectedURLQA);
        }
    }

    @When("User clicks on Register now CTA")
    public void user_clicks_on_Register_now_CTA() {
        CommonMethods.I_AmWait(driver,PortalLetProcess.Register_now);
        PortalLetProcess.click_Register_now();
    }

    @Then("User should be able to navigate to Registration page")
    public void user_should_be_able_to_navigate_to_Registration_page() {
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

    @When("User clicks on Benefits of Registering CTA")
    public void user_clicks_on_Benefits_of_Registering_CTA() {
        //CommonMethods.I_AmWait(driver,PortalLetProcess.Benefits_of_registering);
        CommonMethods.ScrollIntoView(driver,PortalLetProcess.Benefits_of_registering);
        PortalLetProcess.click_Benefits_of_registering();

    }

    @Then("User should be able to navigate to benefits of Registering page")
    public void user_should_be_able_to_navigate_to_benefits_of_Registering_page() throws InterruptedException {
        Thread.sleep(3000);
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "myfoxtons/applicants";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") +  "myfoxtons/applicants";
        }
        System.out.println(actualURL);
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    }