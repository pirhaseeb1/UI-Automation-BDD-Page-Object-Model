package stepdefinitions;
import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.MegaMenuPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

public class MegaMenuSD {
    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    MegaMenuPage PortalMegaMenu = new MegaMenuPage(driver);

    @When("User clicks on Buy CTA of MegaMenu")
    public void user_clicks_on_Buy_CTA_of_MegaMenu() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Buy);
        PortalMegaMenu.click_Buy();
    }

    @When("User clicks on Buy Properties CTA")
    public void user_clicks_on_Buy_Properties_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Buy_properties);
        PortalMegaMenu.click_Buy_properties();


    }

    @Then("User should be able to navigate to Buyer page")
    public void user_should_be_able_to_navigate_to_Buyer_page() throws InterruptedException {
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            Thread.sleep(3000);
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, PortalMegaMenu.ExpectedURL_buyerStage);
        }
        else{
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, PortalMegaMenu.ExpectedURL_buyerQA);
        }
    }

    @When("User clicks on New build homes CTA")
    public void user_clicks_on_New_build_homes_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.New_build_homes);
        PortalMegaMenu.click_New_build_homes();
    }

    @Then("User should be able to navigate to Newhomes page")
    public void user_should_be_able_to_navigate_to_Newhomes_page() throws InterruptedException {
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, PortalMegaMenu.ExpectedURL_newhomesStage);
        }
        else{
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, PortalMegaMenu.ExpectedURL_newhomesQA);
        }
    }

    @When("User clicks on Mortgages CTA")
    public void user_clicks_on_Mortgages_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Mortgages);
        PortalMegaMenu.click_Mortgages();
    }

    @When("User clicks on Mortgage Advice CTA")
    public void user_clicks_on_Mortgage_Advice_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Mortgage_advice);
        PortalMegaMenu.click_Mortgage_advice();
    }

    @Then("User should be able to navigate to Buy mortgages page")
    public void user_should_be_able_to_navigate_to_Buy_mortgages_page() throws InterruptedException {
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, PortalMegaMenu.ExpectedURL_buy_mortgagesStage);
        }
        else{
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, PortalMegaMenu.ExpectedURL_buy_mortgagesQA);
        }
    }

    @When("User clicks on Mortgage calculator CTA")
    public void user_clicks_on_Mortgage_calculator_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Mortgage_calculator);
        PortalMegaMenu.click_Mortgage_calculator();
    }

    @Then("User should be able to navigate to Mortgage calculator page")
    public void user_should_be_able_to_navigate_to_Mortgage_calculator_page() {
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, "https://www.alexanderhall.co.uk/mortgage-calculator");
        }
        else{
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, "https://www.alexanderhall.co.uk/mortgage-calculator");

        }
    }

    @When("User clicks on How Much Can I Borrow Mortgage CTA")
    public void user_clicks_on_How_Much_Can_I_Borrow_Mortgage_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.How_much_I_borrow_mortgage);
        PortalMegaMenu.click_How_much_I_borrow_mortgage();
    }

    @Then("User should be able to navigate to how much can I borrow page")
    public void user_should_be_able_to_navigate_to_how_much_can_I_borrow_page() {
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, projectProperties.getProperty("STAGE_URL") + "buy/mortgages/how-much-can-i-borrow");
        }
        else{
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, projectProperties.getProperty("QA_URL") + "buy/mortgages/how-much-can-i-borrow");
        }
    }

    @When("User clicks on Stamp duty calculator CTA")
    public void user_clicks_on_Stamp_duty_calculator_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Stamp_duty_calculator);
        PortalMegaMenu.click_Stamp_duty_calculator();
    }

    @Then("User should be able to navigate to Stampduty page")
    public void user_should_be_able_to_navigate_to_Stampduty_page() {
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, PortalMegaMenu.ExpectedURL_stampdutyStage);
        }
        else{
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, PortalMegaMenu.ExpectedURL_stampdutyQA);
        }
    }

    @When("User clicks on Buy to let CTA")
    public void user_clicks_on_Buy_to_let_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Buy_to_let);
        PortalMegaMenu.click_Buy_to_let();
    }

    @Then("User should be able to navigate to Buy to let mortgages page")
    public void user_should_be_able_to_navigate_to_Buy_to_let_mortgages_page() {
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, PortalMegaMenu.ExpectedURL_buy_to_let_mortgagesStage);
        }
        else{
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, PortalMegaMenu.ExpectedURL_buy_to_let_mortgagesQA);
        }
    }

    @When("User clicks on Rent CTA of MegaMenu")
    public void user_clicks_on_Rent_CTA_of_MegaMenu() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Rent);
        PortalMegaMenu.click_Rent();
    }

    @When("User clicks on Properties to rent CTA")
    public void user_clicks_on_Properties_to_rent_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Properties_to_rent);
        PortalMegaMenu.click_Properties_to_rent();
    }

    @Then("User should be able to navigate to tenant page")
    public void user_should_be_able_to_navigate_to_tenant_page() {
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, PortalMegaMenu.ExpectedURL_tenantStage);
        }
        else{
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, PortalMegaMenu.ExpectedURL_tenantQA);
        }
    }

    @When("User clicks on Short term rentals CTA")
    public void user_clicks_on_Short_term_rentals_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Short_term_rentals);
        PortalMegaMenu.click_Short_term_rentals();
    }

    @Then("User should be able to navigate to Short term page")
    public void user_should_be_able_to_navigate_to_Short_term_page() {
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, projectProperties.getProperty("STAGE_URL") + "let/short-lets");
        }
        else{
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, projectProperties.getProperty("QA_URL") + "let/short-lets");
        }
    }

    @When("User clicks on Corporate home rentals CTA")
    public void user_clicks_on_Corporate_home_rentals_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Corporate_home_rentals);
        PortalMegaMenu.click_Corporate_home_rentals();
    }

    @Then("User should be able to navigate to Corporate home page")
    public void user_should_be_able_to_navigate_to_Corporate_home_page() {
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, projectProperties.getProperty("STAGE_URL") + "corporate");
        }
        else{
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, projectProperties.getProperty("QA_URL") + "corporate");
        }
    }

    @When("User clicks on Student housing CTA")
    public void user_clicks_on_Student_housing_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Student_housing);
        PortalMegaMenu.click_Student_housing();
    }

    @Then("User should be able to navigate to Student housing page")
    public void user_should_be_able_to_navigate_to_Student_housing_page() {
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, projectProperties.getProperty("STAGE_URL") + "students");
        }
        else{
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, projectProperties.getProperty("QA_URL") + "students");
        }
    }

    @When("User clicks on Let CTA of MegaMenu")
    public void user_clicks_on_Let_CTA_of_MegaMenu() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Lett);
        PortalMegaMenu.click_Lett();
    }

    @When("User clicks on Short term lets CTA")
    public void user_clicks_on_Short_term_lets_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Short_term_lets);
        PortalMegaMenu.click_Short_term_lets();
    }

    @Then("User should be able to navigate to short lets page")
    public void user_should_be_able_to_navigate_to_short_lets_page() {
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, PortalMegaMenu.ExpectedURL_short_letsStage);
        }
        else{
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, PortalMegaMenu.ExpectedURL_short_letsQA);
        }
    }

    @When("User clicks on Property Management CTA")
    public void user_clicks_on_Property_Management_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Property_Management);
        PortalMegaMenu.click_Property_Management();
    }

    @Then("User should be able to navigate to Property Management page")
    public void user_should_be_able_to_navigate_to_Property_Management_page() {
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, PortalMegaMenu.ExpectedURL_property_managementStage);
        }
        else{
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, PortalMegaMenu.ExpectedURL_property_managementQA);
        }
    }

    @When("User clicks on Prime Lettings CTA")
    public void user_clicks_on_Prime_Lettings_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Prime_Lettings);
        PortalMegaMenu.click_Prime_Lettings();
    }

    @Then("User should be able to navigate to Prime page")
    public void user_should_be_able_to_navigate_to_Prime_page() {
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, PortalMegaMenu.ExpectedURL_primeStage);
        }
        else{
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, PortalMegaMenu.ExpectedURL_primeQA);
        }
    }

    @When("User clicks Letting agents CTA")
    public void user_clicks_Letting_agents_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Letting_agents);
        PortalMegaMenu.click_Letting_agents();
    }

    @Then("User should be able to navigate to Letting agents page")
    public void user_should_be_able_to_navigate_to_Letting_agents_page() {
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, projectProperties.getProperty("STAGE_URL") + "landlord/help#more");
        }
        else{
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, projectProperties.getProperty("QA_URL") + "landlord/help#more");
        }
    }
    @When("User clicks on Buy to lett CTA")
    public void user_clicks_on_Buy_to_lett_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Buy_to_lett);
        PortalMegaMenu.click_Buy_to_lett();
    }

    @Then("User should be able to navigate to Buy to let page")
    public void user_should_be_able_to_navigate_to_Buy_to_let_page() {
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, projectProperties.getProperty("STAGE_URL") + "landlord/buy-to-let-mortgages");
        }
        else{
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, projectProperties.getProperty("QA_URL") + "landlord/buy-to-let-mortgages");
        }
    }

    @When("User clicks on Rental yield calculator CTA")
    public void user_clicks_on_Rental_yield_calculator_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Rental_yeild_calculator);
        PortalMegaMenu.click_Rental_yeild_calculator();
    }

    @Then("User should be able to navigate to yield calculator page")
    public void user_should_be_able_to_navigate_to_yield_calculator_page() {
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, PortalMegaMenu.ExpectedURL_yield_calculatorStage);
        }
        else{
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, PortalMegaMenu.ExpectedURL_yield_calculatorQA);
        }
    }

    @When("User clicks on Sell CTA of MegaMenu")
    public void user_clicks_on_Sell_CTA_of_MegaMenu() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Sell);
        PortalMegaMenu.click_Sell();
    }

    @When("User clicks on Sell My Home CTA")
    public void user_clicks_on_Sell_My_Home_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Sell_my_home);
        PortalMegaMenu.click_Sell_my_home();
    }

    @When("User clicks on sell my home CTA")
    public void user_clicks_on_sell_my_home_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Sell_my_homee);
        PortalMegaMenu.click_Sell_my_homee();
    }

    @Then("User should be able to navigate to Sell My Home page")
    public void user_should_be_able_to_navigate_to_Sell_My_Home_page() {
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, projectProperties.getProperty("STAGE_URL") + "sell");
        }
        else{
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, projectProperties.getProperty("QA_URL") + "sell");
        }
    }

    @When("User clicks on sell my home fast CTA")
    public void user_clicks_on_sell_my_home_fast_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Sell_my_home_fast);
        PortalMegaMenu.click_Sell_my_home_fast();
    }

    @Then("User should be able to navigate to Sell My Home Fast page")
    public void user_should_be_able_to_navigate_to_Sell_My_Home_Fast_page() {
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, projectProperties.getProperty("STAGE_URL") + "sell/sell-my-home-fast");
        }
        else{
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, projectProperties.getProperty("QA_URL") + "sell/sell-my-home-fast");
        }
    }

    @When("User clicks on Property Valuation CTA")
    public void user_clicks_on_Property_Valuation_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Property_Valuation);
        PortalMegaMenu.click_Property_Valuation();
    }

    @When("User clicks on property valuation CTA")
    public void user_clicks_on_property_valuation_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Property_Valuationn);
        PortalMegaMenu.click_Property_Valuationn();
    }

    @Then("User should be able to navigate to property valuation page")
    public void user_should_be_able_to_navigate_to_property_valuation_page() {
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, projectProperties.getProperty("STAGE_URL") + "valuation");
        }
        else{
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, projectProperties.getProperty("QA_URL") + "valuation");
        }
    }

    @When("User clicks on Online property valuation CTA")
    public void user_clicks_on_Online_property_valuation_CTA() {
        CommonMethods.I_AmWait(driver,PortalMegaMenu.Online_Property_Valuation);
        PortalMegaMenu.click_Online_Property_Valuation();
    }

    @Then("User should be able to navigate to Online property valuation page")
    public void user_should_be_able_to_navigate_to_Online_property_valuation_page() {
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, projectProperties.getProperty("STAGE_URL") + "valuation");
        }
        else{
            String ActualUrl = driver.getCurrentUrl();
            CommonMethods.assertCustomEquals(ActualUrl, projectProperties.getProperty("QA_URL") + "valuation");
        }
    }

}
