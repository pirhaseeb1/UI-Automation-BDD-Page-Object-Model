package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.MyFoxtonsBuyersPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

import static org.testng.Assert.assertEquals;

public class MyFoxtonsBuyersSD {
    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    MyFoxtonsBuyersPage foxtonsBuyers = new MyFoxtonsBuyersPage(driver);

    @Given("User on Foxtons buyer page")
    public void user_on_Foxtons_buyer_page() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        CommonMethods.clickCookie(driver);
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.get(foxtonsBuyers.ExpectedURLStage);
        }
        else{
            driver.get(foxtonsBuyers.ExpectedURLQA);
        }
        CommonMethods.I_AmWait(driver,MyFoxtonsBuyersPage.go_to_my_foxtons);
    }

    @When("User clicks on Go To My Foxtons button")
    public void user_clicks_on_Go_To_My_Foxtons_button() {
        foxtonsBuyers.click_go_to_my_foxtons();
    }

    @Then("User Should be able to navigate to My Foxtons page")
    public void user_Should_be_able_to_navigate_to_My_Foxtons_page() throws InterruptedException {
        Thread.sleep(3000);
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "myfoxtons";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "myfoxtons";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on sign_in button")
    public void user_clicks_on_sign_in_button() {
        CommonMethods.ScrollIntoView(driver,MyFoxtonsBuyersPage.sign_in);
        foxtonsBuyers.click_sign_in();
    }

    @Then("User Should be able to navigate to SignIN page")
    public void user_Should_be_able_to_navigate_to_SignIN_page() throws InterruptedException {
        Thread.sleep(3000);
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "auth/login";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "auth/login";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on register button")
    public void user_clicks_on_register_button() {
        CommonMethods.ScrollIntoView(driver,MyFoxtonsBuyersPage.register);
        foxtonsBuyers.click_register();
        
    }

    @Then("User Should be able to navigate to Create an Account page")
    public void user_Should_be_able_to_navigate_to_Create_an_Account_page() throws InterruptedException {
        Thread.sleep(3000);
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
