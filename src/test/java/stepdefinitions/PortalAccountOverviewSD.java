package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.PortalAccountOverviewPage;
import pages.PortalValuationPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

import static org.testng.Assert.assertEquals;
import static pages.PortalValuationPage.sign_in;

public class PortalAccountOverviewSD {

    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    PortalAccountOverviewPage PortalOverview = new PortalAccountOverviewPage(driver);

    @Given("User on Foxtons overview Home page After logging In")
    public void user_on_Foxtons_overview_Home_page_After_logging_In() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        CommonMethods.clickCookie(driver);
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.get(PortalOverview.ExpectedURLStage);
        }
        else{
            driver.get(PortalOverview.ExpectedURLQA);
        }

        CommonMethods.I_AmWait(driver,sign_in);
        PortalOverview.send_username(PortalValuationPage.User_name);
        PortalOverview.send_pass(PortalValuationPage.Pass);
        PortalOverview.click_signin();
        CommonMethods.I_AmWait(driver,"//div[@class='MuiBox-root css-0']");
    }

    @When("User clicks on Get started now CTA under let")
    public void user_clicks_on_Get_started_now_CTA_under_let() {
        CommonMethods.I_AmWait(driver,PortalOverview.Get_started_Now_Let);
        PortalOverview.click_Get_started_Now_Let();
      
    }

    @Then("User should be able to navigate to Get started now page under let")
    public void user_should_be_able_to_navigate_to_Get_started_now_page_under_let() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on Get started now CTA under sell")
    public void user_clicks_on_Get_started_now_CTA_under_sell() {
        CommonMethods.I_AmWait(driver,PortalOverview.Get_started_Now_Sell);
        PortalOverview.click_Get_started_Now_Sell();
    }
    @Then("User should be able to navigate to Get started now page under sell")
    public void user_should_be_able_to_navigate_to_Get_started_now_page_under_sell() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on Get started now CTA under Rent")
    public void user_clicks_on_Get_started_now_CTA_under_Rent() {
        CommonMethods.I_AmWait(driver,PortalOverview.Get_started_Now_Rent);
        PortalOverview.click_Get_started_Now_Rent();


    }
    @Then("User should be able to navigate to Get started now page under rent")
    public void user_should_be_able_to_navigate_to_Get_started_now_page_under_rent() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on Get started now CTA under Buy")
    public void user_clicks_on_Get_started_now_CTA_under_Buy() {
        CommonMethods.I_AmWait(driver,PortalOverview.Get_started_Now_Buy);
        PortalOverview.click_Get_started_Now_Buy();


    }
    @Then("User should be able to navigate to Get started now page under buy")
    public void user_should_be_able_to_navigate_to_Get_started_now_page_under_buy() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on Start your journey CTA under letting")
    public void user_clicks_on_Start_your_journey_CTA_under_letting() {
        // CommonMethods.I_AmWait(driver,PortalOverview.Start_Your_Journey_Letting);
        CommonMethods.ScrollIntoView(driver,PortalOverview.Start_Your_Journey_Letting);
        PortalOverview.click_Start_Your_Journey_Letting();
      
    }

    @Then("User should be able to navigate to Start your journey page under letting")
    public void user_should_be_able_to_navigate_to_Start_your_journey_page_under_letting() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on Start your journey CTA under Renting")
    public void user_clicks_on_Start_your_journey_CTA_under_Renting() {
        //CommonMethods.I_AmWait(driver,PortalOverview.Start_Your_Journey_Renting);
        CommonMethods.ScrollIntoView(driver,PortalOverview.Start_Your_Journey_Renting);
        PortalOverview.click_Start_Your_Journey_Renting();
      
    }

    @Then("User should be able to navigate to Start your journey page under Renting")
    public void user_should_be_able_to_navigate_to_Start_your_journey_page_under_Renting() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on Start your journey CTA under Selling")
    public void user_clicks_on_Start_your_journey_CTA_under_Selling() {
        //CommonMethods.I_AmWait(driver,PortalOverview.Start_Your_Journey_Selling);
        CommonMethods.ScrollIntoView(driver,PortalOverview.Start_Your_Journey_Selling);
        PortalOverview.click_Start_Your_Journey_Selling();
      
    }
    @Then("User should be able to navigate to Start your journey page under Selling")
    public void user_should_be_able_to_navigate_to_Start_your_journey_page_under_Selling() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on Start your journey CTA under Buying")
    public void user_clicks_on_Start_your_journey_CTA_under_Buying() {
        //CommonMethods.I_AmWait(driver,PortalOverview.Start_Your_Journey_Buying);
        CommonMethods.ScrollIntoView(driver,PortalOverview.Start_Your_Journey_Buying);
        PortalOverview.click_Start_Your_Journey_Buying();
      
    }
    @Then("User should be able to navigate to Start your journey page under Buying")
    public void user_should_be_able_to_navigate_to_Start_your_journey_page_under_Buying() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on Learn more CTA under letting")
    public void user_clicks_on_Learn_more_CTA_under_letting() {
        CommonMethods.ScrollIntoView(driver,PortalOverview.Learn_More_Letting);
        PortalOverview.click_Learn_More_Letting();
    }

    @Then("User should be able to navigate to Learn more Letting page")
    public void user_should_be_able_to_navigate_to_Learn_more_Letting_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on Learn more CTA under Renting")
    public void user_clicks_on_Learn_more_CTA_under_Renting() {
        CommonMethods.ScrollIntoView(driver,PortalOverview.Learn_More_Renting);
        PortalOverview.click_Learn_More_Renting();
    }

    @Then("User should be able to navigate to Learn more Renting page")
    public void user_should_be_able_to_navigate_to_Learn_more_Renting_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on Learn more CTA under Selling")
    public void user_clicks_on_Learn_more_CTA_under_Selling() {
        CommonMethods.ScrollIntoView(driver,PortalOverview.Learn_More_Selling);
        PortalOverview.click_Learn_More_Selling();
    }

    @Then("User should be able to navigate to Learn more Selling page")
    public void user_should_be_able_to_navigate_to_Learn_more_Selling_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on Learn more CTA under Buying")
    public void user_clicks_on_Learn_more_CTA_under_Buying() {
        CommonMethods.ScrollIntoView(driver,PortalOverview.Learn_More_Buying);
        PortalOverview.click_Learn_More_Buying();
    }

    @Then("User should be able to navigate to Learn more Buying page")
    public void user_should_be_able_to_navigate_to_Learn_more_Buying_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on Learn more CTA under Want expert mortgage advice")
    public void user_clicks_on_Learn_more_CTA_under_Want_expert_mortgage_advice() {
        CommonMethods.ScrollIntoView(driver,PortalOverview.Learn_More_Want_Expert_Mortage);
        PortalOverview.click_Learn_More_Want_Expert_Mortage();
    }

    @Then("User should be able to navigate to Learn more expert mortage page")
    public void user_should_be_able_to_navigate_to_Learn_more_expert_mortage_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on Profile CTA")
    public void user_clicks_on_Profile_CTA() {
        CommonMethods.I_AmWait(driver,PortalOverview.Profile);
        PortalOverview.click_Profile();
    }

    @Then("User should be able to navigate to profile page")
    public void user_should_be_able_to_navigate_to_profile_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/profile";
        }
        else{
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/profile";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("user clicks on change password CTA under change my password")
    public void user_clicks_on_change_password_CTA_under_change_my_password() {
        CommonMethods.I_AmWait(driver,PortalOverview.Change_Password);
        CommonMethods.ScrollIntoView(driver,PortalOverview.Change_Password);
        PortalOverview.click_Change_Password();
    }

    @Then("User should be able to see {string} update your password")
    public void user_should_be_able_to_see_update_your_password(String updatepassword) {
        CommonMethods.I_AmWait(driver,PortalOverview.update_Password);
        String actualtext = driver.findElement(By.xpath(PortalOverview.update_Password)).getText();
        Assert.assertTrue(actualtext.contains(updatepassword));
    }

    @When("User clicks on Alerts CTA")
    public void user_clicks_on_Alerts_CTA() {
        CommonMethods.I_AmWait(driver,PortalOverview.Alerts);
        PortalOverview.click_Alerts();
    }

    @Then("User should be able to navigate to Alerts page")
    public void user_should_be_able_to_navigate_to_Alerts_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/alerts";
        }
        else{
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/alerts";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on CONTACT CTA")
    public void user_clicks_on_CONTACT_CTA() {
        CommonMethods.I_AmWait(driver,PortalOverview.Contacts);
        PortalOverview.click_Contacts();

    }

    @Then("User should be able to see {string} Contacts details")
    public void user_should_be_able_to_see_Contacts_details(String contactdetail) {
        CommonMethods.I_AmWait(driver,PortalOverview.Contactdetails);
        String actualtext = driver.findElement(By.xpath(PortalOverview.Contactdetails)).getText();
        Assert.assertTrue(actualtext.contains(contactdetail));
    }

    @When("User clicks on search property CTA under My properties")
    public void user_clicks_on_search_property_CTA_under_My_properties() {
        CommonMethods.I_AmWait(driver,PortalOverview.Search_Property);
        PortalOverview.Search_Property();
      
    }

    @When("User enter valid {string} property")
    public void user_enter_valid_property(String property) {
        CommonMethods.I_AmWait(driver,PortalOverview.Search_Property);
        PortalOverview.send_property(property);

    }

    @When("User click search CTA")
    public void user_click_search_CTA() {
        CommonMethods.I_AmWait(driver,PortalOverview.search_button);
        PortalOverview.Search_button();

    }

    @Then("User should be able to see {string} searched results")
    public void user_should_be_able_to_see_search_results(String searched) {
        String actualtext = driver.findElement(By.xpath(PortalOverview.Searched)).getText();
        Assert.assertTrue(actualtext.contains(searched));
    }

    @When("User clicks on Filter CTA")
    public void user_clicks_on_Filter_CTA() {
        CommonMethods.I_AmWait(driver,PortalOverview.Filtered_Properties);
        PortalOverview.Filtered_Properties();
    }

    @When("User click on {string} CTA of Lettings Doc")
    public void user_click_on_CTA_of_Lettings_Doc(String string) {
       // CommonMethods.I_AmWait(driver,PortalOverview.click_Right_to_tent);
        CommonMethods.ScrollIntoView(driver,PortalOverview.click_Right_to_tent);
        PortalOverview.click_Right_to_tent();
    }

    @When("User click on Apply CTA")
    public void user_click_on_Apply_CTA() {
        CommonMethods.I_AmWait(driver,PortalOverview.click_apply);
        PortalOverview.click_apply();
    }

    @Then("User should be able to see {string} filtered property")
    public void user_should_be_able_to_see_filtered_property(String Filteredproperty) {
        String actualtext = driver.findElement(By.xpath(PortalOverview.Filteredproperty)).getText();
        Assert.assertTrue(actualtext.contains(Filteredproperty));
    }

    @When("User clicks on All CTA under My properties")
    public void user_clicks_on_All_CTA_under_My_properties() {
        CommonMethods.I_AmWait(driver,PortalOverview.All_Properties);
        PortalOverview.All_Properties();

    }

    @Then("User should be able to see {string} All properties")
    public void user_should_be_able_to_see_All_properties(String Allproperties) {
        String actualtext = driver.findElement(By.xpath(PortalOverview.Allproperties)).getText();
        Assert.assertTrue(actualtext.contains(Allproperties));
    }

    @When("User clicks on RENT CTA under My properties")
    public void user_clicks_on_RENT_CTA_under_My_properties() {
        CommonMethods.I_AmWait(driver,PortalOverview.Rent_Properties);
        PortalOverview.Rent_Properties();
    }

    @Then("User should be able to see {string} Rent properties")
    public void user_should_be_able_to_see_Rent_properties(String Rentproperties) {
        String actualtext = driver.findElement(By.xpath(PortalOverview.Rentproperties)).getText();
        Assert.assertTrue(actualtext.contains(Rentproperties));
    }

    @When("User clicks on LET CTA under My properties")
    public void user_clicks_on_LET_CTA_under_My_properties() {
        CommonMethods.I_AmWait(driver,PortalOverview.Let_Properties);
        PortalOverview.Let_Properties();

    }

    @Then("User should be able to see {string} Let properties")
    public void user_should_be_able_to_see_Let_properties(String Letproperties) {
        String actualtext = driver.findElement(By.xpath(PortalOverview.Letproperties)).getText();
        Assert.assertTrue(actualtext.contains(Letproperties));
    }

    @When("User clicks on SELL CTA under My properties")
    public void user_clicks_on_SELL_CTA_under_My_properties() {
        CommonMethods.I_AmWait(driver,PortalOverview.Sell_Properties);
        PortalOverview.Sell_Properties();


    }

    @Then("User should be able to see {string} Sell properties")
    public void user_should_be_able_to_see_Sell_properties(String Sellproperties) {
        String actualtext = driver.findElement(By.xpath(PortalOverview.Sellproperties)).getText();
        Assert.assertTrue(actualtext.contains(Sellproperties));
    }

    @When("User clicks on SUPPORT CTA")
    public void user_clicks_on_SUPPORT_CTA() {
        CommonMethods.I_AmWait(driver,PortalOverview.Support);
        PortalOverview.click_support();
    }

    @Then("User should be able to navigate Support page")
    public void user_should_be_able_to_navigate_Support_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        CommonMethods.I_AmWait(driver, PortalOverview.Support);
        String ExpectedURL;
        if (newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))) {
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview";
        } else {
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "account/overview";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }
    @When("User click on lettings CTA")
    public void user_click_on_lettings_CTA() {
        //CommonMethods.I_AmWait(driver,PortalOverview.Lettings_Terms);
        PortalOverview.click_Lettings_Terms();

    }

    @When("User click on Rent CTA")
    public void user_click_on_Rent_CTA() {
        //CommonMethods.I_AmWait(driver,PortalOverview.Rent_Guarantee_Terms );
        PortalOverview.click_Rent_Guarantee_Terms();

    }

    @When("User click on Preparation CTA")
    public void user_click_on_Preparation_CTA() {
        //CommonMethods.I_AmWait(driver,PortalOverview.Preparation_for_Tenancy);
        PortalOverview.click_Preparation_for_Tenancy();

    }

    @When("User click on Property CTA")
    public void user_click_on_Property_CTA() {
       // CommonMethods.I_AmWait(driver,PortalOverview.Property_Licence_Query);
        PortalOverview.click_Property_Licence_Query();

    }

    @When("User click on Instruction CTA")
    public void user_click_on_Instruction_CTA() {
        //CommonMethods.I_AmWait(driver,PortalOverview.Instruction_to_Exchange);
        PortalOverview.click_Instruction_to_Exchange();

    }

    @When("User click on Tenancy CTA")
    public void user_click_on_Tenancy_CTA() {
        //CommonMethods.I_AmWait(driver,PortalOverview.Tenancy_Agreement_signed_by_landlord);
        PortalOverview.click_Tenancy_Agreement_signed_by_landlord();
    }

    @When("User click on Landlord CTA")
    public void user_click_on_Landlord_CTA() {
        //CommonMethods.I_AmWait(driver,PortalOverview.Landlord_Commission_Explanation);
        PortalOverview.click_Landlord_Commission_Explanation();
    }

    @When("User click on Application CTA")
    public void user_click_on_Application_CTA() {
        //CommonMethods.ScrollIntoView(driver,PortalOverview.Application_for_Tenancy);
        PortalOverview.click_Application_for_Tenancy();
    }

    @When("User click on External CTA")
    public void user_click_on_External_CTA() {
        //CommonMethods.ScrollIntoView(driver,PortalOverview.External_Reference_Report);
        PortalOverview.click_External_Reference_Report();
    }

    @When("User click on Tenant CTA")
    public void user_click_on_Tenant_CTA() {
        //CommonMethods.ScrollIntoView(driver,PortalOverview.Tenant_Non_Viewing_Letters);
        PortalOverview.click_Tenant_Non_Viewing_Letters();
    }

    @When("User click on TenancyAgreement CTA")
    public void user_click_on_TenancyAgreement_CTA() {
       // CommonMethods.ScrollIntoView(driver,PortalOverview.Tenancy_Agreement_signed_by_tenant);
        PortalOverview.click_Tenancy_Agreement_signed_by_tenant();
    }

    @When("User click on Standing CTA")
    public void user_click_on_Standing_CTA() {
       // CommonMethods.ScrollIntoView(driver,PortalOverview.Standing_Order);
        PortalOverview.click_Standing_Order();
    }

    @When("User click on Right CTA")
    public void user_click_on_Right_CTA() {
        //CommonMethods.ScrollIntoView(driver,PortalOverview.click_Right_to_tent);
        PortalOverview.click_Right_to_tent();
    }

    @When("User click on Compliance CTA")
    public void user_click_on_Compliance_CTA() {
        //CommonMethods.ScrollIntoView(driver,PortalOverview.Compliance_Doc);
        PortalOverview.click_Compliance_Doc();
    }

    @When("User click on Energy CTA")
    public void user_click_on_Energy_CTA() {
        //CommonMethods.I_AmWait(driver,PortalOverview.Energy_Performance_Certificate);
        PortalOverview.click_Energy_Performance_Certificate();
    }

    @When("User click on Gas CTA")
    public void user_click_on_Gas_CTA() {
        //CommonMethods.I_AmWait(driver,PortalOverview.Gas_Safety_Certificate);
        PortalOverview.click_Gas_Safety_Certificate();
    }

    @When("User click on Electrical CTA")
    public void user_click_on_Electrical_CTA() {
       // CommonMethods.I_AmWait(driver,PortalOverview.Electrical_Installation_Condition);
        PortalOverview.click_Electrical_Installation_Condition();
    }

    @When("User click on Portable CTA")
    public void user_click_on_Portable_CTA() {
        //CommonMethods.I_AmWait(driver,PortalOverview.Portable_Appliance_Test);
        PortalOverview.click_Portable_Appliance_Test();
    }

    @When("User click on Fire CTA")
    public void user_click_on_Fire_CTA() {
      //  CommonMethods.I_AmWait(driver,PortalOverview.Fire_Risk_Assessment);
        PortalOverview.click_Fire_Risk_Assessment();
    }

    @When("User click on Legionnaires CTA")
    public void user_click_on_Legionnaires_CTA() {
       // CommonMethods.I_AmWait(driver,PortalOverview.Legionnaires_Risk_Assement );
        PortalOverview.click_Legionnaires_Risk_Assement ();
    }

    @When("User click on Propertyapplication CTA")
    public void user_click_on_Propertyapplication_CTA() {
      //  CommonMethods.I_AmWait(driver,PortalOverview.Property_Licence_Application);
        PortalOverview.click_Property_Licence_Application();
    }

    @When("User click on Propertygranted CTA")
    public void user_click_on_Propertygranted_CTA() {
        //CommonMethods.ScrollIntoView(driver,PortalOverview.Property_Licence_Granted);
        PortalOverview.click_Property_Licence_Granted();
    }

    @When("User click on AML CTA")
    public void user_click_on_AML_documents_POI_POA_CTA() {
        //CommonMethods.ScrollIntoView(driver,PortalOverview.AML_documents);
        PortalOverview.click_AML_documents();
    }

    @When("User click on TenantVisa CTA")
    public void user_click_on_TenantVisa_CTA() {
       // CommonMethods.ScrollIntoView(driver,PortalOverview.Tenant_Visa);
        PortalOverview.click_Tenant_Visa();
    }

    @When("User click on InventoryCheckin CTA")
    public void user_click_on_InventoryCheckin_CTA() {
        //CommonMethods.ScrollIntoView(driver,PortalOverview.Inventory_Check_in);
        PortalOverview.click_Inventory_Check_in();
    }

    @When("User click on InventoryCheckout CTA")
    public void user_click_on_InventoryCheckout_CTA() {
        //CommonMethods.ScrollIntoView(driver,PortalOverview.Inventory_Checkout);
        PortalOverview.click_Inventory_Checkout();
    }

    @When("User click on HowtoRentGuide CTA")
    public void user_click_on_HowtoRentGuide_CTA() {
       // CommonMethods.ScrollIntoView(driver,PortalOverview.How_to_Rent_Guide);
        PortalOverview.click_How_to_Rent_Guide();
    }

    @When("User click on Deposit CTA")
    public void user_click_on_Deposit_CTA() {
        //CommonMethods.ScrollIntoView(driver,PortalOverview.Deposit_Protection_Certificate);
        PortalOverview.click_Deposit_Protection_Certificate();
    }

    @Then("User should be able to see {string} Allfiltered property")
    public void user_should_be_able_to_see_Allfiltered_property(String Allfiltered) {
        String actualtext = driver.findElement(By.xpath(PortalOverview.Filteredproperty)).getText();
        Assert.assertTrue(actualtext.contains(Allfiltered));
    }

}

