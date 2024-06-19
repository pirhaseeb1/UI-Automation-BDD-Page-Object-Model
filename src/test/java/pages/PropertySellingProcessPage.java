package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;

import java.time.Duration;
import java.util.List;

public class PropertySellingProcessPage {
    private WebDriver driver;
    public PropertySellingProcessPage(WebDriver driver) {
        this.driver = driver;
    }
    public static String PropertySellingProcessURLStage = projectProperties.getProperty("STAGE_URL") + "sell/sell-process";
    public static String PropertySellingProcessURLQA = projectProperties.getProperty("QA_URL") + "sell/sell-process";

    // Page elements
    public static String heroBanner = "//*[@id=\"heroBanner\"]";
    public static String Expected_heroBannerHeading = "Guide to Selling";
    public static String heroBannerHeadingElement = "//*[@id=\"guide-to-selling\"]";
    public static String Expected_heroBannerSubtext1 = "A step-by-step guide to selling a property";
    public static String heroBannerSubtext1Element = "//section[@id='heroBanner']//p[contains(@class,'MuiTypography-root MuiTypography-body1')][1]";
    public static String Expected_heroBannerSubtext2 = "Selling property can be far less stressful when you understand the process";
    public static String heroBannerSubtext2Element = "//section[@id='heroBanner']//p[contains(@class,'MuiTypography-root MuiTypography-body1')][2]";
    public static String registerNowButton = "//button[contains(.,'Register now')]";
    public static String Expected_helpSectionHeading = "WE'LL HELP YOU ALL THE WAY";
    public static String helpSectionHeadingElement = "//h2[@id='well-help-you-all-the-way']";
    public static String helpSectionHorizontalCarousel = "//ul[@class='alice-carousel__dots']";
    public static String step1Element = "//li[contains(@class,'alice-carousel__stage-item')][1]";
    public static String step2Element = "//li[contains(@class,'alice-carousel__stage-item')][2]";
    public static String step3Element = "//li[contains(@class,'alice-carousel__stage-item')][3]";
    public static String step4Element = "//li[contains(@class,'alice-carousel__stage-item')][4]";
    public static String step5Element = "//li[contains(@class,'alice-carousel__stage-item')][5]";
    public static String step6Element = "//li[contains(@class,'alice-carousel__stage-item')][6]";
    public static String step7Element = "//li[contains(@class,'alice-carousel__stage-item')][7]";
    public static String step8Element = "//li[contains(@class,'alice-carousel__stage-item')][8]";
    public static String step9Element = "//li[contains(@class,'alice-carousel__stage-item')][9]";
    public static String Expected_step1HeadingText = "Accurate Rental Valuation";
    public static String step1HeadingElement = "//*[@id=\"accurate-rental-valuation\"]";
    public static String Expected_step2HeadingText = "Select an estate agent";
    public static String step2HeadingElement = "//*[@id=\"select-an-estate-agent\"]";
    public static String Expected_step3HeadingText = "Instruct a solicitor";
    public static String step3HeadingElement = "//*[@id=\"instruct-a-solicitor\"]";
    public static String Expected_step4HeadingText = "Property Presentation";
    public static String step4HeadingElement = "//*[@id=\"property-presentation\"]";
    public static String Expected_step5HeadingText = "Find a Buyer";
    public static String step5HeadingElement = "//*[@id=\"find-a-buyer\"]";
    public static String Expected_step6HeadingText = "Accompanied Viewings";
    public static String step6HeadingElement = "//*[@id=\"accompanied-viewings\"]";
    public static String Expected_step7HeadingText = "Receive Offers";
    public static String step7HeadingElement = "//*[@id=\"receive-offers\"]";
    public static String Expected_step8HeadingText = "Accept an offer";
    public static String step8HeadingElement = "//*[@id=\"accept-an-offer\"]";
    public static String Expected_step9HeadingText = "Completion";
    public static String step9HeadingElement = "//*[@id=\"completion\"]";
    public static String Expected_step1CTAText = "Arrange a Valuation";
    public static String step1CTAElement = "//button[contains(.,'Arrange a valuation')]";
    public static String Expected_step2CTAText = "About My Foxtons";
    public static String step2CTAElement = "//button[contains(.,'About My Foxtons')]";
    public static String Expected_step3CTAText = "About Conveyan";
    public static String step3CTAElement = "//button[contains(.,'About Conveyan')]";
    public static String step5SubtextLinkText = "Instruct Foxtons to sell your property";
    public static String step7SubtextLinkText = "My Foxtons";
    public static String exploreFoxtonsSectionElement = "//h2[@id='explore-foxtons']/..";
    public static String Expected_exploreFoxtonsSectionHeading = "EXPLORE FOXTONS";
    public static String exploreFoxtonsSectionHeadingElement = "//*[@id=\"explore-foxtons\"]";
    public static String exploreFoxtonsClickableLinks = exploreFoxtonsSectionElement + "//a[contains(@href,'/')]";
    public static String footerElement = "//div[@class='MuiBox-root css-1qr0o10']";

