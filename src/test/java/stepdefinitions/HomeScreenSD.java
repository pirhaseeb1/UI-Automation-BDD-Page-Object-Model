package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utilities.CommonMethods;

import static io.qameta.allure.Allure.step;
import static org.testng.Assert.assertEquals;

public class HomeScreenSD {
    WebDriver driver = FoxtonsBrowserDrivers.getDriver();

    HomePage homepage = new HomePage(driver);
    //    Scenario 1
    @Given("User on Foxtons Home Screen")
    public void user_on_Foxtons_Home_Screen() {
      //  CommonMethods.clickCookie(driver);
    }

    @When("User clicks on Foxtons logo")
    public void user_clicks_on_Foxtons_logo() {
        //HomePage home = new HomePage(driver);
        CommonMethods.ScrollIntoView(driver,HomePage.Logo);
        homepage.clickLogo();
    }

    @Then("User should navigate to Foxtons Home Screen")
    public void user_should_navigate_to_Foxtons_Home_Screen() {

        String actualURL = driver.getCurrentUrl();
        assertEquals (actualURL, HomePage.ExpectedURL);
        driver.quit();
    }


    //Scenario 2
    @When("User clicks on My Foxtons CTA")
    public void user_clicks_on_My_Foxtons_CTA() {
        // HomePage home = new HomePage(driver);
        CommonMethods.ScrollIntoView(driver,HomePage.CTA);
        homepage.clickCTA();
    }

    @Then("User should navigate to My Foxtons Screen")
    public void user_should_navigate_to_My_Foxtons_Screen() {

        String actualURL = driver.getCurrentUrl();
        assertEquals (actualURL, HomePage.ExpectedURL_CTA);
        driver.quit();
    }

    //    Scenario 3
    @When("User clicks on Landlord Card")
    public void user_clicks_on_Landlord_Card() {
        //HomePage home = new HomePage(driver);
        CommonMethods.ScrollIntoView(driver,HomePage.Let_Property_CTA);
        homepage.clickLetProperty();
    }

    @Then("User should navigate to Landlord Landing Screen")
    public void user_should_navigate_to_Landlord_Landing_Screen() {
        String actualURL = driver.getCurrentUrl();
        assertEquals (actualURL, HomePage.ExpectedURL_Landlord);
        driver.quit();
    }

//    Scenario 4

    @When("User clicks on Rent Your Property Card")
    public void user_clicks_on_Rent_Your_Property_Card() {
        //  HomePage home = new HomePage(driver);
        CommonMethods.ScrollIntoView(driver,HomePage.Rent_Property_CTA);
        homepage.clickRentProperty();
    }

    @Then("User should navigate to Rent Your Property Landing Screen")
    public void user_should_navigate_to_Rent_Your_Property_Landing_Screen() {
        String actualURL = driver.getCurrentUrl();
        CommonMethods.assertCustomEquals(actualURL, HomePage.ExpectedURL_RentProperty);
        driver.quit();
    }

    //    Scenario 5
    @When("User clicks on Buy Property Card")
    public void user_clicks_on_Buy_Property_Card() {
        // HomePage home = new HomePage(driver);
        CommonMethods.ScrollIntoView(driver,HomePage.Buy_Property_CTA);
        homepage.clickBuyProperty();
    }

    @Then("User should navigate to Buy Property Landing Screen")
    public void user_should_navigate_to_Buy_Property_Landing_Screen() {
        String actualURL = driver.getCurrentUrl();
        CommonMethods.assertCustomEquals(actualURL, HomePage.ExpectedURL_BuyProperty);
        driver.quit();
    }

    //    Scenario 6
    @When("User clicks on Sale Property Card")
    public void user_clicks_on_Sale_Property_Card() {
        // HomePage home = new HomePage(driver);
        CommonMethods.ScrollIntoView(driver,HomePage.Sell_Property_CTA);
        homepage.clickSellProperty();
    }
    @Then("User should navigate to Sale Property Landing Screen")
    public void user_should_navigate_to_Sale_Property_Landing_Screen() {
        String actualURL = driver.getCurrentUrl();
        CommonMethods.assertCustomEquals(actualURL, HomePage.ExpectedURL_SellProperty);
        driver.quit();
    }

    //    Scenario 7
    @When("User clicks on Learn More Button")
    public void user_clicks_on_Learn_More_Button() {
        // HomePage home = new HomePage(driver);
        CommonMethods.ScrollIntoView(driver,HomePage.Learn_More_CTA);
        CommonMethods.I_AmWait(driver,HomePage.Learn_More_CTA);
        homepage.clickLearnMore();
    }

    @Then("User should navigate to My Foxtons Screen By Clicking Learn More")
    public void user_should_navigate_to_My_Foxtons_Screen_By_Clicking_Learn_More() {
        String actualURL = driver.getCurrentUrl();
        CommonMethods.assertCustomEquals(actualURL, HomePage.ExpectedURL_CTA);
        driver.quit();
    }
}
