package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.SellConveyancingPage;
import testrunners.projectProperties;
import utilities.CommonMethods;


public class SellConveyancingSD {

    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    SellConveyancingPage SellConveyancing = new SellConveyancingPage(driver);
    String title,marketingTitle,marketingSubTitle;
    String[] subTitle = new String[2], marketingBullets = new String[3], beSaleReady = new String[2], whyUseConveyanCard = new String[7], expFoxtConveyan = new String[11];

    @Given("User on Conveyancing Page")
    public void user_on_Conveyancing_Page() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        CommonMethods.clickCookie(driver);
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.get(SellConveyancing.ExpectedURLStage);
        }
        else{
            driver.get(SellConveyancing.ExpectedURLQA);
        }
    }

    @When("User checks the conveyancing card image")
    public void User_checks_the_conveyancing_card_image() {
        title = SellConveyancing.verify_conveyancing_card_title();
        subTitle = SellConveyancing.verify_conveyancing_card_subtitle();
    }

    @Then("conveyancing card should have expected title and subtitles")
    public void conveyancing_card_should_have_expected_title_and_subtitles() {
        Assert.assertEquals(title, SellConveyancing.conveyancingTitleText);
        Assert.assertEquals(subTitle[0], SellConveyancing.conveyancingSubTitleOnetext);
        Assert.assertEquals(subTitle[1], SellConveyancing.conveyancingSubTitleTwotext);
    }

    @When("User clicks on Get a Quote button")
    public void User_clicks_on_Get_a_Quote_button() {
        CommonMethods.clickCookie(driver);
        SellConveyancing.click_on_get_a_quote();
    }

    @Then("System should open up the mail application")
    public void System_should_open_up_the_mail_application() {
        String URL = driver.getCurrentUrl();
    }

    @When("User checks the marketing fold card")
    public void User_checks_the_marketing_field_fold_card() throws InterruptedException {
        marketingTitle = SellConveyancing.verify_marketing_fold_title();
        marketingSubTitle = SellConveyancing.verify_marketing_fold_subtitle();
        marketingBullets = SellConveyancing.verify_marketing_fold_bullets();
    }

    @Then("marketing fold card should have expected title subtitles and bullet points")
    public void marketing_fold_card_should_have_expected_title_subtitles_and_bullet_points() {
        Assert.assertEquals(marketingTitle, SellConveyancing.sellYourPropertyTitleText);
        Assert.assertEquals(marketingSubTitle, SellConveyancing.sellYourPropertySubTitleText);
        Assert.assertEquals(marketingBullets[0], SellConveyancing.sellYourPropertySubTitleBulletOneText);
        Assert.assertEquals(marketingBullets[1], SellConveyancing.sellYourPropertySubTitleBulletTwoText);
        Assert.assertEquals(marketingBullets[2], SellConveyancing.sellYourPropertySubTitleBulletThreeText);
    }

    @When("User checks the fold card")
    public void User_checks_the_fold_card()  {
        whyUseConveyanCard  = SellConveyancing.verify_why_use_conveyan();
    }

    @Then("user see all the benefits and features of Conveyan services in a list format")
    public void user_see_all_the_benefits_and_features_of_Conveyan_services_in_a_list_format() {
        Assert.assertEquals(whyUseConveyanCard[0], SellConveyancing.whyUseConveyanTitleText);
        Assert.assertEquals(whyUseConveyanCard[1], SellConveyancing.nolegalFeeTitleText);
        Assert.assertEquals(whyUseConveyanCard[2], SellConveyancing.fixedlegalFeeTitleText);
        Assert.assertEquals(whyUseConveyanCard[3], SellConveyancing.legalFeePayableTitleText);
        Assert.assertEquals(whyUseConveyanCard[4], SellConveyancing.realTimeUpdatesTitleText);
        Assert.assertEquals(whyUseConveyanCard[5], SellConveyancing.personalRelationshipTitleText);
        Assert.assertEquals(whyUseConveyanCard[6], SellConveyancing.onlineCaseTitleText);
    }

    @When("User checks be sale ready card")
    public void User_checks_be_sale_ready_card() {
        beSaleReady = SellConveyancing.verify_be_sale_ready_card();
    }

    @Then("user see fold with Title Be sale ready with Conveyan and subtitle")
    public void user_see_fold_with_Title_Be_sale_ready_with_Conveyan_and_aubtitle() {
        Assert.assertEquals(beSaleReady[0], SellConveyancing.beSaleReadyTitleText);
        Assert.assertEquals(beSaleReady[1], SellConveyancing.beSaleReadySubTitleText);
    }

    @When("User checks be explore foxtons section")
    public void User_checks_the_explore_foxtons_section() {
        expFoxtConveyan = SellConveyancing.verify_explore_foxtons_conveyan_page();
    }

    @Then("user should see relevant and clickable links")
    public void user_should_see_relevant_and_clickable_links() {
        Assert.assertEquals(expFoxtConveyan[0], SellConveyancing.exploreFoxtonsConveyanTitleText);
        Assert.assertEquals(expFoxtConveyan[1], SellConveyancing.ourServicesText);
        Assert.assertEquals(expFoxtConveyan[2], SellConveyancing.homeWorthText);
        Assert.assertEquals(expFoxtConveyan[3], SellConveyancing.sellersHelpText);

        Assert.assertEquals(expFoxtConveyan[5], SellConveyancing.foxtonsPrivateOfficeText);
        Assert.assertEquals(expFoxtConveyan[6], SellConveyancing.sellYourHomeText);
        Assert.assertEquals(expFoxtConveyan[7], SellConveyancing.bookValuationAppointText);

        Assert.assertEquals(expFoxtConveyan[9], SellConveyancing.helpAndGuideText);
        Assert.assertEquals(expFoxtConveyan[10], SellConveyancing.contactUsConveyanTitle);
    }
}