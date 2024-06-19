package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import pages.SellMortgagePage;
import testrunners.projectProperties;
import utilities.CommonMethods;

import static org.testng.Assert.assertEquals;


public class SellMortgageSD {
    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    SellMortgagePage SellMortgages = new SellMortgagePage(driver);

    String actual_title_of_hero_image = "MORTGAGES";
    String actual_subtitle_of_hero_image = "Expert mortgage advice";


    @Given("User on buy mortgage page")
    public void User_on_Sell_Mortgages_Page() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        CommonMethods.clickCookie(driver);
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL") +"sell/sell_mortgages/")){
            driver.navigate().to(SellMortgages.ExpectedURLStage);
        }
        else{
            driver.navigate().to(SellMortgages.ExpectedURLQA);
        }
    }

    // Scenario 1
    @When("User checks Mortgages page hero image")
    public void user_checks_Mortages_page_hero_image() {
        SellMortgages.check_mortage_page_hero_image();
    }

    @Then("Mortgages page hero image should have expected title and subtitles")
    public void mortages_page_hero_image_should_have_expected_title_and_subtitles() {
        String ExpectedTitle = SellMortgages.get_title_of_hero_image();
        String ExpectedSubtitle = SellMortgages.get_subtitle_of_hero_image();

        // Verify the title and subtitle of hero image
        assertEquals(actual_title_of_hero_image,ExpectedTitle);
        assertEquals(actual_subtitle_of_hero_image,ExpectedSubtitle);
    }

    // Scenario 2
    @When("User clicks on Visit Alexander Hall button")
    public void user_clicks_on_Alexander_Hall_button() {
        CommonMethods.clickCookie(driver);
        SellMortgages.click_on_alexander_hall_button();
    }

    @Then("System should take user to Alexander Hall Mortgage expert advice page")
    public void system_should_take_user_to_Alexander_Hall_Mortgages_expert_advice_page() {
        String actualURL = driver.getCurrentUrl();
        String ExpectedURL = "https://www.alexanderhall.co.uk/?utm_source=foxtons&utm_medium=referral&utm_campaign=sell";

        // Free Appointment button should exist on Expert advice page
        SellMortgages.user_should_land_on_Mortgages_expert_advice_page();

        assertEquals(actualURL,ExpectedURL);
    }

    // Scenario: 4
    @When("User clicks on the CTA of Moving home mortgages that is view mortgages")
    public void I_click_on_moving_home_mortgages() {
        CommonMethods.clickCookie(driver);
        SellMortgages.click_on_moving_home_mortgages();
    }

    @Then("System takes user to to the Alexander Hall Moving Home mortgages page")
    public void user_should_be_redirected_to_moving_home_mortgages_page() {
        String actualURL = driver.getCurrentUrl();
        String ExpectedURL;
        ExpectedURL = "https://www.alexanderhall.co.uk/mortgages/moving-home?utm_source=foxtons&utm_medium=referral&utm_campaign=sell";

        assertEquals (actualURL, ExpectedURL);
    }

    // Scenario: 5
    @When("User clicks on the CTA of Remortgages that is view mortgages")
    public void I_click_on_remortgage() {
        CommonMethods.clickCookie(driver);
        SellMortgages.click_on_remortgage();
    }

    @Then("System takes user to to the  Alexander Hall Remortgaging page")
    public void user_should_be_redirected_to_remortgage_page() {
        String actualURL = driver.getCurrentUrl();
        String ExpectedURL;
        ExpectedURL = "https://www.alexanderhall.co.uk/mortgages/moving-home?utm_source=foxtons&utm_medium=referral&utm_campaign=sell";

        assertEquals (actualURL, ExpectedURL);
    }

    // Scenario: 6
    @When("User clicks on the CTA of Do you have questions that is contact form")
    public void I_click_on_do_you_have_questions() {
        CommonMethods.clickCookie(driver);
        SellMortgages.click_on_do_you_have_questions();
    }

    @Then("System takes user to to the Alexander Hall Contact Us form page")
    public void user_should_be_redirected_to_do_you_have_questions_page() {
        String actualURL = driver.getCurrentUrl();
        String ExpectedURL;
        ExpectedURL = "https://www.alexanderhall.co.uk/contact?utm_source=foxtons&utm_medium=referral&utm_campaign=sell";
        assertEquals (actualURL, ExpectedURL);
    }
}