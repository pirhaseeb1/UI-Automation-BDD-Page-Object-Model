package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PropertySellingProcessPage;
import testrunners.projectProperties;
import utilities.CommonMethods;

import java.time.Duration;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

public class PropertySellingProcessSD {
    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    PropertySellingProcessPage propSellProc = new PropertySellingProcessPage(driver);

    @Given("The Home Screen is opened")
    public void the_home_screen_is_opened() {
    }

    @Given("User is on the Property Selling Process page")
    public void user_on_Property_Selling_Process_page() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        CommonMethods.clickCookie(driver);
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.get(propSellProc.PropertySellingProcessURLStage);
        }
        else{
            driver.get(propSellProc.PropertySellingProcessURLQA);
        }
    }

    @When("User accesses the Property Selling Process URL")
    public void user_accesses_Property_Selling_Process_URL() {
        propSellProc.accessPropertySellingProcessPage();
    }

    @Then("User should navigate to the Property Selling Process Page")
    public void verify_navigation_to_Property_Selling_Process_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") +  "sell/sell-process";
        }
        else{
            ExpectedURL = projectProperties.getProperty("STAGE_AUTH_URL") + "sell/sell-process";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When ("User sees the hero image on the Property Selling Process Page")
    public void verify_Hero_Banner_on_Property_Selling_Process_page() {
        CommonMethods.I_AmWait(driver,propSellProc.heroBanner);
        driver.findElement(By.xpath(propSellProc.heroBanner)).isDisplayed();
    }

    @Then("User should see proper heading and subtext on the hero image on the Property Selling Process Page")
    public void verify_subtext_on_Hero_Banner_on_Property_Selling_Process_page() {
        assertTrue(propSellProc.Expected_heroBannerHeading.equalsIgnoreCase(driver.findElement(By.xpath(propSellProc.heroBannerHeadingElement)).getText()));
        assertEquals(propSellProc.Expected_heroBannerSubtext1, driver.findElement(By.xpath(propSellProc.heroBannerSubtext1Element)).getText());
        assertEquals(propSellProc.Expected_heroBannerSubtext2, driver.findElement(By.xpath(propSellProc.heroBannerSubtext2Element)).getText());
    }

    @Then("User should see a CTA “Register Now“ on the hero image on the Property Selling Process Page")
    public void verify_presence_of_register_now_button_on_Property_Selling_Process_page() {
        driver.findElement(By.xpath(propSellProc.registerNowButton)).isDisplayed();
    }

    @When("User clicks on the CTA “Register Now“ on the Property Selling Process Page")
    public void press_register_now_button_on_Property_Selling_Process_page() {
        propSellProc.clickOnRegisterNowButton();
    }

    @Then("User should navigate to My Foxtons Registration page")
    public void verify_navigation_to_My_Foxtons_Registration_page_from_Property_Selling_Process_page() {
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "auth/registration";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "auth/registration";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User scrolls down below the hero image")
    public void scroll_down_to_help_section_on_Property_Selling_Process_page() {
        propSellProc.scrollDownToLoadRestOfThePage();
    }

    @Then("User should see a help section with proper heading")
    public void verify_We_Will_Help_You_All_The_Way_section_on_Property_Selling_Process_page() {
        propSellProc.scrollDownToTheHelpSection();
        assertEquals(propSellProc.Expected_helpSectionHeading, driver.findElement(By.xpath(propSellProc.helpSectionHeadingElement)).getText());
    }

    @And("User should see a horizontal carousel containing 9 steps in the help section")
    public void verify_horizontal_carousel_and_9_steps_in_the_help_section_on_Property_Selling_Process_page() throws InterruptedException {

        propSellProc.scrollDownToHelpSectionHorizontalCarousel();
        driver.findElement(By.xpath(propSellProc.helpSectionHorizontalCarousel)).isDisplayed();

        propSellProc.scrollStep1IntoView();
        driver.findElement(By.xpath(propSellProc.step1Element)).isDisplayed();
        Thread.sleep(1000);

        propSellProc.scrollStep2IntoView();
        driver.findElement(By.xpath(propSellProc.step2Element)).isDisplayed();
        Thread.sleep(1000);

        propSellProc.scrollStep3IntoView();
        driver.findElement(By.xpath(propSellProc.step3Element)).isDisplayed();
        Thread.sleep(1000);

        propSellProc.scrollStep4IntoView();
        driver.findElement(By.xpath(propSellProc.step4Element)).isDisplayed();
        Thread.sleep(1000);

        propSellProc.scrollStep5IntoView();
        driver.findElement(By.xpath(propSellProc.step5Element)).isDisplayed();
        Thread.sleep(1000);

        propSellProc.scrollStep6IntoView();
        driver.findElement(By.xpath(propSellProc.step6Element)).isDisplayed();
        Thread.sleep(1000);

        propSellProc.scrollStep7IntoView();
        driver.findElement(By.xpath(propSellProc.step7Element)).isDisplayed();
        Thread.sleep(1000);

        propSellProc.scrollStep8IntoView();
        driver.findElement(By.xpath(propSellProc.step8Element)).isDisplayed();
        Thread.sleep(1000);

        propSellProc.scrollStep9IntoView();
        driver.findElement(By.xpath(propSellProc.step9Element)).isDisplayed();
        Thread.sleep(1000);
    }

    @When("User sees the Step 1 of the help section")
    public void user_sees_the_Step_1_of_the_help_section() {
        propSellProc.scrollStep1IntoView();
    }

    @Then("User should see that the heading of Step 1 is \"Accurate Rental Valuation\"")
    public void verify_heading_of_Step_1_of_the_help_section() {
        assertTrue(propSellProc.Expected_step1HeadingText.equalsIgnoreCase(driver.findElement(By.xpath(propSellProc.step1HeadingElement)).getText()));
    }

    @And("User should see that there is a CTA with text \"Arrange a Valuation\"")
    public void verify_Step_1_CTA_and_its_text_on_Property_Selling_Process_page() {
        driver.findElement(By.xpath(propSellProc.step1CTAElement)).isDisplayed();
        assertTrue(propSellProc.Expected_step1CTAText.equalsIgnoreCase(driver.findElement(By.xpath(propSellProc.step1CTAElement)).getText()));
    }

    @When("User clicks on the \"Arrange a Valuation\" CTA under Step 1 of the help section")
    public void user_clicks_on_the_Arrange_a_Valuation_CTA_under_Step_1_of_the_help_section() {
        propSellProc.scrollStep1IntoView();
        propSellProc.clickOnStep1CTA();
    }

    @Then("User should navigate to the Property Valuation page")
    public void verify_navigation_to_Property_Valuation_page_from_Property_Selling_Process_page() throws InterruptedException {
        Thread.sleep(2000);
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "valuation";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "valuation";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User sees the Step 2 of the help section")
    public void user_sees_the_Step_2_of_the_help_section() {
        propSellProc.scrollStep2IntoView();
    }

    @Then("User should see that the heading of Step 2 is \"Select an estate agent\"")
    public void verify_heading_of_Step_2_of_the_help_section() {
        assertTrue(propSellProc.Expected_step2HeadingText.equalsIgnoreCase(driver.findElement(By.xpath(propSellProc.step2HeadingElement)).getText()));
    }

    @And("User should see that there is a CTA with text \"About My Foxtons\"")
    public void verify_Step_2_CTA_and_its_text_on_Property_Selling_Process_page() {
        driver.findElement(By.xpath(propSellProc.step2CTAElement)).isDisplayed();
        assertTrue(propSellProc.Expected_step2CTAText.equalsIgnoreCase(driver.findElement(By.xpath(propSellProc.step2CTAElement)).getText()));
    }

    @When("User clicks on the \"About My Foxtons\" CTA under Step 2 of the help section")
    public void user_clicks_on_the_About_My_Foxtons_CTA_under_Step_2_of_the_help_section() {
        propSellProc.scrollStep2IntoView();
        propSellProc.clickOnStep2CTA();
    }

    @Then("User should navigate to the My Foxtons for Sellers page")
    public void verify_navigation_to_My_Foxtons_for_Sellers_page_from_Property_Selling_Process_page() throws InterruptedException {
        Thread.sleep(2000);
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "myfoxtons/sellers";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "myfoxtons/sellers";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User sees the Step 3 of the help section")
    public void user_sees_the_Step_3_of_the_help_section() {
        propSellProc.scrollStep3IntoView();
    }

    @Then("User should see that the heading of Step 3 is \"Instruct a solicitor\"")
    public void verify_heading_of_Step_3_of_the_help_section() {
        assertTrue(propSellProc.Expected_step3HeadingText.equalsIgnoreCase(driver.findElement(By.xpath(propSellProc.step3HeadingElement)).getText()));
    }

    @And("User should see that there is a CTA with text \"About Conveyan\"")
    public void verify_Step_3_CTA_and_its_text_on_Property_Selling_Process_page() {
        driver.findElement(By.xpath(propSellProc.step3CTAElement)).isDisplayed();
        assertTrue(propSellProc.Expected_step3CTAText.equalsIgnoreCase(driver.findElement(By.xpath(propSellProc.step3CTAElement)).getText()));
    }

    @When("User clicks on the \"About Conveyan\" CTA under Step 3 of the help section")
    public void user_clicks_on_the_About_Conveyan_CTA_under_Step_3_of_the_help_section() {
        propSellProc.scrollStep3IntoView();
        propSellProc.clickOnStep3CTA();
    }

    @Then("User should navigate to the Conveyancing page")
    public void verify_navigation_to_Conveyancing_page_from_Property_Selling_Process_page() throws InterruptedException {
        Thread.sleep(2000);
        String actualURL = driver.getCurrentUrl();
        String newURL = FoxtonsHooks.HOST;
        String ExpectedURL;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            ExpectedURL = projectProperties.getProperty("STAGE_URL") + "buy/conveyancing";
        }
        else{
            ExpectedURL = projectProperties.getProperty("QA_URL") + "buy/conveyancing";
        }
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User sees the Step 4 of the help section")
    public void user_sees_the_Step_4_of_the_help_section() {
        propSellProc.scrollStep4IntoView();
    }

    @Then("User should see that the heading of Step 4 is \"Property Presentation\"")
    public void verify_heading_of_Step_4_of_the_help_section() {
        assertTrue(propSellProc.Expected_step4HeadingText.equalsIgnoreCase(driver.findElement(By.xpath(propSellProc.step4HeadingElement)).getText()));
    }

    @When("User sees the Step 5 of the help section")
    public void user_sees_the_Step_5_of_the_help_section() {
        propSellProc.scrollStep5IntoView();
    }

    @Then("User should see that the heading of Step 5 is \"Find a Buyer\"")
    public void verify_heading_of_Step_5_of_the_help_section() {
        assertTrue(propSellProc.Expected_step5HeadingText.equalsIgnoreCase(driver.findElement(By.xpath(propSellProc.step5HeadingElement)).getText()));
    }

    @And("User should see that there is an embedded link on the part of a subtext \"instruct Foxtons to sell your property\"")
    public void verify_presence_of_embedded_link_on_subtext_in_Step_5_on_Property_Selling_Process_page() {
        propSellProc.getStep5SubtextElementFromLinkText();
    }

    @When("User clicks on the link on the subtext under Step 5 of the help section")
    public void user_clicks_on_the_link_on_the_subtext_under_Step_5_of_the_help_section() {
        propSellProc.scrollStep5IntoView();
        propSellProc.clickOnStep5SubtextElementFromLinkText();
    }

    @When("User sees the Step 6 of the help section")
    public void user_sees_the_Step_6_of_the_help_section() {
        propSellProc.scrollStep6IntoView();
    }

    @Then("User should see that the heading of Step 6 is \"Accompanied Viewings\"")
    public void verify_heading_of_Step_6_of_the_help_section() {
        assertTrue(propSellProc.Expected_step6HeadingText.equalsIgnoreCase(driver.findElement(By.xpath(propSellProc.step6HeadingElement)).getText()));
    }

    @When("User sees the Step 7 of the help section")
    public void user_sees_the_Step_7_of_the_help_section() {
        propSellProc.scrollStep7IntoView();
    }

    @Then("User should see that the heading of Step 7 is \"Receive Offers\"")
    public void verify_heading_of_Step_7_of_the_help_section() {
        assertTrue(propSellProc.Expected_step7HeadingText.equalsIgnoreCase(driver.findElement(By.xpath(propSellProc.step7HeadingElement)).getText()));
    }

    @And("User should see that there is an embedded link on the part of a subtext \"My Foxtons\"")
    public void verify_presence_of_embedded_link_on_subtext_in_Step_7_on_Property_Selling_Process_page() {
        propSellProc.getStep7SubtextElementFromLinkText();
    }

    @When("User clicks on the link on the subtext under Step 7 of the help section")
    public void user_clicks_on_the_link_on_the_subtext_under_Step_7_of_the_help_section() {
        propSellProc.scrollStep7IntoView();
        propSellProc.clickOnStep7SubtextElementFromLinkText();
    }

    @When("User sees the Step 8 of the help section")
    public void user_sees_the_Step_8_of_the_help_section() {
        propSellProc.scrollStep8IntoView();
    }

    @Then("User should see that the heading of Step 8 is \"Accept an offer\"")
    public void verify_heading_of_Step_8_of_the_help_section() {
        assertTrue(propSellProc.Expected_step8HeadingText.equalsIgnoreCase(driver.findElement(By.xpath(propSellProc.step8HeadingElement)).getText()));
    }

    @When("User sees the Step 9 of the help section")
    public void user_sees_the_Step_9_of_the_help_section() {
        propSellProc.scrollStep9IntoView();
    }

    @Then("User should see that the heading of Step 9 is \"Completion\"")
    public void verify_heading_of_Step_9_of_the_help_section() {
        assertTrue(propSellProc.Expected_step9HeadingText.equalsIgnoreCase(driver.findElement(By.xpath(propSellProc.step9HeadingElement)).getText()));
    }

    @When("User scrolls down below the help section")
    public void user_scrolls_down_below_the_help_section() {
        propSellProc.scrollDownToLoadRestOfThePage();
        propSellProc.scrollDownToHelpSectionHorizontalCarousel();
    }

    @Then("User should see a section prompting to explore other features available on the Foxtons website")
    public void verify_presence_of_Explore_Foxtons_section() {
        driver.findElement(By.xpath(propSellProc.exploreFoxtonsSectionElement)).isDisplayed();
        assertTrue(propSellProc.Expected_exploreFoxtonsSectionHeading.equalsIgnoreCase(driver.findElement(By.xpath(propSellProc.exploreFoxtonsSectionHeadingElement)).getText()));
    }

    @And("User should see that the section provides relevant links that are clickable")
    public void verify_relevant_links_in_Explore_Foxons_section() {
        assertTrue(propSellProc.exploreFoxtonsClickableLinksChecker());
    }

    @When("User scrolls down to the end of the Property Selling Process page")
    public void user_scrolls_down_to_the_end_of_the_Property_Selling_Process_page() {
        propSellProc.scrollDownToLoadRestOfThePage();
        propSellProc.scrollDownToHelpSectionHorizontalCarousel();
        CommonMethods.scrollToBottom(driver);
    }

    @Then("User should see the Foxtons website footer at the bottom of the page")
    public void verify_presence_of_footer_at_the_bottom_of_the_page() {
        driver.findElement(By.xpath(propSellProc.footerElement)).isDisplayed();
    }

}