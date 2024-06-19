package stepdefinitions;
import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.EstimateToBorrowPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

import static org.testng.Assert.assertEquals;

public class EstimateToBorrowSD {

    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    EstimateToBorrowPage EstimateBorrow = new EstimateToBorrowPage(driver);

    //Scenario 1
    @Given("User on how much can i borrow page")
    public void user_on_how_much_can_i_borrow_page() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.get(EstimateBorrow.ExpectedURLStage);
        }
        else{
            driver.get(EstimateBorrow.ExpectedURLQA);
        }
        CommonMethods.clickCookie(driver);
        CommonMethods.ScrollTo(driver,0,800);
    }

    @When("User enter amount of {int} in Applicant one field")
    public void user_enter_amount_of_in_Applicant_one_field(Integer amount1) throws InterruptedException {
        Thread.sleep(2000);
        EstimateBorrow.EnterAmountOne(amount1);
    }

    @When("User enter amount of {int} in Applicant two field")
    public void user_enter_amount_of_in_Applicant_two_field(Integer amount2)throws InterruptedException {
        Thread.sleep(2000);
        EstimateBorrow.EnterAmountTwo(amount2);
    }

    @When("User clicks on Calculate")
    public void user_clicks_on_Calculate() throws InterruptedException {
        Thread.sleep(2000);
        EstimateBorrow.click_Calculate();
    }

    @Then("User should be able to see amount {string} in you could borrow upto field")
    public void user_should_be_able_to_see_amount_in_you_could_borrow_upto_field(String estimated_amount) throws InterruptedException {
        Thread.sleep(2000);
        String ActualText = driver.findElement(By.xpath(EstimateBorrow.Estimated_Amount)).getText();
        Assert.assertTrue(ActualText.contains(estimated_amount));
    }

    //Scenario 2
    @When("User enter invalid {string} in Applicant one field")
    public void user_enter_invalid_in_Applicant_one_field(String amountstr) throws InterruptedException {
        Thread.sleep(2000);
        EstimateBorrow.EnterStringOne(amountstr);
    }

    @When("User enter  invalid {string} in Applicant two field")
    public void user_enter_invalid_in_Applicant_two_field(String amountstr2) throws InterruptedException {
        Thread.sleep(2000);
        EstimateBorrow.EnterStringTwo(amountstr2);
    }

    @When("User click on Calculate")
    public void user_click_on_Calculate() throws InterruptedException {
        Thread.sleep(2000);
        EstimateBorrow.click_Calculate();
    }

    @Then("User should able to see {string} error on both fields")
    public void user_should_able_to_see_error_on_both_fields(String string) throws InterruptedException {
        Thread.sleep(2000);
        String errorText1 = driver.findElement(By.xpath(EstimateBorrow.error_One)).getText();
        String errorText2 = driver.findElement(By.xpath(EstimateBorrow.error_Two)).getText();
        Assert.assertTrue(errorText1.contains(string));
        Assert.assertTrue(errorText2.contains(string));
    }

    //Scenario 3

    @When("User clicks {string} CTA")
    public void user_clicks_CTA(String string) throws InterruptedException {
        Thread.sleep(2000);
        String ReCal = driver.findElement(By.xpath(EstimateBorrow.Re_Calculate_CTA)).getText();
        Assert.assertTrue(ReCal.contains(string));
        EstimateBorrow.click_Re_Calculate();
    }

    @Then("user should be on how much can i borrow page")
    public void user_should_be_on_how_much_can_i_borrow_page() throws InterruptedException {
        Thread.sleep(2000);
        String actualURL = driver.getCurrentUrl();
        CommonMethods.assertCustomEquals(actualURL, EstimateBorrow.ExpectedURLStage);
    }

    //Scenario 4
    @When("User enter amount of {int} in Applicant one field for error")
    public void user_enter_amount_of_in_Applicant_one_field_for_error(Integer amount1) throws InterruptedException {
        Thread.sleep(2000);
        EstimateBorrow.EnterAmountOne(amount1);
    }

    @When("User enter amount of {int} in Applicant two field for error")
    public void user_enter_amount_of_in_Applicant_two_field_for_error(Integer amount2) throws InterruptedException {
        Thread.sleep(2000);
        EstimateBorrow.EnterAmountTwo(amount2);
    }

    @When("User clicks on View Properties CTA")
    public void user_clicks_on_View_Properties_CTA() throws InterruptedException {
        Thread.sleep(2000);
        EstimateBorrow.click_View_Properties();
    }

    @Then("User should be able to see {string} CTA view Properties in title")
    public void user_should_be_able_to_see_CTA_view_Properties_in_title(String string) throws InterruptedException {
        Thread.sleep(2000);
        String viewProp = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals("https://development:Koalanda*2021@fxweb-staging.foxtons-cloud.link/")){
            ExpectedURL = "https://fxweb-staging.foxtons-cloud.link/buy/mortgages/how-much-can-i-borrow#";
        }
        else{
            ExpectedURL = "https://fxweb-qa.foxtons-cloud.link/buy/mortgages/how-much-can-i-borrow#";
        }
        CommonMethods.assertCustomEquals(viewProp, ExpectedURL);
    }



    //Scenario 5
    @When("User enter amount of {int} in Applicant one field only")
    public void user_enter_amount_of_in_Applicant_one_field_only(Integer amount1) throws InterruptedException {
        Thread.sleep(2000);
        EstimateBorrow.EnterAmountOne(amount1);
    }

    @Then("User should be able to see {string} from Applicant one")
    public void user_should_be_able_to_see_from_Applicant_one(String estimated_amount) throws InterruptedException {
        Thread.sleep(2000);
        String ActualText = driver.findElement(By.xpath(EstimateBorrow.Estimated_Amount)).getText();
        Assert.assertTrue(ActualText.contains(estimated_amount));
    }

    //Scenario 6
    @When("User enter amount of {int} in Applicant two field only")
    public void user_enter_amount_of_in_Applicant_two_field_only(Integer amount1) throws InterruptedException {
        Thread.sleep(2000);
        EstimateBorrow.EnterAmountTwo(amount1);
    }

    @Then("User should not see error {string}")
    public void user_should_not_see_error(String estimated_amount) throws InterruptedException {
        Thread.sleep(2000);
        String ActualText = driver.findElement(By.xpath(EstimateBorrow.error_One)).getText();
        Assert.assertTrue(ActualText.contains(estimated_amount));
    }
}