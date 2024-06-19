package pages;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinitions.FoxtonsHooks;

import java.time.Duration;
import java.util.List;

import testrunners.projectProperties;
import utilities.CommonMethods;

public class PublishTnCDocFromBOSpage {

    private WebDriver driver;
    public PublishTnCDocFromBOSpage (WebDriver driver) {
        this.driver = driver;
    }
    public static String loginPageURL = FoxtonsHooks.HOST.replace(projectProperties.getProperty("URL_REPLACE"), "") + "auth/login";
    public static String userProfileURL = FoxtonsHooks.HOST.replace(projectProperties.getProperty("URL_REPLACE"), "") + "account/overview";
    public static String propertyURLSubstring = "account/property/";

    //    Portal Page Elements
    public static String Email = "//*[@id='email']";
    public static String Password = "//*[@id='password']";
    public static String SignIn_Button = "//button[contains(text(), 'Sign in')]";
    public static String desiredPropertyElement;
    public static String getStartedCTAElement = "//button[contains(.,'Get Started')]";
    public static String valuationInstructUsLinkElement = "//span[contains(.,'instruct us')]";

    // BOS Page Elements
    public static String BOSUsernameElement = "//input[@name='User_name']";
    public static String BOSPasswordElement = "//input[@name='Password']";
    public static String BOSLoginButton = "//input[@class='login-button']";
    public static String BOSLogoutLinkElement = "//a[@id='LogoutAnchor']";
    public static String BOSTopNav_People_Element = "//a[contains(.,'People')]";
    public static String BOSTopNav_People_AllContacts_Element = "//a[contains(.,'All Contacts')]";
    public static String BOSEmailSearchField = "//input[@class='form-control'][contains(@id,'Email')]";
    public static String BOSSearchButton = "//input[@type='submit']";
    public static String BOSSearchResultsFirstRowEmailElement = "//a[contains(text(), 'foxtons.co.uk')]";
    public static String BOS_ContactDetails_LookingToLetTab_Element = "//a[@data-tabname='LookingToLet']";
    public static String BOS_ContactDetails_LookingToLetTab_tableRowsElement = "//div[@class='table-responsive']/table/tbody/tr";
    public static String BOS_DesiredProperty_DocumentsTab_Element = "//a[@data-tabname='Documents']";
    public static String BOS_DesiredProperty_DocumentsTab_tableRowsElement = "//div[@class='table-responsive-date']/table/tbody/tr";
    public static String BOS_DesiredProperty_DocumentsTab_RemoveElement = "//a[contains(.,'Remove')]";
    public static String BOS_DesiredProperty_RemoveDocReasonTextElement = "//textarea";
    public static String BOS_DesiredProperty_DialogSaveElement = "//a[contains(.,'Save')]";
    public static String BOS_DesiredProperty_AddInstructionDocElement = "//a[contains(.,'Add Instruction Document')]";
    public static String BOS_DesiredProperty_AddInstructionDocFormElement = "//form[@action='/Documents/CreateScannedDocument']";
    public static String BOS_DesiredProperty_AddInstructionDocDropdownElement = "//select";
    public static String BOS_DesiredProperty_Dropdown_TnCDocOptionElement = "//option[text()=\"Landlord Terms and Conditions\"]";

    //  Page Actions

