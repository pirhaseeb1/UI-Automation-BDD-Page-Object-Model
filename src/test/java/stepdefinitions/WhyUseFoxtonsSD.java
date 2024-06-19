package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.WhyUseFoxtonsPage;
import org.testng.Assert;
import testrunners.projectProperties;
import utilities.CommonMethods;

import static org.testng.Assert.assertEquals;


public class WhyUseFoxtonsSD {

    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    WhyUseFoxtonsPage WhyUseFoxtons = new WhyUseFoxtonsPage(driver);
    String title, subTitleOne, subTitleTwo, foldtitle, foldsubtitle, thousandsOfPropFoldTitle, thousandsOfPropFoldSubTitle;
    String safeHandsTitle, safeHandsSubTitle, londonPropTitle, londonPropSubTitle, propWorthTitle, propWorthSubTitle;
    String[] foldextrapoints = new String[2];
    String[] exploreFoxtonsOption = new String[17];

    //Scenario 1
    @Given("User on Why Use Foxtons Page")
    public void user_on_Why_Use_Foxtons_Page() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        CommonMethods.clickCookie(driver);
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.get(WhyUseFoxtons.ExpectedURLStage);
        }
        else{
            driver.get(WhyUseFoxtons.ExpectedURLQA);
        }
    }

    @When("User checks the hero image")
    public void User_checks_the_hero_image() {
        title = WhyUseFoxtons.verify_hero_image_title();
        subTitleOne = WhyUseFoxtons.verify_hero_image_subtitle_one();
    }

    @Then("image should have expected title and subtitles")
    public void image_should_have_expected_title_and_subtitles() {
        Assert.assertEquals(title, WhyUseFoxtons.heroImageTitleText);
        Assert.assertEquals(subTitleOne, WhyUseFoxtons.heroImageSubTitleOneText);
    }

    //Scenario 2
    @When("User clicks on Register Now button")
    public void User_clicks_on_Register_Now_button() {
        WhyUseFoxtons.click_on_Register_Now();
    }

    @Then("System takes user to Registration Page")
    public void System_takes_user_to_Registration_Page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +  "auth/registration";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "auth/registration";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 3
    @When("User checks the fold")
    public void User_checks_the_fold() {
        foldtitle = WhyUseFoxtons.verify_fold_title();
        foldsubtitle = WhyUseFoxtons.verify_fold_subTitle();
        foldextrapoints = WhyUseFoxtons.verify_fold_extra_points();
    }

    @Then("fold should have the expected title subtitle and points")
    public void fold_should_have_the_expected_title_subtitle_and_points() {
        Assert.assertEquals(foldtitle, WhyUseFoxtons.foldTitleText);
        Assert.assertEquals(foldsubtitle, WhyUseFoxtons.foldSubTitleText);
        Assert.assertEquals(foldextrapoints[0], WhyUseFoxtons.foldExtraPointsOneText);
        Assert.assertEquals(foldextrapoints[1], WhyUseFoxtons.foldExtraPointsThreeText);
    }

    //Scenario 4
    @When("User clicks on Get Started In Seconds Button")
    public void User_clicks_on_Get_Started_In_Seconds_Button() {
        WhyUseFoxtons.click_on_Started_In_Seconds();
    }

    @Then("User lands on Registration Page")
    public void User_lands_on_Registration_Page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +  "auth/registration";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "auth/registration";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 5
    @When("User clicks on Learn More CTA Button")
    public void User_clicks_on_Learn_More_CTA_Button() {
        WhyUseFoxtons.click_on_Learn_More();
    }

    @Then("System should take user to Foxtons Register as a buyer or Register as a renter page")
    public void System_should_take_user_to_Foxtons_Register_as_a_buyer_or_Register_as_a_renter_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +  "foxtons/about/regulatory-bodies";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "foxtons/about/regulatory-bodies";
        }
        System.out.println(actualURL);
        System.out.println(ExpectedURL);
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 6
    @When("User checks thousands of property fold")
    public void User_checks_thousands_of_property_fold() throws InterruptedException {
        thousandsOfPropFoldTitle = WhyUseFoxtons.verify_thousand_of_properties_title();
    }

    @Then("card should have expected title and subtitle")
    public void card_should_have_expected_title_and_subtitle() {
        Assert.assertEquals(thousandsOfPropFoldTitle, WhyUseFoxtons.thousandsOfPropertiesText);
    }

    //Scenario 7
    @When("User clicks on Search Now")
    public void User_clicks_on_Search_Now() {
        WhyUseFoxtons.click_on_Search_Now();
    }

    @Then("User lands on Why Foxtons Page")
    public void User_lands_on_Why_Foxtons_Page() throws InterruptedException {
        Thread.sleep(2000);
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +  "properties-for-sale";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "properties-for-sale";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 8
    @When("User checks safe hands fold")
    public void User_checks_safe_hands_fold() {
        safeHandsTitle = WhyUseFoxtons.verify_safe_hands_title();
        safeHandsSubTitle = WhyUseFoxtons.verify_safe_hands_sub_title();
    }

    @Then("safe hands card should have expected title and subtitle")
    public void safe_hands_card_should_have_expected_title_and_subtitle() {
        Assert.assertEquals(safeHandsTitle, WhyUseFoxtons.SafeHandsText);
        Assert.assertEquals(safeHandsSubTitle, WhyUseFoxtons.getSafeHandsSubTitleText);
    }

    //Scenario 9
    @When("User clicks on learn now from safe hands section")
    public void User_clicks_on_learn_Now_from_safe_hands_section() {
    }

    @Then("User lands on Regulatory Bodies page")
    public void User_lands_on_Regulatory_Bodies_page() {
    }
    //Scenario 10
    @When("User checks london properties section")
    public void User_checks_london_properties_section() {
        londonPropTitle = WhyUseFoxtons.verify_london_properties_title();
        londonPropSubTitle = WhyUseFoxtons.verify_london_properties_sub_title();
    }

    @Then("london Properties section should have expected title and subtitle")
    public void london_Properties_section_should_have_expected_title_and_subtitle() {
        Assert.assertEquals(londonPropTitle, WhyUseFoxtons.getLondonPropExpText);
        Assert.assertEquals(londonPropSubTitle, WhyUseFoxtons.getLondonPrepExpSubTitleText);
    }

    //Scenario 11
    @When("user click on register button")
    public void User_clicks_on_register_button() {
        WhyUseFoxtons.click_on_register_button();
    }

    @Then("User lands on sign up page")
    public void User_lands_on_sign_up_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +  "auth/registration";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "auth/registration";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 12
    @When("User clicks on find offices button")
    public void User_clicks_on_find_offices_button() {
        WhyUseFoxtons.click_on_find_office();
    }

    @Then("User lands on search nearest foxtons office")
    public void User_lands_on_search_nearest_foxtons_office() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +  "buy/Find%20an%20office";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "buy/Find%20an%20office";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 13
    @When("User checks properties worth card")
    public void User_checks_properties_worth_card() {
        propWorthTitle = WhyUseFoxtons.verify_property_worth_title();
        propWorthSubTitle = WhyUseFoxtons.verify_property_worth_sub_title();
    }

    @Then("properties worth card should have expected title and subtitle")
    public void properties_worth_card_should_have_expected_title_and_subtitle() {
        Assert.assertEquals(propWorthTitle, WhyUseFoxtons.getPropWorthText);
        Assert.assertEquals(propWorthSubTitle, WhyUseFoxtons.getPropWorthSubTitleText);
    }

    //Scenario 14
    @When("User clicks on instant valuation")
    public void User_clicks_on_instant_valuation() {
        WhyUseFoxtons.click_on_instant_valuation();
    }

    @Then("User lands on property valuation page")
    public void User_lands_on_property_valuation_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +  "buy";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "buy";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    //Scenario 15
    @When("User checks explore foxtons options")
    public void User_checks_explore_foxtons_options() {
        exploreFoxtonsOption = WhyUseFoxtons.verify_explore_foxtons();
    }

    @Then("All the available options should be present")
    public void All_the_available_options_should_be_present() {
        Assert.assertEquals(exploreFoxtonsOption[0], WhyUseFoxtons.exploreFoxtonsText);
        Assert.assertEquals(exploreFoxtonsOption[1], WhyUseFoxtons.firstTimeBuyersText);
        Assert.assertEquals(exploreFoxtonsOption[2], WhyUseFoxtons.movingHomeText);
        Assert.assertEquals(exploreFoxtonsOption[3], WhyUseFoxtons.helpForBuyersText);
        Assert.assertEquals(exploreFoxtonsOption[4], WhyUseFoxtons.howMuchCanIBorrowText);
        Assert.assertEquals(exploreFoxtonsOption[5], WhyUseFoxtons.guideToBuyingText);
        Assert.assertEquals(exploreFoxtonsOption[6], WhyUseFoxtons.helpToBuyText);
        Assert.assertEquals(exploreFoxtonsOption[7], WhyUseFoxtons.helpToBuyHomesText);
        Assert.assertEquals(exploreFoxtonsOption[8], WhyUseFoxtons.homeWorthText);
        Assert.assertEquals(exploreFoxtonsOption[9], WhyUseFoxtons.registerWithFoxtonsText);
        Assert.assertEquals(exploreFoxtonsOption[10], WhyUseFoxtons.findPropertyText);
        Assert.assertEquals(exploreFoxtonsOption[11], WhyUseFoxtons.homeAvailabilityText);
        Assert.assertEquals(exploreFoxtonsOption[12], WhyUseFoxtons.advantagesFoxtonsText);
        Assert.assertEquals(exploreFoxtonsOption[13], WhyUseFoxtons.mortagesText);
        Assert.assertEquals(exploreFoxtonsOption[14], WhyUseFoxtons.conveyancingText);
        Assert.assertEquals(exploreFoxtonsOption[15], WhyUseFoxtons.stampDutyCalculatorText);
        Assert.assertEquals(exploreFoxtonsOption[16], WhyUseFoxtons.whyBuyNewBuildText);
    }

}
