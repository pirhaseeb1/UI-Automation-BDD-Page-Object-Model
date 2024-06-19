package stepdefinitions;


import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.InstructFoxtonsPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class InstructFoxtonsSD {
    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    InstructFoxtonsPage instructFoxtonsPage = new InstructFoxtonsPage(driver);
    public static String rentalPriceTextFieldValue = "1,234";
    public static String postcodeTextFieldValue = "E1W 1AB";
    public static String firstNameTextFieldValue = "John";
    public static String lastNameTextFieldValue = "Doe";
    public static String emailTextFieldValue = "asiddiqui@creativechaos.co";
    public static String phoneTextFieldValue = "44 1234 5678";

    @When("User accesses the Instruct Foxtons URL")
    public void user_accesses_Instruct_Foxtons_URL() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        driver.get(instructFoxtonsPage.InstructFoxtonsURL);
    }

    @And("User should navigate to the Instruct Foxtons page")
    public void verify_navigation_to_Instruct_Foxtons_page() {
        String actualURL = driver.getCurrentUrl();
        String ExpectedURL = instructFoxtonsPage.InstructFoxtonsURL;
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }
    @Then("Verify the Instruct Foxtons page")
    public void verify_the_Instruct_Foxtons_page() {
        WebElement messageElement = driver.findElement(By.xpath(instructFoxtonsPage.headingElement));
        Assert.assertTrue("Message text is not present on the page", messageElement.isDisplayed());

    }



    @Given("User is on the Instruct Foxtons page")
    public void user_is_on_Instruct_Foxtons_page() {
        CommonMethods.clickCookie(driver);
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "landlord/contact/instruct/lettings";

        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "landlord/contact/instruct/lettings";
        }
    }

    @Then("User sees the Instruct Foxtons form on the Instruct Foxtons page")
    public void user_on_Instruct_Foxtons_page() {
        CommonMethods.clickCookie(driver);
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "landlord/contact/instruct/lettings";

        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "landlord/contact/instruct/lettings";
        }
    }

    @And("User sees the subheading on the Instruct Foxtons page")
    public void user_sees_the_subheading_on_the_Instruct_Foxtons_page() {
        CommonMethods.clickCookie(driver);
        driver.findElement(By.xpath(instructFoxtonsPage.subheadingElement)).isDisplayed();
    }

    @Then("User should see that the subheading contains some text on the Instruct Foxtons page")
    public void verify_subheading_on_Instruct_Foxtons_page() {
        String subheadingText = driver.findElement(By.xpath(instructFoxtonsPage.subheadingElement)).getText();
        assertTrue(!subheadingText.isEmpty());
    }

    @And("User enters some text in the Rental Price text field on the Instruct Foxtons page")
    public void user_enters_some_text_in_the_Rental_Price_field_on_the_Instruct_Foxtons_page() {
        CommonMethods.clickCookie(driver);
        instructFoxtonsPage.enterTextInRentalPriceTextField(rentalPriceTextFieldValue);
    }

    @Then("The Rental Price text field on the Instruct Foxtons page should contain the text that the user entered")
    public void verify_text_in_the_Rental_Price_text_field_on_the_Instruct_Foxtons_page() {
        String expectedInput = rentalPriceTextFieldValue;
        String actualInput = driver.findElement(By.xpath(instructFoxtonsPage.rentalPriceTextFieldElement)).getAttribute("value");
        assertEquals(expectedInput, actualInput);
    }

    @And("User clicks on When do you need tenants field on the Instruct Foxtons page")
    public void user_clicks_on_When_do_you_need_tenants_field_on_the_Instruct_Foxtons_page() {
        CommonMethods.clickCookie(driver);
        instructFoxtonsPage.clickOnDateElementToOpenCalendar();
    }

    @Then("A calendar should pop up beside the When do you need tenants field on the Instruct Foxtons page")
    public void verify_opening_of_a_calendar_on_the_Instruct_Foxtons_page() {
        driver.findElement(By.xpath(instructFoxtonsPage.calendarElement)).isDisplayed();
    }

    @And("User picks a date from the calendar on the When do you need tenants field on the Instruct Foxtons page")
    public void user_picks_a_date_from_the_calendar_on_the_Instruct_Foxtons_page() {
        CommonMethods.clickCookie(driver);
        instructFoxtonsPage.clickOnDateElementToOpenCalendar();
        instructFoxtonsPage.pickTodaysDateFromDateElement();
        instructFoxtonsPage.clickOnDateElement();
    }

    @Then("The date field should be automatically filled in a YYYY-MM-DD format in the When do you need tenants field on the Instruct Foxtons page") public void verify_date_format_in_the_When_do_you_need_tenants_field_on_the_Instruct_Foxtons_page() throws ParseException {
        String selectedDate = driver.findElement(By.xpath(instructFoxtonsPage.dateFieldElement)).getAttribute("value");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        dateFormat.parse(selectedDate);
    }

    @Then("There should be a Postcode field with a Find UK Address CTA on the Instruct Foxtons page")
    public void verify_presence_of_Postcode_field_and_Find_UK_Address_CTA_on_the_Instruct_Foxtons_page() {
        CommonMethods.clickCookie(driver);
        driver.findElement(By.xpath(instructFoxtonsPage.postcodeFieldElement)).isDisplayed();
        driver.findElement(By.xpath(instructFoxtonsPage.findUKAddressCTAElement)).isDisplayed();
    }

    @And("User enters a valid post code in the Postcode field and clicks on the Find UK Address CTA on the Instruct Foxtons page")
    public void user_enters_valid_postcode_and_clicks_on_Find_UK_Address_CTA_on_the_Instruct_Foxtons_page() {
        CommonMethods.clickCookie(driver);
        instructFoxtonsPage.enterTextInPostcodeTextField(postcodeTextFieldValue);
        instructFoxtonsPage.clickOnFindUKAddressCTA();
    }

    @Then("The Select Address dropdown field should appear on the Instruct Foxtons page")
    public void verify_that_Select_Address_dropdown_field_has_appeared_on_the_Instruct_Foxtons_page() {
        driver.findElement(By.xpath(instructFoxtonsPage.selectAddressDropdownElement)).isDisplayed();
    }

    @And("User selects an address from the Select Address dropdown that appeared on the Instruct Foxtons page")
    public void user_selects_an_address_from_the_Select_Address_dropdown_on_the_Instruct_Foxtons_page() {
        instructFoxtonsPage.clickOnSelectAddressDropdown();
        instructFoxtonsPage.selectFirstAddressInSelectAddressDropdown();
    }

    // Leaving this step empty because the functionality hasn't been developed on the website yet
    @Then("The form should reload to show filled Address, Town and Post Code fields on the Instruct Foxtons page")
    public void verify_data_in_Select_Address_and_Town_and_Postcode_fields_on_the_Instruct_Foxtons_page() {}

    @Then("There should be a Titles drop down, First Name and Last Name text fields in the About You section on the Instruct Foxtons page")
    public void verify_presence_of_Titles_dropdown_First_Name_and_Last_Name_text_fields_on_the_Instruct_Foxtons_page() {
        CommonMethods.clickCookie(driver);
        driver.findElement(By.xpath(instructFoxtonsPage.firstNameTextFieldElement)).isDisplayed();
        driver.findElement(By.xpath(instructFoxtonsPage.lastNameTextFieldElement)).isDisplayed();
    }

    @Then("There should be Email and Phone text fields in the About You section on the Instruct Foxtons page")
    public void verify_presence_of_Email_and_Phone_text_fields_on_the_Instruct_Foxtons_page() {
        driver.findElement(By.xpath(instructFoxtonsPage.emailTextFieldElement)).isDisplayed();
        driver.findElement(By.xpath(instructFoxtonsPage.phoneTextFieldElement)).isDisplayed();
    }

    @Then("There should be a check box option to choose to receive follow up information on the Instruct Foxtons page")
    public void verify_presence_of_a_check_box__on_the_Instruct_Foxtons_page() {
        driver.findElement(By.xpath(instructFoxtonsPage.checkboxElement)).isDisplayed();
    }

    @And("User clicks on the Send request CTA after filling out all fields with relevant data on the Instruct Foxtons page")
    public void user_clicks_on_the_Send_request_CTA_after_filling_out_all_fields_on_the_Instruct_Foxtons_page() {
        CommonMethods.clickCookie(driver);
        instructFoxtonsPage.enterTextInRentalPriceTextField(rentalPriceTextFieldValue);

        instructFoxtonsPage.clickOnDateElement();
        instructFoxtonsPage.pickTodaysDateFromDateElement();
        instructFoxtonsPage.clickOnDateElement();

        instructFoxtonsPage.enterTextInPostcodeTextField(postcodeTextFieldValue);

        instructFoxtonsPage.clickOnFindUKAddressCTA();

        instructFoxtonsPage.clickOnSelectAddressDropdown();
        instructFoxtonsPage.selectFirstAddressInSelectAddressDropdown();

        instructFoxtonsPage.enterTextInFirstNameTextField(firstNameTextFieldValue);

        instructFoxtonsPage.enterTextInLastNameTextField(lastNameTextFieldValue);

        instructFoxtonsPage.enterTextInEmailTextField(emailTextFieldValue);

        instructFoxtonsPage.enterTextInPhoneTextField(phoneTextFieldValue);

        instructFoxtonsPage.clickOnSendRequestButton();
    }

    // Leaving this step empty because the success message does not display that the form was submitted,
    // it only shows a message with some subtext and two CTAs, as verified in the subsequent steps
    @Then("User should see a success message letting the user know the form was submitted when the user clicks on the Send request CTA on the Instruct Foxtons page")
    public void verify_success_message_that_lets_the_user_know_the_form_was_submitted_after_sending_request_on_the_Instruct_Foxtons_page() {}

    @Then("User should see a success message with heading Thank You when the user clicks on the Send request CTA on the Instruct Foxtons page")
    public void verify_that_the_success_message_has_the_heading_Thank_You_after_sending_request_on_the_Instruct_Foxtons_page() {
        String expectedHeadingUponFormSubmission = "thank you";
        String actualHeadingUponFormSubmission = driver.findElement(By.xpath(instructFoxtonsPage.thankYouHeadingElement)).getText();
        assertTrue(StringUtils.containsIgnoreCase(actualHeadingUponFormSubmission, expectedHeadingUponFormSubmission));
    }

    @Then("User should see a success message with a subheading when the user clicks on the Send request CTA on the Instruct Foxtons page")
    public void verify_that_the_success_message_has_a_subheading_after_sending_request_on_the_Instruct_Foxtons_page() {
        String subheadingUponFormSubmissionText = driver.findElement(By.xpath(instructFoxtonsPage.subheadingUponFormSubmissionElement)).getText();
        assertTrue(!subheadingUponFormSubmissionText.isEmpty());
    }

    @Then("User should see a success message with a CTA for view My Foxtons features when the user clicks on the Send request CTA on the Instruct Foxtons page")
    public void verify_the_presence_of_view_My_Foxtons_CTA_after_sending_request_on_the_Instruct_Foxtons_page() {
        driver.findElement(By.xpath(instructFoxtonsPage.myFoxtonsCTAElement)).isDisplayed();
    }

    @Then("User should see a success message with a CTA for visiting Alexander Hall when the user clicks on the Send request CTA on the Instruct Foxtons page")
    public void verify_the_presence_of_visit_Alexander_Hall_CTA_after_sending_request_on_the_Instruct_Foxtons_page() {
        driver.findElement(By.xpath(instructFoxtonsPage.alexanderHallCTAElement)).isDisplayed();
    }
}