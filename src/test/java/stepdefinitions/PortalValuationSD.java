package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.PortalValuationPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

public class PortalValuationSD {

    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    PortalValuationPage PortalValuation = new PortalValuationPage(driver);


    @Given("User on Property Valuation page")
    public void user_on_Property_Valuation_page() throws InterruptedException {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.get(PortalValuation.ExpectedURLStage);
        }
        else{
            driver.get(PortalValuation.ExpectedURLQA);
        }
        CommonMethods.I_AmWait(driver, PortalValuationPage.sign_in);
        PortalValuation.send_username(PortalValuationPage.User_name);
        PortalValuation.send_pass(PortalValuationPage.Pass);
        PortalValuation.click_signin();
        CommonMethods.I_AmWait(driver,"//div[@class='MuiBox-root css-0']");
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.get(PortalValuation.ExpectedURLStage);
        }
        else{
            driver.get(PortalValuation.ExpectedURLQA);
        }
        Thread.sleep(1200);
        CommonMethods.I_AmWait(driver,"//div[@class='MuiBox-root css-0']");

    }

    @When("User enter valid postcode {string}")
    public void user_enter_valid_postcode(String PostCode) {
        CommonMethods.I_AmWait(driver,PortalValuationPage.input_postcode);
        driver.findElement(By.xpath(PortalValuationPage.input_postcode)).sendKeys(PostCode);

    }

    @Then("User should be able to see list of addresses")
    public void user_should_be_able_to_see_list_of_addresses() throws InterruptedException {
        Thread.sleep(2000);
        CommonMethods.I_AmWait(driver, PortalValuationPage.Address_1);
        CommonMethods.I_AmWait(driver, PortalValuationPage.Address_2);
        CommonMethods.I_AmWait(driver, PortalValuationPage.Address_3);

    }
    @When("User clicks on refocus")
    public void user_clicks_on_refocus() {
        CommonMethods.ScrollIntoView(driver, PortalValuationPage.Refocus);
        CommonMethods.I_AmWait(driver, PortalValuationPage.Refocus);
        PortalValuation.click_refocus_property_valuation();
    }

    @When("User clicks on Next CTA")
    public void user_clicks_on_Next_CTA() {
       // CommonMethods.ScrollIntoView(driver, PortalValuationPage.Next);
        CommonMethods.I_AmWait(driver, PortalValuationPage.Next);
        PortalValuation.click_Next_property_valuation();
    }

    @Then("User should be able to see error {string}")
    public void user_should_be_able_to_see_error(String string) {
        String actualText = driver.findElement(By.xpath(PortalValuationPage.Error_message_invalid_postcode)).getText();
        Assert.assertEquals(actualText,string);
    }

    @When("User enter invalid postcode {string}")
    public void user_enter_invalid_postcode(String InvalidPostCode) {
        driver.findElement(By.xpath(PortalValuationPage.input_postcode)).sendKeys(InvalidPostCode);
    }

    @Then("User should be able to see error message {string}")
    public void user_should_be_able_to_see_error_message(String string) {
        String actualText = driver.findElement(By.xpath(PortalValuationPage.Error_message_invalid_postcode)).getText();
        Assert.assertEquals(actualText,string);
    }

    @When("User clicked on valid address {string}")
    public void user_clicked_on_valid_address(String address)  {
        CommonMethods.I_AmWait(driver,PortalValuationPage.Address_1);
        PortalValuation.click_Address(address);

    }

    @Then("User should be able to navigate to What type of valuation do you want page")
    public void user_should_be_able_to_navigate_to_What_type_of_valuation_do_you_want_page() {
        CommonMethods.I_AmWait(driver,PortalValuationPage.heading_validate_6);

    }

    @When("User clicked on Online valuation Fold")
    public void user_clicked_on_Online_valuation_Fold() {
        CommonMethods.I_AmWait(driver,PortalValuationPage.Online_valuation);
        PortalValuation.click_Online_valuation();

    }
    @When("User clicked on Home valuation Fold")
    public void user_clicked_on_Home_valuation_Fold() {
        CommonMethods.I_AmWait(driver,PortalValuationPage.Home_valuation);
        PortalValuation.click_Home_valuation();

    }

    @Then("User should be able to navigate to Choose your valuation date page")
    public void user_should_be_able_to_navigate_to_Choose_your_valuation_date_page() {
        CommonMethods.I_AmWait(driver,PortalValuationPage.heading_validate);

    }

    @When("User clicks on date {string}")
    public void user_clicks_on_date(String date) throws InterruptedException {
        Thread.sleep(3000);
        CommonMethods.jsClick(driver,date);

    }

    @Then("User should be able to see three timing cards")
    public void user_should_be_able_to_see_three_timing_cards() {
        CommonMethods.I_AmWait(driver,PortalValuationPage.timing_card_one);
        CommonMethods.I_AmWait(driver,PortalValuationPage.timing_card_two);
        CommonMethods.I_AmWait(driver,PortalValuationPage.timing_card_three);

    }

    @When("User clicks on {string} timing card")
    public void user_clicks_on_timing_card(String string) throws InterruptedException {
       // Thread.sleep(3000);
        CommonMethods.ScrollTo(driver,0,0);
        PortalValuation.choose_timing_card(string);
    }


    @Then("User should be able see error {string}")
    public void user_should_be_able_see_error(String string) {
        String actualText = driver.findElement(By.xpath(PortalValuationPage.error)).getText();
        Assert.assertEquals(actualText,string);
    }


    @Then("User should be able to navigate to What type of building is it page")
    public void user_should_be_able_to_nav_type_of_building_is_it_page() {
        CommonMethods.I_AmWait(driver,PortalValuationPage.heading_validate_7);
    }

    @When("User click on {string} CTA")
    public void user_click_on_CTA(String string) {
        CommonMethods.I_AmWait(driver,PortalValuationPage.heading_validate_7);
        PortalValuation.click_buildingType(string);
    }

    @When("User click on next CTA")
    public void user_click_on_next_CTA() {
        PortalValuation.click_Next_property_valuation();
    }

    @Then("User should be able to navigate to legal owner property page")
    public void user_should_be_able_to_navigate_to_legal_owner_property_page() {
        CommonMethods.I_AmWait(driver,PortalValuationPage.heading_validate_1);

    }

    @Then("user should be able to navigate to What kind of house is it")
    public void user_should_be_able_to_navigate_to_What_kind_of_house_is_it() {
        CommonMethods.I_AmWait(driver,PortalValuationPage.heading_validate_8);
    }

    @When("User clicks on {string} kind of house")
    public void user_clicks_on_kind_of_house(String string) {
        CommonMethods.I_AmWait(driver,PortalValuationPage.heading_validate_8);
        PortalValuation.click_houseType(string);
    }

    @Then("user should be able to navigate to How many bedrooms does it have")
    public void user_should_be_able_to_navigate_to_How_many_bedrooms_does_it_have() {
        CommonMethods.I_AmWait(driver,PortalValuationPage.heading_validate_9);
    }

    @When("user clicks on {string} bedrooms")
    public void user_clicks_on_bedrooms(String string) {
        PortalValuation.click_bedroom(string);
    }

    @Then("user should be able to navigate to Are you the legal owner of the property")
    public void user_should_be_able_to_navigate_to_Are_you_the_legal_owner_of_the_property() {
        CommonMethods.I_AmWait(driver,PortalValuationPage.heading_validate_1);
    }



    @When("user clicks on {string} CTA as legal owner")
    public void user_clicks_on_CTA_as_legal_owner(String string) {
        CommonMethods.ScrollTo(driver,0,0);
        PortalValuation.click_legal_Owner(string);
    }

    @Then("User Should be able to navigate to sales or rental valuation page")
    public void user_Should_be_able_to_navigate_to_sales_or_rental_valuation_page() {
        CommonMethods.I_AmWait(driver,PortalValuationPage.heading_validate_2);
    }

    @When("User click on {string} CTA of Home valuation")
    public void User_clicks_on_CTA_of_Home_valuation(String string) {
        PortalValuation.choose_sales_or_rental(string);
    }


    @Then("User Should be able to navigate to Excellent You are nearly there page")
    public void user_Should_be_able_to_navigate_to_Excellent_You_are_nearly_there_page() {
        CommonMethods.I_AmWait(driver,PortalValuationPage.heading_validate_3);
    }

    @Then("User Should be able to navigate to best contact detail page")
    public void user_Should_be_able_to_navigate_to_best_contact_detail_page() {
        CommonMethods.I_AmWait(driver,PortalValuationPage.heading_validate_4);
    }

    @Then("User Should be able to validate phoneNumber {string} and email {string}")
    public void user_Should_be_able_to_validate_phoneNumber_and_email(String ph_number, String email) {
        String actualText = driver.findElement(By.xpath(PortalValuationPage.PH_Number_validate)).getAttribute("value");
        Assert.assertEquals(actualText,ph_number);

        String actualText1 = driver.findElement(By.xpath(PortalValuationPage.validate_email)).getAttribute("value");
        Assert.assertEquals(actualText1,email);

    }



    @Then("User should be able to validate with email {string}")
    public void user_should_be_able_to_validate_with_email(String string) {
        String actualText = driver.findElement(By.xpath(PortalValuationPage.validate_email)).getAttribute("value");
        Assert.assertEquals(actualText,string);
    }

    @When("User click on Titles drop down")
    public void user_click_on_Titles_drop_down() {
        PortalValuation.click_title();

    }

    @Then("User should be able to see titles")
    public void user_should_be_able_to_see_titles() {
        String actualValue = driver.findElement(By.xpath("(//*[contains(@placeholder,'Title')]//option)[2]")).getAttribute("value");
        Assert.assertEquals(actualValue,"Mr");

    }

    @Then("User should be able to validate firstName {string} and lastName {string}")
    public void user_should_be_able_to_validate_firstName_and_lastName(String firstName, String lastName) {
        String actualText = driver.findElement(By.xpath(PortalValuationPage.firstName_validate)).getAttribute("value");
        Assert.assertEquals(actualText,firstName);

        String actualText1 = driver.findElement(By.xpath(PortalValuationPage.lastName_validate)).getAttribute("value");
        Assert.assertEquals(actualText1,lastName);

    }

    @Then("User should be able to validate phoneNumber {string}")
    public void user_should_be_able_to_validate_phoneNumber(String Phone) {
        String actualText = driver.findElement(By.xpath(PortalValuationPage.PH_Number_validate)).getAttribute("value");
        Assert.assertEquals(actualText,Phone);

    }

    @Then("User should be able to see {string} CTA in What is your situation page")
    public void user_should_be_able_to_see_CTA_in_What_is_your_situation_page(String string) {
        CommonMethods.I_AmWait(driver,PortalValuationPage.heading_validate_5);
    }

    @When("User clicks on {string} CTA")
    public void user_clicks_on_CTA(String string) {
        PortalValuation.click_your_situation(string);
    }

    @Then("User should be able to navigate to Your estimated valuation page")
    public void user_should_be_able_to_navigate_to_Your_estimated_valuation_page() {
        CommonMethods.I_AmWait(driver,PortalValuationPage.estimatedValuation_validate);
    }

    @Then("User Should be able to validate Your request has been sent to our team")
    public void user_Should_be_able_to_validate_Your_request_has_been_sent_to_our_team() {
        CommonMethods.I_AmWait(driver,PortalValuationPage.h1_request_done);

    }
    @Then("User Should be able to see minimum {string} and maximum {string} sale price")
    public void user_Should_be_able_to_see_minimum_and_maximum_sale_price(String minimum,String maximum) {
        CommonMethods.I_AmWait(driver,PortalValuationPage.estimatedValuation_validate);
        String actualText = driver.findElement(By.xpath(PortalValuationPage.Minimum_Price)).getText();
        Assert.assertEquals(actualText,minimum);
        String actualText1 = driver.findElement(By.xpath(PortalValuationPage.Maximum_Price)).getText();
        Assert.assertEquals(actualText1,maximum);

    }

    @When("User click on Rental Price")
    public void user_click_on_Rental_Price() {
        CommonMethods.I_AmWait(driver,PortalValuationPage.estimatedValuation_validate);
        PortalValuation.click_rental_price();

    }

    @Then("User Should be able to see minimum {string} and maximum {string} rental price")
    public void user_Should_be_able_to_see_minimum_and_maximum_rental_price(String minimum,String maximum) {
        String actualText = driver.findElement(By.xpath(PortalValuationPage.Minimum_Price)).getText();
        Assert.assertEquals(actualText,minimum);
        String actualText1 = driver.findElement(By.xpath(PortalValuationPage.Maximum_Price)).getText();
        Assert.assertEquals(actualText1,maximum);

    }
}