    // Page Actions

    // Opening the Property Selling Process Page
    public void accessPropertySellingProcessPage() {
        String base_url = driver.getCurrentUrl();
        driver.get(base_url + "/sell/sell-process");
    }

    // Clicking on the Register Now button
    public void clickOnRegisterNowButton() {
        driver.findElement(By.xpath(registerNowButton)).click();
    }

    // Scrolling down due to lazy loading
    // Since lazy loading is not present on the page anymore, so commenting out this method
    // Keeping the commented code in case if lazy loading is introduced again
    public void scrollDownToLoadRestOfThePage() {
        // Scrolling a little because the page below loads upon scrolling only
        // ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)", "");
        // Scrolling more to bring some part of the next section into view
        // ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
        // WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        // wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(helpSectionHeadingElement)));
    }

    // Bringing the Help Section into view
    public void scrollDownToTheHelpSection() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(helpSectionHeadingElement)));
    }

    // Bringing the horizontal slider inside the Help Section into view
    public void scrollDownToHelpSectionHorizontalCarousel() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(helpSectionHorizontalCarousel)));
    }

    // scrollStep1IntoView() brings the step 1 of the help section into view, it is on a horizontal scroll
    public void scrollStep1IntoView() {
        scrollDownToLoadRestOfThePage();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(step1Element)));
    }

    // scrollStep2IntoView() brings the step 2 of the help section into view, it is on a horizontal scroll
    public void scrollStep2IntoView() {
        scrollDownToLoadRestOfThePage();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(step2Element)));
    }

    // scrollStep3IntoView() brings the step 3 of the help section into view, it is on a horizontal scroll
    public void scrollStep3IntoView() {
        scrollDownToLoadRestOfThePage();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(step3Element)));
    }

    // scrollStep4IntoView() brings the step 4 of the help section into view, it is on a horizontal scroll
    public void scrollStep4IntoView() {
        scrollDownToLoadRestOfThePage();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(step4Element)));
    }

    // scrollStep5IntoView() brings the step 5 of the help section into view, it is on a horizontal scroll
    public void scrollStep5IntoView() {
        scrollDownToLoadRestOfThePage();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(step5Element)));
    }

    // scrollStep6IntoView() brings the step 6 of the help section into view, it is on a horizontal scroll
    public void scrollStep6IntoView() {
        scrollDownToLoadRestOfThePage();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(step6Element)));
    }

    // scrollStep7IntoView() brings the step 7 of the help section into view, it is on a horizontal scroll
    public void scrollStep7IntoView() {
        scrollDownToLoadRestOfThePage();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(step7Element)));
    }

    // scrollStep8IntoView() brings the step 8 of the help section into view, it is on a horizontal scroll
    public void scrollStep8IntoView() {
        scrollDownToLoadRestOfThePage();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(step8Element)));
    }

    // scrollStep9IntoView() brings the step 9 of the help section into view, it is on a horizontal scroll
    public void scrollStep9IntoView() {
        scrollDownToLoadRestOfThePage();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(step9Element)));
    }

    // Clicking on the CTA under Step 1 of the Help Section
    public void clickOnStep1CTA() {
        driver.findElement(By.xpath(step1CTAElement)).click();
    }

    // Clicking on the CTA under Step 2 of the Help Section
    public void clickOnStep2CTA() {
        driver.findElement(By.xpath(step2CTAElement)).click();
    }

    // Clicking on the CTA under Step 3 of the Help Section
    public void clickOnStep3CTA() {
        driver.findElement(By.xpath(step3CTAElement)).click();
    }

    // Returning the Web Element of the link text under Step 5 of the Help Section
    // This is needed to click on it and to verify its presence
    public WebElement getStep5SubtextElementFromLinkText() {
        WebElement step5SubtextElement = driver.findElement(By.linkText(step5SubtextLinkText));
        return step5SubtextElement;
    }

    // Clicking on the Web Element of the link text under Step 5 of the Help Section
    public void clickOnStep5SubtextElementFromLinkText() {
        getStep5SubtextElementFromLinkText().click();
    }

    // Returning the Web Element of the link text under Step 7 of the Help Section
    // This is needed to click on it and to verify its presence
    public WebElement getStep7SubtextElementFromLinkText() {
        WebElement step7SubtextElement = driver.findElement(By.linkText(step7SubtextLinkText));
        return step7SubtextElement;
    }

    // Clicking on the Web Element of the link text under Step 7 of the Help Section
    public void clickOnStep7SubtextElementFromLinkText() {
        getStep7SubtextElementFromLinkText().click();
    }

    public boolean exploreFoxtonsClickableLinksChecker() {
        List<WebElement> clickableLinks = driver.findElements(By.xpath(exploreFoxtonsClickableLinks));
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        if (clickableLinks.size() > 0) {
            for (WebElement link: clickableLinks) {
                wdw.until(ExpectedConditions.elementToBeClickable(link));
            }
            return true;
        } else return false;
    }

}
