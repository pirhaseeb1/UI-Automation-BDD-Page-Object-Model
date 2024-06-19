package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.TenantsPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

import static org.testng.Assert.assertEquals;

public class FindTenantsSD {

    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    WebElement element;
    TenantsPage FindTenant = new TenantsPage(driver);

    @Given("User on Foxtons Find Tenants page from find tenants")
    public void user_on_Foxtons_Find_Tenants_page_from_find_tenants() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.navigate().to(FindTenant.FindTenantsURLStage);
        }
        else{
            driver.navigate().to(FindTenant.FindTenantsURLQA);
        }
        CommonMethods.clickCookie(driver);
    }

    @When("User clicks on Get Started CTA under OUR LETTINGS PACKAGES, Long let Card from find tenants")
    public void user_clicks_on_Get_Started_CTA_under_OUR_LETTINGS_PACKAGES_Long_let_Card_from_find_tenants() {
        CommonMethods.ScrollIntoView(driver,FindTenant.Long_Let);
        CommonMethods.hoverOver(driver, FindTenant.Long_Let);
        CommonMethods.I_AmWait(driver, FindTenant.Long_Let_Getting_Started);
        FindTenant.clickLong_Let_Getting_Started();
    }

    @Then("User should navigate to Find Long Let Tenants Foxtons Page from find tenants")
    public void user_should_navigate_to_Find_Long_Let_Tenants_Foxtons_Page_from_find_tenants() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "landlord/contact/find-tenants/lettings";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "landlord/contact/find-tenants/lettings";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on Get Started CTA under OUR LETTINGS PACKAGES, Managed Long let Card from find tenants")
    public void user_clicks_on_Get_Started_CTA_under_OUR_LETTINGS_PACKAGES_Managed_Long_let_Card_from_find_tenants() {
        CommonMethods.ScrollIntoView(driver,FindTenant.Long_Let);
        CommonMethods.hoverOver(driver, FindTenant.Managed_Long_Let);
        CommonMethods.I_AmWait(driver, FindTenant.Managed_Long_Let_Getting_Started);
        FindTenant.clickManaged_Long_Let_Getting_Started();
    }
    @Then("User should navigate to Find Managed Long Let Tenants Foxtons Page from find tenants")
    public void user_should_navigate_to_Find_Managed_Long_Let_Tenants_Foxtons_Page_from_find_tenants() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "landlord/contact/find-tenants/managed";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "landlord/contact/find-tenants/managed";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }
    @When("User clicks on Get Started CTA under OUR LETTINGS PACKAGES, Managed Short let Card from find tenants")
    public void user_clicks_on_Get_Started_CTA_under_OUR_LETTINGS_PACKAGES_Managed_Short_let_Card_from_find_tenants() {
        CommonMethods.ScrollIntoView(driver,FindTenant.Long_Let);
        CommonMethods.hoverOver(driver, FindTenant.Managed_Short_Let);
        CommonMethods.I_AmWait(driver, FindTenant.Managed_Short_Let_Getting_Started);
        FindTenant.clickManaged_Short_Let_Getting_Started();
    }
    @Then("User should navigate to Find Short Let Tenants Foxtons Page from find tenants")
    public void user_should_navigate_to_Find_Short_Let_Tenants_Foxtons_Page_from_find_tenants() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "landlord/contact/find-tenants/short-lets";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "landlord/contact/find-tenants/short-lets";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on Whats included CTA under OUR LETTINGS PACKAGES, Long let Card from find tenants")
    public void user_clicks_on_Whats_included_CTA_under_OUR_LETTINGS_PACKAGES_Long_let_Card_from_find_tenants() {
        CommonMethods.ScrollIntoView(driver,FindTenant.Long_Let);
        CommonMethods.hoverOver(driver, FindTenant.Long_Let);
        CommonMethods.I_AmWait(driver, FindTenant.Long_Let_What_included);
        FindTenant.clickLong_Let_What_included();
    }

    @Then("User should navigate to Find Tenants from find tenants")
    public void user_should_navigate_to_Find_Tenants_from_find_tenants() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "landlord/find-tenants";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "landlord/find-tenants";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on Whats included CTA under OUR LETTINGS PACKAGES, Managed Long let Card from find tenants")
    public void user_clicks_on_Whats_included_CTA_under_OUR_LETTINGS_PACKAGES_Managed_Long_let_Card_from_find_tenants() {
        CommonMethods.ScrollIntoView(driver,FindTenant.Long_Let);
        CommonMethods.hoverOver(driver, FindTenant.Managed_Long_Let);
        CommonMethods.I_AmWait(driver, FindTenant.Managed_Long_Let_What_included);
        FindTenant.clickManaged_Long_Let_What_included();
    }

    @Then("User should navigate to Property Management page from find tenants")
    public void user_should_navigate_to_Property_Management_page_from_find_tenants() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "landlord/property-management";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "landlord/property-management";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User clicks on Whats included CTA under OUR LETTINGS PACKAGES, Managed Short let Card from find tenants")
    public void user_clicks_on_Whats_included_CTA_under_OUR_LETTINGS_PACKAGES_Managed_Short_let_Card_from_find_tenants() {
        CommonMethods.ScrollIntoView(driver,FindTenant.Long_Let);
        CommonMethods.hoverOver(driver, FindTenant.Managed_Short_Let);
        CommonMethods.I_AmWait(driver, FindTenant.Managed_Short_Let_What_included);
        FindTenant.clickManaged_Short_Let_What_included();
    }

    @Then("User should navigate to Short Let services for Landlord page from find tenants")
    public void user_should_navigate_to_Short_Let_services_for_Landlord_page_from_find_tenants() {
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
}
