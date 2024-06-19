package stepdefinitions;
import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.StampDutyPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

public class StampDutySD {

    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    StampDutyPage stampduty = new StampDutyPage(driver);

    @Given("User on Stamp Duty page")
    public void user_on_Stamp_Duty_page() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        CommonMethods.clickCookie(driver);
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.get(stampduty.ExpectedURLStage);
        }
        else{
            driver.get(stampduty.ExpectedURLQA);
        }
        CommonMethods.ScrollTo(driver,0,650);
        CommonMethods.I_AmWait(driver,StampDutyPage.Input_Price);
    }

    @When("User enter property purchase price {string}")
    public void user_enter_property_purchase_price(String Price) {
        CommonMethods.clearValue(driver,StampDutyPage.Input_Price);
        stampduty.Input_price(Price);
    }

    @Then("User should be able to enter property purchase price {string}")
    public void user_should_be_able_to_enter_property_purchase_price(String price) {
        String actualText = driver.findElement(By.xpath(StampDutyPage.Input_Price)).getAttribute("value");
        Assert.assertEquals(actualText,price);
    }

    @When("User clicks on Calculate button")
    public void user_clicks_on_Calculate_button() {
        stampduty.click_Uk_Residents();
        stampduty.click_Calculate();
    }

    @Then("User should be able to see {string} error")
    public void user_should_be_able_to_see_error(String error) {
        String actualText = driver.findElement(By.xpath(StampDutyPage.error_message)).getText();
        Assert.assertEquals(actualText,error);
    }

    @When("User enter invalid property purchase price {string}")
    public void user_enter_invalid_property_purchase_price(String price) {
        stampduty.Input_price(price);
    }

    @Then("User should be able to see stamp duty {string}")
    public void user_should_be_able_to_see_stamp_duty(String value) throws InterruptedException {
        Thread.sleep(3000);
        CommonMethods.I_AmWait(driver,stampduty.stamp_duty);
        String actualText = driver.findElement(By.xpath(StampDutyPage.stamp_duty)).getText();
        System.out.println(actualText);
        Assert.assertTrue(actualText.contains(value));
    }

    @Then("User should to able to see Total rate {string}")
    public void user_should_to_able_to_see_Total_rate(String value) {
        String actualText = driver.findElement(By.xpath(StampDutyPage.Total_rate)).getText();
        System.out.println(actualText);
        Assert.assertTrue(actualText.contains(value));
    }

    @Then("User should to able to see Total Due {string}")
    public void user_should_to_able_to_see_Total_Due(String value) {
        String actualText = driver.findElement(By.xpath(StampDutyPage.Total_due)).getText();
        System.out.println(actualText);
        Assert.assertTrue(actualText.contains(value));
    }

    @Then("User should be able to see recalculate button")
    public void user_should_be_able_to_see_recalculate_button() {
        CommonMethods.I_AmWait(driver,stampduty.Recalculate);
    }

    @When("User clicks on First time buyer checkbox")
    public void user_clicks_on_First_time_buyer_checkbox() {
        stampduty.click_First_time_buyer();
    }

    @When("User clicks on Property is a buy-to-let or second home checkbox")
    public void user_clicks_on_Property_is_a_buy_to_let_or_second_home_checkbox() {
        stampduty.click_Property_buy_second_home();
    }

    @When("User clicks on Uk Residents checkbox")
    public void user_clicks_on_Uk_Residents_checkbox() {
        stampduty.click_Uk_Residents();
    }

    @When("User clicks on recalculate button")
    public void user_clicks_on_recalculate_button() throws InterruptedException {
        CommonMethods.I_AmWait(driver,StampDutyPage.stamp_duty);
        stampduty.click_Recalculate();
        Thread.sleep(1000);
        CommonMethods.I_AmWait(driver,StampDutyPage.stamp_duty);
    }
}
