package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;
import utilities.CommonMethods;

import java.time.Duration;

public class ResetPasswordPage {
    private WebDriver driver;
    public ResetPasswordPage(WebDriver driver) { this.driver = driver; }

    // Page elements

    public static String resetPasswordURLSubstring = "auth/reset_password";
    public static String resetNewPasswordXPath = "//input[@name='newPassword']";
    public static String resetConfirmNewPasswordXPath = "//input[@name='confirmPassword']";
    public static String passwordValidationTextXPath = "//*[@id=':r1:-helper-text']";
    public static String resetPasswordContinueCTAXPath = "//button[@type='submit']";
    public static String passwordUpdatedTextXPath = "//p[contains(.,'Password Updated')]";
    public static String backToSignInButtonXPath = "//button";
    public static String loginURL = FoxtonsHooks.HOST.replace(projectProperties.getProperty("URL_REPLACE"), "") + "auth/login";

    // Page Actions

    public boolean isResetPasswordPageOpened() {
        Boolean element = false;
        try {
            WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
            element = wdw.until(ExpectedConditions.urlContains(resetPasswordURLSubstring));
        } catch (TimeoutException e) {
        }
        return element;
    }

    public void clickResetNewPasswordField() {
        driver.findElement(By.xpath(resetNewPasswordXPath)).click();
    }

    public boolean isResetNewPasswordFieldEditable() {
        return driver.findElement(By.xpath(resetNewPasswordXPath)).isEnabled();
    }

    public void clickResetConfirmNewPasswordField() {
        driver.findElement(By.xpath(resetConfirmNewPasswordXPath)).click();
    }

    public boolean isResetConfirmNewPasswordFieldEditable() {
        return driver.findElement(By.xpath(resetConfirmNewPasswordXPath)).isEnabled();
    }

    public void enterNewPassword(String password) {
        CommonMethods.I_AmWait(driver, resetNewPasswordXPath);
        driver.findElement(By.xpath(resetNewPasswordXPath)).sendKeys(password);
    }

    public void enterConfirmNewPassword(String password) {
        CommonMethods.I_AmWait(driver, resetConfirmNewPasswordXPath);
        driver.findElement(By.xpath(resetConfirmNewPasswordXPath)).sendKeys(password);
    }

    public boolean passwordNotMatched() {
        Boolean element;
        try {
            element = driver.findElement(By.xpath(passwordValidationTextXPath)).isDisplayed();
        } catch(NoSuchElementException e) {
            element = false;
        }
        return element;
    }

    public void clickContinueCTA() {
        driver.findElement(By.xpath(resetPasswordContinueCTAXPath)).click();
    }

    public boolean isPasswordUpdatedTextPresent() {
        Boolean element;
        try {
            element = driver.findElement(By.xpath(passwordUpdatedTextXPath)).isDisplayed();
        } catch(NoSuchElementException e) {
            element = false;
        }
        return element;
    }

    public void clickBackToSignInButton() {
        driver.findElement(By.xpath(backToSignInButtonXPath)).click();
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        wdw.until(ExpectedConditions.urlToBe(loginURL));
    }
}
