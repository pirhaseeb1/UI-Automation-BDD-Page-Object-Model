package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;
import utilities.CommonMethods;

import java.time.Duration;

public class UserProfilePage {

    private WebDriver driver;
    public UserProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    // Page elements
    public static String ProfileURL = FoxtonsHooks.HOST.replace(projectProperties.getProperty("URL_REPLACE"), "") + "account/profile";
    public static String updateContactDetailsHeadingXPath = "//p[contains(.,'Update')]";
    public static String updateEmailAddressButtonXPath = "//button[contains(.,'Update email address')]";
    public static String updateEmailAddressSectionXPath = "//div[contains(@class,'MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-md-5 css')]";
    public static String updateEmailAddressHeadingXPath = "//h4";
    public static String updateEmailAddressSubheadingXPath = "//div/h4/following-sibling::p";
    public static String newEmailTexboxXPath = "//input[@id='emailAddress']";
    public static String confirmNewEmailTexboxXPath = "//input[@id='confirmEmail']";
    public static String changeEmailAddressButtonXPath = "//button[@type='submit']";
    public static String currentEmailAddressTextboxXPath = "//input[@id='emailaddress']";
    public static String firstNameTextboxXPath = "//input[@name='firstName']";
    public static String lastNameTextboxXPath = "//input[@name='lastName']";
    public static String phoneNumberTextboxXPath = "//input[@name='mobileTelephone']";
    public static String updateContactDetailsMessageXPath = "//div[@class='MuiBox-root css-0'][normalize-space(text())]";

    // Page Actions

    public void scrollToUpdateContactDetailsSection() {
        CommonMethods.ScrollIntoView(driver, updateContactDetailsHeadingXPath);
    }

    public void clickUpdateEmailAddressCTA() {
        CommonMethods.I_AmWait(driver, updateEmailAddressButtonXPath);
        WebElement element = driver.findElement(By.xpath(updateEmailAddressButtonXPath));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element);
        element.click();
    }

    public boolean updateEmailAddressSectionIsOpened() {
        CommonMethods.I_AmWait(driver, updateEmailAddressSectionXPath);
        return driver.findElement(By.xpath(updateEmailAddressSectionXPath)).isDisplayed();
    }

    public String getUpdateEmailAddressHeading() {
        return driver.findElement(By.xpath(updateEmailAddressHeadingXPath)).getText();
    }

    public String getUpdateEmailAddressSubheading() {
        return driver.findElement(By.xpath(updateEmailAddressSubheadingXPath)).getText();
    }

    public void enterNewEmail(String newEmail) {
        driver.findElement(By.xpath(newEmailTexboxXPath)).sendKeys(newEmail);
    }
    public void enterConfirmNewEmail(String confirmNewEmail) {
        driver.findElement(By.xpath(confirmNewEmailTexboxXPath)).sendKeys(confirmNewEmail);
    }

    public boolean isChangeEmailAddressButtonEnabled() {
        return driver.findElement(By.xpath(changeEmailAddressButtonXPath)).isEnabled();
    }

    public String getCurrentEmailAddress() {
        return driver.findElement(By.xpath(currentEmailAddressTextboxXPath)).getAttribute("value");
    }

    public boolean isNewEmailTextboxPresent() {
        return driver.findElement(By.xpath(newEmailTexboxXPath)).isDisplayed();
    }

    public boolean isConfirmNewEmailTextboxPresent() {
        return driver.findElement(By.xpath(confirmNewEmailTexboxXPath)).isDisplayed();
    }

    public boolean isChangeEmailAddressButtonPresent() {
        return driver.findElement(By.xpath(changeEmailAddressButtonXPath)).isDisplayed();
    }

    public void clickNewEmailTextbox() {
        driver.findElement(By.xpath(newEmailTexboxXPath)).click();
    }

    public boolean isNewEmailTextboxEnabled() {
        return driver.findElement(By.xpath(newEmailTexboxXPath)).isEnabled();
    }

    public void clickConfirmNewEmailTextbox() {
        driver.findElement(By.xpath(confirmNewEmailTexboxXPath)).click();
    }

    public boolean isConfirmNewEmailTextboxEnabled() {
        return driver.findElement(By.xpath(confirmNewEmailTexboxXPath)).isEnabled();
    }

    public boolean isChangeEmailAddressButtonClickable() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wdw.until(ExpectedConditions.elementToBeClickable(By.xpath(changeEmailAddressButtonXPath)));
        return element.isDisplayed();
    }

    public String getFirstName() {
        return driver.findElement(By.xpath(firstNameTextboxXPath)).getAttribute("value");
    }

    public String getLastName() {
        return driver.findElement(By.xpath(lastNameTextboxXPath)).getAttribute("value");
    }

    public String getPhoneNumber() {
        return driver.findElement(By.xpath(phoneNumberTextboxXPath)).getAttribute("value");
    }

    public void clickChangeEmailAddressButton() {
        driver.findElement(By.xpath(changeEmailAddressButtonXPath)).click();
    }

    public boolean isUpdateContactDetailsMessagePresent() {
        return driver.findElement(By.xpath(updateContactDetailsMessageXPath)).isDisplayed();
    }
}
