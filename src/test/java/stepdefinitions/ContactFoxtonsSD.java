package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.ContactFoxtonsPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

import static org.testng.Assert.assertEquals;

public class ContactFoxtonsSD {

    WebDriver driver = FoxtonsBrowserDrivers.getDriver();

//      Scenario: 1
    @Given("Home Screen is opened")
    public void home_Screen_is_opened() {
    }

    @When("User access Contact Foxtons URL")
    public void user_access_Contact_Foxtons_URL() {
        ContactFoxtonsPage CFPage = new ContactFoxtonsPage(driver);
        CFPage.accessContactFoxtonsPage();
        CommonMethods.clickCookie(driver);
    }

    @Then("User should navigate to Contact Foxtons Page")
    public void user_should_navigate_to_Contact_Foxtons_Page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "contact/form/investments";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "contact/form/investments";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
        CommonMethods.clickCookie(driver);
    }

//    Scenario 2

    @When("User selects General Enguiry Subject")
    public void user_selects_General_Enguiry_Subject() {
        ContactFoxtonsPage CFPage = new ContactFoxtonsPage(driver);
        CFPage.clickSubjectList();
        CFPage.selectGeneralEnquiry();
    }

    @When("User enters comments")
    public void user_enters_comments()  {
        ContactFoxtonsPage CFPage = new ContactFoxtonsPage(driver);
        
        CommonMethods.I_AmWait(driver, ContactFoxtonsPage.Comments);
        CFPage.addComments();
    }

    @When("User select title")
    public void user_select_title()  {
        ContactFoxtonsPage CFPage = new ContactFoxtonsPage(driver);
        CommonMethods.I_AmWait(driver, ContactFoxtonsPage.Title);
        
        CFPage.clickTitle();
        
        CommonMethods.I_AmWait(driver, ContactFoxtonsPage.MrTitle);
        CFPage.selectTitle();
        
    }

    @When("User enters first name")
    public void user_enters_first_name() {
        ContactFoxtonsPage CFPage = new ContactFoxtonsPage(driver);
        CFPage.addFName();
    }

    @When("User enters last name")
    public void user_enters_last_name() {
        ContactFoxtonsPage CFPage = new ContactFoxtonsPage(driver);
        CFPage.addLName();
    }

    @When("User enters phone number")
    public void user_enters_phone_number() {
        ContactFoxtonsPage CFPage = new ContactFoxtonsPage(driver);
        CFPage.addPhone();
    }

    @When("User enters email id")
    public void user_enters_email_id() {
        ContactFoxtonsPage CFPage = new ContactFoxtonsPage(driver);
        CFPage.addEmail();
    }

    @When("User submits the form")
    public void user_submits_the_form() {
        ContactFoxtonsPage CFPage = new ContactFoxtonsPage(driver);
        CFPage.submitForm();
    }

    @Then("User should see a success message")
    public void user_should_see_a_success_message()  {
        ContactFoxtonsPage CFPage = new ContactFoxtonsPage(driver);
        
        CommonMethods.I_AmWait(driver, ContactFoxtonsPage.SuccessMessage);
    }

//    Scenario 3

    @When("User selects Looking to Buy Subject")
    public void user_selects_Looking_to_Buy_Subject() {
        ContactFoxtonsPage CFPage = new ContactFoxtonsPage(driver);
        CFPage.clickSubjectList();
        CFPage.selectLookingToBuy();
    }

//    Scenario 4

    @When("User selects Looking to Rent Subject")
    public void user_selects_Looking_to_Rent_Subject(){
        ContactFoxtonsPage CFPage = new ContactFoxtonsPage(driver);
        
        CFPage.clickSubjectList();
        CFPage.selectLookingToRent();
    }

//    Scenario 5

    @When("User selects Want to Sell Subject")
    public void user_selects_Want_to_Sell_Subject(){
        ContactFoxtonsPage CFPage = new ContactFoxtonsPage(driver);
        CFPage.clickSubjectList();
        CFPage.selectWantingToSell();
    }

//    Scenario 6

    @When("User selects Property Management Subject")
    public void user_selects_Letting_Property_Management_Subject(){
        ContactFoxtonsPage CFPage = new ContactFoxtonsPage(driver);
        CFPage.clickSubjectList();
        CFPage.selectPropertyManagement();
    }

//    Scenario 7

    @When("User selects Help to Buy Subject")
    public void user_selects_Help_to_Buy_Subject() {
        ContactFoxtonsPage CFPage = new ContactFoxtonsPage(driver);
        CFPage.clickSubjectList();
        CFPage.selectNewHomes();
    }

//    Scenario 8

    @When("User selects Property Development Subject")
    public void user_selects_Property_Development_Subject(){
        ContactFoxtonsPage CFPage = new ContactFoxtonsPage(driver);
        CFPage.clickSubjectList();
        CFPage.selectPropertyDevelopment();
    }

//    Scenario 9

    @When("User selects Complaints Subject")
    public void user_selects_Complaints_Subject(){
        ContactFoxtonsPage CFPage = new ContactFoxtonsPage(driver);
        CFPage.clickSubjectList();
        CFPage.selectComplaints();
    }

//    Scenario 10
    @When("User selects Feedbacks Subject")
    public void user_selects_Feedbacks_Subject(){
        ContactFoxtonsPage CFPage = new ContactFoxtonsPage(driver);
        CFPage.clickSubjectList();
        CFPage.selectFeedbacks();
    }
}