    public void accessLoginPage() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        driver.get(loginPageURL);
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        wdw.until(ExpectedConditions.urlToBe(loginPageURL));

    }

    public void enterEmail (String username){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        wdw.until(ExpectedConditions.elementToBeClickable(By.xpath(Email)));
        driver.findElement(By.xpath(Email)).sendKeys(username);
    }

    public void enterPassword (String password) {
        driver.findElement(By.xpath(Password)).sendKeys(password);
    }

    public void submitLogin() {
        driver.findElement(By.xpath(SignIn_Button)).click();
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        wdw.until(ExpectedConditions.urlToBe(userProfileURL));
    }

    public void clickOnTheDesiredProperty(String desiredPropertytext) {
        desiredPropertyElement = "//p[contains(.,'" + desiredPropertytext + "')]";
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(desiredPropertyElement)));
        driver.findElement(By.xpath(desiredPropertyElement)).click();
        wdw.until(ExpectedConditions.urlContains(propertyURLSubstring));
    }

    public void accessBOSLoginPage() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.BOSHOST);
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        wdw.until(ExpectedConditions.elementToBeClickable(By.xpath(BOSLoginButton)));
    }

    public void enterBOSUsername(String username) { driver.findElement(By.xpath(BOSUsernameElement)).sendKeys(username); }

    public void enterBOSPassword(String password) { driver.findElement(By.xpath(BOSPasswordElement)).sendKeys(password); }

    public void submitBOSLogin() {
        driver.findElement(By.xpath(BOSLoginButton)).click();
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        wdw.until(ExpectedConditions.elementToBeClickable(By.xpath(BOSLogoutLinkElement)));
    }

    public void openANewTab() {
        driver.switchTo().newWindow(WindowType.TAB);
    }

    public void navigateToLettingsDocumentsTabForTheDesiredPropertyInBOS(String email, String desiredProperty) {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));

        CommonMethods.hoverOver(driver, BOSTopNav_People_Element);
        wdw.until(ExpectedConditions.elementToBeClickable(By.xpath(BOSTopNav_People_AllContacts_Element)));
        driver.findElement(By.xpath(BOSTopNav_People_AllContacts_Element)).click();

        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BOSEmailSearchField)));
        driver.findElement(By.xpath(BOSEmailSearchField)).sendKeys(email);
        driver.findElement(By.xpath(BOSSearchButton)).click();

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.xpath(BOSSearchResultsFirstRowEmailElement)));
        driver.findElement(By.xpath(BOSSearchResultsFirstRowEmailElement)).click();

        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BOS_ContactDetails_LookingToLetTab_Element)));
        driver.findElement(By.xpath(BOS_ContactDetails_LookingToLetTab_Element)).click();

        wdw.until(ExpectedConditions.urlContains("LettingsInstructions"));
        List<WebElement> tableRows = driver.findElements(By.xpath(BOS_ContactDetails_LookingToLetTab_tableRowsElement));
        String currentRowAddress, currentRowStatus;
        for (int i = 1; i <= tableRows.size(); i++) {
            currentRowAddress = BOS_ContactDetails_LookingToLetTab_tableRowsElement + "[" + i + "]/td[1]";
            currentRowStatus = BOS_ContactDetails_LookingToLetTab_tableRowsElement + "[" + i + "]/td[2]";
            if (driver.findElement(By.xpath(currentRowAddress)).getText().equalsIgnoreCase(desiredProperty))
                if (driver.findElement(By.xpath(currentRowStatus)).getText().equals("Valued") ||
                driver.findElement(By.xpath(currentRowStatus)).getText().equals("Valuation Booked")) {
                    CommonMethods.ScrollIntoView(driver, currentRowAddress);
                    Actions action = new Actions(driver);
                    WebElement element = driver.findElement(By.xpath(currentRowAddress));

                    // setting yOffset as 10-pixels below the top, so that it points to the written text
                    // since the text appears at the top-left of the element
                    int y = (-1) * (element.getSize().getHeight()/2) + 10;
                    action.moveToElement(element, 0, y).click().build().perform();
                    break;
                }
        }

        wdw.until(ExpectedConditions.urlContains("LandlordTab"));
        wdw.until(ExpectedConditions.elementToBeClickable(By.xpath(BOS_DesiredProperty_DocumentsTab_Element)));
        driver.findElement(By.xpath(BOS_DesiredProperty_DocumentsTab_Element)).click();

        wdw.until(ExpectedConditions.urlContains("LettingsDocumentsTab"));
    }

    public @NotNull String TnCDocPublished() {
        List<WebElement> tableRows = driver.findElements(By.xpath(BOS_ContactDetails_LookingToLetTab_tableRowsElement));
        String currentRow;
        for (int i = 1; i <= tableRows.size(); i++) {
            currentRow = BOS_DesiredProperty_DocumentsTab_tableRowsElement + "[" + i + "]/td[4]";
            if (driver.findElement(By.xpath(currentRow)).getText().equalsIgnoreCase("Landlord Terms and Conditions")) {
                CommonMethods.ScrollIntoView(driver, currentRow);
                return currentRow;
            }
        }
        return "false";
    }

    public void unpublishTnCDocIfNeeded() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));

        String TnCDocElement = TnCDocPublished();
        if (TnCDocElement.contains(BOS_DesiredProperty_DocumentsTab_tableRowsElement)) {
            CommonMethods.ScrollIntoView(driver, TnCDocElement);
            driver.findElement(By.xpath(BOS_DesiredProperty_DocumentsTab_tableRowsElement + "/td[2]")).click();
            driver.findElement(By.xpath(BOS_DesiredProperty_DocumentsTab_RemoveElement)).click();

            wdw.until(ExpectedConditions.elementToBeClickable(By.xpath(BOS_DesiredProperty_RemoveDocReasonTextElement)));
            driver.findElement(By.xpath(BOS_DesiredProperty_RemoveDocReasonTextElement)).sendKeys("test");
            driver.findElement(By.xpath(BOS_DesiredProperty_DialogSaveElement)).click();
            wdw.until(ExpectedConditions.elementToBeClickable(By.xpath(BOS_DesiredProperty_DocumentsTab_Element)));
        }
    }

    public void publishTnCDocIfNeeded() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));

        String TnCDocElement = TnCDocPublished();
        if (TnCDocElement.contains("false")) {
            CommonMethods.ScrollIntoView(driver, BOS_DesiredProperty_AddInstructionDocElement);
            driver.findElement(By.xpath(BOS_DesiredProperty_AddInstructionDocElement)).click();

            wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BOS_DesiredProperty_AddInstructionDocFormElement)));
            driver.findElement(By.xpath(BOS_DesiredProperty_AddInstructionDocDropdownElement)).click();
            driver.findElement(By.xpath(BOS_DesiredProperty_Dropdown_TnCDocOptionElement)).click();
            driver.findElement(By.xpath(BOS_DesiredProperty_DialogSaveElement)).click();
        }
    }

    public boolean verifyAbsenceOfGetStartedCTA() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));

        try { driver.findElement(By.xpath(valuationInstructUsLinkElement)).click(); }
        catch (Exception NoSuchElementException) {}

        try { wdw.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath(getStartedCTAElement)))); }
        catch (Exception NoSuchElementException) {}

        List<WebElement> elements = driver.findElements(By.xpath(getStartedCTAElement));
        int sizeOfElements = elements.size();
        return sizeOfElements < 1;
    }

    public boolean verifyPresenceOfGetStartedCTA() {
        try { driver.findElement(By.xpath(valuationInstructUsLinkElement)).click(); }
        catch (Exception NoSuchElementException) {}

        CommonMethods.ScrollIntoView(driver, getStartedCTAElement);
        return driver.findElement(By.xpath(getStartedCTAElement)).isDisplayed();
    }

}
