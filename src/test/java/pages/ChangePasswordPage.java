package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;
import utilities.CommonMethods;

import java.time.Duration;

import static pages.UserProfilePage.ProfileURL;

public class ChangePasswordPage {
    private WebDriver driver;

    public ChangePasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String OverviewURL = FoxtonsHooks.HOST.replace(projectProperties.getProperty("URL_REPLACE"), "") + "account/overview";

    // Page elements

    public static String profileLink = "//p[contains(.,'Profile')]";
    public static String changePasswordFold = "//h4[contains(.,'Change my password')]/..";
    public static String changePasswordCTA = "//button[contains(.,'Change password')]";
    public static String updatePasswordHeading = "//h4[contains(.,'Update your Password')]";
    public static String newPassword = "//input[@name='newPassword']";
    public static String passwordConditionsXPath = "//div[@style='display: block;']";
    public static String currentPassword = "//input[@name='currentPassword']";
    public static String confirmPassword = "//input[@name='confirmPassword']";
    public static String passwordMatchingErrorXPath = "//p[contains(.,'Password does not match')]";
    public static String updateButton = "//button[@type='submit']";
    public static String passwordValidationErrorXPath = "//*[name()=\"svg\" and @data-testid=\"InfoIcon\"]";

    // Page actions

    public void overviewPageIsOpened() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        wdw.until(ExpectedConditions.urlToBe(OverviewURL));
    }

    public void clickOnTheProfileLink() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        wdw.until(ExpectedConditions.elementToBeClickable(By.xpath(profileLink)));

        WebElement element = driver.findElement(By.xpath(profileLink));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element);

        driver.findElement(By.xpath(profileLink)).click();
    }

    public void profilePageIsOpened() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        wdw.until(ExpectedConditions.urlToBe(ProfileURL));
    }

    public void scrollToTheChangePasswordFold() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.xpath(changePasswordFold)));
        CommonMethods.ScrollIntoView(driver, changePasswordFold);
    }

    public boolean changePasswordCTAIsPresent() {
        return driver.findElement(By.xpath(changePasswordCTA)).isDisplayed();
    }

    public boolean changePasswordCTAIsClickable() {
        return driver.findElement(By.xpath(changePasswordCTA)).isEnabled();
    }

    public void clickOnTheChangePasswordCTA() {
        driver.findElement(By.xpath(changePasswordCTA)).click();
        CommonMethods.I_AmWait(driver, updatePasswordHeading);
    }

    public boolean changeMyPasswordPageIsOpened() {
        return driver.findElement(By.xpath(updatePasswordHeading)).isDisplayed();
    }

    public void clickOnTheNewPasswordField() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        wdw.until(ExpectedConditions.elementToBeClickable(By.xpath(newPassword)));
        driver.findElement(By.xpath(newPassword)).click();
    }

    public boolean passwordConditions() {
        CommonMethods.I_AmWait(driver, passwordConditionsXPath);
        return driver.findElement(By.xpath(passwordConditionsXPath)).isDisplayed();
    }

    public void clickOnTheCurrentPasswordField() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        wdw.until(ExpectedConditions.elementToBeClickable(By.xpath(currentPassword)));
        driver.findElement(By.xpath(currentPassword)).click();
    }

    public void enterTextInTheCurrentPasswordField(String text) {
        driver.findElement(By.xpath(currentPassword)).sendKeys(text);
    }

    public void enterTextInTheNewPasswordField(String text) {
        driver.findElement(By.xpath(newPassword)).sendKeys(text);
    }

    public void clickOnTheConfirmNewPasswordField() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        wdw.until(ExpectedConditions.elementToBeClickable(By.xpath(confirmPassword)));
        driver.findElement(By.xpath(confirmPassword)).click();
    }

    public void enterTextInTheConfirmPasswordField(String text) {
        driver.findElement(By.xpath(confirmPassword)).sendKeys(text);
    }

    public boolean isPasswordMatchingErrorPresentOrNot() {
        int noOfElements = driver.findElements(By.xpath(passwordMatchingErrorXPath)).size();
        if (noOfElements > 0) return true;
        else return false;
    }

    public void clickOnTheUpdateButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        wdw.until(ExpectedConditions.elementToBeClickable(By.xpath(updateButton)));
        driver.findElement(By.xpath(updateButton)).click();
    }

    public boolean isPasswordValidationErrorPresentOrNot() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordValidationErrorXPath)));
        int noOfElements = driver.findElements(By.xpath(passwordValidationErrorXPath)).size();
        if (noOfElements > 0) return true;
        else return false;
    }
}
