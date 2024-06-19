package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.YieldCalculatorPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

import static org.testng.Assert.assertEquals;

public class YieldCalculatorSD {
    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    YieldCalculatorPage Yieldcalculator = new YieldCalculatorPage(driver);

    @Given("User on yield calculator page")
    public void User_on_yield_calculator_page() throws InterruptedException {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        CommonMethods.clickCookie(driver);
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.get(Yieldcalculator.ExpectedURLStage);
        }
        else{
            driver.get(Yieldcalculator.ExpectedURLQA);
        }
    }
    @When("User clicks on Ask us a question CTA")
    public void user_clicks_on_Ask_us_a_question_CTA() {
        CommonMethods.I_AmWait(driver,Yieldcalculator.Ask_a_question);
        Yieldcalculator.click_Ask_a_question();

    }

    @Then("User should be able to navigate to Ask us a question page")
    public void user_should_be_able_to_navigate_to_Ask_us_a_question_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +  "landlord/yield-calculator";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "landlord/yield-calculator";
        }
        System.out.println(actualURL);
        System.out.println(ExpectedURL);
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on rental yield FAQ CTA")
    public void user_clicks_on_rental_yield_FAQ_CTA() {
        CommonMethods.ScrollIntoView(driver,Yieldcalculator.rental_yield);
        Yieldcalculator.click_rental_yield();
    }

    @When("User clicks on calculate rental yield FAQ CTA")
    public void user_clicks_on_calculate_rental_yield_FAQ_CTA() {
        //CommonMethods.ScrollIntoView(driver,Yieldcalculator.calculate_rental_yield);
        CommonMethods.I_AmWait(driver,Yieldcalculator.calculate_rental_yield);
        Yieldcalculator.click_calculate_rental_yield();
    }

    @When("User clicks on buy to let investment FAQ CTA")
    public void user_clicks_on_buy_to_let_investment_FAQ_CTA() {
       // CommonMethods.ScrollIntoView(driver,Yieldcalculator.buy_to_let_investment);
        CommonMethods.I_AmWait(driver,Yieldcalculator.buy_to_let_investment);
        Yieldcalculator.click_buy_to_let_investment();
    }

    @When("User clicks on rental yield in london FAQ CTA")
    public void user_clicks_on_rental_yield_in_london_FAQ_CTA() {
        //CommonMethods.ScrollIntoView(driver,Yieldcalculator.rental_yield_in_london);
        CommonMethods.I_AmWait(driver,Yieldcalculator.rental_yield_in_london);
        Yieldcalculator.click_rental_yield_in_london();
    }

    @When("User clicks on rental question FAQ CTA")
    public void user_clicks_on_rental_question_FAQ_CTA() {
        //CommonMethods.ScrollIntoView(driver,Yieldcalculator.rental_question);
        CommonMethods.I_AmWait(driver,Yieldcalculator.rental_question);
        Yieldcalculator.click_rental_question();
    }

    @Then("User should be able to see FAQS details")
    public void user_should_be_able_to_see_FAQS_details() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +  "landlord/yield-calculator";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "landlord/yield-calculator";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }
    @When("User clicks on Get started CTA under Long let card")
    public void user_clicks_on_Get_started_CTA_under_Long_let_card() {
        CommonMethods.ScrollIntoView(driver,Yieldcalculator.long_let);
        CommonMethods.hoverOver(driver,Yieldcalculator.long_let);
        CommonMethods.I_AmWait(driver,Yieldcalculator.get_started_long_let);
        Yieldcalculator.click_get_started_long_let();
    }

    @Then("User should be able to navigate to lettings page")
    public void user_should_be_able_to_navigate_to_lettings_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +  "landlord/contact/find-tenants/lettings";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "landlord/contact/find-tenants/lettings";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on What's included? CTA under Long let card")
    public void user_clicks_on_What_s_included_CTA_under_Long_let_card() {
        CommonMethods.ScrollIntoView(driver,Yieldcalculator.long_let);
        CommonMethods.hoverOver(driver,Yieldcalculator.long_let);
        CommonMethods.I_AmWait(driver,Yieldcalculator.what_included_long_let);
        Yieldcalculator.click_what_included_long_let();
    }

    @Then("User should be able to see long let card details")
    public void user_should_be_able_to_see_long_let_card_details() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +  "landlord/yield-calculator#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "landlord/yield-calculator#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on Get started CTA under managed long let")
    public void user_clicks_on_Get_started_CTA_under_managed_long_let() throws InterruptedException {
        Thread.sleep(2000);
        CommonMethods.ScrollIntoView(driver,Yieldcalculator.Managed_Long_Let);
        CommonMethods.hoverOver(driver,Yieldcalculator.Managed_Long_Let);
        CommonMethods.I_AmWait(driver,Yieldcalculator.get_started_managed_long);
        Yieldcalculator.click_get_started_managed_long();
    }

    @Then("User should be able to navigate to managed page")
    public void user_should_be_able_to_navigate_to_managed_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +  "landlord/contact/find-tenants/managed";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "landlord/contact/find-tenants/managed";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on What's included? CTA under managed long let")
    public void user_clicks_on_What_s_included_CTA_under_managed_long_let() {
        CommonMethods.ScrollIntoView(driver,Yieldcalculator.Managed_Long_Let);
        CommonMethods.hoverOver(driver,Yieldcalculator.Managed_Long_Let);
        CommonMethods.I_AmWait(driver,Yieldcalculator.what_included_managed_long);
        Yieldcalculator.click_what_included_managed_long();
    }

    @Then("User should be able to see managed long let card details")
    public void user_should_be_able_to_see_managed_long_let_card_details() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +  "landlord/yield-calculator#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "landlord/yield-calculator#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on Get started CTA under managed short let")
    public void user_clicks_on_Get_started_CTA_under_managed_short_let() {
        CommonMethods.ScrollIntoView(driver,Yieldcalculator.Managed_Short_Let);
        CommonMethods.hoverOver(driver,Yieldcalculator.Managed_Short_Let);
        CommonMethods.I_AmWait(driver,Yieldcalculator.get_started_managed_short);
        Yieldcalculator.click_get_started_managed_short();
    }

    @Then("User should be able to navigate to short let page")
    public void user_should_be_able_to_navigate_to_short_let_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +  "landlord/contact/find-tenants/short-lets";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "landlord/contact/find-tenants/short-lets";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on What's included? CTA under managed short let")
    public void user_clicks_on_What_s_included_CTA_under_managed_short_let() {
        CommonMethods.ScrollIntoView(driver,Yieldcalculator.Managed_Short_Let);
        CommonMethods.hoverOver(driver,Yieldcalculator.Managed_Short_Let);
        CommonMethods.I_AmWait(driver,Yieldcalculator.what_included_managed_short);
        Yieldcalculator.click_what_included_managed_short();
    }

    @Then("User should be able to see managed short let card details")
    public void user_should_be_able_to_see_managed_short_let_card_details() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +  "landlord/yield-calculator#";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "landlord/yield-calculator#";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }
