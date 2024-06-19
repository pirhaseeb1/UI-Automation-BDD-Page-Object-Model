package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.BuyConveyancingPage;
import pages.SellConveyancingPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

public class BuyCoveyancingSD {

    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    BuyConveyancingPage BuyConveyancing =    new BuyConveyancingPage(driver);
    SellConveyancingPage SellConveyancing = new SellConveyancingPage(driver);
    String title;
    String[] subTitle = new String[2], beBuyReady = new String[2];


    @Given("User on buy Conveyancing Page")
    public void User_on_buy_Conveyancing_Page() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.get(BuyConveyancing.ExpectedURLStage);
        }
        else{
            driver.get(BuyConveyancing.ExpectedURLQA);
        }
    }

    @When("User checks the i am conveyancing card image")
    public void User_checks_the_i_am_conveyancing_card_image() {
        CommonMethods.clickCookie(driver);
        title = BuyConveyancing.verify_conveyancing_card_title();
        subTitle = BuyConveyancing.verify_conveyancing_card_subtitle_buyer();
        subTitle = BuyConveyancing.verify_conveyancing_card_subtitle_buyer();
    }

    @Then("i am conveyancing card should have expected title and subtitles")
    public void i_am_conveyancing_card_should_have_expected_title_and_subtitles() {
        CommonMethods.assertCustomEquals(title, BuyConveyancing.conveyancingTitleText);
        CommonMethods.assertCustomEquals(subTitle[0], BuyConveyancing.conveyancingSubTitleOnetext);
        CommonMethods.assertCustomEquals(subTitle[1], BuyConveyancing.conveyancingSubTitleTwotext);
    }

    @When("User checks be buy ready card")
    public void User_checks_be_buy_ready_card() {
        beBuyReady = BuyConveyancing.verify_be_buy_ready_card();
    }

    @Then("user see fold with Title Be buy ready with Conveyan and subtitle")
    public void user_see_fold_with_Title_Be_buy_ready_with_Conveyan_and_aubtitle() {
        CommonMethods.assertCustomEquals(beBuyReady[0], BuyConveyancing.beBuyReadyTitleText);
        CommonMethods.assertCustomEquals(beBuyReady[1], BuyConveyancing.beBuyReadySubTitleText);
    }

}