package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.BlogLandingPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

public class BlogLandingPageSD {
    WebDriver driver = FoxtonsBrowserDrivers.getDriver();

    BlogLandingPage BuyConveyancing =    new BlogLandingPage(driver);

    String [] categories= new String[11];
    String[] subTitle = new String[2], beBuyReady = new String[2];


    @Given("User on blog Landing page")
    public void User_on_blog_page() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.get(BlogLandingPage.ExpectedURLStage);
        }
        else{
            driver.get(BlogLandingPage.ExpectedURLQA);
        }
    }

    @When("User scroll through the page")
    public void All_articles_on_blog_page() {
        CommonMethods.clickCookie(driver);

        BuyConveyancing.click_All();
    }

    @Then("User should be able to see all the articles with the latest at the top")
    public void Latest_article_should_be_at_the_top() {
        BuyConveyancing.checkArticleOrder(driver, BlogLandingPage.article);
    }


    @When("User should be able to see the blog categories")
    public void User_able_to_see_the_blog_categories() {
        CommonMethods.clickCookie(driver);
        BuyConveyancing.blog_categories_data();
        BuyConveyancing.verify_blog_categories_data();

    }
    @Then("User should be able to select the blog categories")
    public void User_select_the_blog_categories_data() {
        BuyConveyancing.select_categories_data();

    }

    @When("User should be able click on any of the filter categories")
    public void click_on_any_filter_categories() {
        BuyConveyancing.blog_categories_data();
        BuyConveyancing.verify_blog_categories_data();
    }
    @Then("User should be able to see only relevant articles on the page")
    public void User_see_the_relevant_categories_data_() {
        BuyConveyancing.select_categories_relevant_data();

    }


    @When("User should scroll on the blog landing page is not infinite scroll")
    public void User_should_scroll_is_not_infinite_scroll() {
        CommonMethods.clickCookie(driver);
        BuyConveyancing.check_ScrollIsNOtInfinite();
    }
    @Then("User should be able to see the option to navigate the page forward or backword")
    public void User_navigate_the_page_forward_or_backword() {
        BuyConveyancing.navigate_the_forward_or_backword_page();

    }
}