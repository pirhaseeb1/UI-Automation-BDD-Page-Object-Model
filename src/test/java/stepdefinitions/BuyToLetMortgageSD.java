package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BuyToLetMortgagePage;
import pages.SellConveyancingPage;
import testrunners.projectProperties;
import utilities.CommonMethods;
import static org.testng.Assert.assertEquals;

public class BuyToLetMortgageSD {
    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    WebElement element;
    BuyToLetMortgagePage buylet = new BuyToLetMortgagePage(driver);

    @Given("User on buy-to-let mortgages page")
    public void User_on_buy_to_let_mortgages_page() throws InterruptedException {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.get(buylet.BuyToLetURLStage);
        }
        else{
            driver.get(buylet.BuyToLetURLQA);
        }
    }

    @When("User clicks on Visit Alexander Hall CTA")
    public void user_clicks_on_Ah_CTA() {
        CommonMethods.clickCookie(driver);
        buylet.click_Alexander_Hall();
    }

    @Then("User should navigate to Alexander Hall’s website Homepage")
    public void user_should_navigate_to_Ah_page() {
        // Now only one tab is opening thats why I commented this line
        // CommonMethods.BrowserTabs(driver, 2, buylet.ExpectedURL_Alexander_Hall);
        String actualURL = driver.getCurrentUrl();
        CommonMethods.assertCustomEquals(actualURL, BuyToLetMortgagePage.ExpectedURL_Alexander_Hall);
    }


    @When("User clicks on View Mortgages CTA under NEW BUY-TO-LET MORTGAGE Card")
    public void user_clicks_on_View_Mortgages_CTA_under_NEW_BUY_TO_LET_MORTGAGE_Card() {
        CommonMethods.clickCookie(driver);
        buylet.clickNew_Buy_To_Let_Mortagage();
    }

    @Then("User should navigate to Alexander Hall’s website buy to let mortgage page")
    public void user_should_navigate_to_Alexander_Hall_s_website_buy_to_let_mortgage_page() {
        CommonMethods.BrowserTabs(driver, 2, buylet.ExpectedURL_Ah_Buy_To_Let);
        String actualURL = driver.getCurrentUrl();
        CommonMethods.assertCustomEquals(actualURL, BuyToLetMortgagePage.ExpectedURL_Ah_Buy_To_Let);

    }


    @When("User clicks on View Mortgages CTA under BUY-TO-LET REMORTGAGE Card")
    public void user_clicks_on_View_Mortgages_CTA_under_BUY_TO_LET_REMORTGAGE_Card() {
        CommonMethods.clickCookie(driver);
        buylet.clickNew_Buy_To_Let_Remortagage();
    }


    @When("User clicks on Contact Form CTA under MIGRATE FROM RESIDENTIAL MORTGAGE Card")
    public void user_clicks_on_Contact_Form_CTA_under_MIGRATE_FROM_RESIDENTIAL_MORTGAGE_Card() {
        CommonMethods.clickCookie(driver);
        buylet.clickMigrate_From_Residential_Mortgage();
    }

    @Then("User should navigate to Alexander Hall’s Contact Alexander Hall mortgages, London, UK  page")
    public void user_should_navigate_to_Alexander_Hall_s_Contact_Alexander_Hall_mortgages_London_UK_page() {
        CommonMethods.BrowserTabs(driver, 2, buylet.ExpectedURL_Ah_Contact_Form);
        String actualURL = driver.getCurrentUrl();
        CommonMethods.assertCustomEquals(actualURL, BuyToLetMortgagePage.ExpectedURL_Ah_Contact_Form);
    }


    @When("User clicks on Visit Alexander Hall CTA under BUY-TO-LET MORTGAGE ADVICE")
    public void user_clicks_on_Visit_Alexander_Hall_CTA_under_BUY_TO_LET_MORTGAGE_ADVICE() {
        CommonMethods.clickCookie(driver);
        CommonMethods.ScrollIntoView(driver,BuyToLetMortgagePage.View_Alexander_Hall2);
        buylet.click_Alexander_Hall2();
    }

    @Then("User should navigate to Alexander Hall’s Homepage")
    public void user_should_navigate_to_Alexander_Hall_s_Homepage() {
        String actualURL = driver.getCurrentUrl();
        CommonMethods.assertCustomEquals(actualURL, BuyToLetMortgagePage.ExpectedURL_Alexander_Hall);
    }

    @When("User clicks on Get Started CTA under OUR LETTINGS PACKAGES, Long let Card")
    public void user_clicks_on_Get_Started_CTA_under_OUR_LETTINGS_PACKAGES_Long_let_Card() {
        CommonMethods.clickCookie(driver);
        CommonMethods.ScrollIntoView(driver,buylet.Long_Let);
        driver.findElement(By.xpath(buylet.Long_Let)).click();
        CommonMethods.hoverOver(driver, buylet.Long_Let);
        CommonMethods.I_AmWait(driver, buylet.Long_Let_Getting_Started);
        buylet.clickLong_Let_Getting_Started();
    }

    @Then("User should navigate to Find Long Let Tenants Foxtons Page")
    public void user_should_navigate_to_Find_Long_Let_Tenants_Foxtons_Page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +"landlord/contact/find-tenants/lettings";
        }
        else{
            ExpectedURL =  projectProperties.getProperty("QA_URL") + "landlord/contact/find-tenants/lettings";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }




    @When("User clicks on Get Started CTA under OUR LETTINGS PACKAGES, Managed Long let Card")
    public void user_clicks_on_Get_Started_CTA_under_OUR_LETTINGS_PACKAGES_Managed_Long_let_Card() {
        CommonMethods.clickCookie(driver);
        CommonMethods.ScrollIntoView(driver,buylet.Long_Let);
        driver.findElement(By.xpath(buylet.Managed_Short_Let)).click();
        CommonMethods.hoverOver(driver, buylet.Managed_Long_Let);
        CommonMethods.I_AmWait(driver, buylet.Managed_Long_Let_Getting_Started);
        buylet.clickManaged_Long_Let_Getting_Started();
    }

    @Then("User should navigate to Find Managed Long Let Tenants Foxtons Page")
    public void user_should_navigate_to_Find_Managed_Long_Let_Tenants_Foxtons_Page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +"landlord/contact/find-tenants/managed";
        }
        else{
            ExpectedURL =  projectProperties.getProperty("QA_URL") + "landlord/contact/find-tenants/managed";
        }

        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on Get Started CTA under OUR LETTINGS PACKAGES, Managed Short let Card")
    public void user_clicks_on_Get_Started_CTA_under_OUR_LETTINGS_PACKAGES_Managed_Short_let_Card() {
        CommonMethods.clickCookie(driver);
        CommonMethods.ScrollIntoView(driver,buylet.Long_Let);
        driver.findElement(By.xpath(buylet.Managed_Short_Let)).click();
        CommonMethods.hoverOver(driver, buylet.Managed_Short_Let);
        CommonMethods.I_AmWait(driver, buylet.Managed_Short_Let_Getting_Started);
        buylet.clickManaged_Short_Let_Getting_Started();
    }
    @Then("User should navigate to Find Short Let Tenants Foxtons Page")
    public void user_should_navigate_to_Find_Short_Let_Tenants_Foxtons_Page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") +"landlord/contact/find-tenants/short-lets";
        }
        else{
            ExpectedURL =  projectProperties.getProperty("QA_URL") + "landlord/contact/find-tenants/short-lets";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }


    @When("User clicks on Whats included CTA under OUR LETTINGS PACKAGES, Long let Card")
    public void user_clicks_on_Whats_included_CTA_under_OUR_LETTINGS_PACKAGES_Long_let_Card() {
        CommonMethods.clickCookie(driver);
        CommonMethods.ScrollIntoView(driver,buylet.Long_Let);
        driver.findElement(By.xpath(buylet.Long_Let)).click();
        CommonMethods.hoverOver(driver, buylet.Long_Let);
        CommonMethods.I_AmWait(driver, buylet.Long_Let_What_included);
        buylet.clickLong_Let_What_included();
    }

    @Then("User should navigate to Find Tenants")
    public void user_should_navigate_to_Find_Tenants() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "landlord/find-tenants";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL")+ "landlord/find-tenants";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on Whats included CTA under OUR LETTINGS PACKAGES, Managed Long let Card")
    public void user_clicks_on_Whats_included_CTA_under_OUR_LETTINGS_PACKAGES_Managed_Long_let_Card() {
        CommonMethods.clickCookie(driver);
        CommonMethods.ScrollIntoView(driver,buylet.Long_Let);
        driver.findElement(By.xpath(buylet.Managed_Long_Let)).click();
        CommonMethods.hoverOver(driver, buylet.Managed_Long_Let);
        CommonMethods.I_AmWait(driver, buylet.Managed_Long_Let_What_included);
        buylet.clickManaged_Long_Let_What_included();
    }

    @Then("User should navigate to Property Management page")
    public void user_should_navigate_to_Property_Management_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "landlord/property-management";
        }
        else{
            ExpectedURL =  projectProperties.getProperty("QA_URL") +"landlord/property-management";
        }

        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on Whats included CTA under OUR LETTINGS PACKAGES, Managed Short let Card")
    public void user_clicks_on_Whats_included_CTA_under_OUR_LETTINGS_PACKAGES_Managed_Short_let_Card() {
        CommonMethods.clickCookie(driver);
        CommonMethods.ScrollIntoView(driver,buylet.Long_Let);
        driver.findElement(By.xpath(buylet.Managed_Short_Let)).click();
        CommonMethods.hoverOver(driver, buylet.Managed_Short_Let);
        CommonMethods.I_AmWait(driver, buylet.Managed_Short_Let_What_included);
        buylet.clickManaged_Short_Let_What_included();
    }

    @Then("User should navigate to Short Let services for Landlord page")
    public void user_should_navigate_to_Short_Let_services_for_Landlord_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "landlord/short-lets";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "landlord/short-lets";
        }

        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User scrolls down to Explore Foxtons heading")
    public void user_scrolls_down_to_Explore_Foxtons_heading() {
        CommonMethods.ScrollTo(driver,0,8000);
        CommonMethods.clickCookie(driver);
    }

    @Then("User should find Our Services, Landlord advice, Landlord tools static headings")
    public void user_should_find_Our_Services_Landlord_advice_Landlord_tools_static_headings() {
        CommonMethods.assertCustomEquals(buylet.Expected_Our_Company,driver.findElement(By.xpath(buylet.heading_Our_Company)).getText());
        CommonMethods.assertCustomEquals(buylet.Expected_Landlord_advice,driver.findElement(By.xpath(buylet.heading_Landlord_advice)).getText());
        CommonMethods.assertCustomEquals(buylet.Expected_Landlord_Tools,driver.findElement(By.xpath(buylet.heading_Landlord_Tools)).getText());

    }
}