//scenario_9

    @When("User enter amount of {int} in Purchase price field")
    public void user_enter_amount_of_in_Purchase_price_field(Integer price1) throws InterruptedException {
        Thread.sleep(2000);
        Yieldcalculator.EnterPurchasePrice(price1);
    }

    @When("User clicks on Other purchase costs CTA")
    public void user_clicks_on_Other_purchase_costs_CTA() {
        CommonMethods.I_AmWait(driver,Yieldcalculator.Other_purchase_costs);
        Yieldcalculator.click_Other_purchase_costs();
    }

    @When("User enter amount of {int} in Stamp duty field")
    public void user_enter_amount_of_in_Stamp_duty_field(Integer price2) throws InterruptedException {
        Thread.sleep(2000);
        Yieldcalculator.StampDuty(price2);
    }

    @When("User enter amount of {int} in Valuation fees field")
    public void user_enter_amount_of_in_Valuation_fees_field(Integer price3) throws InterruptedException {
        Thread.sleep(2000);
        Yieldcalculator.ValuationFees(price3);
    }

    @When("User enter amount of {int} in Survey fees field")
    public void user_enter_amount_of_in_Survey_fees_field(Integer price4) throws InterruptedException {
        Thread.sleep(2000);
        Yieldcalculator.Surveyfees(price4);
    }

    @When("User enter amount of {int} in Legal fees field")
    public void user_enter_amount_of_in_Legal_fees_field(Integer price5) throws InterruptedException {
        Thread.sleep(2000);
        Yieldcalculator.Legalfees(price5);
    }

    @When("User enter amount of {int} in Mortgage deposit field")
    public void user_enter_amount_of_in_Mortgage_deposit_field(Integer price6) throws InterruptedException {
        Thread.sleep(2000);
        Yieldcalculator.Mortgagedeposit(price6);
    }

    @When("User enter amount of {int} in Mortgage fees field")
    public void user_enter_amount_of_in_Mortgage_fees_field(Integer price7) throws InterruptedException {
        Thread.sleep(2000);
        Yieldcalculator.Mortgagefees(price7);
    }

    @When("User enter amount of {int} in Refurbishment costs field")
    public void user_enter_amount_of_in_Refurbishment_costs_field(Integer price8) throws InterruptedException {
        Thread.sleep(2000);
        Yieldcalculator.Refurbishmentcosts(price8);
    }

    @When("User enter amount of {int} in Other buying costs field")
    public void user_enter_amount_of_in_Other_buying_costs_field(Integer price9) throws InterruptedException {
        Thread.sleep(2000);
        Yieldcalculator.Otherbuyingcosts(price9);
    }

    @When("User enter amount of {int} in Monthly rent field")
    public void user_enter_amount_of_in_Monthly_rent_field(Integer price10) throws InterruptedException {
        Thread.sleep(2000);
        Yieldcalculator.Monthlyrent(price10);
    }

    @When("User enter amount of {int} in Yearly running costs field")
    public void user_enter_amount_of_in_Yearly_running_costs_field(Integer price11) throws InterruptedException {
        Thread.sleep(2000);
        Yieldcalculator.Yearlyrunning(price11);
    }

    @When("User clicks on Other costs CTA")
    public void user_clicks_on_Other_costs_CTA() {
        CommonMethods.I_AmWait(driver,Yieldcalculator.other_costs);
        Yieldcalculator.click_other_costs();
    }

    @When("User enter amount of {int} in Monthly mortgage payment field")
    public void user_enter_amount_of_in_Monthly_mortgage_payment_field(Integer price12) throws InterruptedException {
        Thread.sleep(2000);
        Yieldcalculator.Monthlymortgage(price12);
    }

    @When("User enter amount of {int} in Repairs and maintenance field")
    public void user_enter_amount_of_in_Repairs_and_maintenance_field(Integer price13) throws InterruptedException {
        Thread.sleep(2000);
        Yieldcalculator.RepairsAndmaintenance(price13);
    }

    @When("User enter amount of {int} in Ground rent and service charges field")
    public void user_enter_amount_of_in_Ground_rent_and_service_charges_field(Integer price14) throws InterruptedException {
        Thread.sleep(2000);
        Yieldcalculator.Groundrent(price14);
    }

    @When("User enter amount of {int} in Insurance field")
    public void user_enter_amount_of_in_Insurance_field(Integer price15) throws InterruptedException {
        Thread.sleep(2000);
        Yieldcalculator.Insurance(price15);
    }

    @When("User enter amount of {int} in Utility bills payable by landlord field")
    public void user_enter_amount_of_in_Utility_bills_payable_by_landlord_field(Integer price16) throws InterruptedException {
        Thread.sleep(2000);
        Yieldcalculator.Utilitybills(price16);
    }

    @When("User enter amount of {int} in Council tax field")
    public void user_enter_amount_of_in_Council_tax_field(Integer price17) throws InterruptedException {
        Thread.sleep(2000);
        Yieldcalculator.Counciltax(price17);
    }

    @When("User enter amount of {int} in Vacancy loss field")
    public void user_enter_amount_of_in_Vacancy_loss_field(Integer price18) throws InterruptedException {
        Thread.sleep(2000);
        Yieldcalculator.Vacancyloss(price18);
    }

    @When("User clicks on Calculate Yield CTA")
    public void user_clicks_on_Calculate_Yield_CTA() {
        CommonMethods.I_AmWait(driver,Yieldcalculator.CalculateYield);
        Yieldcalculator.click_CalculateYield();
    }

    @Then("User should be able to see calculated result {string} Net Yeild")
    public void user_should_be_able_to_see_calculated_result_Net_Yeild(String result1) throws InterruptedException {
        Thread.sleep(2000);
        String ActualText = driver.findElement(By.xpath(Yieldcalculator.result_scenario9)).getText();
        Assert.assertTrue(ActualText.contains(result1));
    }

    @When("User clicks on Calculate yield for CTA")
    public void user_clicks_on_Calculate_yield_for_CTA() throws InterruptedException {
        Thread.sleep(2000);
        CommonMethods.I_AmWait(driver,Yieldcalculator.Calculateyieldfor);
        Yieldcalculator.click_Calculateyieldfor();
    }

    @When("User select option The current value of the property")
    public void user_select_option_The_current_value_of_the_property() throws InterruptedException {
        Thread.sleep(2000);
        CommonMethods.I_AmWait(driver,Yieldcalculator.selectcurrentvalue);
        Yieldcalculator.click_selectcurrentvalue();
    }
    @When("User enter amount of {int} in current price field")
    public void user_enter_amount_of_in_current_price_field(Integer price19) throws InterruptedException {
        Thread.sleep(2000);
        Yieldcalculator.EntercurrentPrice(price19);
    }

}
